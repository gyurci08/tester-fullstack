package hu.jandzsogyorgy.backend.pet.mapper;


import hu.jandzsogyorgy.backend.config.MappingConfig;
import hu.jandzsogyorgy.backend.generic.dto.EntityMapper;
import hu.jandzsogyorgy.backend.pet.dto.PetSaveDto;
import hu.jandzsogyorgy.backend.pet.entity.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = MappingConfig.class)
public interface PetSaveMapper extends EntityMapper<Pet, PetSaveDto> {

    @Mapping(target = "id", ignore = true)  // Database will create the id
    @Override
    Pet toEntity(PetSaveDto dto);

    @Mapping(target = "id", ignore = true)  // We already know the id
    void mapToTarget(@MappingTarget Pet target, PetSaveDto source);
}
