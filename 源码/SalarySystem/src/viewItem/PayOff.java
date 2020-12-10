package viewItem;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import Dao.AchievementDao;
import Dao.BaseDao;
import Dao.UserDao;
import Dao.WorkloadDao;
import modelItem.Achievement;
import modelItem.User;
import modelItem.Workload;
import viewItem.WorkloadInput.TermBean;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.Choice;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 * 添加新用户面板
 * 
 * */
public class PayOff extends JPanel implements ItemListener{
	private User user;
	private JTextField jiaban;
	private JTextField qita;
	private JTextField keyan;
	private JTextField linshi;
	private JTextField jieri;
	private JTextField koufa;
	private JTextField total;
	private JTextField buchong;
	private JTextField userId;
	private JTextField userName;
	private JTextField Ben;
	private JTextField kai;
	private JTextField feng;
	private JTextField cheng;
	private JTextField lingdao;
	private JTextField zhongceng;
	private JTextField jiaofu;
//	String sql = "select * from workload where userId =?";
//	List<String> list = new ArrayList<>();
//	Vector<String> v = BaseDao.select(sql, list);
	private Double para=0.0;//系数，专任教师则是职称系数
	private Double stuModPara=0.0;//学生系数
	private Double unitTuiPara=0.0;//单位课酬
	private String benTuiPara="0";//本科课程时数
	private String kaiTuiPara="0";//开院课程时数
	private String fengTuiPara="0";//凤凰学院课程时数
	private String chengTuiPara="0";//成人教育课程时数
	private String lingdaoTuiPara="0";//领导的管理系数
	private String zhongcengTuiPara="0";//无用
	private String jiaofuTuiPara="0";//无用
	private String zhiwuTuiPara="0";//职务补贴
	private String dianhuaTuiPara="0";//电话补贴
	private String shenghuoTuiPara="0";//生活补贴
	private String jieriTuiPara="0";//节日补贴
	private String koufaTuiPara="0";//扣发补贴
	private String jiabanTuiPara="0";//加班补贴
	private String qitaTuiPara="0";//其他补贴
	private String linshiTuiPara="0";//临时补贴
	private String buchongTuiPara="0";//补充说明
	private String month="0";//发工资的月份
	private String total_kechou="0";//课酬总和
	private String total_butie="0";//补贴总和
	private JTextField dianhua;
	private JTextField shenghuo;
	private JTextField zhiwu;
	private Double total1=0.0;
	private Double total2=0.0;
	private String mTAO_State="";//是否为专任教师
	

