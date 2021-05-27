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

public class EventHandlerExample2 extends Application{
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
				System.out.println("Ok 클릭");
				EventType<?> et = event.getEventType();
				System.out.println("EventType : "+et.getName());
			}
		});
		
		Button btnCan = new Button("Cancle");
		btnCan.setOnAction(event->System.out.println("Cancle 클릭"));
		btnCan.setOnAction(event->{
			System.out.println("Cancle 클릭");
			EventType<?> et = event.getEventType();
			System.out.println("EventType : "+et.getName());
		});
		
		//root.getChildren().addAll(btnOk,btnCan);	//HBox에 btnOk,btnCan를 추가
		root.getChildren().add(btnOk);
		root.getChildren().add(btnCan);
		Scene scene = new Scene(root);
		
		ps.setTitle("Page885");
		ps.setScene(scene);
		//ps.setOnCloseRequest(event->System.out.println("프로그램 종료"));
		ps.setOnHiding(event-> {System.out.println("Hidding");
				EventType<?> et = event.getEventType();
		System.out.println("EventType : "+et.getName());
		});
		
		ps.setOnCloseRequest((WindowEvent event)->
		{System.out.println("프로그램 종료");
		EventType<?> et = event.getEventType();
		System.out.println("EventType : "+et.getName());
		});
		ps.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
