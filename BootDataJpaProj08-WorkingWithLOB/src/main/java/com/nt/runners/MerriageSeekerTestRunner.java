package com.nt.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeeker;
import com.nt.service.IMarriageSeekerMgmtService;

@Component
public class MerriageSeekerTestRunner implements CommandLineRunner {

	@Autowired
	private IMarriageSeekerMgmtService merriageService;

	@Override
	public void run(String... args) throws Exception {

		try {
			// use Scanner to read inputs
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Name:");
			String name = sc.next();
			System.out.println("Enter address:");
			String addrs = sc.next();
			System.out.println("is the person indian:");
			boolean isIndian = sc.nextBoolean();
			System.out.println("Enter path of the photo file::");
			String photoPath = sc.next().trim();
			System.out.println("Enter path of the bioData file:");
			String bioDataPath = sc.next();

			// Create Streams representing photo file and bio data file and get content
			// byte[or char[]
			FileInputStream fis = new FileInputStream(photoPath);
			byte[] photoContent = fis.readAllBytes();

			File file = new File(bioDataPath);
			int length = (int) file.length();
			FileReader reader = new FileReader(file);
			char[] bioDataContent = new char[length];
			reader.read(bioDataContent);

			// create Entity class Object
			MarriageSeeker seeker = new MarriageSeeker(name, addrs, isIndian, photoContent, bioDataContent);

			// invoke the service class method
			String msg = merriageService.registerMarriageSeeker(seeker);
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