	/**
	 * Create the panel.
	 * @throws SQLException 
	 */
	public PayOff(User user) throws SQLException {
		this.user=user;
		setLayout(null);
		JLabel lblNewLabel_1 = new JLabel("\u7F16\u53F7\uFF1A");
		lblNewLabel_1.setBounds(30, 28, 54, 21);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_2.setBounds(215, 30, 54, 21);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5B66\u5E74\u5B66\u671F\uFF1A");
		lblNewLabel_3.setBounds(386, 28, 117, 21);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("\u52A0\u73ED\u8865\u8D34\uFF1A");
		lblNewLabel_5.setBounds(27, 337, 126, 21);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u672C\u79D1\u6559\u5B66\u4E1A\u7EE9\uFF1A");
		lblNewLabel_6.setBounds(30, 108, 134, 21);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u5B66\u9662\u9886\u5BFC\u7BA1\u7406\u4E1A\u7EE9\uFF1A\r\n");
		lblNewLabel_7.setBounds(292, 105, 153, 21);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u79D1\u7814\u4E1A\u7EE9\uFF1A");
		lblNewLabel_8.setBounds(291, 278, 126, 21);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u4E34\u65F6\u8865\u8D34\uFF1A");
		lblNewLabel_9.setBounds(289, 338, 130, 21);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u672C\u6708\u5408\u8BA1\uFF1A");
		lblNewLabel_10.setBounds(289, 389, 132, 21);
		add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u5176\u4ED6\u4E1A\u7EE9\uFF1A");
		lblNewLabel_11.setBounds(28, 386, 126, 21);
		add(lblNewLabel_11);
		
		
		
		JLabel label = new JLabel("\u804C\u52A1\u8865\u8D34\uFF1A");
		label.setBounds(571, 102, 78, 21);
		add(label);
		
		JLabel label_1 = new JLabel("\u5F00\u653E\u5B66\u9662\u6559\u5B66\u4E1A\u7EE9\uFF1A");
		label_1.setBounds(28, 173, 163, 21);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u51E4\u51F0\u5B66\u9662\u6559\u5B66\u4E1A\u7EE9\uFF1A");
		label_2.setBounds(28, 228, 163, 21);
		add(label_2);
		
		JLabel label_3 = new JLabel("\u8865\u5145\u8BF4\u660E\uFF1A");
		label_3.setBounds(28, 439, 126, 21);
		add(label_3);
		
		JLabel label_0 = new JLabel("\u5B66\u9662\u4E2D\u5C42\u7BA1\u7406\u4E1A\u7EE9\uFF1A\r\n");
		label_0.setBounds(292, 165, 182, 21);
		add(label_0);
		
		JLabel label_5 = new JLabel("\u884C\u653F\u6559\u8F85\u7BA1\u7406\u4E1A\u7EE9\uFF1A\r\n");
		label_5.setBounds(291, 228, 182, 21);
		add(label_5);
		
		JButton update = new JButton("\u66F4\u65B0");
		update.setBounds(423, 503, 123, 29);
		//更新相当于重新提交
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Achievement achievement = packToAchievement();
				
				//获取当天是该月的第几天
				Calendar cale =null;
				cale = Calendar.getInstance();
				int day = cale.get(Calendar.DATE);
				if (achievement == null) {
					return;
				}
				
				int count = 0;
				try {
					count = AchievementDao.addachievement(achievement);
				} catch (SQLException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				if (count == 1&&day!=10) {
					JOptionPane.showMessageDialog(PayOff.this, 
							"更新成功！", "提示", JOptionPane.INFORMATION_MESSAGE); 
//					submit.setEnabled(false);
//					updateBtn.setEnabled(true);
				} 
				else if(day!=10)//只有每个月的10号可以发工资
				{
					JOptionPane.showMessageDialog(PayOff.this, 
							"还没有到发放工资的日期！", "提示", JOptionPane.ERROR_MESSAGE); 
				}
				else {
					JOptionPane.showMessageDialog(PayOff.this, 
							"提交失败！", "提示", JOptionPane.ERROR_MESSAGE); 
				}
			}
		});
		add(update);
		
		JLabel label_6 = new JLabel("\u7535\u8BDD\u8865\u8D34\uFF1A");
		label_6.setBounds(569, 162, 79, 21);
		add(label_6);
		
		JLabel label_7 = new JLabel("\u751F\u6D3B\u8865\u8D34\uFF1A");
		label_7.setBounds(569, 226, 75, 21);
		add(label_7);
		
		JLabel label_8 = new JLabel("\u8282\u65E5\u8865\u8D34\uFF1A");
		label_8.setBounds(566, 283, 75, 21);
		add(label_8);
		
		JLabel label_9 = new JLabel("\u6263\u53D1\u3001\u8865\u53D1\uFF1A");
		label_9.setBounds(567, 337, 95, 21);
		add(label_9);
		
		jiaban = new JTextField();
		jiaban.setColumns(10);
		jiaban.setBounds(168, 336, 100, 27);
		add(jiaban);
		
		
		qita = new JTextField();
		qita.setColumns(10);
		qita.setBounds(168, 383, 100, 27);
		add(qita);
		
		
		keyan = new JTextField();
		keyan.setColumns(10);
		keyan.setBounds(424, 274, 100, 27);
		add(keyan);
		
		
		linshi = new JTextField();
		linshi.setColumns(10);
		linshi.setBounds(425, 336, 100, 27);
		add(linshi);
		
		
		jieri = new JTextField();
		jieri.setColumns(10);
		jieri.setBounds(686, 279, 100, 27);
		add(jieri);
		
		
		koufa = new JTextField();
		koufa.setColumns(10);
		koufa.setBounds(686, 336, 100, 27);
		add(koufa);
		
		
		
		JLabel label_10 = new JLabel("\u6210\u4EBA\u6559\u80B2\u5B66\u4E1A\u7EE9\uFF1A");
		label_10.setBounds(28, 276, 127, 21);
		add(label_10);
		
		buchong = new JTextField();
		buchong.setColumns(10);
		buchong.setBounds(169, 433, 417, 27);
		add(buchong);
		if(buchong.getText().equals("")==false)
			buchongTuiPara=koufa.getText();
		
		userId = new JTextField();
		userId.setText(user.getUserId());
		userId.setEditable(false);
		userId.setColumns(10);
		userId.setBounds(71, 27, 117, 21);
		add(userId);
		
		userName = new JTextField();
		userName.setText(user.getUserName());
		userName.setEditable(false);
		userName.setColumns(10);
		userName.setBounds(255, 27, 117, 21);
		add(userName);
		
		
		//学期选择框
		JComboBox termSelect = new JComboBox();
		termSelect.setModel(new DefaultComboBoxModel(getLastCntTerms(6)));
		termSelect.setBounds(462, 27, 139, 23);
		termSelect.addItemListener(this);
		add(termSelect);
		String term = termSelect.getSelectedItem().toString();
		Workload workload = new Workload();
