/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rafael Lucio
 */
public class Conexao {

    private final String driver = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/crudrafael";
    private final String USER = "root";
    private final String SENHA = "";
    private Connection conn;

    public Conexao() {
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(URL, USER, SENHA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void fecharConexao() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
