package p035ru.unicorn.ujin.view.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.VideoView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.VideoController;

/* renamed from: ru.unicorn.ujin.view.activity.VideoPlayerActivity */
public class VideoPlayerActivity extends Activity implements VideoController.MediaPlayerControl {
    private static final String CURRENT_POSITION = "currentPosition";
    public static final String VIDEO_URL = "videoUrl";
    private boolean isFullScreen;
    private ProgressBar pbLoading;
    private int position = 0;
    private VideoController videoController;
    private VideoView videoView;

    public int getBufferPercentage() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        requestWindowFeature(1);
        setContentView(R.layout.video_player_activity);
        this.pbLoading = (ProgressBar) findViewById(R.id.pbLoading);
        this.videoView = (VideoView) findViewById(R.id.video_view);
        this.videoController = new VideoController(this);
        try {
            this.videoView.setVideoURI(Uri.parse(getIntent().getStringExtra(VIDEO_URL)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.videoView.requestFocus();
        this.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoPlayerActivity.this.lambda$onCreate$1$VideoPlayerActivity(mediaPlayer);
            }
        });
        if (getResources().getConfiguration().orientation != 2) {
            z = false;
        }
        this.isFullScreen = z;
    }

    public /* synthetic */ void lambda$onCreate$1$VideoPlayerActivity(MediaPlayer mediaPlayer) {
        this.pbLoading.setVisibility(8);
        this.videoController.setMediaPlayer(this);
        this.videoView.seekTo(this.position);
        this.videoView.start();
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                VideoPlayerActivity.this.lambda$null$0$VideoPlayerActivity(mediaPlayer, i, i2);
            }
        });
    }

    public /* synthetic */ void lambda$null$0$VideoPlayerActivity(MediaPlayer mediaPlayer, int i, int i2) {
        this.videoController.setAnchorView((ViewGroup) findViewById(R.id.video_frame_layout));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.videoController.show();
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(CURRENT_POSITION, this.videoView.getCurrentPosition());
        this.videoView.pause();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.position = bundle.getInt(CURRENT_POSITION);
        this.videoView.seekTo(this.position);
    }

    public void start() {
        this.videoView.start();
    }

    public void pause() {
        this.videoView.pause();
    }

    public int getDuration() {
        return this.videoView.getDuration();
    }

    public int getCurrentPosition() {
        return this.videoView.getCurrentPosition();
    }

    public void seekTo(int i) {
        this.videoView.seekTo(i);
    }

    public boolean isPlaying() {
        return this.videoView.isPlaying();
    }

    public boolean isFullScreen() {
        return this.isFullScreen;
    }

    public void toggleFullScreen() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags ^= 1024;
        getWindow().setAttributes(attributes);
        if (this.isFullScreen) {
            setRequestedOrientation(10);
            this.isFullScreen = false;
            return;
        }
        setRequestedOrientation(0);
        this.isFullScreen = true;
    }

    public static void start(Context context, String str) {
        Intent intent = new Intent(context, VideoPlayerActivity.class);
        intent.putExtra(VIDEO_URL, str);
        context.startActivity(intent);
    }
}
