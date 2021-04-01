package com.slc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.Query;



@Repository(value = "repoJugador")
public class JugadorRepository {
    private static Logger log = LoggerFactory.getLogger(JugadorRepository.class);

    @Autowired
    @Qualifier("jugadorEntityManagerFactory")
    private EntityManager entityManagerJugador;

    @Transactional
    public void sumagol(int id_jugador) {
        log.info("Intento sumar gol al dorsal " + id_jugador);
        try {
            Query query =  entityManagerJugador.createQuery("UPDATE Jugador SET Gols = Gols + 1 WHERE (id = " + id_jugador + ")");
            int updatecount = query.executeUpdate();
            log.info("Updates fets: " + updatecount);
        } catch (Exception e) {
            log.error("Error query UPDATE: " + e.getLocalizedMessage());
        }
    }
}
