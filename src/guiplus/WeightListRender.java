package guiplus;

import java.awt.Checkbox;
import java.awt.Component;
import java.awt.Label;
import java.awt.TextField;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class WeightListRender extends JPanel implements ListCellRenderer{

	JList list;
	TextField textField;
	JLabel label;//,lable2;
	//add()
	public WeightListRender(JList list)
	{
		this.list = list;
		setLayout(null);
		//add(textField = new TextField());
	//	add(lable2 = new JLabel());
		add(label = new JLabel());
	}
	
	




	@Override
	public Component getListCellRendererComponent(JList arg0, Object value,
			int arg2, boolean arg3, boolean arg4) {
		// TODO Auto-generated method stub
		label.setFont(list.getFont());
		System.out.println(value.toString());
label.setText(value.toString());
	//	textField.setText("lala");
		return this;
	}
	
	

	
//	public class MyListLabel{
//		
//	}

}
