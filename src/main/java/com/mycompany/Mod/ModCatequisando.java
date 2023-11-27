/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mod;

/**
 *
 * @author eduardo.3946
 */
public class ModCatequisando {
    
    private int id;
    private int id_matricula;
    private String nome;
    private int id_endereco;
    private String descricao;

    public ModCatequisando() {
    }

    public ModCatequisando(int id,int id_matricula, String nome, int id_endereco, String descricao) {
        this.id = id;
        this.id_matricula = id_matricula;
        this.nome = nome;
        this.id_endereco = id_endereco;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Catequisando{" + "id=" + id + "id_matricula=" + id_matricula + ", nome=" + nome + "id_endreco=" + id_endereco + "\"id_endreco=\" + id_endereco + , descricao=" + descricao + '}';
    }
}

