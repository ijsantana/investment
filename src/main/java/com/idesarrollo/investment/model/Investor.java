package com.idesarrollo.investment.model;

import javax.persistence.*;

@Entity
@Table
public class Investor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long amount;
    private String moneda;
    private String plazo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdInvestor() {
        return id;
    }

    public void setIdInvestor(Long idInvestor) {
        this.id = idInvestor;
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
                "id=" + id +
                ", amount=" + amount +
                ", moneda='" + moneda + '\'' +
                ", plazo='" + plazo + '\'' +
                '}';
    }
}
