class Page{
	int pageNo;
	String contentType;
	Article article;
	
	Page(){
	}
	
	Page(int pageNo,String contentType,Article article){
	this.pageNo=pageNo;
	this.contentType=contentType;
	this.article=article;
	}
	
	public void getPageInfo(){
		System.out.println("Page number is: "+pageNo);
		System.out.println("Page content type is: "+contentType+"\n");
		System.out.println("Page article info is: ");
		this.article.getArticleInfo();
	}

}