package com.mpws.ws.mpwsws.bll.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mpws.ws.mpwsws.bll.GetAllBusiness;
import com.mpws.ws.mpwsws.bo.OutputServicesObject;
import com.mpws.ws.mpwsws.bo.beans.Job;
import com.mpws.ws.mpwsws.dal.DaoJob;

/**
 * 
 * @author tanguycamus
 *
 */
@Service
public class GetAllBusinessImpl implements GetAllBusiness {
	
	@Autowired
	DaoJob daoJob;

	@Override
	public ResponseEntity<OutputServicesObject<List<Job>>> getAllJobs() {
		OutputServicesObject<List<Job>> output = new OutputServicesObject<>();
		HttpStatus httpStatus;
		try {
			List<Job> jobs = (List<Job>) daoJob.findAll();
			output.setBody(jobs);
			httpStatus = HttpStatus.ACCEPTED;
		} catch (Exception e) {
			output.setErrorMessage("Erreur à la récupération des travaux");
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<OutputServicesObject<List<Job>>>(output, httpStatus);
	}

}
