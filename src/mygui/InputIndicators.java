package mygui;

import guiplus.IndicatorListRender;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.awt.TextField;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JScrollPane;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import javax.swing.JScrollBar;

public class InputIndicators {

	private JFrame frame;
//	private JTextField textField;
	private JTextField addTextField;
	DefaultListModel myListModel = new DefaultListModel();
	GridBagConstraints gbc_list = new GridBagConstraints();
	JList list = new JList(myListModel);
	
	
	//String[] test = {"one","two"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputIndicators window = new InputIndicators();
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
	public InputIndicators() {
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
		gridBagLayout.columnWidths = new int[]{75, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 1;
		
		addTextField = new JTextField();
		GridBagConstraints gbc_addTextField = new GridBagConstraints();
		gbc_addTextField.insets = new Insets(0, 0, 5, 5);
		gbc_addTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_addTextField.gridx = 1;
		gbc_addTextField.gridy = 1;
		frame.getContentPane().add(addTextField, gbc_addTextField);
		addTextField.setColumns(10);
		
		JButton addButton = new JButton("add");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 1;
		frame.getContentPane().add(addButton, gbc_btnNewButton);
		
	
		//myListModel.addElement(obj);
		
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = new String();
				tempText = addTextField.getText();
				System.out.println(tempText);
				myListModel.addElement(tempText);
			
				list=new JList(myListModel);
				addTextField.setText("");
		//		frame.getContentPane().add(list, gbc_list);
			}
		});
		
	//	frame.getContentPane().add(textField, gbc_textField);
	//	textField.setColumns(10);
		
		gbc_list.gridwidth = 2;
		gbc_list.insets = new Insets(0, 0, 0, 5);
		gbc_list.weightx = 4.0;
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 3;
		gbc_list.gridy = 2;
//		list.setCellRenderer(new IndicatorListRender(list));
	//	list.add
		frame.getContentPane().add(list, gbc_list);
		JScrollPane scrollPane = new JScrollPane(list);
		GridBagConstraints gbc_ScrollPane = new GridBagConstraints();
		gbc_ScrollPane.gridwidth = 2;
		gbc_ScrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_ScrollPane.weightx = 4.0;
		gbc_ScrollPane.fill = GridBagConstraints.BOTH;
		gbc_ScrollPane.gridx = 1;
		gbc_ScrollPane.gridy = 2;
		frame.getContentPane().add(scrollPane, gbc_ScrollPane);
//		list.setCellRenderer(new IndicatorListRender(list));
//
//	    Container contentPane = frame.getContentPane();
//	    contentPane.add(scrollPane, BorderLayout.CENTER);
//		
	}

}
