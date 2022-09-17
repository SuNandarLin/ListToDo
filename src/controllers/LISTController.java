package controllers;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JTable;
import database.ListDB;
import database.TypeDB;
import support.MyTableModel;
import view.LISTPanel;
import view.DoMainFrame;
import view.TodayTASKPanel;
import view.SubFrame;
import view.TYPEPanel;

public class LISTController {
public LISTPanel myView;
public TYPEPanel typeView=new TYPEPanel();
public DoMainFrame mainView;
public TodayTASKPanel todayView;

public LISTController(final LISTPanel myView,DoMainFrame mainView){
	this.myView=myView;
	this.mainView=mainView;
	
	
	showListProcess();
	comboShow();
	
myView.getBtnEditTypes().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			callEditTypes();						
		}
	});	

myView.getBtnAdd().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			addListProcess();
			showListProcess();			
		}
	});

myView.getGTHomeInList().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
});
myView.getGTTdyTaskInList().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		callTodayTasks();
		
	}
});

myView.getComboChooseTypes().addFocusListener(new FocusListener() {
	
	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void focusGained(FocusEvent arg0) {
		comboShow();
		
	}
});
	
}
public void addListProcess(){
	String list=this.myView.getTxtFieldtaskstodo().getText();
	String selectStr=(String)this.myView.getComboChooseTypes().getSelectedItem();
	int rdSelect = 0;
	if(this.myView.getRdFirstpri().isSelected())
		rdSelect=1;
	else if(this.myView.getRdSecondpri().isSelected())
		rdSelect=2;
	else if(this.myView.getRdThirdpri().isSelected())
		rdSelect=3;
	ListDB addlist=new ListDB();
	addlist.AddingLists(list, selectStr, rdSelect);
	}

public void showListProcess(){
	ListDB listData=new ListDB();	

	MyTableModel mytable=new MyTableModel();
	mytable.takeRowCol(new String[]{"Task","Types of task"});
	
	int rowCount=listData.ShowingRowCount();	 
	 ArrayList<String> list=new ArrayList();	
	 list=listData.ShowingLists();
	 
	 mytable.setRowCount(rowCount,2);
	for(int i=0;i<rowCount;i++){
		String types=listData.ShowingTypes(list.get(i));
		mytable.setValueAt(list.get(i), i, 0);
		mytable.setValueAt(types, i, 1);
	}
	this.myView.getTable().setModel(mytable);
	this.myView.getTable().setRowHeight(30);
	
	}

 public void callEditTypes(){
	 JTable table = null;
	  SubFrame typeFrame=new SubFrame(500,650);
	 typeFrame.TypesFrameMain(500,650,table,todayView);
	 }
 
 public void comboShow(){
	 TypeDB mydata=new TypeDB();
	 ArrayList<String> comboType=new ArrayList();
		comboType=mydata.ShowingTypes();
		this.myView.getComboChooseTypes().removeAllItems();
		this.myView.getComboChooseTypes().addItem("no type");
		if(comboType!=null ){
			for(int i=0;i<comboType.size();i++)
				this.myView.getComboChooseTypes().addItem(comboType.get(i));
		}
    }
  
 public void clearOldViews(){
		Component cs[]=this.mainView.getContentPane().getComponents();
		for(int i=0;i<cs.length;i++){
			Component c=cs[i];
			c.setVisible(false);
			this.mainView.getContentPane().remove(c);
		}
	}
 public void callTodayTasks(){
	 clearOldViews();
	 TodayTASKPanel todayView=new TodayTASKPanel();
	 todayView.setSize(1200, 650);
	 todayView.setVisible(true);
		new TodayTASKController(todayView,mainView);
		this.mainView.getContentPane().add(todayView);	
 }


}


