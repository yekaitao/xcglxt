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
 * �����û�������ӡ���������͡����ڵ�ѡ�������
 *
 */
public abstract class UserTree extends JPanel implements ActionListener,TreeSelectionListener{

	/**
	 * Create the panel.
	 */
	
	JTree tree;
	public UserTree() {
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("���ѧԺ");//���ڵ�
		
		//������ŵĽ��
		DefaultMutableTreeNode dep1 = new DefaultMutableTreeNode("ѧԺ�쵼");
		DefaultMutableTreeNode dep2 = new DefaultMutableTreeNode("�������ϵ");
		DefaultMutableTreeNode dep3 = new DefaultMutableTreeNode("��ѧ��ѧ��");
		DefaultMutableTreeNode dep4 = new DefaultMutableTreeNode("�����������");
		DefaultMutableTreeNode dep5 = new DefaultMutableTreeNode("ѧԺ�칫��");
		DefaultMutableTreeNode dep6 = new DefaultMutableTreeNode("ѧԺʵ������");
		DefaultMutableTreeNode dep7 = new DefaultMutableTreeNode("��ְ������Ա");

		
		//ͨ�����ݿ��ȡĳ����������Ա������Ϣ
		UserDao userDao = new UserDao();
		Vector<User> vectors = new Vector<>();
		List list = new ArrayList();
		vectors = userDao.getUsers(list);
		for(User x:vectors) {
			//�ж��������ĸ����ŵģ�Ȼ�������
			switch(x.getDepartment()) {
				case "ѧԺ�쵼":
					dep1.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "�������ϵ":
					dep2.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "��ѧ��ѧ��":
					dep3.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "�����������":
					dep4.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "ѧԺ�칫��":
					dep5.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "ѧԺʵ������":
					dep6.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
				case "��ְ������Ա":
					dep7.add(new DefaultMutableTreeNode(x.getUserName()));
					break;
			}
		}
		
		//���������ŵ�Ŀ¼����ӵ����ڵ���
		rootNode.add(dep1);
		rootNode.add(dep2);
		rootNode.add(dep3);
		rootNode.add(dep4);
		rootNode.add(dep5);
		rootNode.add(dep6);
		rootNode.add(dep7);
		setLayout(new BorderLayout(0, 0));
		//��ӵ���
		tree = new JTree(rootNode);
		tree.addTreeSelectionListener(this);
		//����ͼ��������м�����ʾ�����ṹ
		this.add(tree,BorderLayout.CENTER);
		
		
		//���ˢ�°�ť
		JButton btnNewButton = new JButton("\u5237\u65B0");
		btnNewButton.addActionListener(this);
		add(btnNewButton, BorderLayout.SOUTH);
	}
	
	//���ڵ�ѡ��
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		//���ѡ��ĵ�һ���ڵ�����һ�����
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
		if(node == null) 
		{
			return ;
		}
		if(node.isLeaf()) {
			System.out.println("����ѡ����"+node.toString());
			leftNodeSelected(node);
		}
	}

	public abstract void leftNodeSelected(DefaultMutableTreeNode node);
	
}
