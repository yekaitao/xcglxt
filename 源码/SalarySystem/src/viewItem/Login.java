package viewItem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.LoginDao;
import modelItem.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

/**
 * ��¼�������
 * 
 *
 */
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField userPsw;
	static Login loginFrame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginFrame = new Login();
					loginFrame.setVisible(true);
					//���ھ�������������
					loginFrame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("\u6B22\u8FCE\u767B\u5F55");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D");
		lblNewLabel.setBounds(27, 52, 81, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801");
		lblNewLabel_1.setBounds(27, 101, 81, 21);
		contentPane.add(lblNewLabel_1);
		
		userName = new JTextField();
		userName.setBounds(96, 49, 228, 27);
		contentPane.add(userName);
		userName.setColumns(10);
		
		userPsw = new JPasswordField();
		userPsw.setBounds(96, 98, 228, 27);
		contentPane.add(userPsw);
		
		//��¼����ĵ�¼��ť
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = userName.getText();
				String psw = new String(userPsw.getPassword()).trim();
				
				User user = new LoginDao().checkUser(name, psw);
				//��������û�������ʾ�û���Ϣ
				if(user!=null) {
					MainFram frame;
					try {
						frame = new MainFram(user);
						frame.setLocationRelativeTo(null);
						frame.setVisible(true);
						loginFrame.dispose();//�ô�����ʧ
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				//����������û�����ʾ��ʾ��Ϣ
				else {
					JOptionPane.showMessageDialog(null, "�û�������","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(50, 157, 123, 29);
		contentPane.add(btnNewButton);
		
		//��¼�����ȡ����ť
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//���ѡ��ȡ�����˳�����
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(212, 157, 123, 29);
		contentPane.add(btnNewButton_1);
	}
}
