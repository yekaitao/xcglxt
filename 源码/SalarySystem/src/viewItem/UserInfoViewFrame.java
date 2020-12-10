package viewItem;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.tree.DefaultMutableTreeNode;

import Dao.UserDao;
import modelItem.User;

/**
 * ���û���Ϣ��������Ҳ����
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
		splitPane.setLeftComponent(new MyTree());//��ʾ�û���
		splitPane.setRightComponent(new UserInfoView(user));//��ʾ��¼�û�����Ϣ����
		add(splitPane,BorderLayout.CENTER);
	}

	class MyTree extends UserTree {

		//ˢ��
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

		//�������ʱ��ʾ���û�����Ϣ
		@Override
		public void leftNodeSelected(DefaultMutableTreeNode node) {
			// TODO Auto-generated method stub
			User user = new UserDao().getUserByName(node.toString());
			splitPane.setRightComponent(new UserInfoView(user));
		}	
	}
}
