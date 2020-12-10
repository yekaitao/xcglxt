package viewItem;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import modelItem.NonSpe;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 参数设置【非专任教师】面板
 * 
 * 
 * 各JTextField的text值:
 * 
 * --------岗位工资--------
 * headPost:院长/书记 的岗位工资
 * assheadPost:副院长/副书记 的岗位工资
 * directPost:系\部\中心主任 的岗位工资
 * assdirectPost:系\部\中心副主任 的岗位工资
 * otherPost:其他 的岗位工资
 * 
 * --------基础绩效工资-------
 * headBasic:院长/书记 的基础绩效工资
 * assheadBasic:副院长/副书记 的基础绩效工资
 * directBasic:系\部\中心主任 的基础绩效工资
 * assdirectBasic:系\部\中心副主任 的基础绩效工资
 * otherBasic:其他 的基础绩效工资
 * 
 * --------管理岗绩效--------
 * headMana:院长/书记 管理岗绩效
 * assheadMana:副院长/副书记 管理岗绩效
 * directMana:系\部\中心主任 管理岗绩效
 * assdirectMana:系\部\中心副主任 管理岗绩效
 * otherMana:其他 管理岗绩效
 * 
 * --------单位课酬----------
 * unitTui:单位课酬(默认与专任教师相同)
 * 
 * 上述变量名加上后缀_para为对应的double类型变量
 * 
 * 
 * 
 */
public class SetNonSpeParaView extends JPanel {
	private JTextField headPost;
	private JTextField assheadPost;
	private JTextField directPost;
	private JTextField assdirectPost;
	private JTextField otherPost;
	private JTextField headBasic;
	private JTextField assheadBasic;
	private JTextField directBasic;
	private JTextField assdirectBasic;
	private JTextField otherBasic;
	private JTextField headMana;
	private JTextField assheadMana;
	private JTextField directMana;
	private JTextField assdirectMana;
	private JTextField otherMana;
	private JTextField unitTui;
	
	public SetNonSpeParaView() {
		
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u975E\u4E13\u4EFB\u6559\u5E08\u5DE5\u8D44\u53C2\u6570");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 21));
		lblNewLabel.setBounds(112, 15, 195, 21);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u5C97\u4F4D\u5DE5\u8D44\uFF08\u5143\uFF09\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 42, 186, 21);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u9662\u957F/\u4E66\u8BB0\uFF1A");
		lblNewLabel_2.setBounds(10, 78, 99, 21);
		add(lblNewLabel_2);
		
		headPost = new JTextField();
		headPost.setText(""+MainFram.nspe.getHeadPostPara());
		headPost.setBounds(106, 75, 85, 27);
		add(headPost);
		headPost.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u526F\u9662\u957F/\u526F\u4E66\u8BB0\uFF1A");
		lblNewLabel_3.setBounds(206, 78, 135, 21);
		add(lblNewLabel_3);
		
		assheadPost = new JTextField();
		assheadPost.setText(""+MainFram.nspe.getAssheadPostPara());
		assheadPost.setBounds(340, 75, 85, 27);
		add(assheadPost);
		assheadPost.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u7CFB\\\u90E8\\\u4E2D\u5FC3\u4E3B\u4EFB\uFF1A");
		lblNewLabel_4.setBounds(10, 117, 150, 21);
		add(lblNewLabel_4);
		
		directPost = new JTextField();
		directPost.setText(""+MainFram.nspe.getDirectPostPara());
		directPost.setBounds(163, 114, 85, 27);
		add(directPost);
		directPost.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u7CFB\\\u90E8\\\u4E2D\u5FC3\u526F\u4E3B\u4EFB\uFF1A");
		lblNewLabel_5.setBounds(10, 156, 162, 21);
		add(lblNewLabel_5);
		
		assdirectPost = new JTextField();
		assdirectPost.setText(""+MainFram.nspe.getAssdirectPostPara());
		assdirectPost.setBounds(173, 153, 85, 27);
		add(assdirectPost);
		assdirectPost.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u5176\u4ED6\uFF1A");
		lblNewLabel_6.setBounds(270, 157, 59, 21);
		add(lblNewLabel_6);
		
		otherPost = new JTextField();
		otherPost.setText(""+MainFram.nspe.getOtherPostPara());
		otherPost.setBounds(329, 153, 85, 27);
		add(otherPost);
		otherPost.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\u57FA\u7840\u7EE9\u6548\u5DE5\u8D44\uFF08\u5143\uFF09\uFF1A");
		lblNewLabel_7.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_7.setBounds(10, 192, 210, 21);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u9662\u957F/\u4E66\u8BB0\uFF1A");
		lblNewLabel_8.setBounds(10, 228, 99, 21);
		add(lblNewLabel_8);
		
		headBasic = new JTextField();
		headBasic.setText(""+MainFram.nspe.getHeadBasicPara());
		headBasic.setBounds(106, 225, 85, 27);
		add(headBasic);
		headBasic.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\u526F\u9662\u957F/\u526F\u4E66\u8BB0\uFF1A");
		lblNewLabel_9.setBounds(206, 228, 135, 21);
		add(lblNewLabel_9);
		
		assheadBasic = new JTextField();
		assheadBasic.setText(""+MainFram.nspe.getAssheadBasicPara());
		assheadBasic.setBounds(340, 225, 85, 27);
		add(assheadBasic);
		assheadBasic.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\u7CFB\\\u90E8\\\u4E2D\u5FC3\u4E3B\u4EFB\uFF1A");
		lblNewLabel_10.setBounds(10, 267, 150, 21);
		add(lblNewLabel_10);
		
