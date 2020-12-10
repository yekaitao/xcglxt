package modelItem;


public class Workload {
	private Integer workloadId;
	
	private String userId;
	
	private String term;
	
	private Integer lessonHour; // ȫ���Ʊ��ƿ�ʱ
	
	private Integer attendCnt; // ��Ӧ���Ͽ�����
	
	private Integer kaiHour; // ����ѧԺ�ܿ�ʱ
	
	private Integer fenHour; // ���ѧԺ�ܿ�ʱ
	
	private Integer chengHour; // ���˽����ܿ�ʱ
	

	public Workload(Integer workloadId, String userId, String term, Integer lessonHour, Integer attendCnt, Integer kaiHour, Integer fenHour, Integer chengHour) {
		super();
		this.workloadId = workloadId;
		this.userId = userId;
		this.term = term;
		this.lessonHour = lessonHour;
		this.attendCnt = attendCnt;
		this.kaiHour = kaiHour;
		this.fenHour = fenHour;
		this.chengHour = chengHour;
	}
	
	public Workload()
	{
		super();
	}

	public Integer getWorkloadId() {
		return workloadId;
	}

	public void setWorkloadId(Integer workloadId) {
		this.workloadId = workloadId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public Integer getLessonHour() {
		return lessonHour;
	}

	public void setLessonHour(Integer lessonHour) {
		this.lessonHour = lessonHour;
	}
	
	public Integer getAttendCnt() {
		return attendCnt;
	}

	public void setAttendCnt(Integer attendCnt) {
		this.attendCnt = attendCnt;
	}
	

	public Integer getkaiHour() {
		return kaiHour;
	}

	public void setkaiHour(Integer kaiHour) {
		this.kaiHour = kaiHour;
	}

	public Integer getfenHour() {
		return fenHour;
	}

	public void setfenHour(Integer fenHour) {
		this.fenHour = fenHour;
	}
	
	public Integer getchengHour() {
		return chengHour;
	}

	public void setchengHour(Integer chengHour) {
		this.chengHour = chengHour;
	}
}
