/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mod;

/**
 *
 * @author eduardo.3946
 */
public class ModEndereco {
    private int id;
    private String Cidade;
    private String nomeRua;
    private String cep;
    private String numeroResidencia;

    public ModEndereco(int id, String Cidade, String nomeRua, String cep, String numeroResidencia) {
        this.id = id;
        this.Cidade = Cidade;
        this.nomeRua = nomeRua;
        this.cep = cep;
        this.numeroResidencia = numeroResidencia;
    }

    public ModEndereco() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    @Override
    public String toString() {
        return "ModEndereco{" + "id=" + id + ", Cidade=" + Cidade + ", nomeRua=" + nomeRua + ", cep=" + cep + ", numeroResidencia=" + numeroResidencia + '}';
    }
}