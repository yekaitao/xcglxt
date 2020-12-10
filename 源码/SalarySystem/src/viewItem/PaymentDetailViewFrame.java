package viewItem;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.tree.DefaultMutableTreeNode;

import Dao.UserDao;
import modelItem.User;

/**
 * 【工资查询】面板的左右侧
 * 
 * @author lzw
 *
 */
public class PaymentDetailViewFrame extends JPanel {

	/**
	 * Create the panel.
	 */
	
	//分割面板
	JSplitPane splitPane;
	
	public PaymentDetailViewFrame(User user) {
		setLayout(new BorderLayout(0,0));
		splitPane = new JSplitPane();
		splitPane.setLeftComponent(new MyTree());
		splitPane.setRightComponent(new PaymentDetailView("all",user));
		add(splitPane,BorderLayout.CENTER);
	}

	
	
	class MyTree extends UserTree{
		//刷新
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		//点击结点开始对应某个查询
		@Override
		public void leftNodeSelected(DefaultMutableTreeNode node) {
			// TODO Auto-generated method stub
			User user = new UserDao().getUserByName(node.toString());
			splitPane.setRightComponent(new PaymentDetailView("user",user));
		}
	}
}
