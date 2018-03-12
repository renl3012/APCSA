package unit11;

public class Grade {
	private double value;
	
	public Grade(){
		value = 0.0;
	}
	
	public Grade(double val){
		value = val;
		getLetterGrade();
		getNumericGrade();
	}
	
	public String getLetterGrade(){
		String letterGrade = "";
		if (value >= 90.0){
			letterGrade = "A";
		}
		else if (value >= 80.0){
			letterGrade = "B";
		}
		else if (value >= 70.0){
			letterGrade = "C";
		}
		else if (value >= 60.0){
			letterGrade = "D";
		}else{
			letterGrade = "F";
		}
		return letterGrade;
	}
	
	public double getNumericGrade(){
		return value;
	}
	
	public String toString(){
		String output = "";
		output += getNumericGrade() + "\n" + getLetterGrade();
		return output;
	}
}
