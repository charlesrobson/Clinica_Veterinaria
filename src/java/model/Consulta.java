/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cliente
 */
public class Consulta {

    private String numero, nomeveterinario, animal, diagnostico, horainicio, horafim, data, valor;

    public Consulta(String numero, String nomeveterinario, String animal, String data, String horainicio, String horafim, String valor, String diagnostico) {
        
        this.numero = numero;
        this.nomeveterinario = nomeveterinario;
        this.animal = animal;
        this.data = data;
        this.horainicio = horainicio;
        this.horafim = horafim;
        this.valor = valor;
        this.diagnostico = diagnostico;
     
    }

    public String getNumero() {
        return numero;
    }

    public String getNomeveterinario() {
        return nomeveterinario;
    }

    public String getAnimal() {
        return animal;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public String getHorafim() {
        return horafim;
    }

    public String getData() {
        return data;
    }

    public String getValor() {
        return valor;
    }



}
