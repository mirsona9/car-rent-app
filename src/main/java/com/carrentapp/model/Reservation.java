package com.carrentapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter @Setter
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "drop_off_date", nullable = false)
    private LocalDate dropOffDate;

    @Column(name = "pick_up_date", nullable = false)
    private LocalDate pickUpDate;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "car_id")
    private Long carId;

    @ManyToOne
    @JoinColumn(name = "car_id", updatable = false, insertable = false)
    private Car car;
}
