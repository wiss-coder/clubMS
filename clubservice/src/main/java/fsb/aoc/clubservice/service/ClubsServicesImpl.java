package fsb.aoc.clubservice.service;

import fsb.aoc.clubservice.entitie.Clubs;
import fsb.aoc.clubservice.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubsServicesImpl implements ClubsServices {

    @Autowired
    ClubRepository clubRepository ;
    @Override
    public void updateWithoutChange(Long id, Clubs clubs) {
        Clubs clubs1 = clubRepository.getById(id);
        if  (clubs.getNom() != null )
            clubs1.setNom(clubs.getNom());
        if (clubs.getNomPresident() != null) {
            clubs1.setNomPresident(clubs.getNomPresident());
        }


        clubRepository.save(clubs1);


    }
}
