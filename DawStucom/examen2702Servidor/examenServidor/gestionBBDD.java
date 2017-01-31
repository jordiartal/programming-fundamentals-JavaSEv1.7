package examenServidor;
import java.sql.*;
import java.util.ArrayList;

public class gestionBBDD {
	private static String server = "localhost";
	private static String bbdd = "crud";
	private static String user = "root";
	private static String pass= "";
	private static Connection con;
	
	public static void conectar(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con  = DriverManager.getConnection("jdbc:mysql://"+server+"/"+bbdd,user,pass);
		}
		catch(Exception e){
			System.out.println("Error al cargar el driver");
		}
	}
	
	public static void insertar (String nombre,int edad) throws SQLException{
		if(con==null || con.isClosed()){
			conectar();
		}
		java.sql.Statement stmt= con.createStatement();
		String query="insert into rmi (nombre,edad) values ('"+nombre+"','"+edad+"')";
		((java.sql.Statement) stmt).executeUpdate(query);
		stmt.close();
		con.close();
	}
	
	public static void modificar (int id, String nombre,int edad) throws SQLException{
		if(con==null || con.isClosed()){
			conectar();
		}
		java.sql.Statement stmt=con.createStatement();
		String query="update rmi set nombre='"+nombre+"', edad="+edad+" where id="+id+";";
		((java.sql.Statement) stmt).executeUpdate(query);
		stmt.close();
		con.close();
	}
	
	public static void eliminar (int id) throws SQLException{
		if(con==null || con.isClosed()){
			conectar();
		}
		java.sql.Statement stmt=con.createStatement();
		String query="delete from rmi where id="+id;
		((java.sql.Statement) stmt).executeUpdate(query);
		stmt.close();
		con.close();
	}
	
	public static ArrayList<String> consulta () throws SQLException{
		if(con==null || con.isClosed()){
			conectar();
		}
		String query="select * from rmi";
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<String> llista = new ArrayList<String>();
		while(rs.next()){
			llista.add(rs.getInt("id")+"/"+rs.getString("nombre")+"/"+rs.getInt("edad"));
		}
		return llista;
	}
}
