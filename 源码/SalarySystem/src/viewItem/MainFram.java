package viewItem;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelItem.NonSpe;
import modelItem.Spe;
import modelItem.User;

import javax.swing.JTabbedPane;

/**
 * 包含多个选项卡的主窗口
 *
 */
public class MainFram extends JFrame {

	private JPanel contentPane;
	static Spe spe;
	static NonSpe nspe;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainFram frame = new MainFram();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public MainFram(User user) throws SQLException {
		
		spe = new Spe();
		nspe = new NonSpe();
		
		setTitle("\u7A0B\u5E8F\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 982, 718);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		//第一个选项卡：用户信息
		JPanel panel = new UserInfoViewFrame(user);
		tabbedPane.addTab("\u7528\u6237\u4FE1\u606F", null, panel, null);
		
		//第二个选项卡：工资查询
		JPanel panel_1 = new PaymentDetailViewFrame(user);
		tabbedPane.addTab("\u5DE5\u8D44\u67E5\u8BE2", null, panel_1, null);
		
		//第三个选项卡：工资发放
		JPanel panel_2 = new PayOff(user);
		tabbedPane.addTab("\u5DE5\u8D44\u53D1\u653E", null, panel_2, null);
		
		//第四个选项卡：用户管理
		JPanel panel_3 = new UserManager();
		tabbedPane.addTab("\u7528\u6237\u7BA1\u7406", null, panel_3, null);
		
		//第五个选项卡：工作量录入
		JPanel panel_4 = new WorkloadBox(user);
		tabbedPane.addTab("\u5DE5\u4F5C\u91CF\u5F55\u5165", null, panel_4, null);
		
		//第六个选项卡：参数设置
		SetParamViewFrame panel_5 = new SetParamViewFrame();
		tabbedPane.addTab("\u53C2\u6570\u8BBE\u7F6E", null, panel_5, null);
	}

}
