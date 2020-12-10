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
 * 添加新用户面板
 * 
 * */
public class UserInfoCreat extends JPanel {
	private JTextField userId;
	private JTextField userName;
	private JTextField post;

	/**
	 * Create the panel.
	 */
	public UserInfoCreat() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6DFB\u52A0\u65B0\u7528\u6237");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 21));
		lblNewLabel.setBounds(267, 36, 107, 21);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7F16\u53F7\uFF1A");
		lblNewLabel_1.setBounds(30, 82, 54, 21);
		add(lblNewLabel_1);
		
		userId = new JTextField();
		userId.setBounds(88, 79, 149, 27);
		add(userId);
		userId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_2.setBounds(30, 132, 54, 21);
		add(lblNewLabel_2);
		
		userName = new JTextField();
		userName.setBounds(88, 129, 149, 27);
		add(userName);
		userName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u6027\u522B\uFF1A");
		lblNewLabel_3.setBounds(30, 183, 59, 21);
		add(lblNewLabel_3);
		
		JComboBox sex = new JComboBox();
		sex.setModel(new DefaultComboBoxModel(new String[] {"\u8BF7\u9009\u62E9", "\u7537", "\u5973"}));
		sex.setBounds(88, 180, 149, 27);
		add(sex);
		
		JLabel lblNewLabel_4 = new JLabel("\u90E8\u95E8\uFF1A");
		lblNewLabel_4.setBounds(30, 233, 54, 21);
		add(lblNewLabel_4);
		
		JComboBox department = new JComboBox();
		department.setModel(new DefaultComboBoxModel(new String[] {"\u5B66\u9662\u9886\u5BFC", "\u8F6F\u4EF6\u5DE5\u7A0B\u7CFB", "\u8BA1\u7B97\u673A\u57FA\u7840\u90E8", "\u6570\u5B66\u6559\u5B66\u90E8", "\u5B66\u9662\u529E\u516C\u5BA4", "\u5B66\u9662\u5B9E\u9A8C\u4E2D\u5FC3", "\u79BB\u804C\u9000\u4F11\u4EBA\u5458"}));
		department.setBounds(88, 230, 149, 27);
		add(department);
		
		JLabel lblNewLabel_5 = new JLabel("\u804C\u52A1\uFF1A");
		lblNewLabel_5.setBounds(30, 280, 54, 21);
		add(lblNewLabel_5);
		
		post = new JTextField();
		post.setBounds(86, 277, 151, 27);
		add(post);
		post.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u804C\u79F0\u7EA7\u522B\uFF1A");
		lblNewLabel_6.setBounds(306, 82, 91, 21);
		add(lblNewLabel_6);
		
		JComboBox professionalTitle = new JComboBox();
		professionalTitle.setModel(new DefaultComboBoxModel(new String[] {"\u8BF7\u9009\u62E9", "\u6B63\u9AD8-\u6B63\u5904", "\u526F\u9AD8-\u526F\u5904", "\u4E2D\u7EA7-\u6B63\u79D1", "\u521D\u7EA7-\u526F\u79D1", "\u65E0"}));
		professionalTitle.setBounds(399, 79, 149, 27);
		add(professionalTitle);
		
		JLabel lblNewLabel_7 = new JLabel("\u7EE9\u6548\u8EAB\u4EFD\u7EDF\u8BA1\uFF1A");
		lblNewLabel_7.setBounds(267, 129, 130, 21);
		add(lblNewLabel_7);
		
