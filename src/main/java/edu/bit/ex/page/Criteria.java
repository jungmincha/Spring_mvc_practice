package edu.bit.ex.page;

import lombok.ToString;

@ToString
public class Criteria {
	
	private int pageNum; //페이지 번호
	private int amount; //한 페이지당 몇 개의 데이터를 처리할 것인지 다루는 변수
	
	public Criteria() {
		this(1, 10);
	}

	public Criteria(int pageNum, int amount) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
