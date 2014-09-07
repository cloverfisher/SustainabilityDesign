package guiplus;

import java.awt.Checkbox;
import java.awt.Component;
import java.awt.TextField;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class IndicatorListRender extends JPanel implements ListCellRenderer{

	JList list;
	TextField textField;
	Checkbox checkbox;
	public IndicatorListRender(JList list)
	{
		this.list = list;
		setLayout(null);
		add(textField = new TextField());
		add(checkbox = new Checkbox());
	}
	
	




	@Override
	public Component getListCellRendererComponent(JList arg0, Object arg1,
			int arg2, boolean arg3, boolean arg4) {
		// TODO Auto-generated method stub
		textField.setText("lala");
		return this;
	}

}
