package org.test;

public class AxisBank implements HdfcBank,RbiBank {
	@Override
	public void fixed() {
System.out.println("fixed 5%");		
	}
	@Override
	public void saving() {
	System.out.println("saving 8%");	
	}
	@Override
	public void depost() {
		System.out.println("depost 5%");
	}
public static void main(String[] args) {
	AxisBank a=new AxisBank();
	a.saving();
	a.fixed();
	a.depost();
	
}
}
