package com.mpws.ws.mpwsws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpws.ws.mpwsws.bll.GetAllBusiness;
import com.mpws.ws.mpwsws.bo.OutputServicesObject;
import com.mpws.ws.mpwsws.bo.beans.Hobby;
import com.mpws.ws.mpwsws.bo.beans.Job;
import com.mpws.ws.mpwsws.bo.beans.Study;

/**
 * 
 * @author tanguycamus
 *
 */
@RestController
public class MpwsController {
	
	@Autowired
	GetAllBusiness business;
	
	/**
	 * 
	 * @return jobs list
	 */
	@PostMapping("/get-jobs")
	public ResponseEntity<OutputServicesObject<List<Job>>> getAllJobs() {
		return business.getAllJobs();
	}
	
	/**
	 * 
	 * @return hobbies list
	 */
	@PostMapping("/get-hobbies")
	public ResponseEntity<OutputServicesObject<List<Hobby>>> getAllHobies() {
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	/**
	 * 
	 * @return studies list
	 */
	@PostMapping("/get-studies")
	public ResponseEntity<OutputServicesObject<List<Study>>> getAllStudies() {
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
}
