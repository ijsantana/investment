package com.idesarrollo.investment.model;

import java.time.LocalDate;

public class Person {

    private Long id;
    private String name;
    private String dni;
    private String cuil;
    private String address;
    private String phone;
    private LocalDate birthday;

    //CONSTRUCTOR
    public Person(){
        this.name = "";
        this.dni = "";
    };

    public Person(String name) {
        this.name = name;
    }



    //SETTER
    public void setName(String n) {
        this.name = n;
    }

    //GETTER
    public String getName(){
        return this.name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    //LE DA PRIORIDAD A ESTE METODO SOBRE EL toString() que viene por default.
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", cuil='" + cuil + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                '}';
    }

}