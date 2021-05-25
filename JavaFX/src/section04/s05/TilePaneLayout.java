package section04.s05;
/*
 * TilePane Container Layout
 * 	- ��Ʈ���� ���ӵ� ������ ��ġ�ϴ� ���̾ƿ�
 * 	- ���ʿ��� �������� �����ؼ� ��ġ
 * 	- ������ �������� ������ ������ �����ؼ� ��ġ
 * 	- ������ ��(Ÿ��) ũ�⸦ ���´�.
 */	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TilePaneLayout extends Application {
	@Override
	public void start(Stage ps) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		
		ps.setTitle("FlowPane Container Layout");
		ps.setScene(scene);
		ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
