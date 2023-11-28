/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mod;

/**
 *
 * @author eduardo.3946
 */
public class ModMatricula {
    private int id;
    private int idEndereco;
    private String nome_da_Crianca;
    private String nome_do_Pai;
    private String telefone_do_Pai;
    private String nome_da_Mae;
    private String telefone_da_Mae;
    
    

    public ModMatricula(int id, int idEndereco, String nome_da_Crianca, String nome_do_Pai, String telefone_do_Pai, String nome_da_Mae, String telefone_da_Mae) {
        this.id = id;
        
        this.id = idEndereco;
        this.nome_da_Crianca = nome_da_Crianca;
        this.nome_do_Pai = nome_do_Pai;
        this.telefone_do_Pai = telefone_do_Pai;
        this.nome_da_Mae = nome_da_Mae;
        this.telefone_da_Mae = telefone_da_Mae;
    }

    public ModMatricula() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getnome_da_Crianca() {
        return nome_da_Crianca;
    }

    public void setnome_da_Crianca(String nome_da_Crianca) {
        this.nome_da_Crianca = nome_da_Crianca;
    }

    public String getnome_do_Pai() {
        return nome_do_Pai;
    }

    public void setnome_do_Pai(String nome_do_Pai) {
        this.nome_do_Pai = nome_do_Pai;
    }
    
    public String getTelefone_do_Pai() {
        return telefone_do_Pai;
    }

    public void setTelefone_do_Pai(String telefone_do_Pai) {
        this.telefone_do_Pai = telefone_do_Pai;
    }
    
    public String getnome_da_Mae() {
        return nome_da_Mae;
    }

    public void setnome_da_Mae(String nome_da_Mae) {
        this.nome_da_Mae = nome_da_Mae;
    }

    public String getTelefone_da_Mae() {
        return telefone_da_Mae;
    }

    public void setTelefone_da_Mae(String telefone_da_Mae) {
        this.telefone_da_Mae = telefone_da_Mae;
    }

    @Override
    public String toString() {
        return "ModPessoa{" + "id=" + id + ", idEndereco=" + idEndereco + ", nome_da_Crianca=" + nome_da_Crianca + ", nome_do_Pai=" + nome_do_Pai + ", telefone_do_Pai=" + telefone_do_Pai + ", nome_da_Mae=" + nome_da_Mae + ", telefone_da_Mae=" + telefone_da_Mae + '}';
    }
}