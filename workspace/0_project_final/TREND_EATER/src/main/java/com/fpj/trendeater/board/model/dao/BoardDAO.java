package com.fpj.trendeater.board.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.fpj.trendeater.board.model.vo.Board;
import com.fpj.trendeater.board.model.vo.PageInfo;
import com.fpj.trendeater.board.model.vo.Reply;


@Repository("bDAO")
public class BoardDAO {

	
/******************** 페이징처리 ********************/ 	
	
	// 페이징처리1 :총게시물수 가져오기
	public int getListCount(SqlSessionTemplate sqlSession) {
		
		return sqlSession.selectOne("boardMapper.getListCount");
	}

	// 페이징처리2 : 원하는 게시판 번호 조회
	public ArrayList<Board> getBoardList(SqlSessionTemplate sqlSession, PageInfo pi) {
		
		// RowBounds관련 설명은 아래에
		// 게시판 몇개를 건너 뛸지 계산하는게 핵심
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());  // 임포트 RowBounds 
		
//		ArrayList<Board> list = (ArrayList)session.selectList("boardMapper.selectBoardList", null, rowBounds); // 쿼리문에 데이터 넣을만한 위치홀더가 없어서 null
		// 전달할게 없는데 로우바운즈는 필요하니까 인자3개짜리 쓴 것
		
		
		return (ArrayList)sqlSession.selectList("boardMapper.getBoardList", null, rowBounds);
	}
	// 시작행(startRow) 끝행(endRow) 만든이유
			// 몇번째부터 몇번째행까지 가져올지 정하기 위해서 startRow, endRow 만듬
			// ex) 2페이지 11-20 가져오기
//			int startRow = (pi.getCurrentPage() - 1) * pi.getBoardLimit() + 1;  
//			int endRow = startRow + pi.getBoardLimit() - 1;
			/* 1일 때 1 2일때 11 3일 때 21 나와야함. cpx10 1일 때 10 2일때는 20 3일 때는 30의 스타트로우가 발생할 것임. 
			   cp자체에다가 -1먼저 해주게 되면 1이 아니라 0 2가 아니라 1 3이 아니라 2가 들어가게 됨. 곱하기 10을 하는 것도
			   0 10 20이 들어가게됨 여기에 마지막에 +1만 하면 1 11이 나옴 */
			
			
			/*
			 myBatis에서의 페이징처리 수 계산    		 강의 11:26-35
			 
			 RowBounds
			 jdbc에서 몇번째부터 몇번째행까지 가져올지 정하기 위해서 시작행(startRow) 끝행(endRow) 만들었다. 
			 jdbc꺼랑 마이바티스랑 계산이 다름
			 
			 
			 RowBounds는
			 1페이지 5개 그다음꺼 5개면 10, 그다음꺼 5개 가져올려면 15 
			  	- RowBounds 계산 key포인트 : 앞에 몇개를 건너뛴 다음에 몇개를 가져올지
			 
			 RowBounds(m,n) :  m개를 건너 뛰고 n개의  게시물을 가져오겠다
			
				5(n-1)
			 1page - 0개         0개 건너띔
			 2page - 5개         5개 건너뜀 (2-10) * 5개
			 3page - 10개	10개 건너뜀 (3-1) * 5개
			 
			 5는 보드리미트. 한페이지에 5개가 보이니까 5개를 건너뛰는것
			 
			 ROWNUM과 인라인뷰 쓸 필요 없이 Rowbounds로 해결가능
			 
			 */
	

	
/********************* 게시판 글쓰기 *********************/ 
	

	public int insertBoard(SqlSessionTemplate sqlSession, Board b) {
		return sqlSession.insert("boardMapper.insertBoard",b);
	}

//	SqlSessionTemplate 대신 sqlsession만 썼다는데 웹페이지가 잘돌아갔다. why?
//			
//	임포트한거 보면 SqlSessionTemplate스프링에서 관리하는 마이바티스에서 관리
//				sqlsession은 마이바티스에서 가져오는거임
//			스프링이 관장해야하는데 마이바티스가 스스로 움직이게 되니 누가 관리하느냐 차이가 달라짐
			

	public int addReadCount(SqlSessionTemplate sqlSession, int bId) {
		return sqlSession.update("boardMapper.addReadCount",bId);
	}

	public Board selectBoard(SqlSessionTemplate sqlSession, int bId) {
		return sqlSession.selectOne("boardMapper.selectBoard",bId);
	}

	public int updateBoard(SqlSessionTemplate sqlSession, Board b) {
		return sqlSession.update("boardMapper.updateBoard",b);
	}

	public int deleteBoard(SqlSessionTemplate sqlSession, int bId) {	// update status='N'도 가능 
		return sqlSession.delete("boardMapper.deleteBoard",bId);
	}

	// 댓글 쓰기 : insert
	public int insertReply(SqlSessionTemplate sqlSession, Reply r) {
		return sqlSession.insert("boardMapper.insertReply", r);
	}
	// 댓글 가져오기 : selectList
	public ArrayList<Reply> selectReplyList(SqlSessionTemplate sqlSession, int bId) {
		return (ArrayList)sqlSession.selectList("boardMapper.selectReplyList", bId);
	}

	// Top-N 분석 : select
	public ArrayList<Board> topList(SqlSessionTemplate sqlSession) {
		return (ArrayList)sqlSession.selectList("boardMapper.topList");
	}

	
	
	
	
}
