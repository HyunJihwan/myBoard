package kr.or.dw.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.dw.command.PageMaker;
import kr.or.dw.command.SearchCriteria;
import kr.or.dw.dao.ShoppingDAO;
import kr.or.dw.vo.ShoppingVO;

@Service
public class ShoppingServiceImpl implements ShoppingService {
	
	@Autowired
	private ShoppingDAO shoppingDAO;
	
	@Override
	public Map<String, Object> selectShoppingList(SearchCriteria cri) throws SQLException {
		
		List<ShoppingVO> shoppingList = null;
		
		int offset = cri.getPageStartRowNum();
		int limit = cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		shoppingList = shoppingDAO.selectSearchShoppingList(cri,rowBounds);
		
		int totalCount = shoppingDAO.selectSearchShoppingListCount(cri);
		
		// PageMaker 생성
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(totalCount);
		
		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("shoppingList", shoppingList);
		dataMap.put("pageMaker",pageMaker);
		
		return dataMap;
		
		
	}
	
	
	
}
