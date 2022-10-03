package com.mpws.ws.mpwsws.bll;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.mpws.ws.mpwsws.bo.OutputServicesObject;
import com.mpws.ws.mpwsws.bo.beans.Job;

/**
 * 
 * @author tanguycamus
 *
 */
public interface GetAllBusiness {
	/**
	 * To get all the job list
	 * @param isEnglish
	 * @return
	 */
	public ResponseEntity<OutputServicesObject<List<Job>>> getAllJobs();
}
