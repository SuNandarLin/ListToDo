package controllers;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import support.RowPopup;
import database.ListDB;
import database.TaskDB;
import support.MyTableModel;
import view.LISTPanel;
import view.DoMainFrame;
import view.TodayTASKPanel;
import support.RowPopup2;
public class TodayTASKController {
private TodayTASKPanel myPanel;
public DoMainFrame mainView;
private LISTPanel listPanel;
//private TaskController taskControl;
private boolean suddenOrNot=true;
private boolean timeOrNot=false;


public TodayTASKController(final TodayTASKPanel myPanel,DoMainFrame mainView){
		this.myPanel=myPanel;
		this.mainView=mainView;		
		
		
		this.myPanel.getSpinnerHour().setVisible(false);
		this.myPanel.getSpinnerMin().setVisible(false);	
		this.myPanel.getLblHour().setVisible(false);
		this.myPanel.getLblMin().setVisible(false);
		this.myPanel.getBtnSuddenTask().setText("Sudden Task");
		this.myPanel.getTxtSuddenTask().setVisible(false);
		comboTodayTask();
		
		
		TaskController taskControl=new TaskController(myPanel.getTable());
		
		taskControl.SHOWTASKprocess(myPanel);
				
		final RowPopup pop=new RowPopup(this.myPanel.getTable(),this.myPanel);
		final RowPopup2 pop2=new RowPopup2(this.myPanel.getTable(),this.myPanel);

		this.myPanel.getTable().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				if(SwingUtilities.isRightMouseButton(e))
					pop.show(e.getComponent(), e.getX(), e.getY());
				if(e.getClickCount()==2){
					pop2.show(e.getComponent(), e.getX(), e.getY());
				/*	JOptionPane.showMessageDialog(null, "click");*/}
			}
		});	

		
this.myPanel.getBtnSetTime().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			SETtime();
			
		}
	});
this.myPanel.getBtnADDTASK().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			TaskController taskControl=new TaskController(myPanel.getTable());
			ADDTASKprocess();
			taskControl.SHOWTASKprocess(myPanel);
			
		}
	});
this.myPanel.getGTHomeInTdy().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});
this.myPanel.getGTListInTdy().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			callListPanel();
			
		}
	});
this.myPanel.getBtnSuddenTask().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		callSuddenTaskText();	
		
	}
});


	}
	public void ADDTASKprocess(){		
		
		String task;
		
		if(suddenOrNot)
			task=(String) this.myPanel.getComboChooseTasks().getSelectedItem();//ComboData;
		else
			task=this.myPanel.getTxtSuddenTask().getText();//SuddenTextData;
								
		String time= this.myPanel.getSpinnerHour().getValue()+":"
					+this.myPanel.getSpinnerMin().getValue();
		TaskDB taskData=new TaskDB();
		taskData.AddingTasks(task, time,suddenOrNot,timeOrNot);
		
		this.myPanel.getTxtSuddenTask().setVisible(false);
		this.myPanel.getComboChooseTasks().setVisible(true);		
		comboTodayTask();	
		//taskData.ShowAll();
	}
		
	public void callSuddenTaskText(){
		if(this.myPanel.getBtnSuddenTask().getText().equals("Sudden Task")){
			this.myPanel.getComboChooseTasks().setVisible(false);
			this.myPanel.getTxtSuddenTask().setVisible(true);			
			this.myPanel.getBtnSuddenTask().setText("Regular Task");
			suddenOrNot=false;
		}
		else if (this.myPanel.getBtnSuddenTask().getText().equals("Regular Task")){
			this.myPanel.getTxtSuddenTask().setVisible(false);		
			this.myPanel.getComboChooseTasks().setVisible(true);
			this.myPanel.getBtnSuddenTask().setText("Sudden Task");
			suddenOrNot=true;
		}
	}
		
	public void comboTodayTask(){
		ListDB list=new ListDB();
		ArrayList<String> listArray=new ArrayList();
		listArray=list.ShowingLists();
		
		this.myPanel.getComboChooseTasks().removeAllItems();
		this.myPanel.getComboChooseTasks().addItem("Choose tasks you will do today");
		if(listArray!=null){
		for(int i=0;i<listArray.size();i++)
			this.myPanel.getComboChooseTasks().addItem(listArray.get(i));		
		}
	}
	
	
	
	public void SETtime(){
		
		if(this.myPanel.getBtnSetTime().getText().equals("SET Time")){
			this.myPanel.getSpinnerHour().setVisible(true);
			this.myPanel.getSpinnerMin().setVisible(true);
			this.myPanel.getLblHour().setVisible(true);
			this.myPanel.getLblMin().setVisible(true);
			this.myPanel.getBtnSetTime().setText("Cancel Time");
			timeOrNot=true;
		}
		else if (this.myPanel.getBtnSetTime().getText().equals("Cancel Time")){
			this.myPanel.getSpinnerHour().setVisible(false);
			this.myPanel.getSpinnerMin().setVisible(false);
			this.myPanel.getLblHour().setVisible(false);
			this.myPanel.getLblMin().setVisible(false);
			this.myPanel.getBtnSetTime().setText("SET Time");
			timeOrNot=false;
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
	public void callListPanel(){
			clearOldViews();
			LISTPanel listPanel=new LISTPanel();
			listPanel.setSize(1200, 650);
			listPanel.setVisible(true);
			new LISTController(listPanel,mainView);
			this.mainView.getContentPane().add(listPanel);
		}
	
	}


	

