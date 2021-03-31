package com.slc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository(value = "repoJugador")
public class JugadorRepository {
    private static Logger log = LoggerFactory.getLogger(JugadorRepository.class);

    @Autowired
    @Qualifier("jugadorEntityManagerFactory")
    private EntityManager entityManagerJugador;


}
