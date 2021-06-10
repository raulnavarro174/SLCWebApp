package com.slc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.slc.component.Constants;
import com.slc.model.Dades;
import com.slc.model.bd.Jugador;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.Query;

@Repository(value = "repoJugador")
public class JugadorRepository {
    private static Logger log = LoggerFactory.getLogger(JugadorRepository.class);
    
    @Autowired
    @Qualifier("jugadorEntityManagerFactory")
    private EntityManager entityManagerJugador;
    
    @Transactional("jugadorTransactionManager")
    public void sumagol(int id_jugador) {
        log.info("Intento sumar gol al dorsal " + id_jugador);
        try {
            Query query = entityManagerJugador.createQuery("UPDATE Jugador j SET j.gols = j.gols + 1 WHERE j.id = " + id_jugador + " ");
            log.info("Query llançada: " + query);
            int updatecount = query.executeUpdate();
            log.info("Updates fets: " + updatecount);
            //hola bon dia
        } catch (Exception e) {
            log.error("Error query UPDATE: " + e.getLocalizedMessage());
        }
    }
    
    public void main(Dades dades) {
    	switch (dades.getMetode()) {
    	case Constants.SUMA_GOL_VALUE:
    		sumagol(dades.getId_jugador());
    	}
    }
}