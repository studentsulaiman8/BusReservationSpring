package com.sulaiman.busreservation.Config;

import com.sulaiman.busreservation.Buses.Bus;
import com.sulaiman.busreservation.Repository.BusRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

@Configuration
public class BusConfig {

    @Bean
    CommandLineRunner commandLineRunner(BusRepository busRepository) {
        return args -> {
            Bus kono = new Bus(
                    1L,
                    "Kono",
                    "Freetown",
                    LocalTime.of(3, 5, 8),
                    LocalTime.of(8, 25, 18),
                    LocalDate.of(2024, Month.MAY, 8),
                    LocalDate.of(2024, Month.MAY, 8),
                    "Le25",
                    100
            );
            Bus makeni = new Bus(
                    1L,
                    "Makeni",
                    "Freetown",
                    LocalTime.of(3, 5, 8),
                    LocalTime.of(8, 25, 18),
                    LocalDate.of(2024, Month.MAY, 8),
                    LocalDate.of(2024, Month.MAY, 8),
                    "Le25",
                    100
            );
            Bus bo = new Bus(
                    1L,
                    "Bo",
                    "Freetown",
                    LocalTime.of(3, 5, 8),
                    LocalTime.of(8, 25, 18),
                    LocalDate.of(2024, Month.MAY, 8),
                    LocalDate.of(2024, Month.MAY, 8),
                    "Le25",
                    100
            );
            busRepository.saveAll(List.of(kono, makeni, bo));
        };
    }
}
