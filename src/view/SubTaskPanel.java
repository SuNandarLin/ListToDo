package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SubTaskPanel extends JPanel {
	private JButton btnSubTask;
	private JTextField txtSubTask;
	private JScrollPane scrollPane;
	private JButton btnAddTasks;
	private JButton btnFinish;
	private JTable tableSubTask;
	private JLabel lblTitle;

	/**
	 * Create the panel.
	 */
	public SubTaskPanel() {
		setLayout(null);
		add(getBtnSubAdd());
		add(getTxtSubTask());
		add(getScrollPaneSub());
		add(getBtnAdd());
		add(getBtnFinish());
		add(getLblTitle());

	}
	public JButton getBtnSubAdd() {
		if (btnSubTask == null) {
			btnSubTask = new JButton("ADD Subtask");
			btnSubTask.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
			btnSubTask.setBounds(32, 56, 132, 32);
		}
		return btnSubTask;
	}
	public JTextField getTxtSubTask() {
		if (txtSubTask == null) {
			txtSubTask = new JTextField();
			txtSubTask.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			txtSubTask.setColumns(10);
			txtSubTask.setBounds(174, 57, 309, 32);
		}
		return txtSubTask;
	}
	public JScrollPane getScrollPaneSub() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(29, 109, 452, 380);
			scrollPane.setViewportView(getTableSubTask());
		}
		return scrollPane;
	}
	public JButton getBtnAdd() {
		if (btnAddTasks == null) {
			btnAddTasks = new JButton("ADD");
			btnAddTasks.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnAddTasks.setBounds(92, 524, 146, 32);
		}
		return btnAddTasks;
	}
	public JButton getBtnFinish() {
		if (btnFinish == null) {
			btnFinish = new JButton("Finish");
			btnFinish.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnFinish.setBounds(283, 524, 146, 32);
		}
		return btnFinish;
	}
	public JTable getTableSubTask() {
		if (tableSubTask == null) {
			tableSubTask = new JTable();
		}
		return tableSubTask;
	}
	public JLabel getLblTitle() {
		if (lblTitle == null) {
			lblTitle = new JLabel("Title");
			lblTitle.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
			lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitle.setBounds(92, 11, 362, 33);
		}
		return lblTitle;
	}
}
