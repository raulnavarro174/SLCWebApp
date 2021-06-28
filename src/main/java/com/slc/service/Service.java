package com.slc.service;

import com.slc.component.MyProperties;
import com.slc.controller.Controller;
import com.slc.model.Dades;
import com.slc.model.bd.Jugador;
import com.slc.repository.JugadorRepository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service("service")
public class Service {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @Autowired
    @Qualifier("repoJugador")
    private JugadorRepository repo;

    @Autowired
    private MyProperties myProperties;

    @Transactional
    public void main (Dades dades) {
        repo.main(dades);
    }

	public List<Jugador> llistarJugador() {
		return repo.llistarJugadors();
	}
	
	@Transactional
	public void esborra_partit( ) {
		repo.esborra_dades_partit();
	}

}
