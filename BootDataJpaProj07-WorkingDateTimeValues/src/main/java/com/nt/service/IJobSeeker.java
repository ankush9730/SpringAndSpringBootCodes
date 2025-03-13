package com.nt.service;

import com.nt.entity.JobSeeker;

public interface IJobSeeker {

	public String registerJobSeeker(JobSeeker js);
	public Iterable<JobSeeker> showAllJobSeeker();
	
	
}
