package mygui;

import guiplus.MyListItem;
import guiplus.WeightListRender;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class WeightFactors {

	private JFrame frame;
	List<String> economicList = new ArrayList<String>();  
	List<String> enviromentList = new ArrayList<String>();
	List<String> socialList = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightFactors window = new WeightFactors();
				//	window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WeightFactors() {
		//example
		economicList.add("Linux");
		economicList.add("Windows");
		economicList.add("MacOSX");
		initialize();
	}
	
	public WeightFactors(List economiclist, List enviromentlist, List sociallist)
	{
		this.economicList = economiclist;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyListItem[] item = {new MyListItem("Temp"),new MyListItem("temp2")};
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{75, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.weighty = 1.0;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnEconomic = new JButton("Economic");
		GridBagConstraints gbc_btnEconomic = new GridBagConstraints();
		gbc_btnEconomic.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEconomic.weighty = 1.0;
		gbc_btnEconomic.insets = new Insets(0, 0, 5, 5);
		gbc_btnEconomic.gridx = 0;
		gbc_btnEconomic.gridy = 2;
		frame.getContentPane().add(btnEconomic, gbc_btnEconomic);
		
		JList jlist = new JList(item);
//		GridBagConstraints gbc_list = new GridBagConstraints();
//		gbc_list.gridheight = 3;
//		gbc_list.insets = new Insets(0, 0, 5, 0);
//		gbc_list.fill = GridBagConstraints.BOTH;
//		gbc_list.gridx = 1;
//		gbc_list.gridy = 2;
//		frame.getContentPane().add(jlist, gbc_list);
		jlist.setCellRenderer(new WeightListRender(jlist));
		
		JButton btnEnviroment = new JButton("Enviroment");
		GridBagConstraints gbc_btnEnvironment = new GridBagConstraints();
		gbc_btnEnvironment.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEnvironment.weighty = 1.0;
		gbc_btnEnvironment.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnvironment.gridx = 0;
		gbc_btnEnvironment.gridy = 3;
		frame.getContentPane().add(btnEnviroment, gbc_btnEnvironment);
		
		JButton btnSocial = new JButton("Social");
		GridBagConstraints gbc_btnSocial = new GridBagConstraints();
		gbc_btnSocial.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSocial.weighty = 1.0;
		gbc_btnSocial.insets = new Insets(0, 0, 5, 5);
		gbc_btnSocial.gridx = 0;
		gbc_btnSocial.gridy = 4;
		frame.getContentPane().add(btnSocial, gbc_btnSocial);
		
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
		
		JButton btnSave = new JButton("Save");
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.insets = new Insets(0, 0, 0, 5);
		gbc_btnSave.gridx = 1;
		gbc_btnSave.gridy = 6;
		frame.getContentPane().add(btnSave, gbc_btnSave);

	}
	


}
