package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import database.TaskDB;
import support.MyTableModel;
import view.SubFrame;
import view.TodayTASKPanel;
import view.UpdatePanel;

public class UpdateTimeController {
private UpdatePanel myPanel;
private SubFrame myView;
private TodayTASKPanel panel;
public JTable jtable;
private TaskDB taskData=new TaskDB();
private MyTableModel mytable=new MyTableModel();


	public UpdateTimeController(UpdatePanel myPanel,SubFrame myView,JTable jtable
			,TodayTASKPanel panel){
		this.myPanel=myPanel;
		this.myView=myView;
		this.jtable=jtable;
		this.panel=panel;
		
	this.myPanel.getBtnUpdateCancel().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			cancelUpdate();
			
		}
	});
	this.myPanel.getBtnUpdateTime().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			Update();
			
		}
	});
	}
	
	public void cancelUpdate(){
		myView.dispose();
	}
	
	public void Update(){
		TaskController taskControl=new TaskController(jtable);
		String time= this.myPanel.getSpinUpdateHr().getValue()+":"
				+this.myPanel.getSpinUpdateMin().getValue();
		String task=taskControl.update(jtable);		
		taskData.updateTime(time, task);
		myView.dispose();
		taskControl.SHOWTASKprocess(panel);
		JOptionPane.showMessageDialog(null, "Updating success!");

	}
	
	
}
