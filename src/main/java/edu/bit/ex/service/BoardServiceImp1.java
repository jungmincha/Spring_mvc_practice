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

	@Override
	public BoardVO getBoard(int bno) {
		log.info("getBoard........");
		return mapper.read(bno);
	}

	@Override
	public BoardVO getReply(int bno1) {
		log.info("getReply........");
		return mapper.reply(bno1);
	}

	@Override
	public void replyBoard(BoardVO boardVO) {
		mapper.replyinsert(boardVO);
		
	}

	@Override
	public BoardVO upHit(int bno3) {
		log.info("upHit........");
		return mapper.uphit(bno3);
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


	@Override
	public void replyShape(BoardVO boardVO) {
		log.info("replyShape........");
		mapper.replyshape(boardVO);
	}
	
}

