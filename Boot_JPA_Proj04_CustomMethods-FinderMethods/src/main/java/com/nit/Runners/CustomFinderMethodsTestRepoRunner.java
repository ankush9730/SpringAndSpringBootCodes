package com.nit.Runners;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.repository.IDoctorRepository;

@Component
public class CustomFinderMethodsTestRepoRunner implements CommandLineRunner {
	@Autowired
	private IDoctorRepository docRepo;

	@Override
	public void run(String... args) throws Exception {

		/*List<Doctor> list = docRepo.getBySpecializationEquals("cardio");
		list.forEach(System.out::println);*/
		
		/*List<Doctor> list=docRepo.findBySpecializationEquals("cardio");
		list.forEach(System.out::println);
		 */
		
//		docRepo.findBySpecialization("cardio").forEach(System.out::println);
		
		/*docRepo.findByDnameStartingWith("R").forEach(System.out::println);
		System.out.println("------------------------");
		docRepo.findByDnameEndingWith("h").forEach(System.out::println);
		System.out.println("------------------------");
		docRepo.findByDnameContaining("s").forEach(System.out::println);*/
		
		/*System.out.println("------------------------");
		docRepo.findByDnameLike("s%").forEach(System.out::println);
		System.out.println("---------------------------------");
		docRepo.findByDnameLike("%h").forEach(System.out::println);
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		docRepo.findByDnameLike("s%s").forEach(System.out::println);*/
		
		/*System.out.println("---------------------------------");
		docRepo.findByIncomeBetween(50000.0, 95000.0).forEach(System.out::println);*/
		System.out.println("---------------------------------");
		
//		docRepo.findByIncomeGreaterThanAndIncomeLessThan(50000, 100000).forEach(System.out::println);
		
//		docRepo.findBySpecializationIgnoreCase("cardio").forEach(System.out::println);		
		
		docRepo.findBySpecializationEqualsIgnoreCaseOrderByDname("cardio").forEach(System.out::println);
	}

}
