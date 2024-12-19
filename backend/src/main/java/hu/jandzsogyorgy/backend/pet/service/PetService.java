package hu.jandzsogyorgy.backend.pet.service;

import hu.jandzsogyorgy.backend.pet.dto.PetDto;
import hu.jandzsogyorgy.backend.pet.mapper.PetMapper;
import hu.jandzsogyorgy.backend.pet.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;
    private final PetMapper petMapper;

    public List<PetDto> listPets(){
        return petMapper.toDto(petRepository.findAll());
    }
}
