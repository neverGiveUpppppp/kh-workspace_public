package com.fpj.trendeater.board.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fpj.trendeater.board.exception.BoardException;
import com.fpj.trendeater.board.model.service.BoardService;
import com.fpj.trendeater.board.model.vo.Board;
import com.fpj.trendeater.board.model.vo.PageInfo;
import com.fpj.trendeater.common.Pagination;

@Controller
public class BoardController {

	@Autowired
	private BoardService bService;
	
	// 게시물 조회 + 페이지네이션
	@RequestMapping("notice.bo") // menubar.jsp의 게시판 버튼의 url주소
	public ModelAndView boardList(@RequestParam(value="page", required=false) Integer page, ModelAndView mv) {
		
		// 넘겨받은 데이터 중에 currentPage가 있으면 currentPage에 받아온 currentPage값을 넣어줘야함
		int currentPage = 1; // currentPage
		
		if(page != null ) { // page가 int라 null 못들어감. 기존 방법이랑 다르게 값 넘어온게 있는지 여부만 체크하고 싶은 상황. 기존 방법은 받아온 값 자체를 체크하는 방식 : if(request.getParameter("currentPage") != null )
		// string으로 받아오면 파싱을 해야되는게 귀찮. 래퍼클래스 Integer 사용하면 모두 해결됨 
			currentPage = page;
		}
		
		// 페이징처리1 :총게시물수 가져오기
		int listCount = bService.getListCount(); 
		// 계산에 필요한 2가지가 갖춰짐 : currentPage, listCount
		
		
		// 페이징처리2 : 필요한 게시판 가져오기
		// PageInfo와 Pagination이 필요한 이유 : 강의 11:07 
		PageInfo pi = Pagination.getPageInfo(currentPage, listCount);
		
		ArrayList<Board> list = bService.getBoardList(pi);
		System.out.println("pi="+pi);
		System.out.println("list="+list); // 항상 디버깅 찍어보기
		
		if(list != null) {
		// model과 ModelAndView 둘 중 하나 선택가능
			mv.addObject("list",list);
			mv.addObject("pi",pi);
			mv.setViewName("boardListView");
		}else {
			throw new BoardException("게시글 전체 조회에 실패했습니다");
		}
		return mv;
	}
		
		
		
	
	
	
	
	
}




