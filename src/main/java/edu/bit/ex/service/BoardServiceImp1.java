package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
@Log4j
@Service
@AllArgsConstructor //�����ڷ� ��� �ִ� new ���������־ ��

public class BoardServiceImp1 implements BoardService{

	//@Autowired
	//@Inject
	private BoardMapper mapper; //���۸� ȣ���Ѵ�.
	
	@Override
	public List<BoardVO> getList(){
		
		
		return mapper.getList();
		
	}

	@Override
	public void writeBoard(BoardVO boardVO) {
		
		mapper.insert(boardVO);
	
		
		
	}

	
}