//		System.out.println(term);
		//通过学期获取本、开、凤、成人的课时数
		workload=WorkloadDao.getWorkload(user.getUserId(),term);
		
		//专任教师的绩效
		if(user.getmTOA_State().equals("专任教师")) {
			
			if(user.getBaseAllowanceState().equals("教授"))
			{
				para=MainFram.spe.getProModPara();
			}
			else if(user.getBaseAllowanceState().equals("副教授"))
			{
				para=MainFram.spe.getAssproModPara();
			}
			else if(user.getBaseAllowanceState().equals("讲师"))
			{
				para=MainFram.spe.getLectModPara();
			}
			else if(user.getBaseAllowanceState().equals("助教"))
			{
				para=MainFram.spe.getAssteaModPara();
			}
			stuModPara=MainFram.spe.getStuModPara();//学生系数
			unitTuiPara=MainFram.spe.getUnitTuiPara();//单位课酬
			
			mTAO_State="专任教师";
			
			//取消科学计数法
			NumberFormat nf = NumberFormat.getInstance();
			nf.setGroupingUsed(false);
			
			benTuiPara = nf.format(stuModPara*unitTuiPara*para*workload.getLessonHour());
			Ben = new JTextField();
			Ben.setText(benTuiPara);
			Ben.setEditable(false);
			Ben.setColumns(10);
			Ben.setBounds(167, 104, 100, 27);
			add(Ben);
//			System.out.println(benTuiPara);
			
			kaiTuiPara = nf.format(stuModPara*unitTuiPara*para*workload.getkaiHour());
			kai = new JTextField();
			kai.setText( kaiTuiPara);
			kai.setEditable(false);
			kai.setColumns(10);
			kai.setBounds(168, 165, 100, 27);
			add(kai);
//			System.out.println(kaiTuiPara);
			
			fengTuiPara = nf.format(stuModPara*unitTuiPara*para*workload.getfenHour());
			feng = new JTextField();
			feng.setText(fengTuiPara);
			feng.setEditable(false);
			feng.setColumns(10);
			feng.setBounds(167, 223, 100, 27);
			add(feng);
//			System.out.println(fengTuiPara);
			
			
			chengTuiPara = nf.format(stuModPara*unitTuiPara*para*workload.getchengHour());
			cheng = new JTextField();
			cheng.setText(chengTuiPara);
			cheng.setEditable(false);
			cheng.setColumns(10);
			cheng.setBounds(168, 274, 100, 27);
			add(cheng);
//			System.out.println(chengTuiPara);
			
//			lingdaoTuiPara = String.valueOf(stuModPara*unitTuiPara*para*workload.getkaiHour());
			lingdao = new JTextField();
			lingdao.setText((String)null);
			lingdao.setEditable(false);
			lingdao.setColumns(10);
			lingdao.setBounds(423, 100, 100, 27);
			add(lingdao);
			
//			zhongcengTuiPara = String.valueOf(stuModPara*unitTuiPara*para*workload.getkaiHour());
			zhongceng = new JTextField();
			zhongceng.setText((String)null);
			zhongceng.setEditable(false);
			zhongceng.setColumns(10);
			zhongceng.setBounds(424, 159, 100, 27);
			add(zhongceng);
			
//			jiaofuTuiPara = String.valueOf(stuModPara*unitTuiPara*para*workload.getkaiHour());
			jiaofu = new JTextField();
			jiaofu.setText((String) null);
			jiaofu.setEditable(false);
			jiaofu.setColumns(10);
			jiaofu.setBounds(423, 221, 100, 27);
			add(jiaofu);
			
			
		}
		else {
			//非专任教师的绩效
			if(user.getmTOA_State().equals("院长")||user.getmTOA_State().equals("书记"))
			{
				para=2.0;
			}
			else if(user.getmTOA_State().equals("系主任")||user.getmTOA_State().equals("部主任")||user.getmTOA_State().equals("中心主任"))
			{
				para=1.8;
			}
			else if(user.getmTOA_State().equals("系副主任")||user.getmTOA_State().equals("部副主任")||user.getmTOA_State().equals("中心副主任"))
			{
				para=1.2;
			}
			else 
			{
				para=1.0;
			}
			
			mTAO_State="非专任教师";
			Ben = new JTextField();
			Ben.setText((String)null);
			Ben.setEditable(false);
			Ben.setColumns(10);
			Ben.setBounds(167, 104, 100, 27);
			add(Ben);
//			System.out.println(benTuiPara);
			
			kai = new JTextField();
			kai.setText((String)null);
			kai.setEditable(false);
			kai.setColumns(10);
			kai.setBounds(168, 165, 100, 27);
			add(kai);
//			System.out.println(kaiTuiPara);
			
			feng = new JTextField();
			feng.setText((String)null);
			feng.setEditable(false);
			feng.setColumns(10);
			feng.setBounds(167, 223, 100, 27);
			add(feng);
//			System.out.println(fengTuiPara);
			
			cheng = new JTextField();
			cheng.setText((String)null);
			cheng.setEditable(false);
			cheng.setColumns(10);
			cheng.setBounds(168, 274, 100, 27);
			add(cheng);
//			System.out.println(chengTuiPara);
			
			//从数据库中取出所有专任教师的总课酬
			Calendar calendar = Calendar.getInstance();
			Integer MONTH = calendar.get(Calendar.MONTH);
			Vector<Achievement> achievements = new Vector<>();
			Vector<Vector<String>> vectors = new Vector<>();
			List<String> list = new ArrayList<>();
			String sql="select * from achievement where mTAO_State='专任教师' AND month = '"+MONTH+"' ;";
			vectors = BaseDao.selectAll(sql, list);
			Double  total_kechou1 = 0.0;//用于数据类型转换
			int count=0;
			for(Vector<String> x:vectors) {
				Achievement achievement = new Achievement();
				achievement = creatAchievement(x);
				total_kechou1=total_kechou1+Double.parseDouble(achievement.getTotal_kechou());
				count=count+1;
			}
			Double total_kechou2 = total_kechou1/count;//求课酬平均值
			//求管理绩效
			lingdaoTuiPara = String.valueOf(para*total_kechou2);
			System.out.println(para);
			System.out.println(total_kechou2);
			System.out.println(lingdaoTuiPara);
			lingdao = new JTextField();
			lingdao.setText(lingdaoTuiPara);
			lingdao.setEditable(false);
			lingdao.setColumns(10);
			lingdao.setBounds(423, 100, 100, 27);
			add(lingdao);
			
			//无用
//			zhongcengTuiPara = String.valueOf(stuModPara*unitTuiPara*para*workload.getkaiHour());
			zhongceng = new JTextField();
			zhongceng.setText((String)null);
			zhongceng.setEditable(false);
			zhongceng.setColumns(10);
			zhongceng.setBounds(424, 159, 100, 27);
			add(zhongceng);
			
			//无用
//			jiaofuTuiPara = String.valueOf(stuModPara*unitTuiPara*para*workload.getkaiHour());
			jiaofu = new JTextField();
			jiaofu.setText((String) null);
			jiaofu.setEditable(false);
			jiaofu.setColumns(10);
			jiaofu.setBounds(423, 221, 100, 27);
			add(jiaofu);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		dianhua = new JTextField();
		dianhua.setColumns(10);
		dianhua.setBounds(686, 162, 100, 27);
		add(dianhua);
		
		
		shenghuo = new JTextField();
		shenghuo.setColumns(10);
		shenghuo.setBounds(686, 224, 100, 27);
		add(shenghuo);
		
		
		zhiwu = new JTextField();
		zhiwu.setColumns(10);
		zhiwu.setBounds(686, 100, 100, 27);
		add(zhiwu);
		
		
		
		//求出课酬总数
		Double a = Double.parseDouble(benTuiPara);
		Double b = Double.parseDouble(kaiTuiPara);
		Double c = Double.parseDouble(fengTuiPara);
		Double d = Double.parseDouble(chengTuiPara);
		total1=(a+b+c+d)/5;//每个月的平均课酬
		
		total_kechou=String.valueOf(total1);
		
		
		
		total = new JTextField();
		total.setColumns(10);
		total.setBounds(424, 387, 100, 27);
		add(total);
		
		
		JButton 合计 = new JButton("\u5408\u8BA1");
		合计.setBounds(539, 385, 123, 29);
		add(合计);
		//获取并算出总和
		合计.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//每次点击重新获取
				if(jiaban.getText().equals("")==false)
					jiabanTuiPara=jiaban.getText();
				if(dianhua.getText().equals("")==false)
					dianhuaTuiPara =dianhua.getText();
				if(shenghuo.getText().equals("")==false)
					shenghuoTuiPara = shenghuo.getText();
				if(zhiwu.getText().equals("")==false)
					zhiwuTuiPara = zhiwu.getText();
				if(koufa.getText().equals("")==false)
					koufaTuiPara=koufa.getText();
				if(jieri.getText().equals("")==false)
					jieriTuiPara=jieri.getText();
				if(qita.getText().equals("")==false)
					qitaTuiPara=qita.getText();
				if(linshi.getText().equals("")==false)
					linshiTuiPara=linshi.getText();
				Double e1 = Double.parseDouble(zhiwuTuiPara);
				Double f = Double.parseDouble(dianhuaTuiPara);
				Double g = Double.parseDouble(shenghuoTuiPara);
				Double h = Double.parseDouble(jieriTuiPara);
				Double i = Double.parseDouble(koufaTuiPara);
				Double j = Double.parseDouble(jiabanTuiPara);
				Double k = Double.parseDouble(qitaTuiPara);
				Double l = Double.parseDouble(linshiTuiPara);
				total2=(e1+f+g+h+i+j+k+l)/5;//每个月的平均补贴
				
				total_butie=String.valueOf(total2);	
				
				total.setText(String.valueOf(total1+total2));
			}
					
		
		});
		
		//提交，发放工资按钮
				JButton submit = new JButton("\u63D0\u4EA4");
				submit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Achievement achievement = packToAchievement();
						
						//获取当天是该月的第几天
						Calendar cale =null;
						cale = Calendar.getInstance();
						int day = cale.get(Calendar.DATE);
						if (achievement == null) {
							return;
						}
						
						int count = 0;
						try {
							count = AchievementDao.addachievement(achievement);
						} catch (SQLException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
						if (count == 1&&day!=10) {
							JOptionPane.showMessageDialog(PayOff.this, 
									"提交成功！", "提示", JOptionPane.INFORMATION_MESSAGE); 
							submit.setEnabled(false);
//							updateBtn.setEnabled(true);
						} 
						else if(day!=10)//只有每个月的10号可以发工资
						{
							JOptionPane.showMessageDialog(PayOff.this, 
									"还没有到发放工资的日期！", "提示", JOptionPane.ERROR_MESSAGE); 
						}
						
						else {
							JOptionPane.showMessageDialog(PayOff.this, 
									"提交失败！", "提示", JOptionPane.ERROR_MESSAGE); 
						}
					}
				});
				submit.setBounds(147, 501, 123, 29);
				add(submit);
		
	}

	
	

	private String[] getLastCntTerms(int cnt) {
		Calendar calendar = Calendar.getInstance();
		Integer year = calendar.get(Calendar.YEAR);
		Integer month = calendar.get(Calendar.MONTH) + 1; // 别忘了+1
		
		String[] terms = new String[cnt];
		TermBean currentTerm = new TermBean(year, month);
		for (int i = 0; i < cnt; i++) {
			terms[i] = currentTerm.toString();
			currentTerm = currentTerm.getPreTermBean();
		}
		return terms;
	}
	
	class TermBean {
		private Integer year1;
		private Integer year2;
		private Integer term;
		
		/**
		 * 当前的年份和月份
		 * @param year
		 * @param month
		 */
		public TermBean(Integer year, Integer month) {
			if (month >= 9) {
				// 第一学期
				year1 = year;
				year2 = year + 1;
				term = 1;
			} else if (month >= 2) {
				// 第二学期
				year1 = year - 1;
				year2 = year;
				term = 2;
			}
		}
		
		public TermBean(Integer year1, Integer year2, Integer term) {
			super();
			this.year1 = year1;
			this.year2 = year2;
			this.term = term;
		}

		/**
		 * 获取上一个学期对象
		 * @return
		 */
		public TermBean getPreTermBean() {
			TermBean perTermBean = null; 
			if (term == 1) {
				perTermBean = new TermBean(year1 - 1, year2 - 1, 2);
			} else {
				perTermBean = new TermBean(year1, year2, 1);
			}
			return perTermBean;
		}

		@Override
		public String toString() {
			return  year1 + "-" + year2 + "（" + term + "）";
		}

		public Integer getYear1() {
			return year1;
		}

		public void setYear1(Integer year1) {
			this.year1 = year1;
		}

		public Integer getYear2() {
			return year2;
		}

		public void setYear2(Integer year2) {
			this.year2 = year2;
		}

		public Integer getTerm() {
			return term;
		}

		public void setTerm(Integer term) {
			this.term = term;
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 检验页面参数，并打包
	 * @return
	 */
	private Achievement packToAchievement() {
//		String ben = termSelect.getSelectedItem().toString();
//		String lessonHour = lessonHourEdit.getText().trim();
//		String attendCnt = attendCntEdit.getText().trim();
//		String kaiHour = kai.getText().trim();
//		String fenHour = fen.getText().trim();
//		String chengHour = cheng.getText().trim();
//		// 校验界面参数
//		if (!TextHelper.isPositiveInteger(lessonHour)
//				|| !TextHelper.isPositiveInteger(attendCnt)) {
//			JOptionPane.showMessageDialog(WorkloadInput.this, 
//					"提交失败：请正确填写数据！", "提示", JOptionPane.ERROR_MESSAGE); 
//			return null; 
//		}
		if(jiaban.getText().equals("")==false)
			jiabanTuiPara=jiaban.getText();
		if(dianhua.getText().equals("")==false)
			dianhuaTuiPara =dianhua.getText();
		if(shenghuo.getText().equals("")==false)
			shenghuoTuiPara = shenghuo.getText();
		if(zhiwu.getText().equals("")==false)
			zhiwuTuiPara = zhiwu.getText();
		if(koufa.getText().equals("")==false)
			koufaTuiPara=koufa.getText();
		if(jieri.getText().equals("")==false)
			jieriTuiPara=jieri.getText();
		if(qita.getText().equals("")==false)
			qitaTuiPara=qita.getText();
		if(linshi.getText().equals("")==false)
			linshiTuiPara=linshi.getText();
		Calendar cale=null;
		cale=Calendar.getInstance();
		Integer month1 = cale.get(Calendar.MONTH);
		month = String.valueOf(month1);
		System.out.println(month);
//		
		return new Achievement(null, user.getUserId(), benTuiPara, 
				kaiTuiPara, fengTuiPara, chengTuiPara, zhiwuTuiPara,dianhuaTuiPara,shenghuoTuiPara,jieriTuiPara,koufaTuiPara,jiabanTuiPara,qitaTuiPara,linshiTuiPara,buchongTuiPara,month,total_kechou,total_butie,mTAO_State);
	}
	
	
	public Achievement creatAchievement(Vector<String> v) {
		Achievement achievement = new Achievement();
		achievement.setId(Integer.parseInt(v.get(0)));
		achievement.setUserId(v.get(1));
		achievement.setBen(v.get(2));
		achievement.setKai(v.get(3));
		achievement.setFeng(v.get(4));
		achievement.setCheng(v.get(5));
		achievement.setZhiwu(v.get(6));
		achievement.setDianhua(v.get(7));
		achievement.setShenghuo(v.get(8));
		achievement.setJieri(v.get(9));
		achievement.setKoufa(v.get(10));
		achievement.setJiaban(v.get(11));
		achievement.setQita(v.get(12));
		achievement.setLinshi(v.get(13));
		achievement.setBuchong(v.get(14));
		achievement.setMonth(v.get(15));
		achievement.setTotal_kechou(v.get(16));
		achievement.setTotal_butie(v.get(17));
		achievement.setmTAO_State(v.get(18));
//		
		return achievement;
	}
}
