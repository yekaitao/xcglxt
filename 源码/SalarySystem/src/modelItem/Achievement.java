package modelItem;


public class Achievement {
	private static Integer id;
	
	private static String userId;
	
	private static String ben;// ȫ���Ʊ��ƿ�ʱ
	
	private static String kai; // ����ѧԺ�ܿ�ʱ
	
	private static String feng; // ���ѧԺ�ܿ�ʱ
	
	private static String cheng; // ���˽����ܿ�ʱ
	
	private static String zhiwu; // ְ����
	
	private static String dianhua; // �绰����
	
	private static String shenghuo; // �����
	
	private static String jieri; // ���ղ���
	
	private static String koufa; // �۷�����
	
	private static String jiaban; // �Ӱಹ��
	
	private static String qita; // ��������
	
	private static String linshi; // ��ʱ����
	
	private static String buchong; // ����˵��
	
	private static String month; // �·�
	
	private static String total_kechou; // �ܿγ�
		
	private static String total_butie; //�ܲ���
	
	private static String mTAO_State; //�Ƿ�Ϊר�ν�ʦ
	
	

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
