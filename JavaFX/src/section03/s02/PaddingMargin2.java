package section03.s02;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class PaddingMargin2 extends Application {
	@Override
	public void start(Stage ps) throws Exception {
		// �е�����
		/*
		 * HBox hbox = new HBox(); hbox.setPadding(new Insets(50, 10, 10, 50));
		 * hbox.setSpacing(10); Button btn = new Button(); btn.setText("��ư1");
		 * btn.setPrefSize(100, 100);
		 * 
		 * Button btn2 = new Button(); btn2.setText("��ư2"); btn2.setPrefSize(100, 100);
		 * //btn2.setLineSpacing(0);
		 */
		// ���� ����

		HBox hbox = new HBox();

		Button btn = new Button();
		btn.setText("��ư1");
		btn.setPrefSize(100, 100);
		HBox.setMargin(btn, new Insets(10, 10, 50, 50));

		Button btn2 = new Button();
		btn2.setText("��ư2");
		btn2.setPrefSize(100, 100);

		hbox.getChildren().add(btn);
		hbox.getChildren().add(btn2);

		Scene scene = new Scene(hbox);

		ps.setTitle("margin,padding");
		ps.setScene(scene);
		ps.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
