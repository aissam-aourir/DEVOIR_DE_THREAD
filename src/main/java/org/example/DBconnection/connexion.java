package org.example.DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexion {
    Connection connection ;

    public connexion() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/threadsproject","root","");

    }
    public Connection getConnection(){
        return connection;
    }
}
