package org.videolan.libvlc.util;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.MediaPlayer;

public class Dumper {
    private final LibVLC mLibVLC;
    /* access modifiers changed from: private */
    public final Listener mListener;
    private final MediaPlayer mMediaPlayer;

    public interface Listener {
        void onFinish(boolean z);

        void onProgress(float f);
    }

    public Dumper(Uri uri, String str, Listener listener) {
        if (uri == null || str == null || listener == null) {
            throw new IllegalArgumentException("arguments shouldn't be null");
        }
        this.mListener = listener;
        ArrayList arrayList = new ArrayList(8);
        arrayList.add("--demux");
        arrayList.add("dump2,none");
        arrayList.add("--demuxdump-file");
        arrayList.add(str);
        arrayList.add("--no-video");
        arrayList.add("--no-audio");
        arrayList.add("--no-spu");
        arrayList.add("-vv");
        this.mLibVLC = new LibVLC((Context) null, arrayList);
        Media media = new Media(this.mLibVLC, uri);
        this.mMediaPlayer = new MediaPlayer(media);
        this.mMediaPlayer.setEventListener(new MediaPlayer.EventListener() {
            public void onEvent(MediaPlayer.Event event) {
                int i = event.type;
                if (i == 259) {
                    Dumper.this.mListener.onProgress(event.getBuffering());
                } else if (i == 265 || i == 266) {
                    Dumper.this.mListener.onFinish(event.type == 265);
                    Dumper.this.cancel();
                }
            }
        });
        media.release();
    }

    public void start() {
        this.mMediaPlayer.play();
    }

    public void cancel() {
        this.mMediaPlayer.stop();
        this.mMediaPlayer.release();
        this.mLibVLC.release();
    }
}
