package fsb.aoc.clubservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fsb.aoc.clubservice.entitie.Clubs;
public interface ClubRepository extends JpaRepository<Clubs ,Long> {
}
