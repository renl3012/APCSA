package labAssessment11;

public class SongRatingsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SongRatings s = new SongRatings("3 - 4.5 2.9 3.2");
		System.out.println(s.average());
		System.out.println(s.highest());
		System.out.println(s.overallComment());
	}

}
