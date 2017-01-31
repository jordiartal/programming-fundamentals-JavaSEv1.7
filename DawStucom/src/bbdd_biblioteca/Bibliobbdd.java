package bbdd_biblioteca;
import java.sql.*;
import java.util.ArrayList;

public class Bibliobbdd {
	private static String server = "localhost";
	private static String bbdd = "biblio";
	private static String user = "root";
	private static String pass= "";
	private static Connection con;
	
	//funcion per a conectar---------------------------------------------------------------------------------
	public static void conectar(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con  = DriverManager.getConnection("jdbc:mysql://"+server+"/"+bbdd,user,pass);
		}
		catch(Exception e){
			System.out.println("Error al cargar el driver");
		}
	}
	
	//funcio per a INSERTAR autors a la BBDD--------------------------------------------------
	public void insertarAutor(String nombre, String apellidos) throws SQLException {
		if(con==null || con.isClosed()){
			conectar();
		}
		//generar la conexió
		Statement stmt = con.createStatement();
		//genera el INSERT mitjançant  Statement
		String query = "insert into autor (nombre,apellido) values ('" +nombre+ "','" +apellidos+"')";
		stmt.executeUpdate(query);
		stmt.close();
		con.close();
	}
	
	//funcio per a MOSTRAR autor de la BBDD------------------------------------------------------------------
	public static ArrayList<String> mostrarAutor() throws SQLException{
		if(con==null || con.isClosed() || con.isClosed()){
			conectar();
		}
		String seleccio = "select * from autor;";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(seleccio);
		ArrayList<String> llista = new ArrayList<String>();
		while(rs.next()){
			llista.add(rs.getShort("codigo")+" "+rs.getString("nombre")+" "+rs.getString("apellido"));
		}
		return llista;
	}
	
	//funcio per a MOSTRAR autor de la BBDD SENSE LLIBRES--------------------------------------------
		public static ArrayList<String> mostrarAutorSense() throws SQLException{
			if(con==null || con.isClosed()){
				conectar();
			}
			String seleccio = "select * from autor a where a.codigo not in (select distinct codigo_autor from libro);";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(seleccio);
			ArrayList<String> llista = new ArrayList<String>();
			while(rs.next()){
				llista.add(rs.getShort("codigo")+" "+rs.getString("nombre")+" "+rs.getString("apellido"));
			}
			return llista;
		}
	
	//funcio per a MODIFICAR autors a la BBDD---------------------------------------------------------------
	public static void modificarAutor(int codigo, String nombre, String apellido) throws SQLException{
		if(con==null || con.isClosed()){
			conectar();
		}
		Statement stmt = con.createStatement();
		String query = "update autor set nombre='"+nombre+"', apellido='"+apellido+"' where codigo = "+codigo+";";
		stmt.executeUpdate(query);
		stmt.close();
		con.close();
	}
		
	//funcio per a ESBORRAR autors a la BBDD---------------------------------------------------------------
	public static void EliminarAutor(int codigo) throws SQLException{
		if(con==null || con.isClosed()){
			conectar();
		}
		Statement stmt = con.createStatement();
		String query = "delete from autor where codigo="+codigo+";";
		stmt.executeUpdate(query);
		stmt.close();
		con.close();
	}
	
	//funcio per a INSERTAR llibres a la BBDD------------------------------------------------
	public static void insertarLibro(String titulo, int codigo,String isbn, int numero_paginas, String genero) throws SQLException {
		if(con==null || con.isClosed()){
			conectar();
		}
		//generar la consulta SQL
		Statement stmt = con.createStatement();
		String query = "insert into libro (titulo, codigo_autor, isbn, numero_paginas, genero) "
			+ "values ('"+titulo+"',"+codigo+",'"+isbn+"',"+numero_paginas+",'"+genero+"')";
		stmt.executeUpdate(query);
		stmt.close();
		con.close();
	}
	
	//funcio per a MOSTRAR llibres a la BBDD------------------------------------------------
	public static ArrayList<String> mostrarLibro() throws SQLException {
		if(con==null || con.isClosed()){
			conectar();
		}
		Statement stmt = con.createStatement();
		String query = "select codigo,titulo from libro;";
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<String> llista = new ArrayList<String>();
		while(rs.next()){
			llista.add(rs.getShort("codigo")+"/"+rs.getString("titulo"));
		}
		stmt.close();
		con.close();
		return llista;
	}
		
		//funcio per a MOSTRAR llibres SELECCIONATS de la BBDD------------------------------
	public static ArrayList<String> mostrarLibroSelec(int codigo) throws SQLException {
		if(con==null || con.isClosed()){
			conectar();
		}
		Statement stmt = con.createStatement();
		String query = "select l.titulo,a.nombre,a.apellido,l.isbn,l.numero_paginas,l.genero,"
				+ "a.codigo from libro l, autor a where l.codigo_autor=a.codigo and l.codigo="+codigo+";";
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<String> llistasel = new ArrayList<String>();
		while(rs.next()){
			llistasel.add(rs.getString("titulo")
					+"/"+rs.getString("nombre")
					+"/"+rs.getString("apellido")
					+"/"+rs.getString("isbn")
					+"/"+rs.getShort("numero_paginas")
					+"/"+rs.getString("genero")
					+"/"+rs.getShort("codigo"));
		}
		stmt.close();
		con.close();
		return llistasel;
	}
	
	//funcio per a MODIFICAR llibres de la BBDD------------------------------------------------
	public static void modificarLibro(int codigo_libro, String titulo, int codigo, String isbn, int numero_paginas, String genero) throws SQLException {
		if(con==null || con.isClosed()){
			conectar();
		}
		//generar la consulta SQL
		Statement stmt = con.createStatement();
		String query = "update libro set titulo='"+titulo+"', codigo_autor="+codigo+", isbn='"+isbn+"', "
						+ "numero_paginas="+numero_paginas+", genero='"+genero+"' where codigo="+codigo_libro+"";
		stmt.executeUpdate(query);
		stmt.close();
		con.close();
	}
	
	//funcio per a ELIMINAR llibres a la BBDD------------------------------------------------
	public static void eliminarLibro(int codigo) throws SQLException {
		if(con==null || con.isClosed()){
			conectar();
		}
		//generar la consulta SQL
		Statement stmt = con.createStatement();
		String query = "delete from libro where codigo="+codigo;
		stmt.executeUpdate(query);
		stmt.close();
		con.close();
		
	}
	
	//funcio per a MOSTRAR els generes a la BBDD------------------------------------------------
	public static ArrayList<String> mostrarGenero() throws SQLException {
		if(con==null || con.isClosed()){
			conectar();
		}
		//generar la consulta SQL
		Statement stmt = con.createStatement();
		String query = "select distinct genero from libro";
		ResultSet rs =  stmt.executeQuery(query);
		ArrayList<String>llista=new ArrayList<String>();
		while(rs.next()){
			llista.add(rs.getString("genero"));
		}
		stmt.close();
		con.close();
		return llista;
	}
	
	public static ResultSet consultaLibros(String consulta) throws SQLException {
		if(con==null || con.isClosed()){
			conectar();
		}
		//generar la consulta SQL
		Statement consultaSt = con.createStatement();
		ResultSet consultaRs =  consultaSt.executeQuery(consulta);
		return consultaRs;
	}
}