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
import kr.or.dw.dao.UserBoardDAO;
import kr.or.dw.vo.BoardVO;

@Service
public class UserBoardServiceImpl implements UserBoardService {
	
	@Autowired
	private UserBoardDAO userboardDAO;
	
	
	@Override
	public Map<String, Object> selectBoardList(SearchCriteria cri) throws SQLException {
		
		List<BoardVO> boardList = null;
		
		int offset = cri.getPageStartRowNum();
		int limit = cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		boardList = userboardDAO.selectSearchBoardList(cri,rowBounds);
		
		
		// 전체 board 개수
				int totalCount = userboardDAO.selectSearchBoardListCount(cri);
				
				// PageMaker 생성
				PageMaker pageMaker = new PageMaker();
				pageMaker.setCri(cri);
				pageMaker.setTotalCount(totalCount);
				
				Map<String, Object> dataMap = new HashMap<String, Object>();
				dataMap.put("boardList", boardList);
				dataMap.put("pageMaker",pageMaker);
				
				return dataMap;
		
		
		
	}
	
}
