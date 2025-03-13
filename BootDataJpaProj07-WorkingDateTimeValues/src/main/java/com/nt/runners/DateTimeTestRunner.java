package com.nt.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.JobSeekerMgmtServiceimpl;

@Component
public class DateTimeTestRunner implements CommandLineRunner {

	@Autowired
	private JobSeekerMgmtServiceimpl jsServcice;

	@Override
	public void run(String... args) throws Exception {
 		try {
 			// prepare jobseeker object
 			JobSeeker js = new JobSeeker("Ankush", "Hyd",
 					LocalDateTime.of(2003, 05, 21,10,20),LocalTime.of(19,03),
 					LocalDate.of(2019,12,01));
 			String msg=jsServcice.registerJobSeeker(js);
 			System.out.println(msg);
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
		
//		 try {
//			jsServcice.showAllJobSeeker().forEach(System.out::println);
//		 }catch(Exception e) {
//			 e.printStackTrace();
//		 }

	}

}