		directBasic = new JTextField();
		directBasic.setText(""+MainFram.nspe.getDirectBasicPara());
		directBasic.setBounds(163, 264, 85, 27);
		add(directBasic);
		directBasic.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\u7CFB\\\u90E8\\\u4E2D\u5FC3\u526F\u4E3B\u4EFB\uFF1A");
		lblNewLabel_11.setBounds(10, 306, 162, 21);
		add(lblNewLabel_11);
		
		assdirectBasic = new JTextField();
		assdirectBasic.setText(""+MainFram.nspe.getAssdirectBasicPara());
		assdirectBasic.setBounds(173, 303, 85, 27);
		add(assdirectBasic);
		assdirectBasic.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("\u5176\u4ED6\uFF1A");
		lblNewLabel_12.setBounds(270, 306, 59, 21);
		add(lblNewLabel_12);
		
		otherBasic = new JTextField();
		otherBasic.setText(""+MainFram.nspe.getOtherBasicPara());
		otherBasic.setBounds(329, 303, 85, 27);
		add(otherBasic);
		otherBasic.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("\u7BA1\u7406\u5C97\u7EE9\u6548\uFF08AV*\uFF09\uFF1A");
		lblNewLabel_13.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_13.setBounds(10, 342, 186, 21);
		add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("\u9662\u957F/\u4E66\u8BB0\uFF1A");
		lblNewLabel_14.setBounds(10, 374, 99, 21);
		add(lblNewLabel_14);
		
		headMana = new JTextField();
		headMana.setText(""+MainFram.nspe.getHeadManaPara());
		headMana.setBounds(106, 371, 85, 27);
		add(headMana);
		headMana.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("\u526F\u9662\u957F/\u526F\u4E66\u8BB0\uFF1A");
		lblNewLabel_15.setBounds(206, 374, 135, 21);
		add(lblNewLabel_15);
		
		assheadMana = new JTextField();
		assheadMana.setText(""+MainFram.nspe.getAssheadManaPara());
		assheadMana.setBounds(340, 371, 85, 27);
		add(assheadMana);
		assheadMana.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("\u7CFB\\\u90E8\\\u4E2D\u5FC3\u4E3B\u4EFB\uFF1A");
		lblNewLabel_16.setBounds(10, 413, 150, 21);
		add(lblNewLabel_16);
		
		directMana = new JTextField();
		directMana.setText(""+MainFram.nspe.getDirectManaPara());
		directMana.setBounds(163, 410, 85, 27);
		add(directMana);
		directMana.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("\u7CFB\\\u90E8\\\u4E2D\u5FC3\u526F\u4E3B\u4EFB\uFF1A");
		lblNewLabel_17.setBounds(10, 452, 162, 21);
		add(lblNewLabel_17);
		
		assdirectMana = new JTextField();
		assdirectMana.setText(""+MainFram.nspe.getAssdirectManaPara());
		assdirectMana.setBounds(173, 449, 85, 27);
		add(assdirectMana);
		assdirectMana.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("\u5176\u4ED6\uFF1A");
		lblNewLabel_18.setBounds(270, 452, 59, 21);
		add(lblNewLabel_18);
		
		otherMana = new JTextField();
		otherMana.setText(""+MainFram.nspe.getOtherManaPara());
		otherMana.setBounds(329, 449, 85, 27);
		add(otherMana);
		otherMana.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("\u5355\u4F4D\u8BFE\u916C\uFF1A");
		lblNewLabel_19.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_19.setBounds(10, 488, 99, 21);
		add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("\u5355\u4F4D\u8BFE\u916C = ");
		lblNewLabel_20.setBounds(10, 518, 99, 21);
		add(lblNewLabel_20);
		
		unitTui = new JTextField();
		unitTui.setText(""+MainFram.nspe.getUnitTuiPara());
		unitTui.setBounds(106, 515, 85, 27);
		add(unitTui);
		unitTui.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("\uFF08\u5143/\u8282\uFF09");
		lblNewLabel_21.setBounds(206, 518, 81, 21);
		add(lblNewLabel_21);
		
		JButton submit = new JButton("\u786E\u5B9A");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFram.nspe.setHeadPostPara(new Double(headPost.getText()));
				MainFram.nspe.setAssheadPostPara(new Double(assheadPost.getText()));
				MainFram.nspe.setDirectPostPara(new Double(directPost.getText()));
				MainFram.nspe.setAssdirectPostPara(new Double(assdirectPost.getText()));
				MainFram.nspe.setOtherPostPara(new Double(otherPost.getText()));
				MainFram.nspe.setHeadBasicPara(new Double(headBasic.getText()));
				MainFram.nspe.setAssheadBasicPara(new Double(assheadBasic.getText()));
				MainFram.nspe.setDirectBasicPara(new Double(directBasic.getText()));
				MainFram.nspe.setAssdirectBasicPara(new Double(assdirectBasic.getText()));
				MainFram.nspe.setOtherBasicPara(new Double(otherBasic.getText()));
				MainFram.nspe.setHeadManaPara(new Double(headMana.getText()));
				MainFram.nspe.setAssheadManaPara(new Double(assheadMana.getText()));
				MainFram.nspe.setDirectManaPara(new Double(directMana.getText()));
				MainFram.nspe.setAssdirectManaPara(new Double(assdirectMana.getText()));
				MainFram.nspe.setOtherManaPara(new Double(otherMana.getText()));
				MainFram.nspe.setUnitTuiPara(new Double(unitTui.getText()));
				JOptionPane.showMessageDialog(null, "参数修改成功","提示信息",JOptionPane.OK_OPTION);
			}
		});
		submit.setBounds(153, 554, 123, 29);
		add(submit);
	}
}
