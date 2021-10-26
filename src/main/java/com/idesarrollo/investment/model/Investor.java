package com.idesarrollo.investment.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table
public class Investor extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idInvestor;
    private Long amount;
    private String moneda;
    private String plazo;

    public Long getIdInvestor() {
        return idInvestor;
    }

    public void setIdInvestor(Long idInvestor) {
        this.idInvestor = idInvestor;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPlazo() {return plazo;}

    public void setPlazo(String plazo) {this.plazo = plazo;}

    @Override
    public String toString() {
        return "Investor{" +
                "id=" + idInvestor +
                ", amount=" + amount +
                ", moneda='" + moneda + '\'' +
                ", plazo='" + plazo + '\'' +
                '}';
    }
}
