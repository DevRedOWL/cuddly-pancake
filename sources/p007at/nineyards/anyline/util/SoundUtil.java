package p007at.nineyards.anyline.util;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.util.Log;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: at.nineyards.anyline.util.SoundUtil */
public class SoundUtil {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f743a = SoundUtil.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f744b = new Object();

    /* renamed from: c */
    private final SoundPool f745c;

    /* renamed from: d */
    private final AudioManager f746d;

    /* renamed from: e */
    private Context f747e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SparseIntArray f748f;

    /* renamed from: g */
    private HashMap<String, Integer> f749g;

    public SoundUtil(Context context) {
        this.f747e = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f745c = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(13).build()).setMaxStreams(2).build();
        } else {
            this.f745c = new SoundPool(2, 5, 0);
        }
        this.f748f = new SparseIntArray();
        this.f749g = new HashMap<>();
        this.f746d = (AudioManager) context.getSystemService("audio");
        this.f745c.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                if (i2 == 0) {
                    synchronized (SoundUtil.this.f744b) {
                        SoundUtil.this.f748f.put(i, 1);
                    }
                    return;
                }
                String a = SoundUtil.f743a;
                Log.w(a, "Sound could not be loaded. Sound Id " + i + " status " + i2 + ".");
            }
        });
    }

    public void loadSoundFromAssets(String str) throws IOException {
        AssetFileDescriptor openFd = this.f747e.getAssets().openFd(str);
        synchronized (this.f744b) {
            if (!this.f749g.containsKey(str)) {
                this.f749g.put(str, Integer.valueOf(this.f745c.load(openFd, 1)));
            }
        }
    }

    public void playSound(String str) {
        synchronized (this.f744b) {
            Integer num = this.f749g.get(str);
            if (num == null) {
                throw new IllegalArgumentException("Must load sound before playing it. Given asset file name: " + str);
            } else if (this.f748f.get(num.intValue()) == 0) {
                String str2 = f743a;
                Log.w(str2, "Sound not yet loaded. Sound Id: " + num + " asset file name: " + str);
            } else {
                float streamVolume = ((float) this.f746d.getStreamVolume(5)) / ((float) this.f746d.getStreamMaxVolume(5));
                this.f745c.play(num.intValue(), streamVolume, streamVolume, 5, 0, 1.0f);
            }
        }
    }

    public void releaseSoundPool() {
        this.f745c.release();
    }
}
