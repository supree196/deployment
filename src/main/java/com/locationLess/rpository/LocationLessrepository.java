package com.locationLess.rpository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locationLess.entities.LocationLess;

public interface LocationLessrepository extends JpaRepository<LocationLess, Long> {

}
