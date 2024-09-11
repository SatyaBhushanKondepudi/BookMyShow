package models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends  BaseModel{
    private String name ;
    @ManyToOne
    private City city ;
    @OneToMany
    private List<Screen> screens ;
}

/*
Theatre : City
One Theatre is Present in One City
One City can have Many Theatres

Theatre : Screen
One Theatre can have Many Screens
One screen can be part of only one Theatre
 */