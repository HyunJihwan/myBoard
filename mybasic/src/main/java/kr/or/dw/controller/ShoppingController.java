package kr.or.dw.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.dw.command.SearchCriteria;
import kr.or.dw.service.ShoppingService;
import kr.or.dw.vo.ShoppingVO;

@Controller
@RequestMapping("/shopping")
public class ShoppingController {
	
	@Autowired
	private ShoppingService shoppingService;
	
	private static final Logger logger = LoggerFactory.getLogger(ShoppingController.class);
	
	@RequestMapping("/main")
	public String main() {
		String url = "shopping/main.open";
		
		return url;
	}
	
	@RequestMapping("/list")
	public ModelAndView list (SearchCriteria cri, ModelAndView mnv) throws SQLException {
		String url = "shopping/list.open";
		
		Map<String, Object> dataMap = shoppingService.selectShoppingList(cri);
		
		mnv.addAllObjects(dataMap);
		mnv.setViewName(url);
		
		return mnv;
		
	}
	
	
}
