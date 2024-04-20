package pro.sky.javacourse.AnimalShelterBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.javacourse.AnimalShelterBot.modal.Caretaker;

import java.util.Optional;

@Repository
public interface CaretakerRepository extends JpaRepository<Caretaker,Long> {
    Caretaker findByChatId(Long chatId);

    Optional<Caretaker> findById(Long id);
}