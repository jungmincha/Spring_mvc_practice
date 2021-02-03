package edu.bit.ex.page;

import lombok.ToString;

@ToString
public class Criteria {
	
	private int pageNum; //������ ��ȣ
	private int amount; //�� �������� �� ���� �����͸� ó���� ������ �ٷ�� ����
	
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
