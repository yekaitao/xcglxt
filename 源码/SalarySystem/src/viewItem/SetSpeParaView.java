package viewItem;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import modelItem.Spe;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * �������á�ר�ν�ʦ�����
 * 
 * 
 * ��JTextField��Textֵ:
 * 
 * -------��λ����--------
 * proPost:���ڵĸ�λ����
 * assproPost:�����ڵĸ�λ����
 * lectPost:��ʦ�ĸ�λ����
 * assteaPost:���̵ĸ�λ����
 * 
 * -------������Ч����-------
 * proBasic:���ڵĻ�����Ч����
 * assproBasic:�����ڵĻ�����Ч����
 * lectBasic:��ʦ�Ļ�����Ч����
 * assteaBasic:���̵Ļ�����Ч����
 * 
 * -------ְ��ϵ��---------
 * proMod:���ڵ�ְ��ϵ��
 * addproMod:�����ڵ�ְ��ϵ��
 * lectMod:��ʦ��ְ��ϵ��
 * assteaMod:����/������ְ��ϵ��
 * 
 * -------ѧ��ϵ��---------
 * stuMod:ѧ��ϵ��,Ĭ��/60
 * 
 * -------��λ�γ�---------
 * unitTui:��λ�γ�,Ĭ��35
 * 
 * �������������Ϻ�׺_paraΪ��Ӧ��double���ͱ���
 * 
 * 
 * @author lzw
 * */
