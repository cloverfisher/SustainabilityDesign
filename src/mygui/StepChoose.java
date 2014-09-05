package mygui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StepChoose {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StepChoose window = new StepChoose();
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
	public StepChoose() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.set
		GridBagLayout gridBagLayout = new GridBagLayout();
	
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JButton btnIndicatorSelection = new JButton("Indicator selection");
		btnIndicatorSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnIndicatorSelection = new GridBagConstraints();
		gbc_btnIndicatorSelection.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIndicatorSelection.insets = new Insets(0, 0, 5, 5);
		gbc_btnIndicatorSelection.gridx = 1;
		gbc_btnIndicatorSelection.gridy = 0;
		gbc_btnIndicatorSelection.weighty = 1;
		gbc_btnIndicatorSelection.weightx = 1;
		frame.getContentPane().add(btnIndicatorSelection, gbc_btnIndicatorSelection);
		
		JButton btnInputFactor = new JButton("Input weight factor");
		GridBagConstraints gbc_btninputFactor = new GridBagConstraints();
		gbc_btninputFactor.weighty = 1.0;
		gbc_btninputFactor.weightx = 1.0;
		gbc_btninputFactor.ipadx = 1;
		gbc_btninputFactor.fill = GridBagConstraints.HORIZONTAL;
		gbc_btninputFactor.insets = new Insets(0, 0, 5, 5);
		gbc_btninputFactor.gridx = 1;
		gbc_btninputFactor.gridy = 1;
		frame.getContentPane().add(btnInputFactor, gbc_btninputFactor);
		
		JButton btnDecideAlternatives = new JButton("Decide alternatives");
		GridBagConstraints gbc_btnDecideAlternatives = new GridBagConstraints();
		gbc_btnDecideAlternatives.weighty = 1.0;
		gbc_btnDecideAlternatives.weightx = 1.0;
		gbc_btnDecideAlternatives.ipady = 1;
		gbc_btnDecideAlternatives.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDecideAlternatives.insets = new Insets(0, 0, 5, 5);
		gbc_btnDecideAlternatives.gridx = 1;
		gbc_btnDecideAlternatives.gridy = 2;
		frame.getContentPane().add(btnDecideAlternatives, gbc_btnDecideAlternatives);
		
		JButton btnInputValue = new JButton("Input real value");
		GridBagConstraints gbc_btnInputValue = new GridBagConstraints();
		gbc_btnInputValue.weightx = 1.0;
		gbc_btnInputValue.weighty = 1.0;
		gbc_btnInputValue.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnInputValue.insets = new Insets(0, 0, 5, 5);
		gbc_btnInputValue.gridx = 1;
		gbc_btnInputValue.gridy = 3;
		frame.getContentPane().add(btnInputValue, gbc_btnInputValue);
		
		JButton btnAnalysisResult = new JButton("Analysis result");
		GridBagConstraints gbc_btnAbaktsusResult = new GridBagConstraints();
		gbc_btnAbaktsusResult.weighty = 1.0;
		gbc_btnAbaktsusResult.weightx = 1.0;
		gbc_btnAbaktsusResult.insets = new Insets(0, 0, 5, 5);
		gbc_btnAbaktsusResult.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAbaktsusResult.gridx = 1;
		gbc_btnAbaktsusResult.gridy = 4;
		frame.getContentPane().add(btnAnalysisResult, gbc_btnAbaktsusResult);
		
		JButton btnBack = new JButton("back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.insets = new Insets(0, 0, 0, 5);
		gbc_btnBack.gridx = 0;
		gbc_btnBack.gridy = 6;
		frame.getContentPane().add(btnBack, gbc_btnBack);
		
		JButton btnClose = new JButton("close");
		GridBagConstraints gbc_btnClose = new GridBagConstraints();
		gbc_btnClose.gridx = 2;
		gbc_btnClose.gridy = 6;
		frame.getContentPane().add(btnClose, gbc_btnClose);
	}

}
