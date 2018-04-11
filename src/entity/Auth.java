package entity;
/**
 * 权限表，也可以叫功能表
 * 
 * @author 晓煜
 * @date2018年3月26日下午3:31:23
 * @version
 * @explain
 */
public class Auth {
	private int id;
	private String auth_name;
	private String auth_type;
	private String url;
	private String percode;
	private int parentid;
	private String parentids;
	private String sortstring;
	private int available;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuth_name() {
		return auth_name;
	}

	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}

	public String getAuth_type() {
		return auth_type;
	}

	public void setAuth_type(String auth_type) {
		this.auth_type = auth_type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPercode() {
		return percode;
	}

	public void setPercode(String percode) {
		this.percode = percode;
	}

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	public String getParentids() {
		return parentids;
	}

	public void setParentids(String parentids) {
		this.parentids = parentids;
	}

	public String getSortstring() {
		return sortstring;
	}

	public void setSortstring(String sortstring) {
		this.sortstring = sortstring;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public Auth() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param id
	 *            权限id,主键
	 * @param auth_name
	 *            资源名称
	 * @param auth_type
	 *            资源类型
	 * @param url
	 *            访问url地址
	 * @param percode
	 *            权限代码字符串
	 * @param parentid
	 *            父结点id
	 * @param parentids
	 *            父结点id列表串
	 * @param sortstring
	 *            排序号
	 * @param available
	 *            是否可用,1：可用，0不可用
	 */
	public Auth(int id, String auth_name, String auth_type, String url, String percode, int parentid, String parentids,
			String sortstring, int available) {
		super();
		this.id = id;
		this.auth_name = auth_name;
		this.auth_type = auth_type;
		this.url = url;
		this.percode = percode;
		this.parentid = parentid;
		this.parentids = parentids;
		this.sortstring = sortstring;
		this.available = available;
	}

	@Override
	public String toString() {
		return "Auth [id=" + id + ", auth_name=" + auth_name + ", auth_type=" + auth_type + ", url=" + url
				+ ", percode=" + percode + ", parentid=" + parentid + ", parentids=" + parentids + ", sortstring="
				+ sortstring + ", available=" + available + "]";
	}
	
}
