package fsb.aoc.clubservice;

import fsb.aoc.clubservice.entitie.Clubs;
import fsb.aoc.clubservice.repositories.ClubRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.Callable;

@SpringBootApplication
public class ClubserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClubserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClubRepository clubRepository){

        Clubs clubs1 = new Clubs (null ,"clubWeb", "yussuf")  ;
        Clubs clubs2 = new Clubs( null,"chessclub", "wissal")  ;
        Clubs clubs3 = new Clubs( null ,"design", "fares")  ;


        return args ->
        {

            clubRepository.save(clubs1) ;
            clubRepository.save(clubs2) ;
            clubRepository.save(clubs3) ;


        };
    }

}
