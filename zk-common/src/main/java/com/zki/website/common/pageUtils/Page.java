package com.zki.website.common.pageUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Filename:    com.user.website.common.pageUtils.Page
 * Copyright:   Copyright (c)2017
 * Company:     北京众智科技有限公司
 *
 * @author: crazy
 * @version: 1.0
 * @since: JDK 1.8
 * Create at:  2017-07-07 20:59
 * Description:
 * <p/>
 * Modification History:
 * Date    Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-07-07  LPF      1.0     1.0 Version
 */
public class Page<E> implements java.io.Serializable{
	
	private int pageShow = 2; 
	private int totalPage;
	private int totalCount;
	private int start;
	private int nowPage;
	private List<E> result = Collections.emptyList();
	
	public int getStart() {
		start = (getNowPage()-1)*getPageShow();
		if(start<0){
			start = 0;
		}
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getPageShow() {
		return pageShow;
	}
	public void setPageShow(int pageShow) {
		this.pageShow = pageShow;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<E> getResult() {
		return result;
	}
	public void setResult(List<E> result) {
		this.result = result;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getTotalPage() {
		return  (int)Math.ceil(totalCount*1.0/pageShow);
	}
	public int getNowPage() {
		if(nowPage<=0)
			nowPage = 1;
		if(nowPage>getTotalPage())
			nowPage = getTotalPage();
		return nowPage;
	}
	@Override
	public String toString() {
		return "Page [pageShow=" + pageShow + ", totalPage=" + getTotalPage()
				+ ", totalCount=" + totalCount + ", nowPage=" + nowPage
				+ ", result=" + result + "]";
	}
	
	
}