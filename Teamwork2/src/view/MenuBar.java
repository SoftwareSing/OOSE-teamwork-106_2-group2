package view;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import listeners.ChangeDarkUIStyleListener;
import listeners.ChangeFlatUIStyleListener;
import listeners.DeleteListener;
import listeners.EditListener;
import listeners.MenuExitListener;
import listeners.RedoListener;
import listeners.UndoListener;

public class MenuBar{
	View vMdtr = View.getInstance();
	
	public MenuBar(JMenuBar menuBar) {
		menuBar.setToolTipText("");
		
		JMenu file = new JMenu("File");
		menuBar.add(file);
		
		JMenuItem menuItemOpen = new JMenuItem("Open");
		file.add(menuItemOpen);
		
		JMenuItem menuItemSave = new JMenuItem("Save");
		file.add(menuItemSave);
		
		file.addSeparator();
		
		JMenuItem menuItemExit = new JMenuItem("Exit");
		file.add(menuItemExit);
		
		JMenu menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);
		
		JMenuItem menuItemDelete = new JMenuItem("Delete");
		menuEdit.add(menuItemDelete);

		JMenuItem menuItemModify = new JMenuItem("Modify");
		menuEdit.add(menuItemModify);
		
		menuEdit.addSeparator();
		
		JMenuItem menuItemUndo = new JMenuItem("Undo");
		menuEdit.add(menuItemUndo);
		
		JMenuItem menuItemRedo = new JMenuItem("Redo");
		menuEdit.add(menuItemRedo);
		
		JMenu style = new JMenu("Style");
		menuBar.add(style);
		
		JMenuItem flatui = new JMenuItem("Flat UI");
		style.add(flatui);
		JMenuItem darkui = new JMenuItem("Dark UI");
		style.add(darkui);
		
		
		vMdtr.registerMenuOpen(menuItemOpen);
		vMdtr.registerMenuSave(menuItemSave);
		vMdtr.registerMenuExit(menuItemExit);
		vMdtr.registerMenuDelete(menuItemDelete);
		vMdtr.registerMenuModify(menuItemModify);
		vMdtr.registerMenuUndo(menuItemUndo);
		vMdtr.registerMenuRedo(menuItemRedo);
		
		//menuItemOpen.addActionListener(new MenuOpenListener());
		//menuItemSave.addActionListener(new MenuSaveListener());
		menuItemExit.addActionListener(new MenuExitListener());
		menuItemDelete.addActionListener(new DeleteListener());
		menuItemModify.addActionListener(new EditListener());
		menuItemUndo.addActionListener(new UndoListener());
		menuItemRedo.addActionListener(new RedoListener());
		flatui.addActionListener(new ChangeFlatUIStyleListener());
		darkui.addActionListener(new ChangeDarkUIStyleListener());
	}
}
