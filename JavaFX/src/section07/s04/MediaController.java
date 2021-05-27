package section07.s04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Circle;

public class MediaController implements Initializable{
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	private boolean endOfMedia;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		// �̵�� ��ü ����
		//Media media = new Media(getClass().getResource("media/video.m4v").toString());
		Media media = new Media(getClass().getResource("media/audio.wav").toString());
		
		
		//�̵�� �÷��̾� ���� �� �̵�� �信 ����
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		
		//�ش� ���°� �Ǹ� ������ Runnable ����
		mediaPlayer.setOnReady(new Runnable() {
			
			@Override
			public void run() {
				btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
				
			}
		});
		
	}
	
	
}
