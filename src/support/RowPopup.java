package support;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

import view.DoMainFrame;
import view.TodayTASKPanel;
import controllers.TaskController;
import controllers.TodayTASKController;



public class RowPopup extends JPopupMenu{
public JTable table;
private DoMainFrame myView;
TodayTASKPanel todayPanel;



	public RowPopup(final JTable table,final TodayTASKPanel myPanel){
				
		final JMenuItem update=new JMenuItem(" Update time");
		final JMenuItem delete=new JMenuItem(" Delete ");
		
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TaskController taskControl=new TaskController(table);
				taskControl.callUpdate(table,myPanel);
			}
		});
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TaskController taskControl=new TaskController(table);
				taskControl.delete(table);
				taskControl.SHOWTASKprocess(myPanel);
				JOptionPane.showMessageDialog(delete, "Deleted");
				
			}
		});
		add(update);
		add(delete);
	}
}

	

