package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TaskDB {
	 private MyDBconnection DB=new MyDBconnection();

 public int GettingType(String task){
	      DB.OpenConnection();  
		  Connection c=DB.getMyConnection();
		  int typeNo = 0;
		 try {			
			 String queryTypeNo="select noOfType from Lists where lists=?;";
			 PreparedStatement stmtTypeNo=c.prepareStatement(queryTypeNo);
			 stmtTypeNo.setString(1,task );
			 ResultSet rs= stmtTypeNo.executeQuery();
			 while (rs.next()){					   
					typeNo=rs.getInt(1);	
				}	
			  c.setAutoCommit(false);
		 } catch (SQLException e) {System.out.println("Error in getting no of type");}
		  DB.CloseConnection();
		  return typeNo;
	  }
	
public void AddingTasks(String task,String time,boolean suddenOrNot,boolean timeOrNot){
	      DB.OpenConnection();  
		  Connection c=DB.getMyConnection();
		 try {
			 int typeNo;
			 if(suddenOrNot)
				 typeNo=GettingType(task);
			 else
				 typeNo=1;
			 if(!timeOrNot)
				 time=" - ";
			 c.setAutoCommit(false);
			String query="insert into Tasks values (?,?,?,?);";			  
			PreparedStatement stmt=c.prepareStatement(query);
			
			stmt.setInt(1, typeNo);			
			stmt.setString(2, task);			
			stmt.setString(3, time);			
			stmt.setInt(4, 0);			
			stmt.execute();			
			c.commit();			
		} catch (SQLException e) {System.out.println("Error in inserting data");}
		  DB.CloseConnection();
	  }
public ArrayList<String> ShowingTasks(){
		 DB.OpenConnection();
		 Connection c=DB.getMyConnection();
		 ArrayList<String> taskArray=new ArrayList();
		 int index=0;
		 
		 try {
		 String queryTask="Select tasks from Tasks; ";
		 PreparedStatement stmt=c.prepareStatement(queryTask);		 
		 ResultSet rs=stmt.executeQuery();		
		 
		 while (rs.next()){
			 taskArray.add(index, rs.getString(1));
			 index++;
		 }
		 
		 } catch (SQLException e) {
				System.out.println("Error in showing tasks");
				e.printStackTrace();
			}
		 DB.CloseConnection();
		 return taskArray;
	 }
public String ShowingTypes(String task){
		 DB.OpenConnection();
		 Connection c=DB.getMyConnection();
		String typeResult=new String();
		 
		 try {
		 String queryType="select Type "+ 
				 			" from typesOfDo td,Tasks tk "+
				 			" where tk.noOfType=td.noOfType "+
				 			" and tk.tasks=? ;";		 
		 PreparedStatement stmt=c.prepareStatement(queryType);
		 stmt.setString(1, task);
		 ResultSet rs=stmt.executeQuery();
		
		 while(rs.next()){
			 typeResult= rs.getString(1);
			
		 }
		} catch (SQLException e) {
			System.out.println("Error in showing types");
			e.printStackTrace();
		}
		 	DB.CloseConnection();
		 return typeResult;
	 }
public ArrayList<String> ShowingTime(){
		 DB.OpenConnection();
		 Connection c=DB.getMyConnection();
		 ArrayList<String> timeArray=new ArrayList();
		 int index=0;
		 
		 try{
			 String queryTime="select time from Tasks;";
			 PreparedStatement stmt=c.prepareStatement(queryTime);
			 ResultSet rs=stmt.executeQuery();
			 
			 while(rs.next()){
				 timeArray.add(index, rs.getString(1));
				 index++;
			 }
		 }catch(SQLException e){
			 System.out.println("Error in showing time");
				e.printStackTrace();
		 }
		 DB.CloseConnection();
		 return timeArray;
	 }
public int ShowRowCountTasks(){
		 DB.OpenConnection();
		 Connection c=DB.getMyConnection();
		 int rowCount = 0;
		 
			try {
		 String queryCount="Select Count(*) from Tasks";
		 PreparedStatement stmt=c.prepareStatement(queryCount);
		 ResultSet rs = stmt.executeQuery();
		 
		 while(rs.next()){
			 rowCount=rs.getInt(1);
		 	}
		} catch (SQLException e) {
			System.out.println("Error in row counting");
			e.printStackTrace();
		}
		 DB.CloseConnection();		 
		return rowCount;
		 
	 }
public void deleteTask(String task){
		 DB.OpenConnection();
		 Connection c=DB.getMyConnection();
		 
			try {
		 String queryDelete="Delete from Tasks where tasks=?; ";
		 PreparedStatement stmt=c.prepareStatement(queryDelete);
		 stmt.setString(1, task);
		 stmt.execute();
		
		} catch (SQLException e) {
			System.out.println("Error in deleting task");
			e.printStackTrace();
		}
		 DB.CloseConnection();		 
	 }
public void updateTime(String time,String task){
	DB.OpenConnection();
	 Connection c=DB.getMyConnection();
	 
		try {
	 String queryUpdate="Update Tasks set time=? where tasks=?; ";
	 PreparedStatement stmt=c.prepareStatement(queryUpdate);
	 stmt.setString(1, time);
	 stmt.setString(2, task);
	 stmt.execute();
	
	} catch (SQLException e) {
		System.out.println("Error in updating time");
		e.printStackTrace();
	}
	 DB.CloseConnection();	
}
public void updateResult(String tasks,int result){
	DB.OpenConnection();
	 Connection c=DB.getMyConnection();
	 
		try {
	 String queryUpdate="Update Tasks set FinishOrNot=? where tasks=?; ";
	 PreparedStatement stmt=c.prepareStatement(queryUpdate);
	 stmt.setInt(1, result);
	 stmt.setString(2, tasks);
	 stmt.execute();
	
	} catch (SQLException e) {
		System.out.println("Error in updating result");
		e.printStackTrace();
	}
	 DB.CloseConnection();
}
public void ShowAll(){
		 DB.OpenConnection();
		 Connection c=DB.getMyConnection();
			String re1 = null;	 
			String re2 = null;	 
			String re3 = null;	 
			try {
		 String query="Select * from Tasks";
		 PreparedStatement stmt=c.prepareStatement(query);
		 ResultSet rs = stmt.executeQuery();
		 
		 while(rs.next()){
			 re1=rs.getString(1);
			 re2=rs.getString(2);
			 re3=rs.getString(3);
			 System.out.println(re1+". . . "+re2+". . . "+re3);			 
		 	}
		} catch (SQLException e) {
			System.out.println("Error in showing all");
			e.printStackTrace();
		}
			
		 DB.CloseConnection();		 
		
		 
	 }
public void select(String task){
	 DB.OpenConnection();
	 Connection c=DB.getMyConnection();
		String re1 = null;	 
		String re2 = null;	 
		String re3 = null;	 
		try {
	 String query="Select FinishOrNot from Tasks where tasks=?;";
	 PreparedStatement stmt=c.prepareStatement(query);
	 stmt.setString(1, task);
	 ResultSet rs = stmt.executeQuery();
	 
	 while(rs.next()){
		 re1=rs.getString(1);
		
		 System.out.println(re1+". . . ");			 
	 	}
	} catch (SQLException e) {
		System.out.println("Error in select");
		e.printStackTrace();
	}
		
	 DB.CloseConnection();		 
	
}
	 
}


