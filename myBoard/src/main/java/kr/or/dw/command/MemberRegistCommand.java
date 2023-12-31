package kr.or.dw.command;

import kr.or.dw.vo.MemberVO;
import lombok.Data;

@Data
public class MemberRegistCommand {
	
	private String id;
	private String pwd;
	private String email;
	private String picture;
	private String[] phone;
	private String name;
	private String authority;
	
	public MemberVO toMemberVO() {
		String phone = "";
		
		for(String data : this.phone) {
			phone += data;
		};
		
		// MemberVO setting
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPwd(pwd);
		member.setEmail(email);
		member.setPicture(picture);
		member.setPhone(phone);
		member.setName(name);
		member.setAuthority(authority);
		
		return member;
	}
	
}
