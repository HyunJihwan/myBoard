package kr.or.dw.vo;

import java.util.Date;

import lombok.Data;

@Data
public class ShoppingVO {
	
	private int sno;
	private String id;
	private String content;
	private String image;
	private String enabled;
	private Date regdate;
	private String product;
	
}
