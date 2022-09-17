package controllers;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import support.MyTableModel;
import view.SubFrame;
import view.TodayTASKPanel;
import view.UpdatePanel;
import database.TaskDB;

public class TaskController {	

TaskDB taskData=new TaskDB();
private MyTableModel mytable=new MyTableModel();
private JTable myjtable;

	public TaskController(JTable table){
		this.myjtable=table;
	}

	public void SHOWTASKprocess(TodayTASKPanel myPanel){		
		
		mytable.takeRowCol(new String[]{"Today Task","Time","Type"});
	
		int rowCount=taskData.ShowRowCountTasks();
		ArrayList<String> taskArray=taskData.ShowingTasks();
		ArrayList<String> timeArray=taskData.ShowingTime();
	
		mytable.setRowCount(rowCount,3);
		for(int i=0;i<rowCount;i++){
		
			mytable.setValueAt(taskArray.get(i), i, 0);
			mytable.setValueAt(timeArray.get(i), i, 1);
			mytable.setValueAt(taskData.ShowingTypes(taskArray.get(i)), i, 2);
		}
	
		myPanel.getTable().setModel(mytable);
		myPanel.getTable().setRowHeight(30);
		myPanel.getTable().getColumnModel().getColumn(1).setMaxWidth(70);
		
		
	}
	
	public void callResult(JTable table,TodayTASKPanel myPanel){
		SubFrame subFrame=new SubFrame(395,440);
		  subFrame.TypesFrameMain(395,440,table,myPanel);
	}
	public void callUpdate(JTable table,TodayTASKPanel myPanel){		
	  SubFrame subFrame=new SubFrame(280,201);
	  subFrame.TypesFrameMain(280,240,table,myPanel);
	//this.myjtable=table;
	}
	
	public String update(final JTable table){
		 int rowNo=table.getSelectedRow();	
		 System.out.println(table.getRowCount());
		 System.out.println(rowNo);
		 System.out.println("Reach update in TaskContol");
		String task=(String)table.getValueAt(rowNo, 0);	
		
		
		return task;
	}
		
	public void delete(final JTable table){
		 int rowNo=table.getSelectedRow();		
			String task=(String)table.getValueAt(rowNo, 0);	
		taskData.deleteTask(task);
	}
	public void subTasks(){
		
	}
	public void Result(){
		
	}

	
}
