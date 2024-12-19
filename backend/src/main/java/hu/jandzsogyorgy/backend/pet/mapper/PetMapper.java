package hu.jandzsogyorgy.backend.pet.mapper;


import hu.jandzsogyorgy.backend.config.MappingConfig;
import hu.jandzsogyorgy.backend.generic.dto.GenericMapper;
import hu.jandzsogyorgy.backend.pet.dto.PetDto;
import hu.jandzsogyorgy.backend.pet.entity.Pet;
import org.mapstruct.Mapper;

@Mapper(config = MappingConfig.class)
public interface PetMapper extends GenericMapper<Pet, PetDto> {
}
