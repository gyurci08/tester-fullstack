package hu.jandzsogyorgy.backend.pet.repository;

import hu.jandzsogyorgy.backend.pet.entity.Pet;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends ListCrudRepository<Pet, Long> {
}
