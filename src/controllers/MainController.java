package controllers;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.HomePanel;
import view.LISTPanel;
import view.DoMainFrame;
import view.TodayTASKPanel;
import view.SubFrame;
import view.TYPEPanel;

public class MainController {
	private DoMainFrame myView;
	private SubFrame typeView;

	public MainController(DoMainFrame mainframe){
		this.myView=mainframe;
		
		HomePanel homep=new HomePanel();	
		homep.setVisible(true);
		this.myView.getContentPane().add(homep);
		
		homep.getBtnTasks().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				callAddListPanel();
				
			}
		});
		homep.getBtnTodaysTasks().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				callTodayTasksPanel();
				
			}
		});
	}
		
	public void clearOldViews(){
		Component cs[]=this.myView.getContentPane().getComponents();
		for(int i=0;i<cs.length;i++){
			Component c=cs[i];
			c.setVisible(false);
			this.myView.getContentPane().remove(c);
		}
	}
	
	public void callAddListPanel(){
		clearOldViews();
		LISTPanel listPanel=new LISTPanel();
		listPanel.setSize(1200, 650);
		listPanel.setVisible(true);
		new LISTController(listPanel,myView);
		this.myView.getContentPane().add(listPanel);
	}
	
	public void callTodayTasksPanel(){
		clearOldViews();
		TodayTASKPanel todayPanel=new TodayTASKPanel();
		todayPanel.setSize(1200, 650);
		todayPanel.setVisible(true);
		new TodayTASKController(todayPanel,myView);
		this.myView.getContentPane().add(todayPanel);
	}
	
}
