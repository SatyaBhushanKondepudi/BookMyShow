package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import models.Enums.Feature;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel{
    private String name ;
    @OneToMany
    private List<Seat> seats ;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection // to store a collection of basic datatypes
    private List<Feature> features ;
}
