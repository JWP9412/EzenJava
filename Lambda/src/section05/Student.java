package section05;

public class Student {
	private String name;
	private int engScore;
	private int mathScore;
	private String sex;
	private int score;
	
	public Student(String name, String sex,int score) {
		this.name = name;
		this.sex = sex;
		this.score =score;
	}
	public Student(String name, int engScore, int mathScore) {
		this.name =name;
		this.engScore= engScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {return name;}
	public int getEngScore() {return engScore;}
	public int getMathScore() {return mathScore;}
	public String getSex() {return sex;}
	public int getScore() {return score;}
	
	public void setName(String name) {this.name = name;}
	public void setEngScore(int engScore) {this.engScore = engScore;}
	public void setMathScore(int mathScore) {this.mathScore = mathScore;}
}
