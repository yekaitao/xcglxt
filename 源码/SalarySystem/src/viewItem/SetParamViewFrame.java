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
 * ���������á�ѡ�����,��������������
 * �󲿷�Ϊר�ν�ʦ��������
 * �Ҳ���Ϊר�ν�ʦ��������
 * �����ֵġ�ȷ�������²���
 * 
 * @author lzw
 * 
 * */
public class SetParamViewFrame extends JPanel {

	JSplitPane splitPane;
	SetSpeParaView sp_left;//����ר�ν�ʦ��������
	SetNonSpeParaView sp_right;//�Ҳ�ķ�ר�ν�ʦ��������
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
