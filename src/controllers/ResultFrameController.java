package controllers;

import java.awt.Component;

import javax.swing.JTable;

import view.HomePanel;
import view.ResultPanel;
import view.SubFrame;
import view.TYPEPanel;
import view.TodayTASKPanel;
import view.UpdatePanel;

public class ResultFrameController {
	public SubFrame subFrame=new SubFrame(395,470);
	HomePanel homep=new HomePanel();
	public JTable jtable;
	private TodayTASKPanel panel;
	
	public ResultFrameController(SubFrame subFrame,JTable table){
		this.subFrame=subFrame;
		this.jtable=table;
		this.panel=panel;
		callResultPanel();
	}
	public void clearOldViews(){
		Component cs[]=this.subFrame.getContentPane().getComponents();
		for(int i=0;i<cs.length;i++){
			Component c=cs[i];
			c.setVisible(false);
			this.subFrame.getContentPane().remove(c);
		}
	}
	public void callResultPanel(){
		clearOldViews();
		ResultPanel resultPanel=new ResultPanel();
		resultPanel.setSize(395, 440);
		resultPanel.setVisible(true);
		new ResultController(resultPanel,subFrame ,jtable);
		this.subFrame.getContentPane().add(resultPanel);
	}
}
