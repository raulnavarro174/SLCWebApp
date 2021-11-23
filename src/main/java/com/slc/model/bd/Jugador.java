package com.slc.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Jugador")
public class Jugador {

    @Id
    private Integer id;

    @Column(name = "Gols")
    private Integer gols;

    @Column(name = "Assist")
    private Integer assist;

    @Column(name = "Xuts_porta")
    private Integer xuts_porta;

    @Column(name = "Xuts_fora")
    private Integer xuts_fora;

    @Column(name = "Perdues")
    private Integer perdues;

    @Column(name = "Partits")
    private Integer partits;
    
    @Column(name = "Recuperacions")
    private Integer recuperacions;
    
    @Column(name = "Intercepcions")
    private Integer intercepcions;
    
    @Column(name = "regats")
    private Integer regats;
    
    @Column(name = "corner_provocat")
    private Integer corner_provocat;
    
    @Column(name = "falta_provocada")
    private Integer falta_provocada;
    
    @Column(name = "falta_comesa")
    private Integer falta_comesa;
    
    @Column(name = "gol_encaixat")
    private Integer gol_encaixat;
    
    @Column(name = "aturada")
    private Integer aturada;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    public Integer getAssist() {
        return assist;
    }

    public void setAssist(Integer assist) {
        this.assist = assist;
    }

    public Integer getXuts_porta() {
        return xuts_porta;
    }

    public void setXuts_porta(Integer xuts_porta) {
        this.xuts_porta = xuts_porta;
    }

    public Integer getXuts_fora() {
        return xuts_fora;
    }

    public void setXuts_fora(Integer xuts_fora) {
        this.xuts_fora = xuts_fora;
    }

    public Integer getPerdues() {
        return perdues;
    }

    public void setPerdues(Integer perdues) {
        this.perdues = perdues;
    }

    public Integer getPartits() {
        return partits;
    }

    public void setPartits(Integer partits) {
        this.partits = partits;
    }

	public Integer getRecuperacions() {
		return recuperacions;
	}

	public void setRecuperacions(Integer recuperacions) {
		this.recuperacions = recuperacions;
	}

	public Integer getIntercepcions() {
		return intercepcions;
	}

	public void setIntercepcions(Integer intercepcions) {
		this.intercepcions = intercepcions;
	}

	public Integer getRegats() {
		return regats;
	}

	public void setRegats(Integer regats) {
		this.regats = regats;
	}

	public Integer getCorner_provocat() {
		return corner_provocat;
	}

	public void setCorner_provocat(Integer corner_provocat) {
		this.corner_provocat = corner_provocat;
	}

	public Integer getFalta_provocada() {
		return falta_provocada;
	}

	public void setFalta_provocada(Integer falta_provocada) {
		this.falta_provocada = falta_provocada;
	}

	public Integer getFalta_comesa() {
		return falta_comesa;
	}

	public void setFalta_comesa(Integer falta_comesa) {
		this.falta_comesa = falta_comesa;
	}

	public Integer getGol_encaixat() {
		return gol_encaixat;
	}

	public void setGol_encaixat(Integer gol_encaixat) {
		this.gol_encaixat = gol_encaixat;
	}

	public Integer getAturada() {
		return aturada;
	}

	public void setAturada(Integer aturada) {
		this.aturada = aturada;
	}
}
