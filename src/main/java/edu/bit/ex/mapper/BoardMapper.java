package edu.bit.ex.mapper;

import java.util.List; 

import edu.bit.ex.vo.BoardVO;

public interface BoardMapper {
	
public List<BoardVO> getList(); //�ڼ��� BoardMapper.xml�� �����Ѵ�. ���̹�Ƽ��!
//���̹�Ƽ�� ���� 3����Ʈ(preparedStatement, ResultSet, Connection) �Ƚ��־ �ȴ�.


public void insert(BoardVO boardVO);

	
	

}