		JComboBox mTOA_State = new JComboBox();
		mTOA_State.setModel(new DefaultComboBoxModel(new String[] {"\u8BF7\u9009\u62E9", "\u9662\u957F", "\u4E66\u8BB0", "\u526F\u9662\u957F", "\u526F\u4E66\u8BB0", "\u5DE5\u4F1A\u4E3B\u5E2D", "\u9662\u957F\u52A9\u7406", "\u5B66\u672F\u59D4\u4E3B\u4EFB\u59D4\u5458", "\u7CFB\u4E3B\u4EFB-\u517C\u804C", "\u90E8\u4E3B\u4EFB-\u517C\u804C", "\u884C\u653F", "\u6559\u8F85", "\u4E13\u4EFB\u6559\u5E08", "\u65E0"}));
		mTOA_State.setBounds(399, 129, 149, 27);
		add(mTOA_State);
		
		JLabel lblNewLabel_8 = new JLabel("\u751F\u6D3B\u6D25\u8D34\u8EAB\u4EFD\uFF1A");
		lblNewLabel_8.setBounds(266, 183, 126, 21);
		add(lblNewLabel_8);
		
		JComboBox baseAllowanceState = new JComboBox();
		baseAllowanceState.setModel(new DefaultComboBoxModel(new String[] {"\u8BF7\u9009\u62E9", "\u9662\u957F\u4E66\u8BB0", "\u526F\u9662\u957F-\u4E66\u8BB0", "\u5DE5\u4F1A\u4E3B\u5E2D", "\u7CFB\u90E8\u4E3B\u4EFB", "\u529E\u516C\u5BA4\u4E3B\u4EFB", "\u56E2\u59D4\u4E66\u8BB0", "\u5B66\u672F\u59D4\u4E3B\u4EFB\u59D4\u5458", "\u9662\u957F\u52A9\u7406", "\u529E\u7CFB\u90E8\u526F\u4E3B\u4EFB", "\u672C\u79D1\u751F\u8F85\u5BFC\u5458", "\u6559\u5B66\u79D8\u4E66\u6559\u52A1", "\u6559\u6388", "\u526F\u6559\u6388", "\u8BB2\u5E08", "\u521D\u7EA7", "\u65E0"}));
		baseAllowanceState.setBounds(399, 180, 149, 27);
		add(baseAllowanceState);
		
		JLabel lblNewLabel_9 = new JLabel("\u804C\u52A1\u6D25\u8D34\u8EAB\u4EFD\uFF1A");
		lblNewLabel_9.setBounds(267, 233, 130, 21);
		add(lblNewLabel_9);
		
		JComboBox dutyAllowanceState = new JComboBox();
		dutyAllowanceState.setModel(new DefaultComboBoxModel(new String[] {"\u8BF7\u9009\u62E9", "\u9662\u957F\u4E66\u8BB0 ", "\u526F\u9662\u957F-\u4E66\u8BB0", "\u5DE5\u4F1A\u4E3B\u5E2D ", "\u529E\u516C\u5BA4\u4E3B\u4EFB", "\u56E2\u59D4\u4E66\u8BB0 ", "\u7EE7\u6559\u529E\u4E3B\u4EFB", "\u5404\u4E2D\u5FC3\u4E3B\u4EFB  ", "\u5404\u4E2D\u5FC3\u526F\u4E3B\u4EFB", "\u5404\u529E\u526F\u4E3B\u4EFB", "\u672C\u79D1\u751F\u8F85\u5BFC\u5458", "\u672C\u79D1\u751F\u73ED\u4E3B\u4EFB", "\u6559\u5B66\u79D8\u4E66", "\u79D1\u7814\u79D8\u4E66", "\u515A\u52A1\u79D8\u4E66", "\u515A\u652F\u90E8\u4E66\u8BB0", "\u5DE5\u4F1A\u59D4\u5458", "\u5B66\u751F\u79D1\u7814\u8D1F\u8D23\u4EBA ", "\u5B66\u9662\u7F51\u7AD9\u7EF4\u62A4 ", "\u5FAE\u4FE1\u516C\u4F17\u53F7\u7EF4\u62A4", "\u65E0"}));
		dutyAllowanceState.setBounds(399, 230, 149, 27);
		add(dutyAllowanceState);
		
