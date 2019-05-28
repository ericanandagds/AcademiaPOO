package Dao;

import Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Familia
 */
public class usuarioDAO {
    private final conexao conexao;
    private int id;
    private String nome;
    private String cpf;
    private String usuario;
    public usuarioDAO(){ 
        this.conexao = new conexao().getConexao();
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO usuario(nome,cpf,usuario,senha) VALUES(?,?,?)";
        try { 
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, Usuario.getcpf());
            stmt.setString(3, usuario.getUsuario());
            stmt.setString(4, usuario.getSenha());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}
