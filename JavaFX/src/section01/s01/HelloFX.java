package section01.s01;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloFX extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.show(); // 윈도우 보여주기
	}
	public static void main(String[] args) {
		launch(args);
	}
}
