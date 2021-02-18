package com.webscraper.console;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PosgresSQLTest {

	public static void main(String[] args) {
		System.out.println("PostgreSQL task started");
		 Connection c = null;
	      Statement stmt = null;
	      try {
	        
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/postgres",
	            "jfdoyle3", "DuM8041");
	         
	    // --------------------------------------     
	         stmt = c.createStatement();
	         ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	         while ( rs.next() ) {
	            int id = rs.getInt("id");
	            String  name = rs.getString("name");
	            int age  = rs.getInt("age");
	            String  address = rs.getString("address");
	            float salary = rs.getFloat("salary");
	            System.out.println( "ID = " + id );
	            System.out.println( "NAME = " + name );
	            System.out.println( "AGE = " + age );
	            System.out.println( "ADDRESS = " + address );
	            System.out.println( "SALARY = " + salary );
	            System.out.println();
	         }
	         rs.close();
	         stmt.close();
	     // -------------------------------------------------       
	         c.close();

	      } catch (Exception e) {
	         e.printStackTrace();
	     //    System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("database task was successful");
	   }

	}


