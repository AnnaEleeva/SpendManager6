package com.caterhog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
//import oracle.jdbc.driver.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateConnection {

    public static void main(String[] args) {

       createConnect();
    }

    public static Connection createConnect() {
        Locale.setDefault(Locale.ENGLISH);
        Connection dbConnection = null;
        try { // Загружаем драйвер jdbc
           // Class.forName("org.postgresql.Driver");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
             //  Создаем подключение к БД
            //String url = "jdbc:postgresql://localhost:5432/yozhdb";
            String url="jdbc:mysql://localhost:3306/business";
            String name = "root2";
            String password = "root";
            //String name = "yozh";
            //String password = "yozh";
            Class.forName("com.mysql.jdbc.Driver");
           // Class.forName("org.postgresql.Driver");
            try {
                dbConnection = DriverManager.getConnection(url, name, password);
                //System.out.println("Connected");
                //con.close();
                //System.out.printf("Disconnercted");
                            } catch  (SQLException e){
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }  /*finally {
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }*/
        return dbConnection;

    }
    public static Connection getConnection() throws SQLException {
        //return new OracleDriver().defaultConnection();
        return getConnection();
    }
}
