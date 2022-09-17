package view;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class ResultPanel extends JPanel {
	private JRadioButton rdbtnFC;
	private JRadioButton rdbtnDWBNET;
	private JRadioButton rdbtnFHFSC;
	private JRadioButton rdbtnCFSC;
	private JRadioButton rdbtnWMT;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnFAIG;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnFinishResult;

	/**
	 * Create the panel.
	 */
	public ResultPanel() {
		setLayout(null);
		add(getRdbtnFC());
		add(getRdbtnDWBNET());
		add(getRdbtnFHFSC());
		add(getRdbtnCFSC());
		add(getRdbtnWMT());
		add(getLblNewLabel());
		add(getRdbtnFAIG());
		add(getBtnFinishResult());

	}
	public JRadioButton getRdbtnFC() {
		if (rdbtnFC == null) {
			rdbtnFC = new JRadioButton("Finish completely :D");
			buttonGroup.add(rdbtnFC);
			rdbtnFC.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			rdbtnFC.setBounds(66, 77, 260, 27);
		}
		return rdbtnFC;
	}
	public JRadioButton getRdbtnDWBNET() {
		if (rdbtnDWBNET == null) {
			rdbtnDWBNET = new JRadioButton("Do well but not enough time :0");
			buttonGroup.add(rdbtnDWBNET);
			rdbtnDWBNET.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			rdbtnDWBNET.setBounds(66, 160, 260, 27);
		}
		return rdbtnDWBNET;
	}
	public JRadioButton getRdbtnFHFSC() {
		if (rdbtnFHFSC == null) {
			rdbtnFHFSC = new JRadioButton("Finish half for sudden case :\\");
			buttonGroup.add(rdbtnFHFSC);
			rdbtnFHFSC.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			rdbtnFHFSC.setBounds(66, 202, 260, 27);
		}
		return rdbtnFHFSC;
	}
	public JRadioButton getRdbtnCFSC() {
		if (rdbtnCFSC == null) {
			rdbtnCFSC = new JRadioButton("Cancel for sudden case :|");
			buttonGroup.add(rdbtnCFSC);
			rdbtnCFSC.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			rdbtnCFSC.setBounds(66, 243, 260, 27);
		}
		return rdbtnCFSC;
	}
	public JRadioButton getRdbtnWMT() {
		if (rdbtnWMT == null) {
			rdbtnWMT = new JRadioButton("Wasted my time :(");
			buttonGroup.add(rdbtnWMT);
			rdbtnWMT.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			rdbtnWMT.setBounds(66, 287, 162, 27);
		}
		return rdbtnWMT;
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Record your tasks finish or not!");
			lblNewLabel.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
			lblNewLabel.setBounds(53, 22, 304, 35);
		}
		return lblNewLabel;
	}
	public JRadioButton getRdbtnFAIG() {
		if (rdbtnFAIG == null) {
			rdbtnFAIG = new JRadioButton("Finish as I guess :)\r\n");
			buttonGroup.add(rdbtnFAIG);
			rdbtnFAIG.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			rdbtnFAIG.setBounds(66, 119, 162, 27);
		}
		return rdbtnFAIG;
	}
	public JButton getBtnFinishResult() {
		if (btnFinishResult == null) {
			btnFinishResult = new JButton("Finish");
			btnFinishResult.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnFinishResult.setBounds(114, 335, 149, 35);
		}
		return btnFinishResult;
	}
}
