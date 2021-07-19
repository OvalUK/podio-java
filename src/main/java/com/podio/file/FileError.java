package com.podio.file;

public class FileError {

	private int code;

	private String message;

	@Override
	public String toString() {
		return "FileError [code=" + code + ", message=" + message + "]";
	}

	public long getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
