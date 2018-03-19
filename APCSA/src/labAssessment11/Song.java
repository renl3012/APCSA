package labAssessment11;

public class Song {

	private String songName;
	private SongRatings allRatings;
	private String stringRatings;
	
	public Song(){
		setName("");
		setRatings("");
	}
	
	public Song(String name, String rate){
		songName = name;
		stringRatings = rate;
		allRatings = new SongRatings(stringRatings);
	}
	
	public void setName(String name){
		songName = name;
	}
	
	public void setRatings(String rate){
		stringRatings = rate;
	}
	
	public String getName(){
		return songName;
	}
	
	public double getAverage(){
		return allRatings.getSum()/allRatings.numOfRatings();
	}
	
	public String comment(){
		return allRatings.overallComment();
	}
	public double highestRating(){
		return allRatings.highest();
	}
	
	public double lowestRating(){
		return allRatings.lowest();
	}
	
	public String toString(){
		String output = songName + "\n" + stringRatings + "\n" + comment();
		return output;
	}
}
