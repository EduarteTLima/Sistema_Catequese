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
import java.sql.ResultSet;

/**
 *
 * @author eduardo.3946
 */
public class DaoCatequisando extends banco_de_dados_catequeseMySql{
    
    private String sql; 
    
    public Boolean inserir(int id,int id_matricula, String nome,int id_endereco, String descricao){
        try{
            sql = "INSERT INTO CATEQUISTA (ID, ID_MATRICULA, NOME, ID_ENDERECO, DESCRICAO) VALUES (?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, id_matricula);
            getStatement().setString(3, nome);
            getStatement().setInt(4, id_endereco);
            getStatement().setString(5, descricao);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id,int Novo_id_matricula, String Novo_Nome, int Novo_id_endereco, String Nova_Descricao){
        try{
            sql = "UPDATE CATEQUISANDO SET ID_MATRICULA = ?, NOME = ?, ID_ENDERECO = ?, DESCRICAO = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(3, id);
            getStatement().setInt(1, Novo_id_matricula);
            getStatement().setString(2, Novo_Nome);
            getStatement().setInt(3, Novo_id_endereco);
            getStatement().setString(4, Nova_Descricao);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM CATEQUISANDO WHERE ID = ?";
            
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
            sql = "SELECT ID, ID_MATRICULA, NOME, ID_ENDERECO, IFNULL(DESCRICAO, '') FROM CATEQUISANDO";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = "SELECT ID, ID_MATRICULA, NOME, ID_ENDERECO, IFNULL(DESCRICAO, '') FROM CATEQUISANDO WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    public ResultSet listarPorIdmatricula(int id_matricula){
        try{
            sql = "SELECT ID, ID_MATRICULA, NOME, ID_ENDERECO, IFNULL(DESCRICAO, '') FROM CATEQUISANDO WHERE ID_MATRICULA= ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id_matricula);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    public ResultSet listarPorIdEndereco(int id_endereco){
        try{
            sql = "SELECT ID, ID_MATRICULA, NOME, ID_ENDERECO, IFNULL(DESCRICAO, '') FROM CATEQUISANDO WHERE ID_ENDERECO = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id_endereco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    public ResultSet listarPorNome(String nome){
        try{
            sql = "SELECT ID, ID_MATRICULA, NOME, ID_ENDERECO, IFNULL(DESCRICAO, '') FROM CATEQUISANDO WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDescricao(String descricao){
        try{
            sql = "SELECT ID, ID_MATRICULA, NOME, ID_ENDERECO, IFNULL(DESCRICAO, '') FROM CATEQUISANDO WHERE DESCRICAO LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, descricao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM CATEQUISANDO";
            
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

