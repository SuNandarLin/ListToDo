package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

import database.TaskDB;
import view.ResultPanel;
import view.SubFrame;
import view.UpdatePanel;

public class ResultController {
	private ResultPanel myPanel;
	private SubFrame myView;
	public JTable jtable;
	private int rdbtnResult;
	private TaskDB taskData=new TaskDB();
	
	public ResultController(ResultPanel myPanel, SubFrame myView,
			JTable jtable) {
		this.myPanel=myPanel;
		this.myView=myView;
		this.jtable=jtable;
		this.myPanel.getBtnFinishResult().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ResultSelect();
				Finish();
				
			}
		});
		
	}

	public void Finish(){
		myView.dispose();
	}
	public void ResultSelect(){
		if(this.myPanel.getRdbtnFC().isSelected()){
			rdbtnResult=1;	addResult();	}
		else if(this.myPanel.getRdbtnFAIG().isSelected()){
			rdbtnResult=2;	addResult();	}
		else if(this.myPanel.getRdbtnDWBNET().isSelected()){
			rdbtnResult=3;	addResult();	}	
		else if(this.myPanel.getRdbtnFHFSC().isSelected()){
			rdbtnResult=4;	addResult();	}
		else if(this.myPanel.getRdbtnCFSC().isSelected()){
			rdbtnResult=5;	addResult();	}
		else if(this.myPanel.getRdbtnWMT().isSelected()){
			rdbtnResult=6;	addResult();	}
				
	}
	public void addResult(){
		 int rowNo=jtable.getSelectedRow();	
		String task=(String)jtable.getValueAt(rowNo, 0);	
		taskData.updateResult(task, rdbtnResult);
	}
}
