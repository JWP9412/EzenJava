package section05.s01;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class EventHandlerExample extends Application{
	@Override
	public void start(Stage ps) throws Exception{
		HBox root = new HBox();
		root.setPrefSize(200, 50);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		Button btnOk = new Button("Ok");
		btnOk.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Ok Ŭ��");
				EventType<?> et = event.getEventType();
				System.out.println("EventType : "+et.getName());
			}
		});
		
		Button btn2 = new Button("��ư2");
		btn2.setOnAction(event->System.out.println("��ư2 Ŭ��"));
		
		root.getChildren().addAll(btnOk,btn2);	//HBox�� btn1,btn2�� �߰�
		Scene scene = new Scene(root);
		
		ps.setTitle("Page885");
		ps.setScene(scene);
		//ps.setOnCloseRequest(event->System.out.println("���α׷� ����"));
		ps.setOnHiding(event-> {System.out.println("Hidding");
				EventType<?> et = event.getEventType();
		System.out.println("EventType : "+et.getName());
		});
		
		ps.setOnCloseRequest((WindowEvent event)->
		{System.out.println("���α׷� ����");
		EventType<?> et = event.getEventType();
		System.out.println("EventType : "+et.getName());
		});
		ps.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
