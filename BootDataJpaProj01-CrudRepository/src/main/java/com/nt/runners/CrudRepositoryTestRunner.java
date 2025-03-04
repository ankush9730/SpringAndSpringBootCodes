package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorManagmentService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorManagmentService docService;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * try { //prepare
		 *  Doctor doc=new Doctor(null,"raja","MD",89666L,99999L,"cardio"); 
		 * String msg=docService.registrDoctor(doc); System.out.println(msg);
		 *  }
		 * catch(Exception e) { e.printStackTrace(); }
		 */
		
//		try {
//			Doctor doc1=new Doctor(null,"Suresh","MD",89666L,99991L,"cardio");
//			Doctor doc2=new Doctor(null,"Mahesh","MD",89666L,99989L,"physio");
//			Doctor doc3=new Doctor(null,"Karan","MD",89666L,99981L,"nuero");
//			
//			List<Doctor> list=List.of(doc1,doc2,doc3);//java 9 feature immutable collecton
//			String result=docService.registerDoctorsAsGroup(list);
//			System.out.println(result);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			String msg=docService.checkDoctorAvailabilityById(110);
//			System.out.println(msg);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			Iterable<Doctor> list=docService.findAllDoctors();
//			list.forEach(doc->{
//				System.out.println(doc);
//			});
//			
//			System.out.println("-----------------------");
//			list.forEach(doc->System.out.println(doc));
//			System.out.println("-----------------------");
//			list.forEach(System.out::println);
//			System.out.println("-----------------------");
//			long count=StreamSupport.stream(list.spliterator(), false).count();
//			System.out.println("No.of records::"+count);
//			System.out.println("-----------------------");
//			List<String> specialatiesList=StreamSupport.stream(list.spliterator(), false).map(Doctor::getSprcialization).collect(Collectors.toList());
//			System.out.println(specialatiesList);
//			System.out.println("-----------------------");
//			for(Doctor doc:list) {
//				System.out.println(doc);
//			}
//			System.out.println("-----------------------");
//			List<Doctor> list1=StreamSupport.stream(list.spliterator(), false).toList();
//			for(int i=0; i<count; ++i) {
//				System.out.println(list1.get(i));
//			}
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
////			List<Integer> ids=new ArrayList();
////			ids.add(101);ids.add(109);ids.add(103);ids.add(null);
//			
//			List<Integer> ids=Arrays.asList(101,109,103,901);
//			Iterable<Doctor> it=docService.findAllByIds(List.of(101,109,103,901));
//			long count=StreamSupport.stream(it.spliterator(), false).count();
//			System.out.println(count+" :No.of doctor are found with the given ids");
//			it.forEach(doc->{
//				System.out.println(doc);
//			});
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		try {
//			Doctor doc=docService.showDoctorById(452);
//			System.out.println("Docror info is::"+doc);
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
//		try {
//			Optional<Doctor> opt=docService.getDoctorById(111);
//			if(opt.isEmpty()) {
//				System.out.println("Doctor Not Found..!");
//			}
//			else {
//				System.out.println("Doctor found::"+opt.get());
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			String msg=docService.removeAllDoctors();
//			System.out.println(msg);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			String msg=docService.removeAllDoctorsById(List.of(108,109,111));
//			System.out.println(msg);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			String msg=docService.removeDoctorByID(111);
			System.out.println(msg);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//run(-)

}//class
