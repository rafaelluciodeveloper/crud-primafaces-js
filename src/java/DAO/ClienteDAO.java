/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import config.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author Rafael Lucio
 */
public class ClienteDAO {
    private Conexao conexao;
    private Statement stmt;
    private boolean sucesso = false;
 
    public ClienteDAO() {
        conexao = new Conexao();
        try {
            stmt = (Statement) conexao.getConn().createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
 
    public boolean inserir(Cliente cliente) {
        try {
            stmt.execute("INSERT INTO cliente (nome, telefone) VALUES ('" + cliente.getNome() + "','" + cliente.getTelefone() + "')");
            sucesso = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
 
        return sucesso;
    }
 
    public boolean alterar(Cliente cliente) {
        try {
            stmt.execute("UPDATE cliente SET nome = '" + cliente.getNome() + "', telefone = '" + cliente.getTelefone() + "' WHERE codigo = '" + cliente.getCodigo() + "'");
            sucesso = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
 
        return sucesso;
    }
 
    public boolean remover(Cliente cliente) {
        try {
            stmt.execute("DELETE FROM cliente WHERE codigo = '" + cliente.getCodigo() + "'");
            sucesso = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
 
        return sucesso;
    }
 
    public List<Cliente> listar() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM cliente ORDER BY nome");
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
 
                clientes.add(cliente);
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
 
        return clientes;
    }
}
