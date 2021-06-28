package com.slc.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Partit")
public class Partit {

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
    
    @Column(name = "Recuperacions")
    private Integer recuperacions;
    
    @Column(name = "Intercepcions")
    private Integer intercepcions;
    
    @Column(name = "gols_generats")
    private Integer gols_generats;

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

	public Integer getGols_generats() {
		return gols_generats;
	}

	public void setGols_generats(Integer gols_generats) {
		this.gols_generats = gols_generats;
	}
}
