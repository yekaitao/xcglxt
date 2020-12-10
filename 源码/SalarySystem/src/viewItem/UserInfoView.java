package viewItem;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Dao.UserDao;
import modelItem.User;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

/**
 * 把登录用户的信息显示在视图上
 * 
 *
 */
public class UserInfoView extends JPanel {
	private JTextField userId;
	private JTextField userName;
	private JTextField post;
	private JTextField sex;
	private JTextField department;
	private JTextField professionalTitle;
	private JTextField mTOA_State;
	private JTextField baseAllowanceState;
	private JTextField dutyAllowanceState;
	private JTextField telAllowanceState;

	/**
	 * Create the panel.
	 */
	public UserInfoView(User user) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u4FE1\u606F");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 21));
		lblNewLabel.setBounds(267, 36, 107, 21);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7F16\u53F7\uFF1A");
		lblNewLabel_1.setBounds(30, 82, 54, 21);
		add(lblNewLabel_1);
		
		userId = new JTextField();
		userId.setBounds(88, 79, 149, 27);
		userId.setText(user.getUserId());
		add(userId);
		userId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_2.setBounds(30, 132, 54, 21);
		add(lblNewLabel_2);
		
		userName = new JTextField();
		userName.setBounds(88, 129, 149, 27);
		userName.setText(user.getUserName());
		add(userName);
		userName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u6027\u522B\uFF1A");
		lblNewLabel_3.setBounds(30, 183, 59, 21);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u90E8\u95E8\uFF1A");
		lblNewLabel_4.setBounds(30, 233, 54, 21);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u804C\u52A1\uFF1A");
		lblNewLabel_5.setBounds(30, 280, 54, 21);
		add(lblNewLabel_5);
		
		post = new JTextField();
		post.setBounds(86, 277, 151, 27);
		post.setText(user.getPost());
		add(post);
		post.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u804C\u79F0\u7EA7\u522B\uFF1A");
		lblNewLabel_6.setBounds(306, 82, 91, 21);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u7EE9\u6548\u8EAB\u4EFD\u7EDF\u8BA1\uFF1A");
		lblNewLabel_7.setBounds(267, 129, 130, 21);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u751F\u6D3B\u6D25\u8D34\u8EAB\u4EFD\uFF1A");
		lblNewLabel_8.setBounds(266, 183, 126, 21);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u804C\u52A1\u6D25\u8D34\u8EAB\u4EFD\uFF1A");
		lblNewLabel_9.setBounds(267, 233, 130, 21);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u7535\u8BDD\u8865\u8D34\u8EAB\u4EFD\uFF1A");
		lblNewLabel_10.setBounds(265, 280, 132, 21);
		add(lblNewLabel_10);
		
		sex = new JTextField();
		sex.setBounds(88, 180, 149, 27);
		sex.setText(user.getSex());
		add(sex);
		sex.setColumns(10);
		
		department = new JTextField();
		department.setBounds(88, 230, 149, 27);
		department.setText(user.getDepartment());
		add(department);
		department.setColumns(10);
		
		professionalTitle = new JTextField();
		professionalTitle.setBounds(399, 79, 149, 27);
		professionalTitle.setText(user.getProfessionalTitle());
		add(professionalTitle);
		professionalTitle.setColumns(10);
		
		mTOA_State = new JTextField();
		mTOA_State.setBounds(399, 132, 149, 27);
		mTOA_State.setText(user.getmTOA_State());
		add(mTOA_State);
		mTOA_State.setColumns(10);
		
		baseAllowanceState = new JTextField();
		baseAllowanceState.setBounds(399, 180, 149, 27);
		baseAllowanceState.setText(user.getBaseAllowanceState());
		add(baseAllowanceState);
		baseAllowanceState.setColumns(10);
		
		dutyAllowanceState = new JTextField();
		dutyAllowanceState.setBounds(399, 230, 149, 27);
		dutyAllowanceState.setText(user.getDutyAllowanceState());
		add(dutyAllowanceState);
		dutyAllowanceState.setColumns(10);
		
		telAllowanceState = new JTextField();
		telAllowanceState.setBounds(399, 277, 149, 27);
		telAllowanceState.setText(user.getTelAllowanceState());
		add(telAllowanceState);
		telAllowanceState.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u663E\u793A\u7528\u6237\u5934\u50CF");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = userId.getText().trim();
				ShowImg showImg = new ShowImg(id);
				showImg.setLocationRelativeTo(null);
				showImg.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(230, 329, 182, 29);
		add(btnNewButton_1);

	}

}
