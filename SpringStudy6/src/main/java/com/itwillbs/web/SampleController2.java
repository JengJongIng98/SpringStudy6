package com.itwillbs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.MemberVO;



// @Controller : 해당 클래스를 컨트롤러 객체(빈)으로 인식하도록 설정 (servlet-context.xml)

@Controller
public class SampleController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	// * 메서드의 리턴타입이 String 일때, 문자열.jsp 뷰페이지를 연결
	
	// http://localhost:8088/web/doB
	@RequestMapping(value = "/doB",method = RequestMethod.GET)
	public String doB() {
		logger.debug(" /doB -> doB() 호출 ");
		
		//return null; // null일때는 void 리턴과 동일함
		return "itwill";
	}
	
	@RequestMapping(value = "/doB1",method = RequestMethod.GET)
	public String doB1() {
		logger.debug(" /doB1 -> doB1() 호출 ");
		
		//return null; // null일때는 void 리턴과 동일함
		return "itwill";
	}
	
	// http://localhost:8088/web/doB2
	// http://localhost:8088/web/doB2?msg=itwill
	
	@RequestMapping(value = "/doB2",method = RequestMethod.GET)
	public String doB2(@ModelAttribute("msg") String msg) {
		logger.debug(" /doB2 -> doB2() 호출 ");
		// request.getParameter("msg"); (x)
		
		logger.debug("msg : "+msg);
		
		return "itwill";
	}
	
	// http://localhost:8088/web/doB3?msg=itwill&id=20240101
	@RequestMapping(value = "/doB3",method = RequestMethod.GET)
	public String doB3(@ModelAttribute("msg") String msg,@ModelAttribute("id") int id) {
		logger.debug(" /doB3 -> doB3() 호출 ");
		
		logger.debug("msg : "+msg);
		logger.debug("id : "+id);
		
		return "itwill";
	}
	
	// * 컨트롤러는 파라메터 자동수집을 제공
	
	// http://localhost:8088/web/doB4?userid=itwill&userpw=20240101
	@RequestMapping(value = "/doB4")
	public String doB4(/* @ModelAttribute */MemberVO vo) {
	
//	(@ModelAttribute("userid") String userid,@ModelAttribute("userpw") String userpw)
	  
		logger.debug(" /doB4 -> doB4() 호출 ");
			
		
//		 logger.debug("msg : "+userid); logger.debug("id : "+userpw);
		
		logger.debug(" vo : "+vo);
		
		return "itwill";
	}
	
	
	// http://localhost:8088/web/doB5
	@RequestMapping(value = "/doB5")
	public String doB5(Model model /* MemberVO vo1 */) {
	  
		logger.debug(" /doB5 -> doB5() 호출 ");
		
		// MemberVO 객체 생성 => DAO의 메서드 리턴
		MemberVO vo = new MemberVO();
		vo.setUserid("ADMIN");
		vo.setUserpw("1234");
		
//		request.setAttribute(attributeName, attributeValue);
		model.addAttribute("vo1", vo);
		
		logger.debug(" vo : "+vo);
		
		return "itwill";
	}
	
	
}
