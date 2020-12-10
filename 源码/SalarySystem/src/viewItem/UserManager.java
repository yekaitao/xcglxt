package viewItem;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JSplitPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;

import Dao.UserDao;
import modelItem.User;

/**
 * MainFram选项卡【用户管理】的界面
 * 
 *
 */
public class UserManager extends JPanel {

	/**
	 * Create the panel.
	 */
	JSplitPane splitPane;
	
	public UserManager() {
		setLayout(new BorderLayout(0, 0));
		
		splitPane = new JSplitPane();
		splitPane.setLeftComponent(new myTree());
		splitPane.setRightComponent(new UserInfoCreat());
		add(splitPane, BorderLayout.CENTER);
	}
	
	class myTree extends UserTree{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("刷新成功~");
			splitPane.setLeftComponent(new myTree());
		}
		
		@Override
		public void leftNodeSelected(DefaultMutableTreeNode node) {
			User user = new UserDao().getUserByName(node.toString());
			splitPane.setRightComponent(new UserInfoUpdate(user));
		}
	}

}
