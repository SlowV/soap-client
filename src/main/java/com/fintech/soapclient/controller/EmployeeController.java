package com.fintech.soapclient.controller;

import com.fintech.soapclient.client.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    SoapClient soapClient;

    @GetMapping
    public String all(Model model) {
        model.addAttribute("employees", soapClient.getAllEmployees().getEmployeeInfo());
        return "list";
    }
}
