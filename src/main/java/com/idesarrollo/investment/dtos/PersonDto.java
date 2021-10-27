package com.idesarrollo.investment.dtos;

public class PersonDto {

    private String dni;
    private String address;
    private String name;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "dni='" + dni + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
