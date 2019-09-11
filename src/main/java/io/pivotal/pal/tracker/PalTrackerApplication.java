package io.pivotal.pal.tracker;
<<<<<<< HEAD
=======

>>>>>>> e0b7808a438e52fd921dddfb9745820b05b76e02
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PalTrackerApplication {
<<<<<<< HEAD
    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }

    @Bean
    public TimeEntryRepository getTimeEntryRepository(){
        final TimeEntryRepository inMemoryTimeEntryRepository = new InMemoryTimeEntryRepository();
        return inMemoryTimeEntryRepository;
    }

}
=======

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }
@Bean
    public TimeEntryRepository getTimeEntryRepository(){
    final TimeEntryRepository inMemoryTimeEntryRepository = new InMemoryTimeEntryRepository();
    return inMemoryTimeEntryRepository;
    }
}
>>>>>>> e0b7808a438e52fd921dddfb9745820b05b76e02
