package com.sulaiman.busreservation.Repository;

import com.sulaiman.busreservation.Buses.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface BusRepository extends JpaRepository<Bus,Long> {
    Optional<Bus> findBusesByFare(String fare);
}
