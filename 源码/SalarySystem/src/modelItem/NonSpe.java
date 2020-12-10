package modelItem;

/**
 * 用户获取【非专任】教师工资组成的各参数
 * 
 * @author lzw
 * 
 * */
public class NonSpe {
	//岗位工资
	private double headPostPara;//院长/书记
	private double assheadPostPara;//副院长/副书记
	private double directPostPara;//系\部\中心主任
	private double assdirectPostPara;//系\部\中心副主任
	private double otherPostPara;//其他
	
	private double headBasicPara;//院长/书记
	private double assheadBasicPara;//副院长/副书记
	private double directBasicPara;//系\部\中心主任
	private double assdirectBasicPara;//系\部\中心副主任
	private double otherBasicPara;//其他
	
	private double headManaPara;//院长/书记
	private double assheadManaPara;//副院长/副书记
	private double directManaPara;//系\部\中心主任
	private double assdirectManaPara;//系\部\中心副主任
	private double otherManaPara;//其他
	
	private double unitTuiPara;//单位课酬
	public NonSpe(){
		headPostPara = 2000;
		assheadPostPara = 1800;
		directPostPara = 1500;
		assdirectPostPara = 1200;
		otherPostPara = 1000;
		
		headBasicPara = 1100;
		assheadBasicPara = 900;
		directBasicPara = 700;
		assdirectBasicPara = 600;
		otherBasicPara = 500;
		
		headManaPara = 2;
		assheadManaPara = 1.8;
		directManaPara = 1.5;
		assdirectManaPara = 1.2;
		otherManaPara = 1.0;
		
		unitTuiPara = 35;
	}
	public double getHeadPostPara() {
		return headPostPara;
	}
	public void setHeadPostPara(double headPostPara) {
		this.headPostPara = headPostPara;
	}
	public double getAssheadPostPara() {
		return assheadPostPara;
	}
	public void setAssheadPostPara(double assheadPostPara) {
		this.assheadPostPara = assheadPostPara;
	}
	public double getDirectPostPara() {
		return directPostPara;
	}
	public void setDirectPostPara(double directPostPara) {
		this.directPostPara = directPostPara;
	}
	public double getAssdirectPostPara() {
		return assdirectPostPara;
	}
	public void setAssdirectPostPara(double assdirectPostPara) {
		this.assdirectPostPara = assdirectPostPara;
	}
	public double getOtherPostPara() {
		return otherPostPara;
	}
	public void setOtherPostPara(double otherPostPara) {
		this.otherPostPara = otherPostPara;
	}
	public double getHeadBasicPara() {
		return headBasicPara;
	}
	public void setHeadBasicPara(double headBasicPara) {
		this.headBasicPara = headBasicPara;
	}
	public double getAssheadBasicPara() {
		return assheadBasicPara;
	}
	public void setAssheadBasicPara(double assheadBasicPara) {
		this.assheadBasicPara = assheadBasicPara;
	}
	public double getDirectBasicPara() {
		return directBasicPara;
	}
	public void setDirectBasicPara(double directBasicPara) {
		this.directBasicPara = directBasicPara;
	}
	public double getAssdirectBasicPara() {
		return assdirectBasicPara;
	}
	public void setAssdirectBasicPara(double assdirectBasicPara) {
		this.assdirectBasicPara = assdirectBasicPara;
	}
	public double getOtherBasicPara() {
		return otherBasicPara;
	}
	public void setOtherBasicPara(double otherBasicPara) {
		this.otherBasicPara = otherBasicPara;
	}
	public double getHeadManaPara() {
		return headManaPara;
	}
	public void setHeadManaPara(double headManaPara) {
		this.headManaPara = headManaPara;
	}
	public double getAssheadManaPara() {
		return assheadManaPara;
	}
	public void setAssheadManaPara(double assheadManaPara) {
		this.assheadManaPara = assheadManaPara;
	}
	public double getDirectManaPara() {
		return directManaPara;
	}
	public void setDirectManaPara(double directManaPara) {
		this.directManaPara = directManaPara;
	}
	public double getAssdirectManaPara() {
		return assdirectManaPara;
	}
	public void setAssdirectManaPara(double assdirectManaPara) {
		this.assdirectManaPara = assdirectManaPara;
	}
	public double getOtherManaPara() {
		return otherManaPara;
	}
	public void setOtherManaPara(double otherManaPara) {
		this.otherManaPara = otherManaPara;
	}
	public double getUnitTuiPara() {
		return unitTuiPara;
	}
	public void setUnitTuiPara(double unitTuiPara) {
		this.unitTuiPara = unitTuiPara;
	}
	
}
