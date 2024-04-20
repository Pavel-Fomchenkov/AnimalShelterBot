package pro.sky.javacourse.AnimalShelterBot.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.javacourse.AnimalShelterBot.modal.Shelter;
import pro.sky.javacourse.AnimalShelterBot.modal.Volunteer;
import pro.sky.javacourse.AnimalShelterBot.repository.ShelterRepository;
import pro.sky.javacourse.AnimalShelterBot.service.ShelterService;

import java.awt.*;
import java.util.List;

@Service
public class ShelterServiceImpl implements ShelterService {
    private ShelterRepository shelterRepository;
    public ShelterServiceImpl(ShelterRepository shelterRepository) {

        this.shelterRepository = shelterRepository;
    }
    @Override
    public Shelter findingShelterByName(String name) {
        return shelterRepository.findByName(name);
    }

    @Override
    public Shelter addShelter(String name, String address, String info, String regime, List<Image> locationMaps) {
        Shelter shelter = new Shelter(name, info, regime);
        return (Shelter) shelterRepository.save(shelter);
    }

    @Override
    public Shelter addShelter(Shelter shelter) {
        return (Shelter) shelterRepository.save(shelter);
    }

    @Override
    public List<Volunteer> addVolunteer(String name, String address) {
        //Volunteer volunteer = new Volunteer(name, address);
        //shelterModal.getVolunteers().add(volunteer);
        return null;
    }

    @Override
    public String getInfoAboutShelter(String name) {
        return shelterRepository.findByName(name).getInfo();
    }


}