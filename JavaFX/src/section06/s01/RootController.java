package section06.s01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController implements Initializable {
	@FXML private Slider sliderFx;
	@FXML private Label labelFx;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		sliderFx.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.printf("slideFx.valueProperty :old(%f), new(%f)\n",oldValue.doubleValue(),newValue.doubleValue());
				labelFx.setFont(new Font(newValue.doubleValue()));
			}
		});
		
	}

}
