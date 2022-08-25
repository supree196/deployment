package com.locationLess.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.locationLess.Services.LocationLessService;
import com.locationLess.entities.LocationLess;

@Controller
public class LocationLessController {
	
	@Autowired
	private LocationLessService locService;
	
	@RequestMapping("/loc")
	public String SaveLocation() {
		return "NewFile";
	}
	
	// this method is used to see data in Backend which is submitted in form 
/*	@RequestMapping("/saveTheData")// Action attribute is calling to this Method
  public String SaveTheDataBoss(LocationLess location) {
		System.out.println(location.getId());
	     System.out.println(location.getName());
		System.out.println(location.getCity());
	       return"NewFile";
}*/
	@RequestMapping("/SaveDataIntoDB")
	public String SaveTheDataBoss(LocationLess location) {
		locService.save(location);// saveDatas is interface which is created in the services interface
		return "NewFile";
	}
	
}
