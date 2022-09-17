package controllers;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import database.ListDB;
import database.TypeDB;
import support.MyTableModel;
import view.LISTPanel;
import view.DoMainFrame;
import view.SubFrame;
import view.TYPEPanel;

public class TYPEController {

	private TYPEPanel myView;
	ArrayList<String> dataCollect=new ArrayList<String>();
	public SubFrame typeView;
	
	public TYPEController(TYPEPanel OpPanel,SubFrame typeView){
		this.myView=OpPanel;
		this.typeView=typeView;
		this.myView.getTable().setVisible(true);
		showTypesTable();
		
		this.myView.getBtnAddTask().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addTaskProcess();
				showTypesTable();
				
				
			}
		});	
		this.myView.getBtnFinish().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			finish();
				
			}
		});
	}
	public void addTaskProcess(){
		
		String strType=this.myView.getTxtAddTask().getText();
		TypeDB addtype=new TypeDB();
		addtype.AddingTypes(strType);	
		}
	
	public void showTypesTable(){
		
		TypeDB addtype=new TypeDB();
		int rowCount=addtype.ShowingRowCount();
		 ArrayList<String> typeArray=new ArrayList();
		  typeArray=addtype.ShowingTypes();
		
		MyTableModel mytable=new MyTableModel();
		mytable.takeRowCol(new String[]{"No. ","Types of tasks"});
		mytable.setRowCount(rowCount,2);
		
		for(int i=0;i<rowCount;i++){
		mytable.setValueAt((i+1), i, 0);
		mytable.setValueAt(typeArray.get(i), i, 1);
		}
		this.myView.getTable().setModel(mytable);
		this.myView.getTable().getColumnModel().getColumn(0).setMaxWidth(100);
		this.myView.getTable().setRowHeight(30);
		
	}
	public void finish(){
		typeView.dispose();
		
	}
}
