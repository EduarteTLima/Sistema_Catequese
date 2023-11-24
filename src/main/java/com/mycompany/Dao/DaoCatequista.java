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
public class DaoCatequista extends banco_de_dados_catequeseMySql{
    String sql;
    
    public ResultSet listarTodos(){
        try{
            sql = "SELECT ID, ID_ENDERECO, NOME, TELEFONE FROM CATEQUISTA";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = "SELECT ID, ID_ENDERECO, NOME, TELEFONE FROM CATEQUISTA WHERE NOME LIKE ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
}
