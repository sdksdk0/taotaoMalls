package cn.tf.taotao.search.pojo;

import java.util.List;

public class SearchResult {
	
	private Long recordCount;  //总记录数
	private List<Item>itemList;  //商品列表
	private long pageCount;  //分页总数
	private long curPage;  //当前页
	public Long getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(Long recordCount) {
		this.recordCount = recordCount;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public long getPageCount() {
		return pageCount;
	}
	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}
	public long getCurPage() {
		return curPage;
	}
	public void setCurPage(long curPage) {
		this.curPage = curPage;
	}
	
	


}
