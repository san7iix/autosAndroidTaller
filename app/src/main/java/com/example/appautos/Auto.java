package com.example.appautos;

public class Auto {
    private String modelo;
    private String marca;
    private String matricula;

    public Auto(String modelo, String marca, String matricula) {
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Modelo: "+modelo+", Matricula: "+matricula+", Marca: "+marca;
    }
}
