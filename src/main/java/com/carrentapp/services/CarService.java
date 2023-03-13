package com.carrentapp.services;

import com.carrentapp.dto.FilterDto;
import com.carrentapp.model.Car;
import com.carrentapp.repository.CarRepository;
import com.carrentapp.utils.DateUtils;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    protected @NonNull CarRepository carRepository;

    public List<Car> getFilteredCars(FilterDto filter) {
        return carRepository.getCarsByFilter(filter.getVehicle(), DateUtils.convertToLocalDateTime(filter.getPickUp()), DateUtils.convertToLocalDateTime(filter.getDropOff()));
    }
}
