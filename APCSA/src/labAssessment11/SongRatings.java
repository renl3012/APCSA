package labAssessment11;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class SongRatings {
	public SongRating[] ratings;
	
	public SongRatings(){
		setRatings("");
	}
	
	public SongRatings(String ratingsList){
		setRatings(ratingsList);
		
	}
	
	public void setRatings(String ratingsList){
		Scanner s = new Scanner(ratingsList);
		int size = s.nextInt();
		ratings = new SongRating[size];
		
		ratingsList = ratingsList.substring(4, ratingsList.length());
		Scanner s2 = new Scanner(ratingsList);

		int spot = 0;
		for (int i = 0; i < size; i++){
			if (s.hasNextInt()){
				ratings[spot] = new SongRating((double)s.nextInt());
				spot++;
			}
			if (s.hasNextDouble()){
				ratings[spot] = new SongRating(s.nextDouble());
				spot++;
			}
		}
		
		s.close();
		s2.close();	
	}
	
	public void setRating(int spot, double rating){
		ratings[spot] = new SongRating(rating);
	}
	
	public double getSum(){
		double total = 0;
		for (int i = 0; i < ratings.length; i++){
			total += ratings[i].getRating();
		}
		return total;
	}
	
	public int numOfRatings(){
		return ratings.length;
	}
	
	public double highest(){
		double high = Double.MIN_VALUE;
		for (int i = 0; i < ratings.length; i++){
			if (ratings[i].getRating() > high){
				high = ratings[i].getRating();
			}
		}
		return high;
	}
	
	public double lowest(){
		double low = Double.MAX_VALUE;
		for (int i = 0; i < ratings.length; i++){
			if (ratings[i].getRating() < low){
				low = ratings[i].getRating();
			}
		}
		return low;
	}
	
	public double average(){
		double avg = getSum()/numOfRatings();
		return avg;
	}
	
	public String overallComment(){
		String comment = "";
		SongRating tempS = new SongRating();
		comment = tempS.getComment(average());
		return comment;
	}
}
