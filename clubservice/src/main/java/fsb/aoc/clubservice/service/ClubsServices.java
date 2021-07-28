package fsb.aoc.clubservice.service;

import fsb.aoc.clubservice.entitie.Clubs;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ClubsServices {

    public void updateWithoutChange( Long id, Clubs clubs);
}
