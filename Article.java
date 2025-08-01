class Article{
	int articleId;
	String title;
	String author;
	int wordCount;
	
	Article(){
		
	}
	
	Article(int articleId,String title,String author,int wordCount){
	this.articleId=articleId;
	this.title=title;
	this.author=author;
	this.wordCount=wordCount;	
	}
	
	public void getArticleInfo(){
		System.out.println("Article Id is: "+articleId);
		System.out.println("Article title is: "+title);
		System.out.println("Article author is: "+author);
		System.out.println("Article wordCount is: "+wordCount);
	}
}