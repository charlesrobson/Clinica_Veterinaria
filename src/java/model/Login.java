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
public class Login {
    private String senha, cpflog;
    
    
    public Login(String cpf, String senha) {
        this.cpflog = cpflog;
        this.senha = senha;

    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpflog(String cpflog) {
        this.cpflog = cpflog;
    }
    
}
