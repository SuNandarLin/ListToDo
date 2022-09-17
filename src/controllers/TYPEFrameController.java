package controllers;

import java.awt.Component;

import view.HomePanel;
import view.SubFrame;
import view.TYPEPanel;

public class TYPEFrameController {
	public SubFrame typeFrame=new SubFrame(500,650);
	HomePanel homep=new HomePanel();	
	
	public TYPEFrameController(SubFrame typeFrame){
		this.typeFrame=typeFrame;
		callAddTypePanel();
	}
	public void clearOldViews(){
		Component cs[]=this.typeFrame.getContentPane().getComponents();
		for(int i=0;i<cs.length;i++){
			Component c=cs[i];
			c.setVisible(false);
			this.typeFrame.getContentPane().remove(c);
		}
	}
	public void callAddTypePanel(){
		clearOldViews();
		TYPEPanel typePanel=new TYPEPanel();
		typePanel.setSize(500, 700);
		typePanel.setVisible(true);
		new TYPEController(typePanel,typeFrame );
		this.typeFrame.getContentPane().add(typePanel);
	}
}
