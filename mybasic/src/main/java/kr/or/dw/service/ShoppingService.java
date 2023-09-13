package kr.or.dw.service;

import java.sql.SQLException;
import java.util.Map;

import kr.or.dw.command.SearchCriteria;

public interface ShoppingService {

	Map<String, Object> selectShoppingList(SearchCriteria cri) throws SQLException;

}
