package view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;

public class HomePanel extends JPanel {
	private JButton btnHome;
	private JButton btnTasks;
	private JButton btnTodaysTasks;
	private JLabel lblNewLabel;
	private JLabel lblNothingCanStop;

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		setLayout(null);
		add(getBtnHome());
		add(getBtnTasks());
		add(getBtnTodaysTasks());
		add(getLblNewLabel());
		add(getLblNothingCanStop());

	}

	public JButton getBtnHome() {
		if (btnHome == null) {
			btnHome = new JButton("Home");
			btnHome.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnHome.setBounds(52, 75, 239, 46);
		}
		return btnHome;
	}
	public JButton getBtnTasks() {
		if (btnTasks == null) {
			btnTasks = new JButton("Tasks To Do");
			btnTasks.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnTasks.setBounds(52, 132, 239, 46);
		}
		return btnTasks;
	}
	public JButton getBtnTodaysTasks() {
		if (btnTodaysTasks == null) {
			btnTodaysTasks = new JButton("Today's Tasks To Do");
			btnTodaysTasks.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
			btnTodaysTasks.setBounds(52, 189, 239, 46);
		}
		return btnTodaysTasks;
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Go!");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 55));
			lblNewLabel.setBounds(310, 89, 127, 62);
		}
		return lblNewLabel;
	}
	public JLabel getLblNothingCanStop() {
		if (lblNothingCanStop == null) {
			lblNothingCanStop = new JLabel("Nothing can stop you.");
			lblNothingCanStop.setHorizontalAlignment(SwingConstants.CENTER);
			lblNothingCanStop.setFont(new Font("Segoe Print", Font.PLAIN, 30));
			lblNothingCanStop.setBounds(376, 162, 368, 62);
		}
		return lblNothingCanStop;
	}
}
