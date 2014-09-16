package mygui;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class InputIndicators extends Frame{

	private JFrame frame;
//	private JTextField textField;
	private JTextField addTextField;
	DefaultListModel economicListModel ;//= new DefaultListModel();
	DefaultListModel enviromentListModel;
	DefaultListModel socialListModel;
	GridBagConstraints gbc_list = new GridBagConstraints();
	JList jlist; //= new JList(myListModel);
	 
	int viewflag=1;//economic = 1, enviroment = 2, social = 3
	List<String> economicList = new ArrayList<String>();  
	List<String> enviromentList = new ArrayList<String>();
	List<String> socialList = new ArrayList<String>();
	private GridBagConstraints gbc_btnSave;
	
	
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
	//	setBounds(100, 100, 800, 600);
		economicListModel = new DefaultListModel();
		enviromentListModel = new DefaultListModel();
		socialListModel = new DefaultListModel();
		jlist = new JList(economicListModel);
		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{75, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 1.0;
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		
//		GridBagConstraints gbc_textField = new GridBagConstraints();
//		gbc_textField.insets = new Insets(0, 0, 0, 5);
//		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
//		gbc_textField.gridx = 0;
//		gbc_textField.gridy = 1;
		
		addTextField = new JTextField();
		GridBagConstraints gbc_addTextField = new GridBagConstraints();
		gbc_addTextField.weighty = 1.0;
		gbc_addTextField.gridwidth = 2;
		gbc_addTextField.insets = new Insets(0, 0, 5, 5);
		gbc_addTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_addTextField.gridx = 1;
		gbc_addTextField.gridy = 1;
		frame.getContentPane().add(addTextField, gbc_addTextField);
		addTextField.setColumns(10);
		
		JButton addButton = new JButton("add");
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdd.gridx = 3;
		gbc_btnAdd.gridy = 1;
		frame.getContentPane().add(addButton, gbc_btnAdd);
		
		

		jlist.addListSelectionListener(
				new ListSelectionListener() {
					
					@Override
					public void valueChanged(ListSelectionEvent e) {
						// TODO Auto-generated method stub
					//	jlist.setSelectedIndex(index);
					//	if(jlist.getSelectedIndex()!=)
					//	System.out.println(jlist.getSelectedIndex());
					}
				}
					);
		
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempText = new String();
				tempText = addTextField.getText();
				if(!tempText.trim().isEmpty())
				{
					switch(viewflag)
					{
					case 1://economic
					{
						economicList.add(tempText);
						economicListModel.add(economicListModel.getSize(),tempText);	
						break;
					}
					case 2:	//enviroment
					{
						enviromentList.add(tempText);
						enviromentListModel.add(enviromentListModel.getSize(), tempText);
						break;
					}
					case 3: //social
					{
						socialList.add(tempText);
						socialListModel.add(socialListModel.getSize(), tempText);
						break;
					}
						
					}
		
				}

				
			//	jlist=new JList(myListModel);
				addTextField.setText("");
		//		frame.getContentPane().add(list, gbc_list);
			}
		});
		
		JButton btnEconomic = new JButton("Economic");
		GridBagConstraints gbc_btnEconomic = new GridBagConstraints();
		gbc_btnEconomic.weighty = 1.0;
		gbc_btnEconomic.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEconomic.insets = new Insets(0, 0, 5, 5);
		gbc_btnEconomic.gridx = 0;
		gbc_btnEconomic.gridy = 2;
		frame.getContentPane().add(btnEconomic, gbc_btnEconomic);
		btnEconomic.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewflag = 1;
				jlist.setModel(economicListModel);
			}
		});
		
	//	frame.getContentPane().add(textField, gbc_textField);
	//	textField.setColumns(10);
		
