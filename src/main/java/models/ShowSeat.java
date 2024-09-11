package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import models.Enums.ShowSeatStatus;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus status;
}
/*
ShowSeat : Show
1 - 1 => 1 showSeat can be booked for 1 show
M - 1 => 1 show can have many showSeats

ShowSeat : Seat
1 - 1 => 1 showSeat will be mapped to 1 seat
M - 1 => 1 seat can be booked in multiple shows = Multiple showSeats

 */