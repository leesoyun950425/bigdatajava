package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //컨트롤러로 인식, servlet처럼 인식하기

public class LoginController {

	@RequestMapping("loginCheck") //로그인이라고 요청이 되면 무조건 밑에 있는 메소드 호출, 메소드 이름은 상관없다. 
	public void login(@RequestParam("id") String id, @RequestParam String pw) { 
		//RequestParam은 jsp에서 넘길 name과 일치해야한다. String id = request.getParameter("id");와 같다. 받아올 값과 변수명이 일치하면 ("pw")생략 가능
		System.out.println("입력한 id : "+id);
		System.out.println("입력한 pw : "+pw);
		System.out.println("로그인 처리 요청됨.");
		System.out.println("로그인 처리 완료.");
	}
	
	@RequestMapping("loginCheck2") //로그인이라고 요청이 되면 무조건 밑에 있는 메소드 호출, 메소드 이름은 상관없다. 
	public String login2(@RequestParam("id") String id, @RequestParam String pw) { 
		String sId = "root";
		String sPw = "1234";
		if(sId.equals(id) && sPw.equals(pw)) {
			return "loginOk";
		}else {
			return "loginNot";
		}
	}
	
	@RequestMapping("memberDetail")
	public void detail() {
		System.out.println("DAO의 db연동 처리");
		System.out.println("상세 정보 받아옴");
		System.out.println("views아래로 결과를 넘김.");
	}
	
	@RequestMapping("memberDelete")
	public void delete() {
		System.out.println("회원 정보 삭제됨.");
	}
}
