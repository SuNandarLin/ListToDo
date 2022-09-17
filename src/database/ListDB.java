package database;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ListDB {
	public TypeDB addtype=new TypeDB();
 private MyDBconnection DB=new MyDBconnection();

 // To add values to lists ...................................................
  public void AddingLists(String list,String type,int radio){
      DB.OpenConnection();  
	  Connection c=DB.getMyConnection();
	 try {
		 int typeNo = 0;
		 String queryType="select noOfType from typesOfDo where Type=?;";
		 PreparedStatement stmtType=c.prepareStatement(queryType);
		 stmtType.setString(1,type );
		 ResultSet rs= stmtType.executeQuery();
		 while (rs.next()){					   
				typeNo=rs.getInt(1);	
			}		 
		 
		  c.setAutoCommit(false);
		  String query="insert into Lists values (?,?,?);";
		PreparedStatement stmt=c.prepareStatement(query);
		stmt.setInt(1,typeNo );
		stmt.setString(2,list );
		stmt.setInt(3,radio );
		stmt.execute();
		c.commit();
	} catch (SQLException e) {}
	  DB.CloseConnection();
  }
  
  //to add types to the comboBox......................................................
  public String[] addComboTypes(){
	  DB.OpenConnection();
	  Connection c=DB.getMyConnection();
	  String result=null;
		 String str[] = new String[addtype.ShowingRowCount()];
	   try {
		
		   for(int j=0;j<addtype.ShowingRowCount();j++){
			   
		String query="Select Type from typesOfDo where noOfType=?;";
		PreparedStatement stmt=c.prepareStatement(query);
		stmt.setString(1,""+(j+1)+"");
		ResultSet rs=stmt.executeQuery();
		
		while (rs.next()){					   
			result=rs.getString(1);	
		}
		str[j]=result;
		
	}
	} catch (SQLException e) {}
	   DB.CloseConnection();
	return str;
  }
  
  //to get number of rows.........................................................
  public int ShowingRowCount(){
	  DB.OpenConnection();
	  Connection c=DB.getMyConnection();
	  int count=0;
	  
	   try {
		
		String query="Select Count(*) from Lists ;";
		PreparedStatement stmt=c.prepareStatement(query);
		ResultSet rs=stmt.executeQuery();
		
		while (rs.next()){					   
			count=rs.getInt(1);			
		}
			
	} catch (SQLException e) {}
	   DB.CloseConnection();
	return count;
  } 
  
  // to show lists in table...........................................................
  public ArrayList<String> ShowingLists(){
	  DB.OpenConnection();
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
	return list;
  }
 
 //to show types in table.........................................................
  public String ShowingTypes(String listName){
	  DB.OpenConnection();
	  Connection c=DB.getMyConnection();
	String result=new String();
	 	
	   try {
		
		String query="select Type "+
				"from typesOfDo t,Lists l "+
				"where t.noOfType=l.noOfType "+
				"and l.lists=?;";
		PreparedStatement stmt=c.prepareStatement(query);
		//System.out.println("list Name :"+listName);
		stmt.setString(1, listName);
		ResultSet rs=stmt.executeQuery();
		
		while (rs.next()){	
			result= rs.getString(1);			
		}
			
	} catch (SQLException e) {}
	   DB.CloseConnection();
	 
	return result;
  }   
  
}
