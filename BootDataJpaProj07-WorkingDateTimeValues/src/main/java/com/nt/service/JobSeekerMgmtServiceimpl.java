package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Service
public class JobSeekerMgmtServiceimpl implements IJobSeeker {

	@Autowired
	private IJobSeekerRepository jsRepo;
	
	@Override
	public String registerJobSeeker(JobSeeker js) {
		int idVal=jsRepo.save(js).getJsid();
		return "JobSeeker is Saved With id Value::"+idVal;
	}

	@Override
	public Iterable<JobSeeker> showAllJobSeeker() {
		
		return jsRepo.findAll();
	}

 
	
}
