package jus.poc.prodcons.v1;

import jus.poc.prodcons.Message;

public class MessageX implements Message {
	
	private String msg;
	
	public MessageX(String msg){
		this.msg=msg;
		
	}
	
	public String toString(){
		
		return msg;
	}
}
