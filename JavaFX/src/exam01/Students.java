package exam01;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Students {
	private SimpleStringProperty name;
	private SimpleIntegerProperty kor;
	private SimpleIntegerProperty math;
	private SimpleIntegerProperty eng;
	@FXML
	private TextField tf1;

	@FXML
	private TextField tf2;

	@FXML
	private TextField tf3;

	@FXML
	private TextField tf4;
	
	
	public Students() {
		this.name = new SimpleStringProperty();//new String(tf1.getText());
		this.kor = new SimpleIntegerProperty();
		this.math = new SimpleIntegerProperty();//new Integer(Integer.parseInt(tf3.getText()));
		this.eng = new SimpleIntegerProperty();//new Integer(Integer.parseInt(tf4.getText()));
		//new Students(this.name=tf1.getText(),this.kor =Integer.parseInt(tf2.getText()),this.math =Integer.parseInt(tf3.getText()),this.eng=Integer.parseInt(tf4.getText()));
		//this.eng = new Integer(eng);
	} 
	/*
	public Students(TextField tf1, TextField tf2, TextField tf3, TextField tf4) {
		this.name = new SimpleStringProperty(tf1.getText());//new String(tf1.getText());
		this.kor = new SimpleIntegerProperty(Integer.parseInt(tf2.getText()));//new Integer(Integer.parseInt(tf2.getText()));
		this.math = new SimpleIntegerProperty(Integer.parseInt(tf3.getText()));//new Integer(Integer.parseInt(tf3.getText()));
		this.eng = new SimpleIntegerProperty(Integer.parseInt(tf4.getText()));//new Integer(Integer.parseInt(tf4.getText()));
		//new Students(this.name=tf1.getText(),this.kor =Integer.parseInt(tf2.getText()),this.math =Integer.parseInt(tf3.getText()),this.eng=Integer.parseInt(tf4.getText()));
		//this.eng = new Integer(eng);
	} 
	*/
	public Students(String name, int kor, int math, int eng) {
		this.name = new SimpleStringProperty(name);
		this.kor = new SimpleIntegerProperty(kor);
		this.math =new SimpleIntegerProperty(math);
		this.eng = new SimpleIntegerProperty(eng);
		//new Students(this.name = name,this.kor = kor,this.math = math,this.eng = eng);
		//this.eng = new Integer(eng);
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public Integer getKor() {
		return kor.get();
	}

	public void setKor(Integer kor) {
		this.kor.set(kor);
	}

	public Integer getMath() {
		return math.get();
	}

	public void setMath(Integer math) {
		this.math.set(math); 
	}

	public Integer getEng() {
		return eng.get();
	}

	public void setEng(Integer eng) {
		this.eng.set(eng);
	}
}
