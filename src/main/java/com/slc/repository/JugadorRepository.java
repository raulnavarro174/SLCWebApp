package com.slc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.slc.component.Constants;
import com.slc.model.Dades;
import com.slc.model.Metodes;
import com.slc.model.bd.Jugador;
import com.slc.model.bd.Partit;

import java.util.List;

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
    public void main(Dades dades) {
    	log.info("Intento sumar " + dades.getMetode() + " al dorsal " + dades.getId_jugador());
        try {
        	StringBuilder s = new StringBuilder("");
        	log.info(dades.getMetode());
        	if (dades.getMetode().equals("partits")) s.append("UPDATE Jugador j SET j.partits = j.partits + 1 WHERE j.id = " + dades.getId_jugador());
        	else s.append("UPDATE Partit p SET p." + dades.getMetode() + "= p." + dades.getMetode() + "+ 1 WHERE p.id = " + dades.getId_jugador() + " ");
            Query query = entityManagerJugador.createQuery(s.toString());
            log.info("Query llançada: " + query);
            int updatecount = query.executeUpdate();
            log.info("Updates fets: " + updatecount);
        } catch (Exception e) {
            log.error("Error query UPDATE: " + e.getLocalizedMessage());
        }
    }
    
    public List<Partit> llistarPartit() {
		log.info("Repo llistarPartit connect to BBDD");
		List<Partit> result = null;
		try {
			StringBuilder str = new StringBuilder("SELECT p FROM Partit p order by p.id");
			TypedQuery<Partit> query = null;
			query = entityManagerJugador.createQuery(str.toString(), Partit.class);

			result = query.getResultList();
		} catch (Exception e) {
			log.error("Error query llistarPartit: " + e.getLocalizedMessage());
		}
		return result;
	}
    
    public List<Jugador> llistarJugador() {
		log.info("Repo llistarJugador connect to BBDD");
		List<Jugador> result = null;
		try {
			StringBuilder str = new StringBuilder("SELECT j FROM Jugador j order by j.id");
			TypedQuery<Jugador> query = null;
			query = entityManagerJugador.createQuery(str.toString(), Jugador.class);

			result = query.getResultList();
		} catch (Exception e) {
			log.error("Error query llistarJugador: " + e.getLocalizedMessage());
		}
		return result;
	}
}