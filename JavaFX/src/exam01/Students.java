package exam01;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Students {
	private String name;
	private Integer kor;
	private Integer math;
	private Integer eng;
	@FXML
	private TextField tf1;

	@FXML
	private TextField tf2;

	@FXML
	private TextField tf3;

	@FXML
	private TextField tf4;
	
	
	public void Students(TextField tf1, TextField tf2, TextField tf3, TextField tf4) {
		this.name = new String(tf1.getText());
		this.kor = new Integer(Integer.parseInt(tf2.getText()));
		this.math = new Integer(Integer.parseInt(tf3.getText()));
		this.eng = new Integer(Integer.parseInt(tf4.getText()));
		//this.eng = new Integer(eng);
	}
	public Students(String name, int kor, int math, int eng) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		//this.eng = new Integer(eng);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getKor() {
		return kor;
	}

	public void setKor(Integer kor) {
		this.kor = kor;
	}

	public Integer getMath() {
		return math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	public Integer getEng() {
		return eng;
	}

	public void setEng(Integer eng) {
		this.eng = eng;
	}
}
