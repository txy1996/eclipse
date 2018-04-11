package entity;

/**
 * 角色权限关联表
 * 
 * @author 晓煜
 * @date2018年3月26日下午3:44:49
 * @version
 * @explain
 */
public class RoleAndAuth {
	private int id;
	private int role_id;
	private int auth_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(int auth_id) {
		this.auth_id = auth_id;
	}

	public RoleAndAuth() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param id
	 *            主键 id
	 * @param role_id
	 *            角色id，外键
	 * @param auth_id
	 *            权限id,外键
	 */
	public RoleAndAuth(int id, int role_id, int auth_id) {
		super();
		this.id = id;
		this.role_id = role_id;
		this.auth_id = auth_id;
	}

}
