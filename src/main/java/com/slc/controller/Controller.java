package com.slc.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slc.component.Constants;
import com.slc.model.Dades;
import com.slc.model.Metodes;
import com.slc.model.bd.Jugador;
import com.slc.service.Service;

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
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String mainGet (ModelMap model) {
    	log.info("Endpoint '/' --> SLCWebApp");
    	model = getParams(model);
    	
    	model.addAttribute("dades", new Dades());
    	return "home";
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public String mainPost (@ModelAttribute("dades") Dades dades, ModelMap model) {
        log.info("Endpoint '/main' --> SLCWebApp");
    	model = getParams(model);
        service.main(dades);
        model.addAttribute("dades", dades);
    	
        return "home";
    }
    
    @RequestMapping("/escriu")
	public String escriu(@ModelAttribute("dades") Dades dades, ModelMap model, HttpServletResponse response) {
		log.info("Endpoint '/escriu' --> home");
		List<Jugador> listJugador = service.llistarJugador();
		model.addAttribute("resultQuery", listJugador);

		return "llistarJugador";
	}
    
    @RequestMapping("/esborrapartit")
    public String esborrapartit(ModelMap model,HttpServletResponse response) {
    	log.info("Endpoint '/esborrapartit'");
    	service.esborra_partit();
    	model.addAttribute("dades", new Dades());
    	return "home";
    }
    
    private ModelMap getParams(ModelMap model) {
		List<Metodes> list = Constants.listMetodes;
		model.addAttribute("listmetodes", list);
		
		List<Integer> llist = Constants.jugadors;
		model.addAttribute("jugadors", llist);

		return model;
	}
}
