package fsb.aoc.clubservice.web;

import fsb.aoc.clubservice.entitie.Clubs;
import fsb.aoc.clubservice.repositories.ClubRepository;
import fsb.aoc.clubservice.service.ClubsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api")

public class ClubController {

    @Autowired
    ClubRepository clubRepository;
    @Autowired
    ClubsServices clubsServices;


    @PostMapping("/clubs")
    public void ajouter(@RequestBody Clubs clubs) {
        clubRepository.save(clubs);

    }

    @GetMapping("/clubs")
    public List<Clubs> getAll() {
        return clubRepository.findAll();
    }

    @DeleteMapping("/clubs/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        clubRepository.deleteById(id);

    }
/*
    @PutMapping("/clubs/{id}")
    public void update(@PathVariable(name = "id") Long id, @RequestBody Clubs clubs) {
        Clubs clubs1 = clubRepository.getById(id);
        clubs1.setNom(clubs1.getNom());
        clubs1.setNom(clubs1.getNomPresident());


        clubRepository.save(clubs1);

    }
    */

    @PutMapping("/clubs/{id}")
    public void update(@PathVariable(name = "id") Long id, @RequestBody Clubs clubs) {
        clubsServices.updateWithoutChange(id,clubs );

    }


}