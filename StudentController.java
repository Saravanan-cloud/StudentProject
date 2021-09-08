package com.sara.controllers;   
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.sara.beans.Student;
import com.sara.dao.StudentDao;  
@Controller  
public class StudentController {  
    @Autowired  
    StudentDao dao;
    
    
    @RequestMapping("/stuform")  
    public String showform(Model m){  
    	m.addAttribute("command", new Student());
    	return "stuform"; 
    }  
    
    
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("students") Student stu){  
        dao.save(stu);  
        return "redirect:/viewstu";
        }  

    @RequestMapping("/viewstu")  
    public String viewstu(Model m){  
        List<Student> list=dao.getStudents();  
        m.addAttribute("list",list);
        return "viewstu";  
    }  

    @RequestMapping(value="/editstu/{id}")  
    public String edit(@PathVariable int id, Model m){  
        Student stu=dao.getStudentsById(id);  
        m.addAttribute("command",stu);
        return "stueditform";  
    }  

    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("stu") Student stu){  
        dao.update(stu);  
        return "redirect:/viewstu";  
    }  

    @RequestMapping(value="/deletestu/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
        dao.delete(id);  
        return "redirect:/viewstu";  
    }   
}  