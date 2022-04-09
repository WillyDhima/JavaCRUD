/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbjavaapplication;

import java.sql.*;

/**
 *
 * @author willy
 */
public class dbConnection {

    private String url = "jdbc:mysql://localhost:3306/test2";
    private String user = "root";
    private String pass = "";
    public Connection cn;

    public Connection openDB() {
        try {
            cn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException sqlE) {
            System.out.print("" + sqlE);
        }
        return cn;
    }
}
