package java19;

public class Border {
	String title;
	String content;
	String id;
	String pw;
	public Border(String title, String content, String id, String pw) {
		super();
		this.title = title;
		this.content = content;
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Border [title=" + title + ", content=" + content + ", id=" + id + ", pw=" + pw + "]";
	}
}
