package section11.s03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class TaskController3 implements Initializable{
    @FXML
    private ProgressBar bar;

    @FXML
    private Label label;

    @FXML
    private Label lblWorkDone;
    
    @FXML
    private Label lblWorkResult;

    @FXML
    private Button btnStart;

    @FXML
    private Button btnStop;

    private TimeService timeService;
    private Task<Integer> task;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnStart.setOnAction(event->handleBtnStart(event));
		btnStop.setOnAction(event->handleBtnStop(event));
		timeService =new TimeService();
		timeService.start();
		
	}
	public void handleBtnStart(ActionEvent e) {
		timeService.restart();
		lblWorkResult.setText("");
	}
	
	public void handleBtnStop(ActionEvent e) {
		timeService.cancel();
	}
	class TimeService extends Service<Integer>{
		@Override
		protected Task<Integer> createTask(){
			Task<Integer> task = new Task<Integer>() {
				@Override
				protected Integer call() throws Exception{
					int result = 0;
					for(int i =0;i<=100;i++) {
						if(isCancelled()) {
							break;
							
						}
						result += i;
						updateProgress(i, 100);
						updateMessage(String.valueOf(i));
						try {Thread.sleep(100);}catch(Exception e) {
							if(isCancelled()) {
								break;
							}
						}
						
					}
					return result;
				}
			};
			bar.progressProperty().bind(task.progressProperty());
			lblWorkDone.textProperty().bind(task.messageProperty());
			return task;
		}
		@Override
		protected void running() {
			lblWorkResult.setText("진행 중....");
		}
		
		@Override
		protected void succeeded() {
			lblWorkResult.setText(String.valueOf(getValue()));
		}
		
		@Override
		protected void cancelled() {
			lblWorkResult.setText("취소됨");
		}
		@Override
		protected void failed() {
			lblWorkResult.setText("실패");
		}
	}
	
	
}
