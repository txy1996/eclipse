package mapper;

import java.util.List;

import entity.Dept;

/**
 * 部门表接口
 * 
 * @author 晓煜
 * @date2018年3月27日下午5:29:29
 * @version
 * @explain
 */
public interface DeptMapper {
	/**
	 * 查询所有部门
	 * 
	 * @return
	 */
	public List<Dept> listDept();
	/**
	 * 增加部门
	 * @param dept
	 */
	public void saveDept(Dept dept);
	/**
	 * 删除部门
	 * @param dept
	 */
	public void removeDept(Dept  dept);
	
}
