package kr.or.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.member.model.service.MemberService;
import kr.or.member.model.vo.Member;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	
	@Autowired //스프링이 서버시작시 자동으로 생성한 객체중 아래 변수와 일치하는 데이터타입의 객체를 찾아서 변수에 저장
	public MemberController() {
		super();
		System.out.println("controller 생성완료");
		
	}
	@RequestMapping(value="/login.do")
	public String login(Member member ,HttpSession session) {
		
		Member m = service.selectOneMember(member);
		if(m!=null) {
			session.setAttribute("m", m);
		}
		return "redirect:/";
				
	}


}
