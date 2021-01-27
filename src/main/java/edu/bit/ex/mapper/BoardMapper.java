package edu.bit.ex.mapper;

import java.util.List; 

import edu.bit.ex.vo.BoardVO;

public interface BoardMapper {
	
public List<BoardVO> getList(); //자손을 BoardMapper.xml로 구현한다. 마이바티스!
//마이바티스 문법 3종세트(preparedStatement, ResultSet, Connection) 안써주어도 된다.


public void insert(BoardVO boardVO);

	
	

}
