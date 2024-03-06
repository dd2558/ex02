package com.study.erum.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter	
@ToString
public class PageDTO {
	private int page; // 현재페이지
	private int maxPage; // 전체 필요한페이지
	private int startPage; // 시작페이지값
	private int endPage; // 마지막페이지값
}
