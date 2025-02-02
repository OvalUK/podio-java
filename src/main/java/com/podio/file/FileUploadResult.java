package com.podio.file;

import org.codehaus.jackson.annotate.JsonProperty;

public class FileUploadResult {

	private long fileId;

	@Override
	public String toString() {
		return "FileUploadResult [fileId=" + fileId + "]";
	}

	@JsonProperty("file_id")
	public long getFileId() {
		return fileId;
	}

	@JsonProperty("file_id")
	public void setFileId(long fileId) {
		this.fileId = fileId;
	}
}
