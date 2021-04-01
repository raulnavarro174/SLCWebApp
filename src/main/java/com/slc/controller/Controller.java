package com.slc.controller;

import com.slc.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slc.model.Dades;

@org.springframework.stereotype.Controller()
public class Controller {
    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @Autowired
    @Qualifier("service")
    private Service service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login (Model model, String error, String logout) {
        log.info("Endpoint '/login' -- > login" );
        if (error != null) model.addAttribute("errorMsg", "L'usuari o la contrassenya no són correctes.");
        if (logout != null) model.addAttribute("msg", "Has sortit correctament");
        return "login";
    }

    @RequestMapping(value = "/sumaGol")
    public String sumaGol (Model model) {
        service.sumagol();
        model.addAttribute("dades", new Dades());
        return "home";
    }

}
