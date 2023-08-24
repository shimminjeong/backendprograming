package kr.ac.kopo.board.vo;

import javax.validation.constraints.NotEmpty;
public class BoardVO {

	private int no;
	@NotEmpty(message = "title이 비어있습니다.")
	private String title;
	@NotEmpty(message = "writer이 비어있습니다. 필수항목입니다.")
	private String writer;
	@NotEmpty(message = "content이 비어있습니다. 필수항목입니다.")
	private String content;
	private String regdate;
	private int count;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + ", count=" + count + "]";
	}

}
