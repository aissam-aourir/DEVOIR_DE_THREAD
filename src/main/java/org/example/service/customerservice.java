package org.example.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.example.DBconnection.connexion;
import org.example.model.Customer;

public class customerservice {
    connexion conn;
    Connection con;
    public customerservice() throws SQLException, ClassNotFoundException {
        conn=new connexion();
        this.con=conn.getConnection();
    }
    public boolean getcustomer(int customerid) throws SQLException {
        String sql="select * from customers where id=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setInt(1, customerid);
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){
            Customer c=new Customer();
            c.setId(rs.getInt("id"));
            c.setName(rs.getString("name"));
            c.setEmail(rs.getString("email"));
            return true;
        }
        return false;

    }

}
