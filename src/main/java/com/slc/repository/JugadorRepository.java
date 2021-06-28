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
    	log.info("Intento sumar" + dades.getMetode() + "al dorsal " + dades.getId_jugador());
        try {
            Query query = entityManagerJugador.createQuery("UPDATE Partit p SET p." + dades.getMetode() + "= p." + dades.getMetode() + "+ 1 WHERE p.id = " + dades.getId_jugador() + " ");
            log.info("Query llançada: " + query);
            int updatecount = query.executeUpdate();
            log.info("Updates fets: " + updatecount);
        } catch (Exception e) {
            log.error("Error query UPDATE: " + e.getLocalizedMessage());
        }
    }
    
    public List<Jugador> llistarJugadors() {
		log.info("Repo llistarJugadors connect to BBDD");
		List<Jugador> result = null;
		try {
			StringBuilder str = new StringBuilder("SELECT j FROM Jugador j ORDER BY j.id DESC ");

			TypedQuery<Jugador> query = null;
			query = entityManagerJugador.createQuery(str.toString(), Jugador.class);

			result = query.getResultList();
		} catch (Exception e) {
			log.error("Error query llistarJugadors: " + e.getLocalizedMessage());
		}
		return result;
	}
    
    @Transactional("jugadorTransactionManager")
    public void esborra_dades_partit() {
    	log.info("Intento tornar a 0 les dades de la taula partit");
    	try {
    		for (Metodes m:Constants.listMetodes) {
    			Query query = entityManagerJugador.createQuery("UPDATE Partit p SET p." + m.getNom() + "= 0");
                log.info("Query llançada: " + query);
                int updatecount = query.executeUpdate();
                log.info("Updates fets: " + updatecount);
    		}
        } catch (Exception e) {
            log.error("Error query UPDATE: " + e.getLocalizedMessage());
        }
    }
}