		JLabel lblNewLabel_10 = new JLabel("\u7535\u8BDD\u8865\u8D34\u8EAB\u4EFD\uFF1A");
		lblNewLabel_10.setBounds(265, 280, 132, 21);
		add(lblNewLabel_10);
		
		JComboBox telAllowanceState = new JComboBox();
		telAllowanceState.setModel(new DefaultComboBoxModel(new String[] {"\u8BF7\u9009\u62E9", "\u9662\u957F\u4E66\u8BB0", "\u526F\u9662\u957F\u4E66\u8BB0", "\u9662\u957F\u52A9\u7406", "\u5DE5\u4F1A\u4E3B\u5E2D", "\u529E\u516C\u5BA4\u4E3B\u4EFB", "\u56E2\u59D4\u4E66\u8BB0", "\u5B66\u672F\u59D4\u4E3B\u4EFB\u59D4\u5458", "\u5404\u7CFB\u90E8\u95E8\u4E3B\u4EFB", "\u5404\u90E8\u95E8\u526F\u4E3B\u4EFB", "\u672C\u79D1\u751F\u8F85\u5BFC\u5458", "\u515A\u52A1\u79D8\u4E66", "\u6559\u52A1\u5458", "\u6559\u5B66\u79D8\u4E66", "\u79D1\u7814\u79D8\u4E66", "\u65E0"}));
		telAllowanceState.setBounds(399, 277, 149, 27);
		add(telAllowanceState);
		
		JLabel lblNewLabel_11 = new JLabel("\u7528\u6237\u767B\u5F55\u7CFB\u7EDF\u8EAB\u4EFD\uFF08\u7528\u6237\u6743\u9650\uFF09\uFF1A");
		lblNewLabel_11.setBounds(30, 330, 270, 21);
		add(lblNewLabel_11);
		
		JComboBox loginAuthority = new JComboBox();
		loginAuthority.setModel(new DefaultComboBoxModel(new String[] {"\u6559\u5E08", "\u8D22\u52A1\u5458", "\u8D22\u52A1\u4E3B\u7BA1\u9886\u5BFC"}));
		loginAuthority.setBounds(306, 327, 139, 27);
		add(loginAuthority);
		
		//创建新用户按钮
		JButton creatUserBT = new JButton("\u521B\u5EFA\u65B0\u7528\u6237");
		creatUserBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user = new User();
				user.setUserId(userId.getText());
				user.setUserName(userName.getText());
				user.setUserPsw("abc123456");
				user.setSex(sex.getSelectedItem().toString());
				user.setDepartment(department.getSelectedItem().toString());
				user.setPost(post.getText());
				user.setProfessionalTitle(professionalTitle.getSelectedItem().toString());
				user.setmTOA_State(mTOA_State.getSelectedItem().toString());
				user.setBaseAllowanceState(baseAllowanceState.getSelectedItem().toString());
				user.setDutyAllowanceState(dutyAllowanceState.getSelectedItem().toString());
				user.setTelAllowanceState(telAllowanceState.getSelectedItem().toString());
				user.setLoginAuthority(loginAuthority.getSelectedItem().toString());
				
				UserDao userDao = new UserDao();
				int n = 0;
				try {
					n = userDao.addUser(user);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				if(n==1) {
					JOptionPane.showMessageDialog(null, "添加用户成功","提示信息",JOptionPane.OK_OPTION);
				}
				else {
					JOptionPane.showMessageDialog(null, "添加用户失败","提示信息",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		creatUserBT.setBounds(274, 385, 123, 29);
		add(creatUserBT);
		
		JButton btnNewButton = new JButton("\u4E0A\u4F20\u7528\u6237\u5934\u50CF");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = userId.getText().trim();
				ShowImg showImg = new ShowImg(id);
				showImg.setLocationRelativeTo(null);
				showImg.setVisible(true);
			}
		});
		btnNewButton.setBounds(460, 326, 182, 29);
		add(btnNewButton);

	}
}
