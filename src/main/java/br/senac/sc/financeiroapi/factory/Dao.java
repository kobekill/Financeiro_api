/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sc.financeiroapi.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bruno
 */
public class Dao {

    protected PreparedStatement stmt;
    protected ResultSet rs;
    protected String msql;
    protected boolean debug = true;

    protected Connection conexao;
    private static final String DATABASE_NAME = "financeiro";

    public Dao() {
        conexao = Conexao.getConexao();
        openOrCreateDatabase();
    }

    private void openOrCreateDatabase() {

        try {
            stmt = conexao.prepareStatement("CREATE DATABASE IF NOT EXISTS " + DATABASE_NAME);
            stmt.execute();

            stmt = conexao.prepareStatement("USE " + DATABASE_NAME);
            stmt.execute();
        } catch (SQLException ex) {

            System.err.println(ex.getMessage());
        }
    }
}
