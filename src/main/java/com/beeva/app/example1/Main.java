package com.beeva.app.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.beeva.app.Calculadora;
import com.beeva.app.Firma;


public class Main {
	public static void main( String[] args )
    {
		
		//Calculadora c = Calculadora.getCalculadora();	
		//Firma firma = null;
		/*
		if(args[0].equals("suma")){
			System.out.println( "Suma "+args[1]+" + "+args[2]+" = " + c.suma(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
		}else if(args[0].equals("resta")){
			System.out.println( "Resta "+args[1]+" + "+args[2]+" = " + c.resta(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
		}else if(args[0].equals("pascal")){
			c.getTriangulodePascal(Integer.parseInt(args[1]));
		}
		else{
			System.out.println("opcion no valida");
		}
		*/
		//c.getTriangulodePascal(10);
        
		
		String URL = "jdbc:mysql://localhost:3306/test";
		String userName = "root";
		String password = "thor";
		String query = "Select * from empleado";
		
		try(Connection connection = DriverManager.getConnection(URL,userName,password);
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery(query);){
			while(rs.next()){
			System.out.println("**************************");
			System.out.println("id: "+rs.getString("id"));
			System.out.println("first_Name: "+rs.getString("first_name"));
			System.out.println("Last_Name: "+rs.getString("last_name"));
			System.out.println("age: "+rs.getString("age"));
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
    }
}
