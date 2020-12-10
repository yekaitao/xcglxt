package modelItem;

/**
 * 用户获取【专任】教师工资组成的各参数
 * 
 * @author lzw
 * 
 * */
public class Spe {
	//岗位工资
	private Double proPostPara;//教授
	private Double assproPostPara;//副教授
	private Double lectPostPara;//讲师
	private Double assteaPostPara;//助教
	//基础绩效工资
	private Double proBasicPara;//教授
	private Double assproBasicPara;//副教授
	private Double lectBasicPara;//讲师
	private Double assteaBasicPara;//助教
	//职称系数
	private Double proModPara;//教授
	private Double assproModPara;//副教授
	private Double lectModPara;//讲师
	private Double assteaModPara;//助教
	//学生系数
	private Double stuModPara;//学生系数
	//单位课酬
	private Double unitTuiPara;//单位课酬
	public Spe(){
		proPostPara = 2000.0;
		assproPostPara = 1800.0;
		lectPostPara = 1500.0;
		assteaPostPara = 1200.0;
		
		proBasicPara = 1000.0;
		assproBasicPara = 800.0;
		lectBasicPara = 600.0;
		assteaBasicPara = 500.0;
		
		proModPara = 1.5;
		assproModPara = 1.3;
		lectModPara = 1.2;
		assteaModPara = 1.0;
		
		stuModPara = 60.0;
		unitTuiPara = 35.0;
	}
	public Double getProPostPara() {
		return proPostPara;
	}
	public void setProPostPara(double proPostPara) {
		this.proPostPara = proPostPara;
	}
	public Double getAssproPostPara() {
		return assproPostPara;
	}
	public void setAssproPostPara(double assproPostPara) {
		this.assproPostPara = assproPostPara;
	}
	public Double getLectPostPara() {
		return lectPostPara;
	}
	public void setLectPostPara(double lectPostPara) {
		this.lectPostPara = lectPostPara;
	}
	public Double getAssteaPostPara() {
		return assteaPostPara;
	}
	public void setAssteaPostPara(double assteaPostPara) {
		this.assteaPostPara = assteaPostPara;
	}
	public Double getProBasicPara() {
		return proBasicPara;
	}
	public void setProBasicPara(double proBasicPara) {
		this.proBasicPara = proBasicPara;
	}
	public Double getAssproBasicPara() {
		return assproBasicPara;
	}
	public void setAssproBasicPara(double assproBasicPara) {
		this.assproBasicPara = assproBasicPara;
	}
	public Double getLectBasicPara() {
		return lectBasicPara;
	}
	public void setLectBasicPara(double lectBasicPara) {
		this.lectBasicPara = lectBasicPara;
	}
	public Double getAssteaBasicPara() {
		return assteaBasicPara;
	}
	public void setAssteaBasicPara(double assteaBasicPara) {
		this.assteaBasicPara = assteaBasicPara;
	}
	public Double getProModPara() {
		return proModPara;
	}
	public void setProModPara(double proModPara) {
		this.proModPara = proModPara;
	}
	public Double getAssproModPara() {
		return assproModPara;
	}
	public void setAssproModPara(double assproModPara) {
		this.assproModPara = assproModPara;
	}
	public Double getLectModPara() {
		return lectModPara;
	}
	public void setLectModPara(double lectModPara) {
		this.lectModPara = lectModPara;
	}
	public Double getAssteaModPara() {
		return assteaModPara;
	}
	public void setAssteaModPara(double assteaModPara) {
		this.assteaModPara = assteaModPara;
	}
	public Double getStuModPara() {
		return stuModPara;
	}
	public void setStuModPara(double stuModPara) {
		this.stuModPara = stuModPara;
	}
	public Double getUnitTuiPara() {
		return unitTuiPara;
	}
	public void setUnitTuiPara(double unitTuiPara) {
		this.unitTuiPara = unitTuiPara;
	}
	
}
