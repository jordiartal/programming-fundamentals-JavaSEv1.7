/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd_reyesMagos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author albertomendezhernandez
 */
public class GestionBDD {
    private final String server = "localhost";
    private final String baseDatos = "reyes";
    private final String user = "root";
    private final String pass = "";
    private Connection con;
    
    public void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+server+"/"+baseDatos,user,pass);
        }catch(Exception e){
            System.out.println("Error al cargar el driver");
        }
    }
    
    public ArrayList<Regalo> seleccionarRegalos() throws Exception{
        ArrayList<Regalo> listaRegalos = new ArrayList<Regalo>();
        Statement stmt;
        ResultSet rs;
        if(con==null){
            conectar();
        }
        stmt = con.createStatement();
        String query = "SELECT * FROM regalo";
        rs = stmt.executeQuery(query);
        while(rs.next()){
            listaRegalos.add(new Regalo(rs.getInt(1),rs.getString(2),rs.getString(3)));
        }
        return listaRegalos;
    }
    
    public void insertarRegalo(String nombre, String beneficiario) throws SQLException{
        if(con==null){
            conectar();
        }
        Statement stmt = con.createStatement();
        String query = "INSERT INTO regalo(nombre,beneficiario) VALUES ('"+nombre+"','"+beneficiario+"')";
        stmt.executeUpdate(query);
        stmt.close();
    }
}