//		gbc_list.gridwidth = 2;
//		gbc_list.insets = new Insets(0, 0, 0, 5);
//		gbc_list.weightx = 4.0;
//		gbc_list.fill = GridBagConstraints.BOTH;
//		gbc_list.gridx = 3;
//		gbc_list.gridy = 2;

	//	frame.getContentPane().add(list, gbc_list);
		JScrollPane scrollPane = new JScrollPane(jlist);
		GridBagConstraints gbc_ScrollPane = new GridBagConstraints();
		gbc_ScrollPane.gridheight = 4;
		gbc_ScrollPane.gridwidth = 3;
		gbc_ScrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_ScrollPane.weightx = 4.0;
		gbc_ScrollPane.fill = GridBagConstraints.BOTH;
		gbc_ScrollPane.gridx = 1;
		gbc_ScrollPane.gridy = 2;
		frame.getContentPane().add(scrollPane, gbc_ScrollPane);
		
		JButton btnEnvironment = new JButton("Environment");
		GridBagConstraints gbc_btnEnvironment = new GridBagConstraints();
		gbc_btnEnvironment.weighty = 1.0;
		gbc_btnEnvironment.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEnvironment.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnvironment.gridx = 0;
		gbc_btnEnvironment.gridy = 3;
		frame.getContentPane().add(btnEnvironment, gbc_btnEnvironment);
		btnEnvironment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewflag = 2;
				jlist.setModel(enviromentListModel);
			}
		});
		
		JButton btnSocial = new JButton("Social");
		GridBagConstraints gbc_btnSocial = new GridBagConstraints();
		gbc_btnSocial.weighty = 1.0;
		gbc_btnSocial.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSocial.insets = new Insets(0, 0, 5, 5);
		gbc_btnSocial.gridx = 0;
		gbc_btnSocial.gridy = 4;
		frame.getContentPane().add(btnSocial, gbc_btnSocial);
		btnSocial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				viewflag = 3;
				jlist.setModel(socialListModel);
			}
		});
		
		JButton btnExample = new JButton("Example");
		GridBagConstraints gbc_btnExample = new GridBagConstraints();
		gbc_btnExample.weighty = 1.0;
		gbc_btnExample.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExample.insets = new Insets(0, 0, 5, 5);
		gbc_btnExample.gridx = 0;
		gbc_btnExample.gridy = 5;
		frame.getContentPane().add(btnExample, gbc_btnExample);
		
		JButton btnDeleteIndicator = new JButton("Delete");
		btnDeleteIndicator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO delete the select indicator in jlist&&list
				
				int tempIndex = jlist.getSelectedIndex();
				if(tempIndex!=-1)
				{
					switch (viewflag) {
					case 1:
						economicList.remove(tempIndex);
						economicListModel.remove(tempIndex);
						break;

					case 2:
						enviromentList.remove(tempIndex);
						enviromentListModel.remove(tempIndex);
						break;
					case 3:
						socialList.remove(tempIndex);
						socialListModel.remove(tempIndex);
						break;
					}

				}
				System.out.println(tempIndex);
			//	jlist.setSelectedIndex(2);
			}
		});
		GridBagConstraints gbc_btnDeleteIndicator = new GridBagConstraints();
		gbc_btnDeleteIndicator.weighty = 1.0;
		gbc_btnDeleteIndicator.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDeleteIndicator.insets = new Insets(0, 0, 0, 5);
		gbc_btnDeleteIndicator.gridx = 1;
		gbc_btnDeleteIndicator.gridy = 6;
		frame.getContentPane().add(btnDeleteIndicator, gbc_btnDeleteIndicator);
		
		JButton btnSave = new JButton("Save");
		GridBagConstraints gbc_btnSaveIndicator;
		gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.weighty = 1.0;
		gbc_btnSave.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSave.insets = new Insets(0, 0, 0, 5);
		gbc_btnSave.gridx = 2;
		gbc_btnSave.gridy = 6;
		frame.getContentPane().add(btnSave, gbc_btnSave);
		
		JButton btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.weighty = 1.0;
		gbc_btnBack.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBack.gridx = 3;
		gbc_btnBack.gridy = 6;
		frame.getContentPane().add(btnBack, gbc_btnBack);
//		list.setCellRenderer(new IndicatorListRender(list));
//
//	    Container contentPane = frame.getContentPane();
//	    contentPane.add(scrollPane, BorderLayout.CENTER);
//		
	}

}
