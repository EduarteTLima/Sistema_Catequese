/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Dao;

import com.mycompany.Arquivos_Sistemas_Brutos.banco_de_dados_catequeseMySql;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author eduardo.3946
 */
public class DaoCatequese extends banco_de_dados_catequeseMySql{
    private String sql;
    
    public Boolean inserir(int id, int id_volume, String data_icicio, String data_fim, int id_catequista){
        try{
            sql = "INSERT INTO CATEQUESE(ID, ID_VOLUME,ID_CATEQUISTA, DATA_INICIO, DATA_FIM) VALUES (?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, id_volume);
            getStatement().setInt(3, id_catequista);
            getStatement().setString(4, data_icicio);
            getStatement().setString(5, data_fim);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int novo_id_volume, String novo_data_icicio, String novo_data_fim, int novo_id_catequista){
        try{
            sql = "UPDATE CATEQUESE SET ID_VOLUME = ?, ID_CATEQUISTA = ?, DATA_INICIO = ?, DATA_FIM = ?,WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, novo_id_volume);
            getStatement().setInt(3, novo_id_catequista);
            getStatement().setString(4, novo_data_icicio);
            getStatement().setString(5, novo_data_fim);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM CATEGORIA WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet listarTodos(){
        try{
            sql = "SELECT ID, ID_VOLUME, ID_CATEQUISTA, DATA_INICIO, DATA_FIM FROM CATEQUESE";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = "SELECT ID, ID_VOLUME, ID_CATEQUISTA, DATA_INICIO, DATA_FIM FROM CATEQUESE WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorVolume(int Volume){
        try{
            sql = "SELECT ID, ID_VOLUME, ID_CATEQUISTA, DATA_INICIO, DATA_FIM FROM CATEQUESE WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, Volume + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorInicio(Date inicio){
        try{
            sql = "SELECT ID, ID_VOLUME, ID_CATEQUISTA, DATA_INICIO, DATA_FIM FROM CATEQUESE WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, inicio + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorFim(Date fim){
        try{
            sql = "SELECT ID, ID_VOLUME, ID_CATEQUISTA, DATA_INICIO, DATA_FIM FROM CATEQUESE WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, fim + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM CATEQUESE";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next(); //Move para o primeiro registro.
            
            id = getResultado().getInt(1); //Pega o valor retornado na consulta
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
    }
    
}
