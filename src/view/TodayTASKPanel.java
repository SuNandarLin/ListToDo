package view;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;

import javax.swing.JSpinner;
import javax.swing.SpinnerModel;

public class TodayTASKPanel extends JPanel {
	private JScrollPane scrollPane;
	private JTable table;
	private JComboBox comboChooseTasks;
	private JTextField txtSuddenTask;
	private JButton btnSetTime;
	private JButton btnADDTASK;
	private JSpinner spinnerHour;
	private JButton GTHomeInTdy;
	private JButton GTListInTdy;
	private JLabel lblTodayTasks;
	private JSpinner spinnerMin;
	private JLabel lblHour;
	private JLabel lblMin;
	private JButton btnSuddenTask;

	/**
	 * Create the panel.
	 */
	public TodayTASKPanel() {
		setLayout(null);
		add(getScrollPane());
		add(getComboChooseTasks());
		add(getTxtSuddenTask());
		add(getBtnSetTime());
		add(getBtnADDTASK());
		add(getSpinnerHour());
		add(getGTHomeInTdy());
		add(getGTListInTdy());
		add(getLblTodayTasks());
		add(getSpinnerMin());
		add(getLblHour());
		add(getLblMin());
		add(getBtnSuddenTask());

	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setToolTipText("");
			scrollPane.setBounds(43, 103, 1056, 418);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	public JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setSurrendersFocusOnKeystroke(true);
			table.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		}
		return table;
	}
	public JComboBox getComboChooseTasks() {
		if (comboChooseTasks == null) {
			comboChooseTasks = new JComboBox();
			comboChooseTasks.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			comboChooseTasks.setBounds(552, 11, 284, 36);
		}
		return comboChooseTasks;
	}
	public JTextField getTxtSuddenTask() {
		if (txtSuddenTask == null) {
			txtSuddenTask = new JTextField("Type sudden task that you didn't prepare");
			txtSuddenTask.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
			txtSuddenTask.setBounds(552, 11, 284, 36);
			txtSuddenTask.setColumns(10);
		}
		return txtSuddenTask;
	}
	public JButton getBtnSetTime() {
		if (btnSetTime == null) {
			btnSetTime = new JButton("SET Time");
			btnSetTime.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			btnSetTime.setBounds(552, 58, 131, 27);
		}
		return btnSetTime;
	}
	public JButton getBtnADDTASK() {
		if (btnADDTASK == null) {
			btnADDTASK = new JButton("ADD");
			btnADDTASK.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnADDTASK.setBounds(1006, 25, 93, 60);
		}
		return btnADDTASK;
	}
	public JSpinner getSpinnerHour() {
		if (spinnerHour == null) {
			
			String[] hourArray=new String[12];
			int i;		
			for(i=1;i<=12;i++)
				hourArray[i-1]=""+i;
			
			SpinnerListModel Spmodel=new SpinnerListModel(hourArray);
			spinnerHour = new JSpinner(Spmodel);
			spinnerHour.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			spinnerHour.setBounds(741, 58, 41, 27);
		}
		return spinnerHour;
	}
	public JSpinner getSpinnerMin() {
		if (spinnerMin == null) {
			
			String[] minArray=new String[60];
			int i;		
			for(i=0;i<=59;i++){
				if(i<10)
					minArray[i]=0+""+i;
				else
					minArray[i]=""+i;
				}
			
			SpinnerListModel Spmodel=new SpinnerListModel(minArray);
			spinnerMin = new JSpinner(Spmodel) ;
			spinnerMin.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			spinnerMin.setBounds(837, 58, 41, 27);
		}
		return spinnerMin;
	}
	public JLabel getLblHour() {
		if (lblHour == null) {
			lblHour = new JLabel("Hour :");
			lblHour.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			lblHour.setHorizontalAlignment(SwingConstants.LEFT);
			lblHour.setBounds(688, 58, 44, 28);
		}
		return lblHour;
	}
	public JLabel getLblMin() {
		if (lblMin == null) {
			lblMin = new JLabel("Min :");
			lblMin.setHorizontalAlignment(SwingConstants.CENTER);
			lblMin.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			lblMin.setBounds(792, 58, 44, 28);
		}
		return lblMin;
	}


	public JButton getGTHomeInTdy() {
		if (GTHomeInTdy == null) {
			GTHomeInTdy = new JButton("Go To Home >>>");
			GTHomeInTdy.setHorizontalAlignment(SwingConstants.LEADING);
			GTHomeInTdy.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
			GTHomeInTdy.setBounds(928, 532, 171, 23);
		}
		return GTHomeInTdy;
	}
	public JButton getGTListInTdy() {
		if (GTListInTdy == null) {
			GTListInTdy = new JButton("Go To List of Tasks >>>");
			GTListInTdy.setHorizontalAlignment(SwingConstants.LEADING);
			GTListInTdy.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
			GTListInTdy.setBounds(928, 566, 171, 23);
		}
		return GTListInTdy;
	}
	public JLabel getLblTodayTasks() {
		if (lblTodayTasks == null) {
			lblTodayTasks = new JLabel("Today Tasks");
			lblTodayTasks.setHorizontalAlignment(SwingConstants.CENTER);
			lblTodayTasks.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
			lblTodayTasks.setBounds(158, 23, 248, 60);
		}
		return lblTodayTasks;
	}
	public JButton getBtnSuddenTask() {
		if (btnSuddenTask == null) {
			btnSuddenTask = new JButton("For Sudden Task");
			btnSuddenTask.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			btnSuddenTask.setBounds(848, 11, 154, 36);
		}
		return btnSuddenTask;
	}
}
	