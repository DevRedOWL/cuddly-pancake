package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.drew.metadata.exif.makernotes.NikonType2MakernoteDirectory;
import java.lang.ref.WeakReference;
import java.util.Formatter;
import java.util.Locale;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.customViews.VideoController */
public class VideoController extends FrameLayout {
    private static final int DEFAULT_TIMEOUT = 5000;
    private static final int FADE_OUT = 1;
    private static final int SHOW_PROGRESS = 2;
    private ViewGroup anchorView;
    private View.OnClickListener backwardListener = new View.OnClickListener() {
        public void onClick(View view) {
            if (VideoController.this.mediaPlayerControl != null) {
                VideoController.this.mediaPlayerControl.seekTo(VideoController.this.mediaPlayerControl.getCurrentPosition() - 15000);
                int unused = VideoController.this.setProgress();
                VideoController.this.show(VideoController.DEFAULT_TIMEOUT);
            }
        }
    };
    private ImageButton btnBackward;
    private ImageButton btnForward;
    private ImageButton btnFullScreen;
    private ImageButton btnPause;
    private Context context;
    StringBuilder formatBuilder;
    Formatter formatter;
    private View.OnClickListener forwardListener = new View.OnClickListener() {
        public void onClick(View view) {
            if (VideoController.this.mediaPlayerControl != null) {
                VideoController.this.mediaPlayerControl.seekTo(VideoController.this.mediaPlayerControl.getCurrentPosition() + 15000);
                int unused = VideoController.this.setProgress();
                VideoController.this.show(VideoController.DEFAULT_TIMEOUT);
            }
        }
    };
    private View.OnClickListener fullScreenListener = new View.OnClickListener() {
        public void onClick(View view) {
            VideoController.this.doToggleFullscreen();
            VideoController.this.show(VideoController.DEFAULT_TIMEOUT);
        }
    };
    /* access modifiers changed from: private */
    public Handler handler = new MessageHandler(this);
    /* access modifiers changed from: private */
    public boolean isDragging;
    /* access modifiers changed from: private */
    public boolean isShowing;
    /* access modifiers changed from: private */
    public MediaPlayerControl mediaPlayerControl;
    private View.OnClickListener pauseListener = new View.OnClickListener() {
        public void onClick(View view) {
            VideoController.this.doPauseResume();
            VideoController.this.show(VideoController.DEFAULT_TIMEOUT);
        }
    };
    private ProgressBar progressBar;
    private View root;
    private SeekBar.OnSeekBarChangeListener seekListener = new SeekBar.OnSeekBarChangeListener() {
        public void onStartTrackingTouch(SeekBar seekBar) {
            VideoController.this.show(3600000);
            boolean unused = VideoController.this.isDragging = true;
            VideoController.this.handler.removeMessages(2);
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (VideoController.this.mediaPlayerControl != null && z) {
                int duration = (int) ((((long) VideoController.this.mediaPlayerControl.getDuration()) * ((long) i)) / 1000);
                VideoController.this.mediaPlayerControl.seekTo(duration);
                if (VideoController.this.tvCurrentTime != null) {
                    VideoController.this.tvCurrentTime.setText(VideoController.this.stringForTime(duration));
                }
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            boolean unused = VideoController.this.isDragging = false;
            int unused2 = VideoController.this.setProgress();
            VideoController.this.updatePausePlay();
            VideoController.this.show(VideoController.DEFAULT_TIMEOUT);
            VideoController.this.handler.sendEmptyMessage(2);
        }
    };
    /* access modifiers changed from: private */
    public TextView tvCurrentTime;
    private TextView tvEndTime;

    /* renamed from: ru.unicorn.ujin.view.customViews.VideoController$MediaPlayerControl */
    public interface MediaPlayerControl {
        int getBufferPercentage();

        int getCurrentPosition();

        int getDuration();

        boolean isFullScreen();

        boolean isPlaying();

        void pause();

        void seekTo(int i);

        void start();

        void toggleFullScreen();
    }

    public VideoController(Context context2) {
        super(context2);
        this.context = context2;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View view = this.root;
        if (view != null) {
            initControllerView(view);
        }
    }

    public void setMediaPlayer(MediaPlayerControl mediaPlayerControl2) {
        this.mediaPlayerControl = mediaPlayerControl2;
        updatePausePlay();
        updateFullScreen();
    }

    public void setAnchorView(ViewGroup viewGroup) {
        this.anchorView = viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        removeAllViews();
        addView(makeControllerView(), layoutParams);
    }

    /* access modifiers changed from: protected */
    public View makeControllerView() {
        this.root = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(R.layout.video_player_layout, (ViewGroup) null);
        initControllerView(this.root);
        return this.root;
    }

    private void initControllerView(View view) {
        this.btnPause = (ImageButton) view.findViewById(R.id.pause);
        ImageButton imageButton = this.btnPause;
        if (imageButton != null) {
            imageButton.requestFocus();
            this.btnPause.setOnClickListener(this.pauseListener);
        }
        this.btnFullScreen = (ImageButton) view.findViewById(R.id.full_screen);
        ImageButton imageButton2 = this.btnFullScreen;
        if (imageButton2 != null) {
            imageButton2.requestFocus();
            this.btnFullScreen.setOnClickListener(this.fullScreenListener);
        }
        this.btnForward = (ImageButton) view.findViewById(R.id.forward);
        ImageButton imageButton3 = this.btnForward;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(this.forwardListener);
        }
        this.btnBackward = (ImageButton) view.findViewById(R.id.backward);
        ImageButton imageButton4 = this.btnBackward;
        if (imageButton4 != null) {
            imageButton4.setOnClickListener(this.backwardListener);
        }
        this.progressBar = (ProgressBar) view.findViewById(R.id.media_controller_progress);
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            if (progressBar2 instanceof SeekBar) {
                ((SeekBar) progressBar2).setOnSeekBarChangeListener(this.seekListener);
            }
            this.progressBar.setMax(1000);
        }
        this.tvEndTime = (TextView) view.findViewById(R.id.rest_time);
        this.tvCurrentTime = (TextView) view.findViewById(R.id.current_time);
        this.formatBuilder = new StringBuilder();
        this.formatter = new Formatter(this.formatBuilder, Locale.getDefault());
    }

    public void show() {
        show(DEFAULT_TIMEOUT);
    }

    public void show(int i) {
        if (!this.isShowing && this.anchorView != null) {
            setProgress();
            ImageButton imageButton = this.btnPause;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            this.anchorView.addView(this, new FrameLayout.LayoutParams(-1, -2, 80));
            this.isShowing = true;
        }
        updatePausePlay();
        updateFullScreen();
        this.handler.sendEmptyMessage(2);
        Message obtainMessage = this.handler.obtainMessage(1);
        if (i != 0) {
            this.handler.removeMessages(1);
            this.handler.sendMessageDelayed(obtainMessage, (long) i);
        }
    }

    public boolean isShowing() {
        return this.isShowing;
    }

    public void hide() {
        ViewGroup viewGroup = this.anchorView;
        if (viewGroup != null) {
            try {
                viewGroup.removeView(this);
                this.handler.removeMessages(2);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            this.isShowing = false;
        }
    }

    /* access modifiers changed from: private */
    public String stringForTime(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = (i2 / 60) % 60;
        int i5 = i2 / NikonType2MakernoteDirectory.TAG_NIKON_SCAN;
        StringBuilder sb = this.formatBuilder;
        if (sb != null) {
            sb.setLength(0);
        }
        if (i5 > 0) {
            return this.formatter.format("%d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3)}).toString();
        }
        return this.formatter.format("%02d:%02d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i3)}).toString();
    }

    /* access modifiers changed from: private */
    public int setProgress() {
        MediaPlayerControl mediaPlayerControl2 = this.mediaPlayerControl;
        if (mediaPlayerControl2 == null || this.isDragging) {
            return 0;
        }
        int currentPosition = mediaPlayerControl2.getCurrentPosition();
        int duration = this.mediaPlayerControl.getDuration();
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            if (duration > 0) {
                progressBar2.setProgress((int) ((((long) currentPosition) * 1000) / ((long) duration)));
            }
            this.progressBar.setSecondaryProgress(this.mediaPlayerControl.getBufferPercentage() * 10);
        }
        this.tvEndTime.setText(String.format("- %s", new Object[]{stringForTime(duration - currentPosition)}));
        this.tvCurrentTime.setText(stringForTime(currentPosition));
        return currentPosition;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        show(DEFAULT_TIMEOUT);
        return true;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        show(DEFAULT_TIMEOUT);
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.mediaPlayerControl == null) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0;
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z) {
                doPauseResume();
                show(DEFAULT_TIMEOUT);
                ImageButton imageButton = this.btnPause;
                if (imageButton != null) {
                    imageButton.requestFocus();
                }
            }
            return true;
        } else if (keyCode == 126) {
            if (z && !this.mediaPlayerControl.isPlaying()) {
                this.mediaPlayerControl.start();
                updatePausePlay();
                show(DEFAULT_TIMEOUT);
            }
            return true;
        } else if (keyCode == 86 || keyCode == 127) {
            if (z && this.mediaPlayerControl.isPlaying()) {
                this.mediaPlayerControl.pause();
                updatePausePlay();
                show(DEFAULT_TIMEOUT);
            }
            return true;
        } else if (keyCode == 25 || keyCode == 24 || keyCode == 164) {
            return super.dispatchKeyEvent(keyEvent);
        } else {
            if (keyCode == 4 || keyCode == 82) {
                if (z) {
                    hide();
                }
                return true;
            }
            show(DEFAULT_TIMEOUT);
            return super.dispatchKeyEvent(keyEvent);
        }
    }

    public void updatePausePlay() {
        MediaPlayerControl mediaPlayerControl2;
        if (this.root != null && this.btnPause != null && (mediaPlayerControl2 = this.mediaPlayerControl) != null) {
            if (mediaPlayerControl2.isPlaying()) {
                this.btnPause.setImageResource(R.drawable.ic_media_pause);
            } else {
                this.btnPause.setImageResource(R.drawable.ic_media_play);
            }
        }
    }

    public void updateFullScreen() {
        MediaPlayerControl mediaPlayerControl2;
        if (this.root != null && this.btnFullScreen != null && (mediaPlayerControl2 = this.mediaPlayerControl) != null) {
            if (mediaPlayerControl2.isFullScreen()) {
                this.btnFullScreen.setImageResource(R.drawable.ic_media_fullscreen_shrink);
            } else {
                this.btnFullScreen.setImageResource(R.drawable.ic_media_fullscreen_stretch);
            }
        }
    }

    /* access modifiers changed from: private */
    public void doPauseResume() {
        MediaPlayerControl mediaPlayerControl2 = this.mediaPlayerControl;
        if (mediaPlayerControl2 != null) {
            if (mediaPlayerControl2.isPlaying()) {
                this.mediaPlayerControl.pause();
            } else {
                this.mediaPlayerControl.start();
            }
            updatePausePlay();
        }
    }

    /* access modifiers changed from: private */
    public void doToggleFullscreen() {
        MediaPlayerControl mediaPlayerControl2 = this.mediaPlayerControl;
        if (mediaPlayerControl2 != null) {
            mediaPlayerControl2.toggleFullScreen();
        }
    }

    /* renamed from: ru.unicorn.ujin.view.customViews.VideoController$MessageHandler */
    private static class MessageHandler extends Handler {
        private final WeakReference<VideoController> mView;

        MessageHandler(VideoController videoController) {
            this.mView = new WeakReference<>(videoController);
        }

        public void handleMessage(Message message) {
            VideoController videoController = (VideoController) this.mView.get();
            if (videoController != null && videoController.mediaPlayerControl != null) {
                int i = message.what;
                if (i == 1) {
                    videoController.hide();
                } else if (i == 2) {
                    int access$700 = videoController.setProgress();
                    if (!videoController.isDragging && videoController.isShowing && videoController.mediaPlayerControl.isPlaying()) {
                        sendMessageDelayed(obtainMessage(2), (long) (1000 - (access$700 % 1000)));
                    }
                }
            }
        }
    }
}
