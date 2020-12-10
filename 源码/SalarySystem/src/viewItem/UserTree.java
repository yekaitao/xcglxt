package viewItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import Dao.UserDao;
import modelItem.User;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 构造用户树，添加【活动监听】和【树节点选择监听】
 *
 */
public abstract class UserTree extends JPanel implements ActionListener,TreeSelectionListener{

	/**
	 * Create the panel.
	 */
	
	JTree tree;
	public UserTree() {
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("软件学院");//根节点
		
		//多个部门的结点
		DefaultMutableTreeNode dep1 = new DefaultMutableTreeNode("学院领导");
		DefaultMutableTreeNode dep2 = new DefaultMutableTreeNode("软件工程系");
		DefaultMutableTreeNode dep3 = new DefaultMutableTreeNode("数学教学部");
		DefaultMutableTreeNode dep4 = new DefaultMutableTreeNode("计算机基础部");
		DefaultMutableTreeNode dep5 = new DefaultMutableTreeNode("学院办公室");
		DefaultMutableTreeNode dep6 = new DefaultMutableTreeNode("学院实验中心");
		DefaultMutableTreeNode dep7 = new DefaultMutableTreeNode("离职退休人员");

		
		//通过数据库获取某个部门所有员工的信息
		UserDao userDao = new UserDao();
		Vector<User> vectors = new Vector<>();
		List list = new ArrayList();
		vectors = userDao.getUsers(list);
		for(User x:vectors) {
			//判断是属于哪个部门的，然后加入结点
			switch(x.getDepartment()) {
				case "学院领导":
					dep1.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "软件工程系":
					dep2.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "数学教学部":
					dep3.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "计算机基础部":
					dep4.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "学院办公室":
					dep5.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "学院实验中心":
					dep6.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "离职退休人员":
					dep7.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
			}
		}
		
		//将各个部门的目录树添加到根节点中
		rootNode.add(dep1);
		rootNode.add(dep2);
		rootNode.add(dep3);
		rootNode.add(dep4);
		rootNode.add(dep5);
		rootNode.add(dep6);
		rootNode.add(dep7);
		setLayout(new BorderLayout(0, 0));
		//添加到树
		tree = new JTree(rootNode);
		tree.addTreeSelectionListener(this);
		//在视图窗口左侧中间中显示出树结构
		this.add(tree,BorderLayout.CENTER);
		
		
		//添加刷新按钮
		JButton btnNewButton = new JButton("\u5237\u65B0");
		btnNewButton.addActionListener(this);
		add(btnNewButton, BorderLayout.SOUTH);
	}
	
	//树节点选中
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		//获得选择的第一个节点的最后一个组件
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
		if(node == null) 
		{
			return ;
		}
		if(node.isLeaf()) {
			System.out.println("你已选择结点"+node.toString());
			leftNodeSelected(node);
		}
	}

	public abstract void leftNodeSelected(DefaultMutableTreeNode node);
	
}
