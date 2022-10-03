package com.mpws.ws.mpwsws.dal;

import org.springframework.data.repository.CrudRepository;

import com.mpws.ws.mpwsws.bo.beans.Job;

public interface DaoJob extends CrudRepository<Job, Integer> {

}
