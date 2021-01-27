package edu.bit.ex.mapper;

import java.util.List; 

import edu.bit.ex.vo.BoardVO;

public interface BoardMapper {
	
public List<BoardVO> getList(); //�ڼ��� BoardMapper.xml�� �����Ѵ�. ���̹�Ƽ��!
//���̹�Ƽ�� ���� 3����Ʈ(preparedStatement, ResultSet, Connection) �Ƚ��־ �ȴ�.


public void insert(BoardVO boardVO);


public BoardVO read(int bno);


public BoardVO reply(int bno1);


public void replyinsert(BoardVO boardVO);


public BoardVO uphit(int bno3);


public BoardVO delete(int bno4);


public void modify(BoardVO boardVO);


public void replyshape(BoardVO boardVO);

	
	

}
