package kr.or.dw.controller;

import java.sql.SQLException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.dw.command.SearchCriteria;
import kr.or.dw.service.UserBoardService;

@Controller
@RequestMapping("/userboard")
public class UserBoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserBoardController.class);
	
	@Autowired
	private UserBoardService userboardService;
	
	
	@RequestMapping("/list")
	public ModelAndView list(SearchCriteria cri, ModelAndView mnv) throws SQLException {
		
		String url = "userboard/list.open";
		Map<String, Object> dataMap = userboardService.selectBoardList(cri);
		
		mnv.addAllObjects(dataMap);
		mnv.setViewName(url);
		
		
		return mnv;
				
	}
	
	
}
