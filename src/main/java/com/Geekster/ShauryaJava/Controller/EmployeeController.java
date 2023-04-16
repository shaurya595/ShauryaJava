package com.Geekster.ShauryaJava.Controller;

import com.Geekster.ShauryaJava.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    Employee t1;
    @RequestMapping( value = "/employee" , method = RequestMethod.GET)
    public String want(){
        return t1.want();
    }

}
