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
		Media media = new Media(getClass().getResource("media/nuc.wav").toString());
		
		
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
		
		mediaPlayer.setOnPlaying(()->{		//Playing ���°� �� �� ����
			btnPlay.setDisable(true); btnPause.setDisable(false); btnStop.setDisable(false);
		});
		
		mediaPlayer.setOnPaused(()->{		//Paused ���°� �� �� ����
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(false);
		});
		
		mediaPlayer.setOnEndOfMedia(()->{	//EndOfMedia ���°� �� �� ����
			endOfMedia = true;
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
		});
		
		mediaPlayer.setOnStopped(()->{	//Stoped ���°� �� �� ����
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
		});
		
		//��ư ActionEvent ó��
		btnPlay.setOnAction(event -> {
			if(endOfMedia) {									// EndOfMedia ������ ���
				mediaPlayer.stop();								// ��� ����
				mediaPlayer.seek(mediaPlayer.getStartTime());	// ����ð��� ó������ ����
			}
			mediaPlayer.play();
			endOfMedia = false;
		});
		btnPause.setOnAction(event->mediaPlayer.pause());
		btnStop.setOnAction(event->mediaPlayer.stop());
	}
}
