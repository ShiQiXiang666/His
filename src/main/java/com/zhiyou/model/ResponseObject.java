package com.zhiyou.model;

public class ResponseObject {

	String code;
	
	String msg;
	
	Object obj;

	@Override
	public String toString() {
		return "ResponseObject [code=" + code + ", msg=" + msg + ", obj=" + obj + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}
