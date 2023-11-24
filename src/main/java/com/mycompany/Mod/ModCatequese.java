/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Mod;

/**
 *
 * @author eduardo.3946
 */
public class ModCatequese {
    private int id;
    private int id_volume;
    private int id_catequista;
    private String data_icicio;
    private String data_fim;

    public ModCatequese() {
    }

    public ModCatequese(int id, int id_volume, int id_catequista, String data_icicio, String data_fim) {
        this.id = id;
        this.id_volume = id_volume;
        this.id_catequista = id_catequista;
        this.data_icicio = data_icicio;
        this.data_icicio = data_fim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getid_volume() {
        return id_volume;
    }

    public void setid_volume(int id_volume) {
        this.id_volume = id_volume;
    }
    
    public int getid_catequista() {
        return id_catequista;
    }

    public void setid_catequista(int id_catequista) {
        this.id_catequista = id_catequista;
    }
    
    public String getdata_icicio() {
        return data_icicio;
    }

    public void setdata_icicio(String data_icicio) {
        this.data_icicio = data_icicio;
    }
    
    public String getdata_fim() {
        return data_fim;
    }

    public void setdata_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    @Override
    public String toString() {
        return "Catequese{" + "id =" + id + ", Volume =" + id_volume + ", Catequista =" + id_catequista + ", Icicio =" + data_icicio + ", Fim =" + data_fim +'}';
    }
}
