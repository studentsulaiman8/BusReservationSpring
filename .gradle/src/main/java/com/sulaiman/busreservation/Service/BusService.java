package com.sulaiman.busreservation.Service;

import com.sulaiman.busreservation.Buses.Bus;
import com.sulaiman.busreservation.Repository.BusRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;



import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BusService {

    private final BusRepository busRepository;

    @Autowired
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @GetMapping
    public List<Bus> getBuses() {
        return busRepository.findAll();
    }

    public void addNewBus(Bus bus) {
       Optional<Bus> busOptional = busRepository.findBusesByFare(bus.getFare());
        if (busOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        busRepository.save(bus);
    }

    public void deleteBus(Long busNumber) {
        boolean exists = busRepository.existsById(busNumber);
        if(!exists) {
            throw new IllegalStateException(
                    "bus with id" + busNumber + "does not exists"
            );
        }
        busRepository.deleteById(busNumber);
    }

    @Transactional
    public void updateBus(Long busNumber, String source,
                          String destination,
                         String fare) {
        Bus bus = busRepository.findById(busNumber).orElseThrow(() -> new IllegalStateException("bus wit id" + busNumber+ "does not exist"));

         if (source != null && source.length() > 0 && !Objects.equals(bus.getSource(), source)) {
             bus.setSource(source);
         }
        if (destination != null && destination.length() > 0 && !Objects.equals(bus.getDestination(), destination)) {
            bus.setDestination(destination);
        }

         if (fare != null && fare.length() > 0 && !Objects.equals(bus.getFare(), fare)) {
             Optional<Bus> busOptional = busRepository.findBusesByFare(fare);
             if (busOptional.isPresent()) {
                 throw new IllegalStateException("fare taken");
             }
             bus.setFare(fare);
         }
    }

}

