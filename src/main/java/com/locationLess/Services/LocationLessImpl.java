package com.locationLess.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationLess.entities.LocationLess;
import com.locationLess.rpository.LocationLessrepository;
@Service
public class LocationLessImpl implements LocationLessService {

	@Autowired
	LocationLessrepository lc;
	
	@Override
	public void save(LocationLess location) {
		lc.save(location);
	}
	
	

}
