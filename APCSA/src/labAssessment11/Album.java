package labAssessment11;

public class Album {
	String albumName;
	Song[] album;
	
	public Album(){
		albumName = "";
	}
	
	public Album(String name, int numSongs){
		albumName = name;
		album = new Song[numSongs];
	}
	
	public void addSong(int place, Song s){
		album[place] = s;
	}
	
	public String toString(){
		String output = albumName + ":";
		for (int i = 0; i < album.length; i++){
			output += "\n" + album[i].getName() + ": Rating = " + album[i].getAverage() + album[i].comment();
		}
		return output;
	}
}
