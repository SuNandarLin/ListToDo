package controllers;

import java.awt.Component;

import view.SubTaskFrame;
import view.LISTPanel;
import view.SubTaskPanel;

public class SubTaskFrameController {
public SubTaskFrame myFrame;
	public SubTaskFrameController(SubTaskFrame myFrame){
		this.myFrame=myFrame;
		callAddTaskPanel();
	}
	
public void clearOldViews(){
		Component cs[]=this.myFrame.getContentPane().getComponents();
		for(int i=0;i<cs.length;i++){
			Component c=cs[i];
			c.setVisible(false);
			this.myFrame.getContentPane().remove(c);
		}
	}
	
public void callAddTaskPanel(){
		clearOldViews();
		SubTaskPanel TodayPanel=new SubTaskPanel();
		TodayPanel.setSize(600, 600);
		TodayPanel.setVisible(true);
		new SubTaskController(TodayPanel);
		this.myFrame.getContentPane().add(TodayPanel);
	}
}
