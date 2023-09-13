package kr.or.dw.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import kr.or.dw.command.SearchCriteria;
import kr.or.dw.vo.ShoppingVO;

@Mapper
public interface ShoppingDAO {

	List<ShoppingVO> selectSearchShoppingList(SearchCriteria cri, RowBounds rowBounds) throws SQLException;

	int selectSearchShoppingListCount(SearchCriteria cri) throws SQLException;
	
}