public class SetSpeParaView extends JPanel {
	// textField
	private JTextField proPost;
	private JTextField assproPost;
	private JTextField lectPost;
	private JTextField assteaPost;
	private JTextField proBasic;
	private JTextField assproBasic;
	private JTextField lectBasic;
	private JTextField assteaBasic;
	private JTextField proMod;
	private JTextField assproMod;
	private JTextField lectMod;
	private JTextField assteaMod;
	private JTextField stuMod;
	private JTextField unitTui;
	
	
	public SetSpeParaView() {
		
		
		setLayout(null);
		
		//Panel���⡾ר�ν�ʦ���ʲ�����
		JLabel lblNewLabel = new JLabel("\u4E13\u4EFB\u6559\u5E08\u5DE5\u8D44\u53C2\u6570");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 21));
		lblNewLabel.setBounds(120, 15, 168, 21);
		add(lblNewLabel);
		
		//��ְ�Ƶġ���λ���ʡ���������
		JLabel lblNewLabel_1 = new JLabel("\u5C97\u4F4D\u5DE5\u8D44\uFF08\u5143\uFF09\uFF1A");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(15, 43, 163, 21);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6559\u6388\uFF1A");
		lblNewLabel_2.setBounds(15, 79, 65, 21);
		add(lblNewLabel_2);
		
		//�����ڡ�ְλ�ĸ�λ����
		proPost = new JTextField();
		proPost.setText(""+MainFram.spe.getProPostPara());
		proPost.setBounds(82, 76, 96, 27);
		add(proPost);
		proPost.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u526F\u6559\u6388\uFF1A");
		lblNewLabel_3.setBounds(193, 79, 72, 21);
		add(lblNewLabel_3);
		
		//�������ڡ�ְλ�ĸ�λ����
		assproPost = new JTextField();
		assproPost.setText(""+MainFram.spe.getAssproPostPara());
		assproPost.setBounds(280, 76, 96, 27);
		add(assproPost);
		assproPost.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u8BB2\u5E08\uFF1A");
		lblNewLabel_4.setBounds(15, 118, 54, 21);
		add(lblNewLabel_4);
		
		//����ʦ��ְλ�ĸ�λ����
		lectPost = new JTextField();
		lectPost.setText(""+MainFram.spe.getLectPostPara());
		lectPost.setBounds(75, 115, 96, 27);
		add(lectPost);
		lectPost.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u52A9\u6559\uFF1A");
		lblNewLabel_5.setBounds(187, 118, 54, 21);
		add(lblNewLabel_5);
		
		//�����̡�ְλ�ĸ�λ����
		assteaPost = new JTextField();
		assteaPost.setText(""+MainFram.spe.getAssteaPostPara());
		assteaPost.setBounds(248, 115, 96, 27);
		add(assteaPost);
		assteaPost.setColumns(10);
		
		//��ְ�ơ�������Ч���ʡ���������
		JLabel lblNewLabel_6 = new JLabel("\u57FA\u7840\u7EE9\u6548\u5DE5\u8D44\uFF08\u5143\uFF09\uFF1A");
		lblNewLabel_6.setFont(new Font("����", Font.BOLD, 18));
		lblNewLabel_6.setBounds(15, 157, 232, 21);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u6559\u6388\uFF1A");
		lblNewLabel_7.setBounds(15, 193, 54, 21);
		add(lblNewLabel_7);
		
		//�����ڡ�ְλ�Ļ�����Ч����
		proBasic = new JTextField();
		proBasic.setText(""+MainFram.spe.getProBasicPara());
		proBasic.setBounds(82, 190, 96, 27);
		add(proBasic);
		proBasic.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\u526F\u6559\u6388\uFF1A");
		lblNewLabel_8.setBounds(194, 193, 82, 21);
		add(lblNewLabel_8);
		
		//�������ڡ�ְλ�Ļ�����Ч����
		assproBasic = new JTextField();
		assproBasic.setText(""+MainFram.spe.getAssproBasicPara());
		assproBasic.setBounds(280, 190, 96, 27);
		add(assproBasic);
		assproBasic.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\u8BB2\u5E08\uFF1A");
		lblNewLabel_9.setBounds(15, 232, 60, 21);
		add(lblNewLabel_9);
		
		//����ʦ��ְλ�Ļ�����Ч����
		lectBasic = new JTextField();
		lectBasic.setText(""+MainFram.spe.getLectBasicPara());
		lectBasic.setBounds(75, 229, 96, 27);
		add(lectBasic);
		lectBasic.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\u52A9\u6559\uFF1A");
		lblNewLabel_10.setBounds(187, 232, 54, 21);
		add(lblNewLabel_10);
		
		//�����̡�ְλ�Ļ�����Ч����
		assteaBasic = new JTextField();
		assteaBasic.setText(""+MainFram.spe.getAssteaBasicPara());
		assteaBasic.setBounds(248, 229, 96, 27);
		add(assteaBasic);
		assteaBasic.setColumns(10);
		
		//��ְ�ơ�ְ��ϵ������������
		JLabel lblNewLabel_11 = new JLabel("\u804C\u79F0\u7CFB\u6570\uFF1A");
		lblNewLabel_11.setFont(new Font("����", Font.BOLD, 18));
		lblNewLabel_11.setBounds(15, 268, 96, 21);
		add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u6559\u6388\uFF1A");
		lblNewLabel_12.setBounds(15, 301, 54, 21);
		add(lblNewLabel_12);
		
		//�����ڡ�ְλ��ְ��ϵ��
		proMod = new JTextField();
		proMod.setText(""+MainFram.spe.getProModPara());
		proMod.setBounds(82, 298, 96, 27);
		add(proMod);
		proMod.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("\u526F\u6559\u6388\uFF1A");
		lblNewLabel_13.setBounds(193, 301, 72, 21);
		add(lblNewLabel_13);
		
		//�������ڡ�ְλ��ְ��ϵ��
		assproMod = new JTextField();
		assproMod.setText(""+MainFram.spe.getAssproModPara());
		assproMod.setBounds(280, 298, 96, 27);
		add(assproMod);
		assproMod.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("\u8BB2\u5E08\uFF1A");
		lblNewLabel_14.setBounds(16, 340, 54, 21);
		add(lblNewLabel_14);
		
		//����ʦ��ְλ��ְ��ϵ��
		lectMod = new JTextField();
		lectMod.setText(""+MainFram.spe.getLectModPara());
		lectMod.setBounds(76, 337, 96, 27);
		add(lectMod);
		lectMod.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("\u52A9\u6559/\u5176\u4ED6\uFF1A");
		lblNewLabel_15.setBounds(188, 340, 107, 21);
		add(lblNewLabel_15);
		
		//������/������ְλ��ְ��ϵ��
		assteaMod = new JTextField();
		assteaMod.setText(""+MainFram.spe.getAssteaModPara());
		assteaMod.setBounds(294, 337, 82, 27);
		add(assteaMod);
		assteaMod.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("\u5B66\u751F\u7CFB\u6570\uFF1A");
		lblNewLabel_16.setFont(new Font("����", Font.BOLD, 18));
		lblNewLabel_16.setBounds(15, 376, 163, 21);
		add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("\u5B66\u751F\u7CFB\u6570 = \u5B66\u751F\u4EBA\u6570/");
		lblNewLabel_17.setBounds(15, 412, 190, 21);
		add(lblNewLabel_17);
		
		stuMod = new JTextField();
		stuMod.setText(""+MainFram.spe.getStuModPara());
		stuMod.setBounds(202, 409, 72, 27);
		add(stuMod);
		stuMod.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("\u5355\u4F4D\u8BFE\u916C\uFF1A");
		lblNewLabel_18.setFont(new Font("����", Font.BOLD, 18));
		lblNewLabel_18.setBounds(15, 448, 114, 21);
		add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("\u5355\u4F4D\u8BFE\u916C = ");
		lblNewLabel_19.setBounds(15, 484, 107, 21);
		add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("\uFF08\u5B66\u751F\u7CFB\u6570\u4E0D\u8DB31\u63091\u8BA1\u7B97\uFF09");
		lblNewLabel_20.setBounds(108, 376, 243, 21);
		add(lblNewLabel_20);
		
		unitTui = new JTextField();
		unitTui.setText(""+MainFram.spe.getUnitTuiPara());
		unitTui.setBounds(126, 481, 65, 27);
		add(unitTui);
		unitTui.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("\uFF08\u5143/\u8282\uFF09");
		lblNewLabel_21.setBounds(193, 484, 81, 21);
		add(lblNewLabel_21);
		
		//ȷ���޸Ĳ�������
		JButton submit = new JButton("\u786E\u8BA4");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//���²���
				MainFram.spe.setProPostPara(new Double(proPost.getText()));
				MainFram.spe.setAssproPostPara(new Double(assproPost.getText()));
				MainFram.spe.setLectPostPara(new Double(lectPost.getText()));
				MainFram.spe.setAssteaPostPara(new Double(assteaPost.getText()));
				MainFram.spe.setProBasicPara(new Double(proBasic.getText()));
				MainFram.spe.setAssproBasicPara(new Double(assproBasic.getText()));
				MainFram.spe.setLectBasicPara(new Double(lectBasic.getText()));
				MainFram.spe.setAssteaBasicPara(new Double(assteaBasic.getText()));
				MainFram.spe.setProModPara(new Double(proMod.getText()));
				MainFram.spe.setAssproModPara(new Double(assproMod.getText()));
				MainFram.spe.setLectModPara(new Double(lectMod.getText()));
				MainFram.spe.setAssteaModPara(new Double(assteaMod.getText()));
				MainFram.spe.setStuModPara(new Double(stuMod.getText()));
				MainFram.spe.setUnitTuiPara(new Double(unitTui.getText()));
				JOptionPane.showMessageDialog(null, "�����޸ĳɹ�","��ʾ��Ϣ",JOptionPane.OK_OPTION); 
			}
		});
		submit.setBounds(120, 520, 123, 29);
		add(submit);
	}
}
