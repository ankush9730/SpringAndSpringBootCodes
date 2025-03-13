package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MarriageSeeker;
import com.nt.repository.MerriageSeekerRepository;

@Service
public class MerraigeSeekerMgmtServiceImpl implements IMarriageSeekerMgmtService {

	@Autowired
	private MerriageSeekerRepository merraigeRepo;
	@Override
	public String registerMarriageSeeker(MarriageSeeker info) {
		int idVal=merraigeRepo.save(info).getMid();
		return "MerriageSeeker info is saved with id value::"+idVal;
	}

}
