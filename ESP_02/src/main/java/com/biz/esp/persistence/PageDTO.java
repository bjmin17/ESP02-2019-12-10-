package com.biz.esp.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PageDTO {
	private long totalCount;	// 전체 데이터 개수
	
	private long litsPerPage;	// 한페이지에 보여질 데이터 개수
	private long pageCount;		// 현재페이지 하단에 보여질 페이지번호 리스트 개수
	
	private long firstPageNo;	// 전체데이터의 첫페이지 번호(일반적으로 1)
	private long finalPageNo;	// 전체데이터의 마지막 페이지 번호(계산결과)
	
	private long prePageNo;		// 이전페이지
	private long startPageNo;	// 보여지는 리스트의 시작페이지 번호
	
	private long nextPageNo;	// 다음페이지
	private long endPageNo;		// 보여지는 리스트의 끝 번호
	
	private long currentPageNo;	// 현재 선택된 페이지 번호

}
