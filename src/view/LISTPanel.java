package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

public class LISTPanel extends JPanel {
	private JLabel lblTasksTodo;
	private JLabel lblChoosetypes;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdFirstpri;
	private JRadioButton rdSecondpri;
	private JRadioButton rdThirdpri;
	private JScrollPane scrollPane;
	private JTextField txtFieldtaskstodo;
	private JTable table;
	private JButton btnAdd;
	private JButton btnEditTypes;
	private JComboBox comboChooseTypes;
	private JLabel lblListOfTasks;
	private JButton GTHomeInList;
	private JButton GTTdyTaskInList;

	/**
	 * Create the panel.
	 */
	public LISTPanel() {
		setLayout(null);
		add(getLblTasksTodo());
		add(getLblChoosetypes());
		add(getRdFirstpri());
		add(getRdSecondpri());
		add(getRdThirdpri());
		add(getScrollPane());
		add(getTxtFieldtaskstodo());
		add(getBtnAdd());
		add(getBtnEditTypes());
		add(getComboChooseTypes());
		add(getLblListOfTasks());
		add(getGTHomeInList());
		add(getGTTdyTaskInList());

	}
	public JLabel getLblTasksTodo() {
		if (lblTasksTodo == null) {
			lblTasksTodo = new JLabel("Task to do     :");
			lblTasksTodo.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
			lblTasksTodo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTasksTodo.setBounds(627, 57, 153, 38);
		}
		return lblTasksTodo;
	}
	public JLabel getLblChoosetypes() {
		if (lblChoosetypes == null) {
			lblChoosetypes = new JLabel("Choose types :");
			lblChoosetypes.setHorizontalAlignment(SwingConstants.CENTER);
			lblChoosetypes.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
			lblChoosetypes.setBounds(627, 132, 153, 38);
		}
		return lblChoosetypes;
	}
	public JRadioButton getRdFirstpri() {
		if (rdFirstpri == null) {
			rdFirstpri = new JRadioButton("First priority");
			buttonGroup.add(rdFirstpri);
			rdFirstpri.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
			rdFirstpri.setBounds(641, 260, 139, 23);
		}
		return rdFirstpri;
	}
	public JRadioButton getRdSecondpri() {
		if (rdSecondpri == null) {
			rdSecondpri = new JRadioButton("Second priority");
			buttonGroup.add(rdSecondpri);
			rdSecondpri.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
			rdSecondpri.setBounds(791, 260, 159, 23);
		}
		return rdSecondpri;
	}
	public JRadioButton getRdThirdpri() {
		if (rdThirdpri == null) {
			rdThirdpri = new JRadioButton("Third priority");
			buttonGroup.add(rdThirdpri);
			rdThirdpri.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
			rdThirdpri.setBounds(952, 260, 147, 23);
		}
		return rdThirdpri;
	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(34, 49, 583, 516);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	public JTextField getTxtFieldtaskstodo() {
		if (txtFieldtaskstodo == null) {
			txtFieldtaskstodo = new JTextField();
			txtFieldtaskstodo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			txtFieldtaskstodo.setBounds(790, 60, 309, 32);
			txtFieldtaskstodo.setColumns(10);
		}
		return txtFieldtaskstodo;
	}
	public JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		}
		return table;
	}
	public JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("ADD");
			btnAdd.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
			btnAdd.setBounds(952, 333, 147, 61);
		}
		return btnAdd;
	}
	public JButton getBtnEditTypes() {
		if (btnEditTypes == null) {
			btnEditTypes = new JButton("Edit types");
			btnEditTypes.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
			btnEditTypes.setBounds(988, 179, 111, 32);
		}
		return btnEditTypes;
	}
	public JComboBox getComboChooseTypes() {
		if (comboChooseTypes == null) {
			comboChooseTypes = new JComboBox();
			comboChooseTypes.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			comboChooseTypes.setBounds(790, 136, 309, 32);
		}
		return comboChooseTypes;
	}
	public JLabel getLblListOfTasks() {
		if (lblListOfTasks == null) {
			lblListOfTasks = new JLabel("List of tasks to do");
			lblListOfTasks.setHorizontalAlignment(SwingConstants.CENTER);
			lblListOfTasks.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			lblListOfTasks.setBounds(232, 11, 192, 27);
		}
		return lblListOfTasks;
	}
	public JButton getGTHomeInList() {
		if (GTHomeInList == null) {
			GTHomeInList = new JButton("Go To Home >>>");
			GTHomeInList.setHorizontalAlignment(SwingConstants.LEADING);
			GTHomeInList.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
			GTHomeInList.setBounds(891, 536, 171, 23);
		}
		return GTHomeInList;
	}
	public JButton getGTTdyTaskInList() {
		if (GTTdyTaskInList == null) {
			GTTdyTaskInList = new JButton("Go To Today Task >>>");
			GTTdyTaskInList.setHorizontalAlignment(SwingConstants.LEADING);
			GTTdyTaskInList.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
			GTTdyTaskInList.setBounds(891, 566, 171, 23);
		}
		return GTTdyTaskInList;
	}
}
