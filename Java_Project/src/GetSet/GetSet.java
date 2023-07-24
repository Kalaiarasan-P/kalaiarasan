package GetSet;

public class GetSet {
	private int r_no;
	private String name;
	
	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void display() {
		System.out.println(r_no+" "+name);
	}
		
}
