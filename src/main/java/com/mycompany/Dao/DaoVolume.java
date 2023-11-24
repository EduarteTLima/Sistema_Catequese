/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Dao;

import com.mycompany.Arquivos_Sistemas_Brutos.banco_de_dados_catequeseMySql;
import static com.mycompany.Arquivos_Sistemas_Brutos.banco_de_dados_catequeseMySql.getConexao;
import static com.mycompany.Arquivos_Sistemas_Brutos.banco_de_dados_catequeseMySql.getResultado;
import static com.mycompany.Arquivos_Sistemas_Brutos.banco_de_dados_catequeseMySql.getStatement;
import static com.mycompany.Arquivos_Sistemas_Brutos.banco_de_dados_catequeseMySql.setResultado;
import static com.mycompany.Arquivos_Sistemas_Brutos.banco_de_dados_catequeseMySql.setStatement;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author eduardo.3946
 */
public class DaoVolume extends banco_de_dados_catequeseMySql{
    String sql; 
    
     public Boolean inserir(int id,String nome ){
        try{
            sql = "INSERT INTO VOLUME (ID, NOME) VALUES (?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(2, nome);

            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public Boolean alterar(int id,String nome){
        try{
            sql = "UPDATE VOLUME SET NOME = ?,WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(2, id);
            getStatement().setString(1, nome);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM VOLUME WHERE ID = ?";
            
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
            sql = "SELECT ID, NOME FROM VOLUME";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    public ResultSet listarPorId(int id){
        try{
            sql = "SELECT ID, NOME FROM VOLUME WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    public ResultSet listarPorVolume(String Nome){
        try{
            sql = "SELECT ID, NOME FROM VOLUME WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, Nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM VOLUME";
            
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
