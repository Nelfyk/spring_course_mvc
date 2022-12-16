package com.ruslanburduzhan.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model){
        model.addAttribute("employee",new Employee());
        return "ask-details-view";
    }
    @RequestMapping("/showDetails")
    public String showDetails(@Valid @ModelAttribute("employee") Employee emp,
                              BindingResult bindingResult){
        String view="show-details-view";
        if(bindingResult.hasErrors()){
            view="ask-details-view";
        }
        return view;
    }
}
