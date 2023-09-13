package com.board.domain;

import java.util.Date;

public class BoardVO {
	private int bno;
	private String title;
	private String writer;
	private String content;
	private Date regdate;
	private int viewcnt;
	private Date updatedate;
	private int replycnt;	// 댓글 개수
	
	public BoardVO() {}

	public BoardVO(int bno, String title, String writer, String content, Date regdate, int viewcnt, Date updatedate) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
		this.viewcnt = viewcnt;
		this.updatedate = updatedate;
	};
}
