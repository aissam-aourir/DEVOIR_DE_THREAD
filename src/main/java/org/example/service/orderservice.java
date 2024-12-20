package org.example.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.example.DBconnection.connexion;
import org.example.model.Order;

public class orderservice {
    connexion conn;
    Connection con;
    public orderservice() throws SQLException, ClassNotFoundException {
        conn=new connexion();
        this.con = conn.getConnection();
    }
    public boolean getorder(int id) throws SQLException, ClassNotFoundException {
        String sql="select * from orders where id=?";
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeQuery();
        ResultSet rs=pst.getResultSet();
        if(rs.next()){
            return true;
        }
        return false;
    }
    public void orderinsert(Order order) throws SQLException, ClassNotFoundException {
        String sql = "insert into orders values(?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1,order.getId());
        pstmt.setString(2,order.getDate());
        pstmt.setFloat(3,order.getAmount());
        pstmt.setInt(4,order.getCustomerId());
        pstmt.executeUpdate();}


}
