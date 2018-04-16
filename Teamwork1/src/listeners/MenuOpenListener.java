package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

import mediator.ViewMediator;

public class MenuOpenListener implements ActionListener{
	private ViewMediator vMdtr = ViewMediator.getInstance();

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFileChooser openFile = new JFileChooser();
        openFile.showOpenDialog(null);
	}

}
