package viewItem;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.tree.DefaultMutableTreeNode;

import Dao.UserDao;
import modelItem.NonSpe;
import modelItem.Spe;
import modelItem.User;
import viewItem.PaymentDetailViewFrame.MyTree;

/**
 * 【参数设置】选项卡内容,包含左右两部分
 * 左部分为专任教师参数设置
 * 右部分为专任教师参数设置
 * 两部分的【确定】更新参数
 * 
 * @author lzw
 * 
 * */
public class SetParamViewFrame extends JPanel {

	JSplitPane splitPane;
	SetSpeParaView sp_left;//左侧的专任教师参数设置
	SetNonSpeParaView sp_right;//右侧的非专任教师参数设置
	public SetParamViewFrame() {
		setLayout(new BorderLayout(0, 0));
		splitPane = new JSplitPane();
		sp_left = new SetSpeParaView();
		sp_right = new SetNonSpeParaView();
		splitPane.setLeftComponent(sp_left);
		splitPane.setRightComponent(sp_right);	
		splitPane.setDividerLocation(440);
		splitPane.setEnabled(false);
		add(splitPane, BorderLayout.CENTER);
	}
}
