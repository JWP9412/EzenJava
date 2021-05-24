package section02.s01;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCycle extends Application{
	public LifeCycle() {
		System.out.println(Thread.currentThread().getName() +" : LifeCycle() ȣ��");
	}
	
	@Override
	public void init() throws Exception{
		System.out.println(Thread.currentThread().getName() +" : init() ȣ��");
	}
	
	@Override
	public void start(Stage ps) throws Exception{
		System.out.println(Thread.currentThread().getName() +" : start() ȣ��");
		ps.show();
	}
	
	@Override
	public void stop() throws Exception{
		System.out.println(Thread.currentThread().getName() +" : stop() ȣ��");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() +" : main() ȣ��");
		launch(args);

	}

}
