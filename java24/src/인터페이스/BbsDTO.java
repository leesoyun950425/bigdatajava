package �������̽�;

public class BbsDTO {
	private String id;
	private String pw;
	private String name;
	private String addr;
	
	
	public BbsDTO(String id, String pw, String name, String addr) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addr = addr;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "BbsDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
	
}
