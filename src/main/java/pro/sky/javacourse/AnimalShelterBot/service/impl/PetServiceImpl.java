package pro.sky.javacourse.AnimalShelterBot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pro.sky.javacourse.AnimalShelterBot.model.Pet;
import pro.sky.javacourse.AnimalShelterBot.repository.PetRepository;
import pro.sky.javacourse.AnimalShelterBot.service.PetService;
@Service
public class PetServiceImpl implements PetService {

    private static final Logger logger = LoggerFactory.getLogger(PetServiceImpl.class);

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    private final PetRepository petRepository;

    @Override
    public Pet add(Pet pet) {
        logger.info("add method was invoked");
        return petRepository.save(pet);
    }

    @Override
    public Pet get(Long id) {
        logger.info("get method was invoked");
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet update(Long id, Pet pet) {
        logger.info("update method was invoked");
        return petRepository.findById(id).map(studentFromDb -> {
            studentFromDb.setCaretakerId(pet.getCaretakerId());
            studentFromDb.setShelter(pet.getShelter());
            return petRepository.save(petFromDb);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) {
        logger.info("delete method was invoked");
        petRepository.deleteById(id);
    }
}