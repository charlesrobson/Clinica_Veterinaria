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
public class Animal {
     private String nome, tipo, raca, tutor, alergico, id, idade, peso, altura;

    public Animal(String id, String nome, String tipo, String raca, String idade, String alergico, String peso, String altura, String tutor) {       
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.alergico = alergico;
        this.peso = peso;
        this.altura = altura;
        this.tutor = tutor;            
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public String getTutor() {
        return tutor;
    }

    public String getAlergico() {
        return alergico;
    }

    public String getId() {
        return id;
    }

    public String getIdade() {
        return idade;
    }

    public String getPeso() {
        return peso;
    }

    public String getAltura() {
        return altura;
    }




}
