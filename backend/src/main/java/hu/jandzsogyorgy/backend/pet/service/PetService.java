package hu.jandzsogyorgy.backend.pet.service;

import hu.jandzsogyorgy.backend.pet.dto.PetDto;
import hu.jandzsogyorgy.backend.pet.dto.PetSaveDto;
import hu.jandzsogyorgy.backend.pet.entity.Pet;
import hu.jandzsogyorgy.backend.pet.mapper.PetMapper;
import hu.jandzsogyorgy.backend.pet.mapper.PetSaveMapper;
import hu.jandzsogyorgy.backend.pet.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;
    private final PetMapper petMapper;
    private final PetSaveMapper petSaveMapper;

    private Pet findPetById(Long id){
        return petRepository.findById(id).orElse(null);
    }

    public List<PetDto> listPets(){
        return petMapper.toDto(petRepository.findAll());
    }

    public PetDto loadPet(Long id){
        return petMapper.toDto(findPetById(id));
    }

    @Transactional
    public PetDto createPet(PetSaveDto dto){
        return petMapper.toDto(
                petRepository.save(petSaveMapper.toEntity(dto))
        );
    }
    @Transactional
    public PetDto editPet(Long id, PetSaveDto dto){
        var entity = findPetById(id);
        if (entity != null){
            petSaveMapper.mapToTarget(entity, dto);
            return petMapper.toDto(entity);
        }
        return null;
    }

    @Transactional
    public void deletePet(Long id){
        petRepository.deleteById(id);
    }




}
