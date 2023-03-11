package com.carrentapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "drop_off_date", nullable = false)
    private LocalDate dropOffDate;

    @Column(name = "pick_up_date", nullable = false)
    private LocalDate pickUpDate;

    @Column(name = "reservation_number", nullable = false)
    private Integer reservationNumber;

    @Column(name = "reservation_price", nullable = false)
    private Integer reservationPrice;
}
