package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.View;

public class BtnSelectListener implements ActionListener{

	private View vMdtr = View.getInstance();
	
	
	public BtnSelectListener() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		vMdtr.selectClick(e);
	}

}
