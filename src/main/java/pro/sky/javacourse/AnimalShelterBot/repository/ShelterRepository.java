package pro.sky.javacourse.AnimalShelterBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.javacourse.AnimalShelterBot.model.Shelter;

@Repository
public interface ShelterRepository extends JpaRepository<Shelter, Long> {
    Shelter findByName(String name);
}
