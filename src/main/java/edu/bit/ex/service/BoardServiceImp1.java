package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
@Log4j
@Service
@AllArgsConstructor //생성자로 담고 있다 new 생성안해주어도 됨

public class BoardServiceImp1 implements BoardService{

	//@Autowired
	//@Inject
	private BoardMapper mapper; //맵퍼를 호출한다.
	
	@Override
	public List<BoardVO> getList(){
		
		
		return mapper.getList();
		
	}

	@Override
	public void writeBoard(BoardVO boardVO) {
		
		mapper.insert(boardVO);
	
		
		
	}

	
}

