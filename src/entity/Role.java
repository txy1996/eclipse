package entity;

import java.util.List;

/**
 * 角色表
 * 
 * @author 晓煜
 * @date2018年3月26日下午3:25:38
 * @version
 * @explain
 */
public class Role {
	private int id;
	private String role_name;
	private int available;
	private List<Auth> auths;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public List<Auth> getAuths() {
		return auths;
	}

	public void setAuths(List<Auth> auths) {
		this.auths = auths;
	}

	/**
	 * 
	 * @param id
	 *            角色id
	 * @param role_name
	 *            角色名称
	 * @param available
	 *            是否可用，1：不可用 0：可用
	 */
	
	public Role(int id, String role_name, int available) {
		super();
		this.id = id;
		this.role_name = role_name;
		this.available = available;
	}

	public Role(int id, String role_name, int available, List<Auth> auths) {
		super();
		this.id = id;
		this.role_name = role_name;
		this.available = available;
		this.auths = auths;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role_name=" + role_name + ", available=" + available + ", auths=" + auths + "]";
	}
	
}
