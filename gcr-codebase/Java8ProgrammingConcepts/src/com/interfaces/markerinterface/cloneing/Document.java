package com.interfaces.markerinterface.cloneing;

class Document implements Cloneable {

	String title;
	String content;

	public Document(String title, String content) {
		this.title = title;
		this.content = content;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // shallow copy
	}

	@Override
	public String toString() {
		return "Document [title=" + title + ", content=" + content + "]";
	}
}
