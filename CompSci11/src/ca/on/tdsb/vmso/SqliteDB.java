// TO DO
// please clean up

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.on.tdsb.vmso;

/**
 *
 * @author Owner
 */
import java.sql.*;

// https://www.tutlane.com/tutorial/sqlite/sqlite-java-tutorial
public class SqliteDB
//public class TableUsingJava        

{

public static void main( String args[] )

{

Connection c = null;

Statement stmt = null;

try {

Class.forName("org.sqlite.JDBC"); // https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc/3.8.11.2

//c = DriverManager.getConnection("jdbc:sqlite:SqliteJavaDB.db");
c = DriverManager.getConnection("jdbc:sqlite:sql3-database.db"); 
// TODO
// default location? project root
// fix to package for build
// filename: sql3-database.db

System.out.println("Database Opened...\n");

stmt = c.createStatement();

String sql = "CREATE TABLE Product " +

"(p_id INTEGER PRIMARY KEY AUTOINCREMENT," +

" p_name TEXT NOT NULL, " +

" price REAL NOT NULL, " +

" quantity INTEGER) " ;

stmt.executeUpdate(sql);

stmt.close();

c.close();

}

catch ( Exception e ) {

System.err.println( e.getClass().getName() + ": " + e.getMessage() );

System.exit(0);

}

System.out.println("Table Product Created Successfully!!!");

}

}
