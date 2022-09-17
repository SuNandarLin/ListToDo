package view;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.JButton;

public class UpdatePanel extends JPanel {
	private JLabel lblupdateHr;
	private JSpinner spinUpdateHr;
	private JLabel lblUpdateMin;
	private JSpinner spinUpdateMin;
	private JLabel lblUpdateTime1;
	private JLabel lblUpdateTime2;
	private JButton btnUpdateCancel;
	private JButton btnUpdateTime;

	/**
	 * Create the panel.
	 */
	public UpdatePanel() {
		setLayout(null);
		add(getLblupdateHr());
		add(getSpinUpdateHr());
		add(getLblUpdateMin());
		add(getSpinUpdateMin());
		add(getLblUpdateTime1());
		add(getLblUpdateTime2());
		add(getBtnUpdateCancel());
		add(getBtnUpdateTime());

	}
	public JLabel getLblupdateHr() {
		if (lblupdateHr == null) {
			lblupdateHr = new JLabel("Hour :");
			lblupdateHr.setHorizontalAlignment(SwingConstants.LEFT);
			lblupdateHr.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			lblupdateHr.setBounds(29, 90, 44, 28);
		}
		return lblupdateHr;
	}
	public JSpinner getSpinUpdateHr() {
		if (spinUpdateHr == null) {
				
				String[] hourArray=new String[12];
				int i;		
				for(i=1;i<=12;i++)
					hourArray[i-1]=""+i;
				
			SpinnerListModel Spmodel=new SpinnerListModel(hourArray);
			spinUpdateHr = new JSpinner(Spmodel);
			spinUpdateHr.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			spinUpdateHr.setBounds(83, 90, 41, 27);
		}
		return spinUpdateHr;
	}
	public JLabel getLblUpdateMin() {
		if (lblUpdateMin == null) {			
			lblUpdateMin = new JLabel("Min :");
			lblUpdateMin.setHorizontalAlignment(SwingConstants.CENTER);
			lblUpdateMin.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			lblUpdateMin.setBounds(134, 90, 44, 28);
		}
		return lblUpdateMin;
	}
	public JSpinner getSpinUpdateMin() {
		if (spinUpdateMin == null) {
			String[] minArray=new String[60];
			int i;		
			for(i=0;i<=59;i++){
				if(i<10)
					minArray[i]=0+""+i;
				else
					minArray[i]=""+i;
				}
			
			SpinnerListModel Spmodel=new SpinnerListModel(minArray);
			spinUpdateMin = new JSpinner(Spmodel);
			spinUpdateMin.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			spinUpdateMin.setBounds(179, 90, 41, 27);
		}
		return spinUpdateMin;
	}
	public JLabel getLblUpdateTime1() {
		if (lblUpdateTime1 == null) {
			lblUpdateTime1 = new JLabel("Don't delay your tasks! ");
			lblUpdateTime1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			lblUpdateTime1.setBounds(10, 11, 213, 28);
		}
		return lblUpdateTime1;
	}
	public JLabel getLblUpdateTime2() {
		if (lblUpdateTime2 == null) {
			lblUpdateTime2 = new JLabel("Update time only if essential.");
			lblUpdateTime2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			lblUpdateTime2.setBounds(47, 41, 213, 28);
		}
		return lblUpdateTime2;
	}
	public JButton getBtnUpdateCancel() {
		if (btnUpdateCancel == null) {
			btnUpdateCancel = new JButton("Cancel");
			btnUpdateCancel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			btnUpdateCancel.setBounds(29, 143, 85, 28);
		}
		return btnUpdateCancel;
	}
	public JButton getBtnUpdateTime() {
		if (btnUpdateTime == null) {
			btnUpdateTime = new JButton("Update");
			btnUpdateTime.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			btnUpdateTime.setBounds(134, 143, 85, 28);
		}
		return btnUpdateTime;
	}
}
