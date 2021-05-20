package section05;

public class Student {
	private String name;
	private int engScore;
	private int mathScore;
	
	public Student(String name, int engScore, int mathScore) {
		this.name =name;
		this.engScore= engScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {return name;}
	public int getEngScore() {return engScore;}
	public int getMathScore() {return mathScore;}

	public void setName(String name) {this.name = name;}
	public void setEngScore(int engScore) {this.engScore = engScore;}
	public void setMathScore(int mathScore) {this.mathScore = mathScore;}
}
