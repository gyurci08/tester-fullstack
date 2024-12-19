package hu.jandzsogyorgy.backend.pet.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Pet {
    @Id
    private Long id;
    private String name;
    private String type;
}
