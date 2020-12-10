package viewItem;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.tree.DefaultMutableTreeNode;

import Dao.UserDao;
import modelItem.User;

/**
 * 【用户信息】面板左右侧界面
 * 
 *
 */
public class UserInfoViewFrame extends JPanel {

	/**
	 * Create the panel.
	 */
	JSplitPane splitPane;
	public UserInfoViewFrame(User user) {
		setLayout(new BorderLayout(0,0));
		splitPane = new JSplitPane();
		splitPane.setLeftComponent(new MyTree());//显示用户树
		splitPane.setRightComponent(new UserInfoView(user));//显示登录用户的信息界面
		add(splitPane,BorderLayout.CENTER);
	}

	class MyTree extends UserTree {

		//刷新
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

		//单击结点时显示该用户的信息
		@Override
		public void leftNodeSelected(DefaultMutableTreeNode node) {
			// TODO Auto-generated method stub
			User user = new UserDao().getUserByName(node.toString());
			splitPane.setRightComponent(new UserInfoView(user));
		}	
	}
}
