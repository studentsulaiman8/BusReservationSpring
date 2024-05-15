package com.sulaiman.busreservation.Controller;


import com.sulaiman.busreservation.Buses.Bus;
import com.sulaiman.busreservation.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping(path = "api/v1/bus")
public class BusController {
    private final BusService busService;

    @Autowired
    public BusController(BusService busService) {
        this.busService = busService;
    }


    @GetMapping
    public List<Bus> getBuses(){
        return busService.getBuses();
    }

    @PostMapping
    public  void registerNewBus(@RequestBody Bus bus) {
        busService.addNewBus(bus);
    }

    @DeleteMapping(path = "{busNumber}")
    public void deleteBus(@PathVariable("busNumber") Long busId) {
        busService.deleteBus(busId);
    }

    @PutMapping(path="{busNumber}")
    public void updateBus(
            @PathVariable("busNumber") Long busNumber,
            @RequestParam(required = false) String source,
            @RequestParam(required = false) String destination,
            @RequestParam(required = false) String fare

    ) {
        busService.updateBus(busNumber, source, destination,
                 fare);
    }
}

