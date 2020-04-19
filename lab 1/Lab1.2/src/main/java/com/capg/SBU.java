package com.capg;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	void printSBUDetails() {
		System.out.println("SBU Details= SBU"+"["+"sbuCode:"+sbuId+" "+"sbuHead:"+sbuHead+" "+"sbuName:"+sbuName+"]");
	}
	
}
