/**
 * Supplier.java
 */
package mapper;

import java.util.List;

import entity.Supplier;

/**
 * @author SGY
 * @date 2018年3月26日
 */
public interface SupplierMapper {

	/**
	 * 插入供应商
	 * @param sup
	 */
	public void insert(Supplier sup);
	/**
	 * 根据id删除供应商
	 * @param id
	 */
	public void delete(int id);
	/**
	 * 查询所有供应商
	 * @return
	 */
	public List<Supplier> selectAll();
	/**
	 * 根据供应商id查询所有技术
	 * @return
	 */
	public List<Supplier> findBySupid(int supId);
	/**
	 * 根据供应商id查询
	 * @return
	 */
	public Supplier findBySupname(String supName);
	/**
	 * 全查供应商
	 * @return
	 */
	public List<Supplier> findAllSupplier();
	/**
	 * 根据供应商id查询所有技术
	 * @param su
	 * @return
	 */
	public Supplier findTechBySupplierId(Supplier su);
	
	
}
