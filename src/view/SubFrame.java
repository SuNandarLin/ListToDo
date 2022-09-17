package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import controllers.ResultFrameController;
import controllers.TYPEFrameController;
import controllers.UpdateFrameController;

public class SubFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void TypesFrameMain(final int width,final int height,final JTable table
			,final TodayTASKPanel panel) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubFrame frame = new SubFrame(width,height);
					frame.setVisible(true);
					if(width<300)
						new UpdateFrameController(frame,table,panel);
					else if(width>=500)
					    new TYPEFrameController(frame);
					else if (width>300 && width<500)
						new ResultFrameController(frame,table);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public SubFrame(int width,int height) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 50, width, height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	

}
