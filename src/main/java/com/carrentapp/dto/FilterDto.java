package com.carrentapp.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter @Setter
public class FilterDto {
    protected String vehicle;
    @DateTimeFormat(pattern = "dd/mm/yyyy") protected Date pickUp;
    @DateTimeFormat(pattern = "dd/mm/yyyy") protected Date dropOff;
}
