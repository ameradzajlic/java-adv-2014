package com.voteapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap; 
public class Dao {
    public Connection conn;
    public HashMap questions;
    
    public Dao(){
        questions = new HashMap();
        questions.put("1", "Han");
        questions.put("2", "Lea");
        questions.put("3", "Luke");
    }
    
    public void connect() throws SQLException{
        this.conn = DriverManager.getConnection("jdbc:derby:appdb;create=true");
    }
    
    public void DDL() throws SQLException{
        Statement st = this.conn.createStatement();
        st.execute("create table answers ( id int not null GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),username varchar(50), answer int)");
    } 
    public void addAnswer(String username, int answer) throws SQLException{
        PreparedStatement st = this.conn.prepareStatement("insert into answers (username, answer) values (?,?)");
        st.setString(1, username);
        st.setInt(2, answer);
        st.execute();
    } 
    public ArrayList getAnswersCount() throws SQLException{
        Statement st = this.conn.createStatement();
        ArrayList results = new ArrayList();
        ResultSet rs = st.executeQuery("select count(id) as cnt,answer from answers group by answer");
        while(rs.next()){
            results.add(new Integer[]{rs.getInt(1),rs.getInt(2)});
        }
        return results;
    }
    
    public void disconnect() throws SQLException{
        this.conn.close();
    }
}
