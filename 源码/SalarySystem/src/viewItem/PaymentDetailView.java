package viewItem;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dao.DataDao;
import modelItem.User;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
/**
 * ��ʾ�������ݱ������
 * 
 * 
 * @author lzw*/

public class PaymentDetailView extends JPanel {
	
	private JTable table;
	private int page = 0;//ҳ��
	private int count = 20;//ÿҳ������
	private int startNum = page * count;
	private String[] t_head = new String[]{"user_id","staff_id","pay","amount","payment_date","last_update"};//����еı��ⲿ��
	private String[][] t_data;//����е����ݲ���
	private String sql;
	private String consql;
	JScrollPane scrollPane;
	private JTextField currentPage;
	
	public PaymentDetailView(String flag,User user) {
		setLayout(null);
		//���ĳ���û���ѯ
		if("user".equals(flag)) {
			sql = "select * from payment where user_id='"+user.getUserId()+"' order by last_update desc";
		}
		else if("all".equals(flag)) {
			sql = "select * from payment order by user_id,last_update desc";
		}
		 
		//��һҳ��ť
		JButton before = new JButton("\u4E0A\u4E00\u9875");
		//��һҳ��ť
		JButton next = new JButton("\u4E0B\u4E00\u9875");
		//��ʾ��ǰҳ��
		currentPage = new JTextField();
		currentPage.setBounds(336, 426, 52, 27);
		add(currentPage);
		
		before.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page--;
				if(page==0) {
					before.setEnabled(false);
				}
				else {
					before.setEnabled(true);
				}
				consql = sql.concat(" limit "+page*count+","+count);
				t_data = new DataDao().get_t_datas(consql);
				if(t_data.length>=20) {
					next.setEnabled(true);
				}
				else {
					next.setEnabled(false);
				}
				table.setModel(new DefaultTableModel(t_data,t_head));
				scrollPane.setViewportView(table);//�ѱ��Ž����������
				currentPage.setText(""+(page+1));
			}
		});
		before.setBounds(183, 425, 123, 29);
		add(before);
		
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page++;
				consql = sql.concat(" limit "+page*count+","+count);
				t_data = new DataDao().get_t_datas(consql);
				if(t_data.length<20) {
					next.setEnabled(false);
				}
				else {
					next.setEnabled(true);
				}
				if(page==0) {
					before.setEnabled(false);
				}
				else {
					before.setEnabled(true);
				}
				table.setModel(new DefaultTableModel(t_data,t_head));
				scrollPane.setViewportView(table);//�ѱ��Ž����������
				currentPage.setText(""+(page+1));
			}
		});
		next.setBounds(421, 425, 123, 29);
		add(next);
		
		//�����ǰҳ��Ϊ0���������Ϸ�ҳ
		if(page==0) {
			before.setEnabled(false);
		}
		//��ȡ��ѯ���
		consql = sql.concat(" limit "+page*count+","+count);//���Ʋ�ѯ��Χ
		t_data = new DataDao().get_t_datas(consql);
		if(t_data.length<20) {
			next.setEnabled(false);
		}
		currentPage.setText(""+(page+1));
		
		//����ѯ�Ľ��������ģ��
		table = new JTable();
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(t_data,t_head));//�����ģ�ʹ�����
		
		scrollPane = new JScrollPane();//�������
		scrollPane.setBounds(10,43,744,367);//���û�������С
		add(scrollPane);//������
		scrollPane.setViewportView(table);//�ѱ��Ž����������
		
		JLabel lblNewLabel = new JLabel("\u7B2C");
		lblNewLabel.setBounds(308, 429, 29, 21);
		add(lblNewLabel);
		
		JLabel label = new JLabel("\u9875");
		label.setBounds(397, 429, 29, 21);
		add(label);
		
		//��תҳ����ť
		JButton jumpPage = new JButton("\u8DF3\u8F6C");
		jumpPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int getPage = Integer.parseInt(currentPage.getText().trim());
				if(getPage<=0) {
					JOptionPane.showMessageDialog(null,"ҳ������Ϊ����0������!");
				}
				else {
					page = getPage-1;		
					consql = sql.concat(" limit "+page*count+","+count);
					t_data = new DataDao().get_t_datas(consql);
					if(t_data.length<20) {
						next.setEnabled(false);
					}
					else {
						next.setEnabled(true);
					}
					if(page==0) {
						before.setEnabled(false);
					}
					else {
						before.setEnabled(true);
					}
					table.setModel(new DefaultTableModel(t_data,t_head));
					scrollPane.setViewportView(table);//�ѱ��Ž����������
					currentPage.setText(""+(page+1));
				}
				
			}
		});
		jumpPage.setBounds(318, 468, 95, 29);
		add(jumpPage);
		
		
	}
}
