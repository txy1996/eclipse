package entity;

/**
 * 用户角色关联表
 * 
 * @author 晓煜
 * @date2018年3月26日下午3:46:40
 * @version
 * @explain
 */
public class UserAndRole {
	private int id;
	private int user_id;
	private int role_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public UserAndRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param id
	 *            主键 id
	 * @param user_id
	 *            用户id外键
	 * @param role_id
	 *            角色id外键
	 */
	public UserAndRole(int id, int user_id, int role_id) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.role_id = role_id;
	}

}
