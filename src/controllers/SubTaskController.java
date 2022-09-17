package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.SubTaskPanel;

public class SubTaskController {
public SubTaskPanel myView;
	public SubTaskController(SubTaskPanel myView){
		this.myView=myView;
		
	this.myView.getBtnSubAdd().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});
	}
	

}
