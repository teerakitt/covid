package com.dome.covid.controler;

import com.dome.covid.entity.Data;
import com.dome.covid.service.Ser;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Control {
    @Autowired
    private Ser ser;
    @GetMapping("/")
    public String callApi(Model model) throws JsonProcessingException {
        Data data = ser.getApi();
        model.addAttribute(data);
        System.out.print(data);
        return "page";
    }
}
