package hu.jandzsogyorgy.backend.pet.controller;

import hu.jandzsogyorgy.backend.pet.dto.PetDto;
import hu.jandzsogyorgy.backend.pet.service.PetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/pets")
public class PetController {
    private final PetService petService;

    @GetMapping
    public List<PetDto> listPets(){
        return petService.listPets();
    }
}
