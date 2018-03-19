package labAssessment11;

public class SongRating {
	private double stars;
	
	public SongRating(){
		stars = 0.0;
		getRating();
	}
	
	public SongRating(double s){
		stars = s;
	}
	
	public String getComment(double s){
		String comment = "";
		if (s == 5.0){
			comment = "Superb";
		}
		else if (s > 5.0){
			comment = "The highest possible rating is 5 stars.";
		}
		else if (s >= 4.0){
			comment = "Excellent";
		}
		else if (s >= 3.0){
			comment = "Pretty good";
		}
		else if (s >= 2.0){
			comment = "Not great";
		}else if (s > 0.0){
			comment = "Just terrible";
		}
		return comment;
	}
	
	public double getRating(){
		return stars;
	}
	
	public String toString(){
		String output = "";
		output += getRating() + "\n" + getComment(stars);
		return output;
	}
}
