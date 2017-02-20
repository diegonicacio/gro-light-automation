package com.gro.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gro.model.sensor.Sensor;

public interface SensorRepository extends CrudRepository<Sensor, Integer> {
    @Override
    public List<Sensor> findAll();
}
