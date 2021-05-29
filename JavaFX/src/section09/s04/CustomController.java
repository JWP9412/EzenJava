package section09.s04;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.filechooser.FileNameExtensionFilter;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CustomController implements Initializable {
	// @FXML private Button btnOk;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	private Stage ps;

	public void setPrimaryStage(Stage ps) {
		this.ps = ps;
	}
	//파일 열기 다이얼로그 실행
	public void handelOpenFileChooser(ActionEvent e) {
		FileChooser fc = new FileChooser();
		fc.getExtensionFilters().addAll(
				new ExtensionFilter("Text Files","*.txt"),
				new ExtensionFilter("Image Files","*.png","*.jpg"),
				new ExtensionFilter("Audio Files","*.wav","*.mp4"),
				new ExtensionFilter("All Files","*.*"));
		
		File selectedFile = fc.showOpenDialog(ps);
		if(selectedFile != null) {
			System.out.println(selectedFile.getPath());
		}
	}
	//파일 저장 다이얼로그 실행
	public void handleSaveFileChooser(ActionEvent e) {
		FileChooser fc = new FileChooser();
		fc.getExtensionFilters().add(new ExtensionFilter("All Files", "*.*"));
		File selectedFile = fc.showSaveDialog(ps);
		if(selectedFile != null) {
			System.out.println(selectedFile.getPath());
		}
	}
	
	//파일 저장 다이얼로그 실행
		public void handleDirectoryChooser(ActionEvent e) {
			DirectoryChooser dc = new DirectoryChooser();
			File selectedDir = dc.showDialog(ps);
			if(selectedDir != null) {
				System.out.println(selectedDir.getPath());
			}
		}
		//Popup 다이얼로그 실행
		public void handlePopup(ActionEvent e) throws Exception {
			Popup pu = new Popup();
			
			HBox hbox = (HBox) FXMLLoader.load(getClass().getResource("popup.fxml"));
			
			ImageView iv = new ImageView();
			iv.setImage(new Image(getClass().getResource("images/dialog_info.png").toString()));
			iv.setOnMouseClicked(event->pu.hide());
			Label MessageLabel = (Label) hbox.lookup("#MessageLabel");
			MessageLabel.setText("메시지가 왔씁니다");
			
			pu.getContent().add(hbox);
			pu.setAutoHide(true);
			pu.show(ps);
		}
		//커스텀 다이얼로그 실행
		
		public void handleCustom(ActionEvent e) throws Exception{
			Stage dlog = new Stage(StageStyle.UTILITY);
			dlog.initModality(Modality.WINDOW_MODAL);
			dlog.initOwner(ps);
			dlog.setTitle("확인");
			
			AnchorPane anchorPane =
					(AnchorPane) FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
			Label txtTitle = (Label)anchorPane.lookup("#txtTitle");
			txtTitle.setText("확인했냐?");
			Button btnOk = (Button)anchorPane.lookup("#btnOk");
			btnOk.setOnAction(event->dlog.close());
			
			Scene scene = new Scene(anchorPane);
			dlog.setScene(scene);
			dlog.setResizable(false);
			dlog.show();
		}
}



