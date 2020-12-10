package viewItem;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.tree.DefaultMutableTreeNode;

import Dao.UserDao;
import modelItem.User;
import viewItem.WorkloadBox.MyTree;

public class WorkloadBox extends JPanel {

	/**
	 * Create the panel.
	 */
	JSplitPane splitPane;
	public WorkloadBox(User user) {
		setLayout(new BorderLayout(0, 0));
		
		splitPane = new JSplitPane();
		splitPane.setLeftComponent(new MyTree());
		splitPane.setRightComponent(new WorkloadInput(user));
		add(splitPane, BorderLayout.CENTER);

	}
	
	class MyTree extends UserTree{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			
		}

		@Override
		public void leftNodeSelected(DefaultMutableTreeNode node) {
			// TODO 自动生成的方法存根
			User user=new UserDao().getUserByName(node.toString());
			splitPane.setRightComponent(new WorkloadInput(user));
			
		}
		
	}

}
