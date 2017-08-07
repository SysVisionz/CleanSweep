package taskComponent;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListItems extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3004743829927917514L;

	/**
	 * Create the panel.
	 */
	public ListItems(String whichbutton, ArrayList<String> entries) {
		DefaultListModel<String> listModel = new DefaultListModel<>();
		int location=0;
		for(int i = 0; i < entries.size()/2; i++){
			listModel.addElement(entries.get(i));
			location++;
		}
		JList<String> list = new JList<>(listModel);
		
		DefaultListModel<String> listModel2 = new DefaultListModel<>();
		for(int i = location; i < entries.size(); i++){
			listModel2.addElement(entries.get(i));
		}
		JList<String> list2 = new JList<>(listModel2);
		add(list);
		add(list2);
		
		JButton btnAddNew = new JButton("New" + whichbutton);
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String addto = JOptionPane.showInputDialog("New " + whichbutton + " name:");
				if (listModel.size()<listModel2.size()){
					listModel.addElement(addto);
				}
				else{
					listModel2.addElement(addto);
				}
			}
		});
		btnAddNew.setBounds(342, 215, 96, 25);
		add(btnAddNew);
	}
	@Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

}
