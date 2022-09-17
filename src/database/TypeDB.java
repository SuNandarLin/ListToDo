package database;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TypeDB {
 private MyDBconnection DB=new MyDBconnection();
 
 
  public void AddingTypes(String type){
      DB.OpenConnection();  
	  Connection c=DB.getMyConnection();
	 try {
		  c.setAutoCommit(false);
		  String query="insert into typesOfDo values (null,?);";
		PreparedStatement stmt=c.prepareStatement(query);
		stmt.setString(1, type);
		stmt.execute();
		c.commit();
	} catch (SQLException e) {}
	  DB.CloseConnection();
  }
  
  public ArrayList<String> ShowingTypes(){
	  DB.OpenConnection();
	  Connection c=DB.getMyConnection();
	  ArrayList<String> typeArray=new ArrayList();
		 int index=0;
	 	
	   try {
		
		String query="Select Type from typesOfDo ;";
		PreparedStatement stmt=c.prepareStatement(query);
		ResultSet rs=stmt.executeQuery();
		
		while (rs.next()){					   
			typeArray.add(index, rs.getString(1));		
			index++;
		}
			
	} catch (SQLException e) {}
	   DB.CloseConnection();
	return typeArray;
  }
  
  public int ShowingRowCount(){
	  DB.OpenConnection();
	  Connection c=DB.getMyConnection();
	  int count=0;
	  
	   try {
		
		String query="Select Count(*) from typesOfDo ;";
		PreparedStatement stmt=c.prepareStatement(query);
		ResultSet rs=stmt.executeQuery();
		
		while (rs.next()){					   
			count=rs.getInt(1);			
		}
			
	} catch (SQLException e) {}
	   DB.CloseConnection();
	return count;
  }  
  /*DB.OpenConnection();
	  Connection c=DB.getMyConnection();
	 ArrayList<String> list=new ArrayList();
	 int index=0;
	 	
	   try {
		
		String query="Select lists from Lists ;";
		PreparedStatement stmt=c.prepareStatement(query);
		ResultSet rs=stmt.executeQuery();
		
		while (rs.next()){	
			list.add(index, rs.getString(1));
			index++;
		}
	
	} catch (SQLException e) {}
	   DB.CloseConnection();	  
	return list;*/
  
}
