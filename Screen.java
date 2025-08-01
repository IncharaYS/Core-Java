class Screen{
	int screenId;
	String screenName;
	String type;
	Movie movie;
	
	Screen(){
		
	}
	
	Screen(int screenId,String screenName,String type,Movie movie){
	this.screenId=screenId;
	this.screenName=screenName;
	this.type=type;
	this.movie=movie;	
	}
	
	public void getScreenInfo(){
		System.out.println("Screen Id is:"+screenId);
		System.out.println("Screen name is:"+screenName);
		System.out.println("Screen type is:"+type+"\n");
		System.out.println("Screen movie info is:");
		this.movie.getMovieInfo();
	}
}