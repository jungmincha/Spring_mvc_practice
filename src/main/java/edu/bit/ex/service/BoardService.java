package edu.bit.ex.service;

import java.util.List; 

import edu.bit.ex.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> getList();

	public void writeBoard(BoardVO boardVO);

	public BoardVO getBoard(int getbId);

	public BoardVO getReply(int getbId);

	public void replyBoard(BoardVO boardVO);

	public BoardVO upHit(int getbId);

	public void inputDelete(int getbId);

	public void modifyBoard(BoardVO boardVO);

	public void replyShape(BoardVO boardVO);
	
}
