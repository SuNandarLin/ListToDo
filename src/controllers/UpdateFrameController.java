package controllers;

import java.awt.Component;

import javax.swing.JTable;

import view.HomePanel;
import view.SubFrame;
import view.TYPEPanel;
import view.TodayTASKPanel;
import view.UpdatePanel;

public class UpdateFrameController {
	public SubFrame subFrame=new SubFrame(280,240);
	HomePanel homep=new HomePanel();
	public JTable jtable;
	private TodayTASKPanel panel;
	
	public UpdateFrameController(SubFrame subFrame,JTable table,TodayTASKPanel panel){
		this.subFrame=subFrame;
		this.jtable=table;
		this.panel=panel;
		callUpdatePanel();
	}
	public void clearOldViews(){
		Component cs[]=this.subFrame.getContentPane().getComponents();
		for(int i=0;i<cs.length;i++){
			Component c=cs[i];
			c.setVisible(false);
			this.subFrame.getContentPane().remove(c);
		}
	}
	public void callUpdatePanel(){
		clearOldViews();
		UpdatePanel updatePanel=new UpdatePanel();
		updatePanel.setSize(280, 201);
		updatePanel.setVisible(true);
		new UpdateTimeController(updatePanel,subFrame ,jtable,panel);
		this.subFrame.getContentPane().add(updatePanel);
	}
}
