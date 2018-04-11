package entity;

import java.util.List;

/**
 * 
 * @author 陈光辉 封装类型， 封装 技术经理用到的参数 2018年3月27日
 */
public class TechVo {

	private List<Supplier> suppliers; // 供应商
	private List<Tech> techs; // 技术类型
	/**
	 * 正在工作的员工数
	 */
	private int hsenior = 0;
	private int hmiddle = 0;
	private int hlow = 0;
	/**
	 * 未在工作的员工数
	 */
	private int ssenior = 0;
	private int smiddle = 0;
	private int slow = 0;
	/**
	 * 技术人员
	 */
	private Artisan artisan; 
	/**
	 * 项目
	 */
	private Project project;
	/**
	 * 供应商
	 */
	private Supplier supplier;
	/**
	 * 技术表
	 */
	private Tech  tech;
	/**
	 * 工作流
	 */
	private WorkFlow workFlow;
	/**
	 * 项目里面技术和人对应的表
	 * @return
	 */
	private List<TechAndArVo> techAndArVos;
	/**
	 * 总计
	 * @return
	 */
	private int count ;
	@Override
	public String toString() {
		return "TechVo [suppliers=" + suppliers + ", techs=" + techs + ", hsenior=" + hsenior + ", hmiddle=" + hmiddle
				+ ", hlow=" + hlow + ", ssenior=" + ssenior + ", smiddle=" + smiddle + ", slow=" + slow + ", artisan="
				+ artisan + ", project=" + project + ", supplier=" + supplier + ", tech=" + tech + ", workFlow="
				+ workFlow + ", techAndArVos=" + techAndArVos + ", count=" + count + "]";
	}
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	public List<Tech> getTechs() {
		return techs;
	}
	public void setTechs(List<Tech> techs) {
		this.techs = techs;
	}
	public int getHsenior() {
		return hsenior;
	}
	public void setHsenior(int hsenior) {
		this.hsenior = hsenior;
	}
	public int getHmiddle() {
		return hmiddle;
	}
	public void setHmiddle(int hmiddle) {
		this.hmiddle = hmiddle;
	}
	public int getHlow() {
		return hlow;
	}
	public void setHlow(int hlow) {
		this.hlow = hlow;
	}
	public int getSsenior() {
		return ssenior;
	}
	public void setSsenior(int ssenior) {
		this.ssenior = ssenior;
	}
	public int getSmiddle() {
		return smiddle;
	}
	public void setSmiddle(int smiddle) {
		this.smiddle = smiddle;
	}
	public int getSlow() {
		return slow;
	}
	public void setSlow(int slow) {
		this.slow = slow;
	}
	public Artisan getArtisan() {
		return artisan;
	}
	public void setArtisan(Artisan artisan) {
		this.artisan = artisan;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Tech getTech() {
		return tech;
	}
	public void setTech(Tech tech) {
		this.tech = tech;
	}
	public WorkFlow getWorkFlow() {
		return workFlow;
	}
	public void setWorkFlow(WorkFlow workFlow) {
		this.workFlow = workFlow;
	}
	public List<TechAndArVo> getTechAndArVos() {
		return techAndArVos;
	}
	public void setTechAndArVos(List<TechAndArVo> techAndArVos) {
		this.techAndArVos = techAndArVos;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	
	
}
