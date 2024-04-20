package pro.sky.javacourse.AnimalShelterBot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sky.javacourse.AnimalShelterBot.intermediary.QueryDefinitionClass;
import pro.sky.javacourse.AnimalShelterBot.modal.Shelter;
import pro.sky.javacourse.AnimalShelterBot.service.ShelterService;

import java.awt.*;
import java.util.List;

@RestController("shelter")
public class ShelterController {
    @Autowired
    private ShelterService shelterService;
    @Autowired
    private QueryDefinitionClass queryDefinitionClass;

    public ShelterController(ShelterService shelterService, QueryDefinitionClass queryDefinitionClass) {
        this.shelterService = shelterService;
        this.queryDefinitionClass = queryDefinitionClass;
    }

    @GetMapping("give_info")
    public String giveInfoAboutShelter(@RequestParam String name) {
        return queryDefinitionClass.getInfoAboutShelter(name);
    }

    @PostMapping
    public Shelter addShelter(@RequestBody Shelter shelter) {
        Shelter savedShelter = shelterService.addShelter(shelter);
        return savedShelter;
    }
}
