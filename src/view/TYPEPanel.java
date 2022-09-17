package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

public class TYPEPanel extends JPanel {
	private JButton btnAddTask;
	private JTextField txtAddTask;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnFinish;

	/**
	 * Create the panel.
	 */
	public TYPEPanel() {
		setLayout(null);
		add(getBtnAddTask());
		add(getTxtAddTask());
		add(getScrollPane());
		add(getBtnFinish());

	}

	public JButton getBtnAddTask() {
		if (btnAddTask == null) {
			btnAddTask = new JButton("Add type");
			btnAddTask.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
			btnAddTask.setBounds(347, 35, 116, 43);
		}
		return btnAddTask;
	}
	public JTextField getTxtAddTask() {
		if (txtAddTask == null) {
			txtAddTask = new JTextField();
			txtAddTask.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
			txtAddTask.setBounds(39, 35, 298, 43);
			txtAddTask.setColumns(10);
		}
		return txtAddTask;
	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(38, 108, 424, 402);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	public JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setBackground(SystemColor.inactiveCaption);
			table.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		}
		return table;
	}
	public JButton getBtnFinish() {
		if (btnFinish == null) {
			btnFinish = new JButton("Finish");
			btnFinish.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
			btnFinish.setBounds(101, 532, 272, 43);
		}
		return btnFinish;
	}
}
