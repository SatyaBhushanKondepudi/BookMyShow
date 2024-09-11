package models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show ;
    @ManyToOne
    private SeatType seatType ;
    private int price ;
}

/*
ShowSeatType : Show
one show can have Many ShowSeatType
One ShowSeatType will be mapped to one show

ShowSeatType : seatType
One ShowSeatType will be mapped to one seatType
One seatType can be booked in multiple shows = Multiple ShowSeatType
 */
