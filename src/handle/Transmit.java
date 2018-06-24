package handle;

public class Transmit {
	private String str;
	private int no;
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public Transmit(String str,int no) {
		this.no = no;
		this.str = str;
	}
	
	
	
	public Transmit() {
		// TODO Auto-generated constructor stub
		this.no = -1;
	}
}
