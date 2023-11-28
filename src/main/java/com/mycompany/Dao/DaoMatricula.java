/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Dao;

import com.mycompany.Arquivos_Sistemas_Brutos.banco_de_dados_catequeseMySql;
import java.sql.ResultSet;

/**
 *
 * @author eduardo.3946
 */
public class DaoMatricula extends banco_de_dados_catequeseMySql{
    String sql;
    
    public Boolean inserir(int id, int id_endereco, String nome_da_crianca, String nome_do_Pai, String telefone_Pai, String nome_da_Mae, String telefone_Mae){
        try{
            sql = "INSERT INTO Matricula (ID, ID_ENDERECO, NOME_DA_CRIANCA, NOME_DO_PAI,  TELEFONE_DO_PAI, NOME_DA_MAE, TELEFONE_DA_MAE) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, id_endereco);
            getStatement().setString(3, nome_da_crianca);
            getStatement().setString(4, nome_do_Pai);
            getStatement().setString(5, telefone_Pai);
            getStatement().setString(6, nome_da_Mae);
            getStatement().setString(7, telefone_Mae);

            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int idEndereco, int idEstadoCivil, String nome, String sobrenome, String genero, String telefone, String email){
        try{
            sql = "UPDATE Matricula SET ID_ENDERECO = ?, NOME_DA_CRIANCA = ?, NOME_DO_PAI = ?,  TELEFONE_DO_PAI = ?, NOME_DA_MAE = ?, TELEFONE_DA_MAE = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(8, id);
            getStatement().setInt(1, idEndereco);
            getStatement().setInt(2, idEstadoCivil);
            getStatement().setString(3, nome);
            getStatement().setString(4, sobrenome);
            getStatement().setString(5, genero);
            getStatement().setString(6, telefone);
            getStatement().setString(7, email);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM Matricula WHERE ID = ?";
            
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
            sql = " SELECT ID, ID_ENDERECO, NOME_DA_CRIANCA, NOME_DO_PAI,  TELEFONE_DO_PAI, NOME_DA_MAE, TELEFONE_DA_MAE";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = " SELECT ID, ID_ENDERECO, NOME_DA_CRIANCA, NOME_DO_PAI,  TELEFONE_DO_PAI, NOME_DA_MAE, TELEFONE_DA_MAE";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome_da_Crianca(String nome){
        try{
            sql = " SELECT ID, ID_ENDERECO, NOME_DA_CRIANCA, NOME_DO_PAI,  TELEFONE_DO_PAI, NOME_DA_MAE, TELEFONE_DA_MAE";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome_do_Pai(String nome){
        try{
            sql = " SELECT ID, ID_ENDERECO, NOME_DA_CRIANCA, NOME_DO_PAI,  TELEFONE_DO_PAI, NOME_DA_MAE, TELEFONE_DA_MAE";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorTelefone_do_Pai(String telefone){
        try{
            sql = " SELECT ID, ID_ENDERECO, NOME_DA_CRIANCA, NOME_DO_PAI,  TELEFONE_DO_PAI, NOME_DA_MAE, TELEFONE_DA_MAE";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, telefone + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome_da_Mae(String nome){
        try{
            sql = " SELECT ID, ID_ENDERECO, NOME_DA_CRIANCA, NOME_DO_PAI,  TELEFONE_DO_PAI, NOME_DA_MAE, TELEFONE_DA_MAE";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    
    
    public ResultSet listarPorTelefone_da_Mae(String telefone){
        try{
            sql = " SELECT ID, ID_ENDERECO, NOME_DA_CRIANCA, NOME_DO_PAI,  TELEFONE_DO_PAI, NOME_DA_MAE, TELEFONE_DA_MAE";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, telefone + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM Matricula";
            
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