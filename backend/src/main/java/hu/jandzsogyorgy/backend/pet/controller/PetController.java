package hu.jandzsogyorgy.backend.pet.controller;

import hu.jandzsogyorgy.backend.pet.dto.PetDto;
import hu.jandzsogyorgy.backend.pet.dto.PetSaveDto;
import hu.jandzsogyorgy.backend.pet.service.PetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public PetDto loadPet(@PathVariable Long id){
        return petService.loadPet(id);
    }

    @PostMapping
    public PetDto createPet(PetSaveDto dto){
        return petService.createPet(dto);
    }

    @PutMapping("/{id}")
    public PetDto editPet(@PathVariable Long id, PetSaveDto dto){
        return petService.editPet(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Long id){
        petService.deletePet(id);
    }



}
