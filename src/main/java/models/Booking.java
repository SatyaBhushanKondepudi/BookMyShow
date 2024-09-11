package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import models.Enums.BookingStatus;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    private String BookingReference ;
    @OneToMany
    private List<ShowSeat> showSeats ;
    @ManyToOne
    private User user ;
    private int amount ;
    @OneToMany
    private List<Payment> payment ;
    @Enumerated(EnumType.ORDINAL)
    // Enum : Integer value(Ordinal) , String value (String)
    private BookingStatus bookingStatus ;

}

/*
=> Booking : User = 1 : 1
=> User : Booking = 1 : M
=> M:1
 */