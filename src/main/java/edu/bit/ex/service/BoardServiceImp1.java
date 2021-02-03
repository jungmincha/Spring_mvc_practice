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

public class BoardServiceImp1 implements BoardService{ //������ ��������Ѵ�.

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

	@Override
	public BoardVO getBoard(int bno) {
		log.info("getBoard........");
		mapper.uphit(bno);
		return mapper.read(bno);
	}

	@Override
	public BoardVO getReply(int bno1) {
		log.info("getReply........");
		return mapper.reply(bno1);
	}

	@Override
	public void replyBoard(BoardVO boardVO) {
		log.info("replyBoard........");
		mapper.replyinsert(boardVO);
		mapper.replyshape(boardVO);
		
	}
	



	@Override
	public void inputDelete(int bno4) {
		log.info("delete........");
		mapper.delete(bno4);
	}

	@Override
	public void modifyBoard(BoardVO boardVO) {
		log.info("modify........");
		mapper.modify(boardVO);
	}



	
}

