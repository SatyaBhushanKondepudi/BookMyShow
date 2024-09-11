package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import models.Enums.Feature;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show  extends BaseModel{
    @ManyToOne // Many shows can be played by one movie
    private Movie movie ;
    private Date startTime ;
    private Date endTime ;
    @ManyToOne // Many shows can be played in one screen
    private Screen screen;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features ;
}
/*
Show : Movie
1 - 1 => 1 show can run 1 movie
M - 1 => 1 Movie can run in many shows
show : screen
1 - 1 => 1 show can run in 1 screen
M - 1 => 1 screen can have many shows
 */
