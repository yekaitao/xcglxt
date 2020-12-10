package modelItem;


public class Achievement {
	private static Integer id;
	
	private static String userId;
	
	private static String ben;// 全日制本科课时
	
	private static String kai; // 开放学院总课时
	
	private static String feng; // 凤凰学院总课时
	
	private static String cheng; // 成人教育总课时
	
	private static String zhiwu; // 职务补贴
	
	private static String dianhua; // 电话补贴
	
	private static String shenghuo; // 生活补贴
	
	private static String jieri; // 节日补贴
	
	private static String koufa; // 扣发补贴
	
	private static String jiaban; // 加班补贴
	
	private static String qita; // 其他补贴
	
	private static String linshi; // 临时补贴
	
	private static String buchong; // 补充说明
	
	private static String month; // 月份
	
	private static String total_kechou; // 总课酬
		
	private static String total_butie; //总补贴
	
	private static String mTAO_State; //是否为专任教师
	
	

	public Achievement(Integer id, String userId, String ben, String kai,String feng, String cheng,String zhiwu, String dianhua,String shenghuo,String jieri,String koufa,String jiaban,String qita,String linshi,String buchong,String month, String total_kechou,String total_butie,String mTAO_State) {
		super();
		this.id = id;
		this.userId=userId;
		this.ben = ben;
		this.kai = kai;
		this.feng = feng;
		this.cheng = cheng;
		this.zhiwu = zhiwu;
		this.dianhua = dianhua;
		this.shenghuo = shenghuo;
		this.jieri = jieri;
		this.koufa = koufa;
		this.jiaban = jiaban;
		this.qita = qita;
		this.buchong = linshi;
		this.buchong = buchong;
		this.month = month;
		this.total_kechou = total_kechou;
		this.total_butie = total_butie;
		this.mTAO_State=mTAO_State;
		
		
	}
	
	public Achievement()
	{
		super();
	}

	public static Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public static String getBen() {
		return ben;
	}

	public void setBen(String ben) {
		this.ben = ben;
	}

	public static String getKai() {
		return kai;
	}

	public void setKai(String kai) {
		this.kai = kai;
	}

	public static String getFeng() {
		return feng;
	}

	public void setFeng(String feng) {
		this.feng = feng;
	}

	public static String getCheng() {
		return cheng;
	}

	public void setCheng(String cheng) {
		this.cheng = cheng;
	}

	public static String getZhiwu() {
		return zhiwu;
	}

	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}

	public static String getDianhua() {
		return dianhua;
	}

	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}

	public static String getShenghuo() {
		return shenghuo;
	}

	public void setShenghuo(String shenghuo) {
		this.shenghuo = shenghuo;
	}

	public static String getJieri() {
		return jieri;
	}

	public void setJieri(String jieri) {
		this.jieri = jieri;
	}

	public static String getKoufa() {
		return koufa;
	}

	public void setKoufa(String koufa) {
		this.koufa = koufa;
	}

	public static String getJiaban() {
		return jiaban;
	}

	public void setJiaban(String jiaban) {
		this.jiaban = jiaban;
	}

	public static String getQita() {
		return qita;
	}

	public void setQita(String qita) {
		this.qita = qita;
	}

	public static String getLinshi() {
		return linshi;
	}

	public void setLinshi(String linshi) {
		this.linshi = linshi;
	}

	public static String getBuchong() {
		return buchong;
	}

	public void setBuchong(String buchong) {
		this.buchong = buchong;
	}

	public static String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public static String getTotal_kechou() {
		return total_kechou;
	}

	public void setTotal_kechou(String total_kechou) {
		this.total_kechou = total_kechou;
	}

	public static String getTotal_butie() {
		return total_butie;
	}

	public void setTotal_butie(String total_butie) {
		this.total_butie = total_butie;
	}

	public static String getmTAO_State() {
		return mTAO_State;
	}

	public static void setmTAO_State(String mTAO_State) {
		Achievement.mTAO_State = mTAO_State;
	}

	
	
}
