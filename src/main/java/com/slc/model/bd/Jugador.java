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
}
