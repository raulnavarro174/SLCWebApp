package com.slc.service;

import com.slc.component.MyProperties;
import com.slc.controller.Controller;
import com.slc.repository.JugadorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service("service")
public class Service {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @Autowired
    @Qualifier("repoJugador")
    private JugadorRepository repo;

    @Autowired
    private MyProperties myProperties;


}
