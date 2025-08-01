class Movie{
	int movieId;
	String name;
	String language;
	String releaseDate;
	
	Movie(){
		
	}
	
	Movie(int movieId,String name,String language,String releaseDate){
	this.movieId=movieId;
	this.name=name;
	this.language=language;
	this.releaseDate=releaseDate;	
	}
	
	public void getMovieInfo(){
		System.out.println("Movie Id is: "+movieId);
		System.out.println("Movie name is: "+name);
		System.out.println("Movie language is: "+language);
		System.out.println("Movie release date is: "+releaseDate);
	}
}