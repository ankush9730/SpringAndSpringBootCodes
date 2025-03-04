package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service
public class DoctorMgmtServiceImp implements IDoctorManagmentService {

	@Autowired
	private IDoctorRepository doctorRepo;//injectes the dynamically InMemory proxy class obj
	
	@Override
	public String registrDoctor(Doctor doctor) {
		//save the object(insert the record)
		Doctor savedDoctor=doctorRepo.save(doctor);
		//get the generated id value
		int idVal=savedDoctor.getDid();
		return "Doctor Obj is saved with- "+idVal;
	}

	@Override
	public long showDoctorsCount() {
		long count = doctorRepo.count();
		return count;
	}

//	@Override
//	public String registerDoctorsAsGroup(Iterable<Doctor> list) {
//		//Save objects
//		Iterable<Doctor> savedList=doctorRepo.saveAll(list);
//		//get saved objs count
//		List<Doctor> savedList1=(List<Doctor>)savedList;
//		int count=savedList1.size();
//		//get only id values form the savedList
//		List<Integer> ids=new ArrayList<>();
//		savedList1.forEach(doc->{
//			ids.add(doc.getDid());
//		});
//		
//		return count+" no.of doctors are saved with id values::"+ids;
//	}

	// OR
	@Override
	public String registerDoctorsAsGroup(Iterable<Doctor> list) {
		// Save objects
		Iterable<Doctor> savedList = doctorRepo.saveAll(list);
		List<Integer> ids = StreamSupport.stream(savedList.spliterator(), false).map(Doctor::getDid)
				.collect(Collectors.toList());
		return ids.size() + " no.of doctors are saved with id values::" + ids;

	}

	@Override
	public String checkDoctorAvailabilityById(int id) {
		boolean flag = doctorRepo.existsById(id);
		return flag ? id + " id value Doctor found" : "Doctor not found";
	}

	@Override
	public Iterable<Doctor> findAllDoctors() {

		return doctorRepo.findAll();
	}

	@Override
	public Iterable<Doctor> findAllByIds(Iterable<Integer> ids) {
		return doctorRepo.findAllById(ids);
		
	}

	

	

//	@Override
//	public Doctor showDoctorById(int id) 
//	{
//		Optional<Doctor> opt=doctorRepo.findById(id);
//		if(opt.isPresent())
//		{
//			//get the Object
//			Doctor doc=opt.get();
//			return doc;
//		}
//		throw new IllegalArgumentException("Invalid Doctor Id");
//	}
	 
//	@Override
//	public Doctor showDoctorById(int id) {
//		
//		return doctorRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id"));
//	}
	
//	@Override
//	public Doctor showDoctorById(int id) {
//		return doctorRepo.findById(id).orElseThrow(()->new DoctorNotFoundException("Invalid id"));
//	}
	
	@Override
	public Doctor showDoctorById(int id) {
		return doctorRepo.findById(id).orElse(new Doctor(1111,"abd","MBBS",999L,789565L,"Duty-Doctor"));
	}

	@Override
	public String fetchDoctorById(int id) {

		Optional<Doctor> opt=doctorRepo.findById(id);
		if(opt.isPresent()) {
			Doctor doc=opt.get();
			return id+"Doctor id details are"+doc;
		}else
		{
			return id+"Doctor Not Found!";
		}
	}

	@Override
	public Optional<Doctor> getDoctorById(int id) {
		Optional<Doctor> opt=doctorRepo.findById(id);
		if(opt.isEmpty()) {
			return Optional.empty();
		}
		else {
			return opt;
		}
	}

	@Override
	public String registerOrUpdateDoctor(Doctor doctor) 
	{
		doctorRepo.save(doctor);
			doctorRepo.save(doctor);
			
			return "Doctor is Saved/Updated";
		}

	@Override
	public String removeAllDoctors() {
		//get the count of records
		long count=doctorRepo.count();
		//delete all the records
		doctorRepo.deleteAll();
		return count+" no.of Doctors are deleted";
	}

	@Override
	public String removeAllDoctorsById(Iterable<Integer> ids) {
		//get doctors By Ids
		Iterable<Doctor> list=doctorRepo.findAllById(ids);
		long count=StreamSupport.stream(list.spliterator(), false).count();
		//delete doctors By Ids
		doctorRepo.deleteAllById(ids);
		
		return count+"no.of doctors are deleted";
	}

	@Override
	public String removeDoctorByID(int id) {
		//Load the object
		Optional<Doctor> opt=doctorRepo.findById(id);
		if(opt.isPresent()) {
			doctorRepo.deleteById(id);
			return "Doctor "+id+" is deleted Successfully..!";
		}
		return "id Doctor Not Found..!";
	} 

	 

}
