package mygui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{48, 80, 162, 80, 48};
		gridBagLayout.rowHeights = new int[]{36, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JButton btnAnalysis = new JButton("Analysis");
		btnAnalysis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblWelcomeTitle = new JLabel("welcome title");
		lblWelcomeTitle.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblWelcomeTitle = new GridBagConstraints();
		gbc_lblWelcomeTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblWelcomeTitle.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblWelcomeTitle.gridx = 2;
		gbc_lblWelcomeTitle.gridy = 1;
		frame.getContentPane().add(lblWelcomeTitle, gbc_lblWelcomeTitle);
		GridBagConstraints gbc_btnAnalysisBtn = new GridBagConstraints();
		gbc_btnAnalysisBtn.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnalysisBtn.gridx = 1;
		gbc_btnAnalysisBtn.gridy = 4;
		frame.getContentPane().add(btnAnalysis, gbc_btnAnalysisBtn);
		
		JButton btnDecision = new JButton("Decision");
		GridBagConstraints gbc_btnDecision= new GridBagConstraints();
		gbc_btnDecision.insets = new Insets(0, 0, 5, 0);
		gbc_btnDecision.gridx = 3;
		gbc_btnDecision.gridy = 4;
		frame.getContentPane().add(btnDecision, gbc_btnDecision);
	}

}
