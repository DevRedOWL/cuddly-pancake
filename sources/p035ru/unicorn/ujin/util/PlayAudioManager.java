package p035ru.unicorn.ujin.util;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;

/* renamed from: ru.unicorn.ujin.util.PlayAudioManager */
public class PlayAudioManager {
    private static MediaPlayer mediaPlayer;

    public static void playAudio(Context context, String str) throws Exception {
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(context, Uri.parse(str));
        }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mediaPlayer) {
                PlayAudioManager.killMediaPlayer();
            }
        });
        mediaPlayer.start();
    }

    /* access modifiers changed from: private */
    public static void killMediaPlayer() {
        MediaPlayer mediaPlayer2 = mediaPlayer;
        if (mediaPlayer2 != null) {
            try {
                mediaPlayer2.reset();
                mediaPlayer.release();
                mediaPlayer = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
