package support;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

import view.TodayTASKPanel;
import controllers.TaskController;


public class RowPopup2 extends JPopupMenu{
		 public JTable table;
		 //public String radio;
		

		 	public RowPopup2(final JTable table,final TodayTASKPanel myPanel){
		 		final TaskController taskControl=new TaskController(table);
		 		final JMenuItem subTasks=new JMenuItem(" Sub Tasks ");
		 		final JMenuItem result=new JMenuItem(" Success or Fail ");
		 		
		 		subTasks.addActionListener(new ActionListener() {
		 			
		 			@Override
		 			public void actionPerformed(ActionEvent e) {
		 				//taskControl.pdate();
		 				JOptionPane.showMessageDialog(subTasks, "Sub Tasks");
		 				
		 			}
		 		});
		 		
		 		result.addActionListener(new ActionListener() {
		 			
		 			@Override
		 			public void actionPerformed(ActionEvent e) {
		 				TaskController taskControl=new TaskController(table);
		 				taskControl.callResult(table, myPanel);
		 				//JOptionPane.showMessageDialog(result, "Recorded!");
		 				
		 			}
		 		});
		 		add(subTasks);
		 		add(result);
		 	}
	}

