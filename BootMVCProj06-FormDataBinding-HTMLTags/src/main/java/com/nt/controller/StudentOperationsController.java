package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {

    @GetMapping("/")
    public String showHomePage() {
        return "welcome"; // Ensure welcome.jsp exists
    }
///BootMVCProj06-FormDataBinding-HTMLTags/src/main/webapp/WEB-INF/pages/welcome.jsp
    @GetMapping("/register")
    public String showStudentFormPage() {
        return "stud_register_form";  // Ensure stud_register_form.jsp exists
    }

    @PostMapping("/register")
    public String processStudentRegistration(Map<String,Object> map,@ModelAttribute ("stud") Student stu) {
        //Write b.logic
        String result=null;
        if(stu.getAvg()<35)
        	result="fail..!";
        else
        	result="Pass";
        
        map.put("resultMsg", result);
        return "sucess";  // Create success.jsp
    }
}
