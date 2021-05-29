package section11.s02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class TaskController2 implements Initializable{
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

    private Task<Integer> task;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnStart.setOnAction(event->handleBtnStart(event));
		btnStop.setOnAction(event->handleBtnStop(event));
	}
	
	public void handleBtnStart(ActionEvent e) {
		task = new Task<Integer>(){
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
		};
	bar.progressProperty().bind(task.progressProperty());
	lblWorkDone.textProperty().bind(task.messageProperty());
	
	Thread thread = new Thread(task);
	thread.setDaemon(true);
	thread.start();
	}
	
	public void handleBtnStop(ActionEvent e) {
		task.cancel();
	}
}
