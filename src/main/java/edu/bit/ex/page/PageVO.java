package edu.bit.ex.page;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.ToString;

@ToString
public class PageVO {
	
	private int startPage;
	private int endPage;
	private boolean prev , next;
	
	private int total;
	private Criteria cri; //Criteria 안에는 페이지에서 보여주는 데이터수(amount)와 현재 페이지번호(pageNum) 보유
	
	
	public PageVO(Criteria cri , int total) {
		this.cri = cri;
		this.total = total;
		
		this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0))*10;
		
		this.startPage = this.endPage -9;
		
		int realEnd = (int)(Math.ceil((total * 1.0)/cri.getAmount()));
		
		if(realEnd <=this.endPage) {
			this.endPage = realEnd;
		}
		
		
		this.prev = this.startPage > 1;
		
		this.next = this.endPage < realEnd;
	}
	
	 public String makeQuery(int page) {
         UriComponents uriComponentsBuilder = UriComponentsBuilder.newInstance().queryParam("pageNum", page) // pageNum = 3
               .queryParam("amount", cri.getAmount()) // pageNum=3&amount=10
               .build(); // ?pageNum=3&amount=10
         return uriComponentsBuilder.toUriString(); // ?pageNum=3&amount=10 리턴 
      }

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	 

}
