package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginPanel1 extends JPanel {
	private JLabel lblName;
	private JLabel lblacclogin;
	private JLabel lblUsername;
	private JTextField tfUserName;
	private JLabel lablaccNo;
	private JTextField tfAccNo;
	private JLabel lblpassword;
	private JTextField tfPassword;
	private JButton btnLogin;

	/**
	 * Create the panel.
	 */
	public LoginPanel1() {
		setBackground(new Color(210, 105, 30));
		setLayout(null);
		add(getLblName());
		add(getLblacclogin());
		add(getLblUsername());
//		add(getTfUserName());
		add(getLablaccNo());
		add(getTfAccNo());
		add(getLblpassword());
		add(getTfPassword());
		add(getBtnLogin());

	}

	public JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Piggy Bank");
			lblName.setHorizontalAlignment(SwingConstants.CENTER);
			lblName.setForeground(new Color(255, 228, 225));
			lblName.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
			lblName.setBounds(257, 33, 138, 32);
		}
		return lblName;
	}
	public JLabel getLblacclogin() {
		if (lblacclogin == null) {
			lblacclogin = new JLabel("Account Login");
			lblacclogin.setHorizontalAlignment(SwingConstants.CENTER);
			lblacclogin.setForeground(new Color(255, 228, 225));
			lblacclogin.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
			lblacclogin.setBounds(257, 76, 138, 32);
		}
		return lblacclogin;
	}
	public JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("User Name");
			lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
			lblUsername.setForeground(new Color(255, 228, 225));
			lblUsername.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
			lblUsername.setBounds(65, 140, 112, 32);
		}
		return lblUsername;
	}
/*	public JTextField getTfUserName() {
		if (tfUserName == null) {
			tfUserName = new JTextField();
			tfUserName.setColumns(10);
			tfUserName.setBounds(213, 140, 225, 32);
		}
		return tfUserName;
	}*/
	public JLabel getLablaccNo() {
		if (lablaccNo == null) {
			lablaccNo = new JLabel("Account No.");
			lablaccNo.setHorizontalAlignment(SwingConstants.CENTER);
			lablaccNo.setForeground(new Color(255, 228, 225));
			lablaccNo.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
			lablaccNo.setBounds(75, 186, 102, 32);
		}
		return lablaccNo;
	}
	public JTextField getTfAccNo() {
		if (tfAccNo == null) {
			tfAccNo = new JTextField();
			tfAccNo.setColumns(10);
			tfAccNo.setBounds(213, 186, 225, 32);
		}
		return tfAccNo;
	}
	public JLabel getLblpassword() {
		if (lblpassword == null) {
			lblpassword = new JLabel("Password");
			lblpassword.setHorizontalAlignment(SwingConstants.CENTER);
			lblpassword.setForeground(new Color(255, 228, 225));
			lblpassword.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
			lblpassword.setBounds(50, 234, 138, 32);
		}
		return lblpassword;
	}
	public JTextField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JTextField();
			tfPassword.setColumns(10);
			tfPassword.setBounds(213, 234, 225, 32);
		}
		return tfPassword;
	}
	public JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.setForeground(new Color(210, 105, 30));
			btnLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
			btnLogin.setBounds(222, 307, 138, 38);
		}
		return btnLogin;
	}
}
