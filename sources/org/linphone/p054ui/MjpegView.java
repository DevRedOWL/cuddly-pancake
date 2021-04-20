package org.linphone.p054ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/* renamed from: org.linphone.ui.MjpegView */
public class MjpegView extends View {
    private static final int CHUNK_SIZE = 4096;
    public static final int MODE_BEST_FIT = 3;
    public static final int MODE_FIT_HEIGHT = 2;
    public static final int MODE_FIT_WIDTH = 1;
    public static final int MODE_ORIGINAL = 0;
    public static final int MODE_STRETCH = 4;
    private static final int WAIT_AFTER_READ_IMAGE_ERROR_MSEC = 5000;
    private boolean adjustHeight;
    private boolean adjustWidth;
    /* access modifiers changed from: private */
    public boolean alreadyStart = false;
    private Context context;
    /* access modifiers changed from: private */
    public long delay = 10000;
    private MjpegDownloader downloader;
    private int drawX;
    private int drawY;
    private Rect dst;
    /* access modifiers changed from: private */
    public Handler handler = new Handler();
    private boolean isRecycleBitmap;
    private boolean isUserForceConfigRecycle;
    private Bitmap lastBitmap;
    private int lastImgHeight;
    private int lastImgWidth;
    private final Object lockBitmap = new Object();
    private int mode = 0;
    /* access modifiers changed from: private */
    public int msecWaitAfterReadImageError = WAIT_AFTER_READ_IMAGE_ERROR_MSEC;
    /* access modifiers changed from: private */
    public OnStartStream onStartStream;
    private Paint paint;
    Runnable runnable = new Runnable() {
        public void run() {
            MjpegView.this.onStartStream.onStreamStarted(false);
            MjpegView.this.onStartStream.onStreamNotStarting();
            MjpegView.this.stopStream();
        }
    };
    /* access modifiers changed from: private */
    public final String tag = getClass().getSimpleName();
    /* access modifiers changed from: private */
    public String url;
    private int vHeight = -1;
    private int vWidth = -1;

    /* renamed from: org.linphone.ui.MjpegView$OnStartStream */
    public interface OnStartStream {
        void onStreamNotStarting();

        void onStreamStarted(boolean z);
    }

    public void setOnStartStream(OnStartStream onStartStream2) {
        this.onStartStream = onStartStream2;
    }

    public long getDelay() {
        return this.delay;
    }

    public void setDelay(long j) {
        this.delay = j;
    }

    public MjpegView(Context context2) {
        super(context2);
        this.context = context2;
        init();
    }

    public MjpegView(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        this.context = context2;
        init();
    }

    private void init() {
        this.paint = new Paint(1);
        this.dst = new Rect(0, 0, 0, 0);
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void startStream() {
        MjpegDownloader mjpegDownloader = this.downloader;
        if (mjpegDownloader == null || !mjpegDownloader.isRunning()) {
            this.downloader = new MjpegDownloader();
            this.downloader.start();
            this.handler.postDelayed(this.runnable, getDelay());
            return;
        }
        Log.w(this.tag, "Already started, stop by calling stopStream() first.");
    }

    public void stopStream() {
        MjpegDownloader mjpegDownloader = this.downloader;
        if (mjpegDownloader != null) {
            mjpegDownloader.cancel();
        }
    }

    public int getMode() {
        return this.mode;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setBitmap(Bitmap bitmap) {
        synchronized (this.lockBitmap) {
            if (this.lastBitmap != null && ((this.isUserForceConfigRecycle && this.isRecycleBitmap) || (!this.isUserForceConfigRecycle && Build.VERSION.SDK_INT < 11))) {
                Log.v(this.tag, "Manually recycle bitmap");
                this.lastBitmap.recycle();
            }
            this.lastBitmap = bitmap;
        }
        Context context2 = this.context;
        if (context2 instanceof Activity) {
            ((Activity) context2).runOnUiThread(new Runnable() {
                public void run() {
                    MjpegView.this.onStartStream.onStreamStarted(false);
                    MjpegView.this.invalidate();
                    MjpegView.this.requestLayout();
                }
            });
        } else {
            Log.e(this.tag, "Can not request Canvas's redraw. Context is not an instance of Activity");
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        synchronized (this.lockBitmap) {
            z = (this.lastBitmap == null || (this.lastImgWidth == this.lastBitmap.getWidth() && this.lastImgHeight == this.lastBitmap.getHeight())) ? false : true;
            if (z) {
                this.lastImgWidth = this.lastBitmap.getWidth();
                this.lastImgHeight = this.lastBitmap.getHeight();
            }
        }
        if (z) {
            Log.d(this.tag, "Recalculate view/image size");
            this.vWidth = View.MeasureSpec.getSize(i);
            this.vHeight = View.MeasureSpec.getSize(i2);
            int i3 = this.mode;
            if (i3 == 0) {
                int i4 = this.vWidth;
                int i5 = this.lastImgWidth;
                this.drawX = (i4 - i5) / 2;
                this.drawY = (this.vHeight - this.lastImgHeight) / 2;
                if (this.adjustWidth) {
                    this.vWidth = i5;
                    this.drawX = 0;
                }
                if (this.adjustHeight) {
                    this.vHeight = this.lastImgHeight;
                    this.drawY = 0;
                }
            } else if (i3 == 1) {
                int i6 = (int) ((((float) this.lastImgHeight) / ((float) this.lastImgWidth)) * ((float) this.vWidth));
                this.drawX = 0;
                if (this.adjustHeight) {
                    this.vHeight = i6;
                    this.drawY = 0;
                } else {
                    this.drawY = (this.vHeight - i6) / 2;
                }
                Rect rect = this.dst;
                int i7 = this.drawX;
                int i8 = this.drawY;
                rect.set(i7, i8, this.vWidth, i6 + i8);
            } else if (i3 == 2) {
                int i9 = (int) ((((float) this.lastImgWidth) / ((float) this.lastImgHeight)) * ((float) this.vHeight));
                this.drawY = 0;
                if (this.adjustWidth) {
                    this.vWidth = i9;
                    this.drawX = 0;
                } else {
                    this.drawX = (this.vWidth - i9) / 2;
                }
                Rect rect2 = this.dst;
                int i10 = this.drawX;
                rect2.set(i10, this.drawY, i9 + i10, this.vHeight);
            } else if (i3 == 3) {
                int i11 = this.lastImgWidth;
                int i12 = this.vWidth;
                float f = ((float) i11) / ((float) i12);
                int i13 = this.lastImgHeight;
                int i14 = this.vHeight;
                if (f > ((float) i13) / ((float) i14)) {
                    int i15 = (int) ((((float) i13) / ((float) i11)) * ((float) i12));
                    this.drawX = 0;
                    if (this.adjustHeight) {
                        this.vHeight = i15;
                        this.drawY = 0;
                    } else {
                        this.drawY = (i14 - i15) / 2;
                    }
                    Rect rect3 = this.dst;
                    int i16 = this.drawX;
                    int i17 = this.drawY;
                    rect3.set(i16, i17, this.vWidth, i15 + i17);
                } else {
                    int i18 = (int) ((((float) i11) / ((float) i13)) * ((float) i14));
                    this.drawY = 0;
                    if (this.adjustWidth) {
                        this.vWidth = i18;
                        this.drawX = 0;
                    } else {
                        this.drawX = (i12 - i18) / 2;
                    }
                    Rect rect4 = this.dst;
                    int i19 = this.drawX;
                    rect4.set(i19, this.drawY, i18 + i19, this.vHeight);
                }
            } else if (i3 == 4) {
                this.dst.set(0, 0, this.vWidth, this.vHeight);
            }
            setMeasuredDimension(this.vWidth, this.vHeight);
            return;
        }
        if (this.vWidth == -1 || this.vHeight == -1) {
            this.vWidth = View.MeasureSpec.getSize(i);
            this.vHeight = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(this.vWidth, this.vHeight);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        synchronized (this.lockBitmap) {
            if (canvas != null) {
                if (this.lastBitmap != null && !this.lastBitmap.isRecycled()) {
                    if (!isInEditMode()) {
                        if (this.mode != 0) {
                            canvas.drawBitmap(this.lastBitmap, (Rect) null, this.dst, this.paint);
                        } else {
                            canvas.drawBitmap(this.lastBitmap, (float) this.drawX, (float) this.drawY, this.paint);
                        }
                    }
                }
            }
            Log.d(this.tag, "Skip drawing, canvas is null or bitmap is not ready yet");
        }
    }

    public boolean isAdjustWidth() {
        return this.adjustWidth;
    }

    public void setAdjustWidth(boolean z) {
        this.adjustWidth = z;
    }

    public boolean isAdjustHeight() {
        return this.adjustHeight;
    }

    public void setAdjustHeight(boolean z) {
        this.adjustHeight = z;
    }

    public int getMsecWaitAfterReadImageError() {
        return this.msecWaitAfterReadImageError;
    }

    public void setMsecWaitAfterReadImageError(int i) {
        this.msecWaitAfterReadImageError = i;
    }

    public boolean isRecycleBitmap() {
        return this.isRecycleBitmap;
    }

    public void setRecycleBitmap(boolean z) {
        this.isUserForceConfigRecycle = true;
        this.isRecycleBitmap = z;
    }

    /* renamed from: org.linphone.ui.MjpegView$MjpegDownloader */
    class MjpegDownloader extends Thread {
        private boolean run = true;

        MjpegDownloader() {
        }

        public void cancel() {
            this.run = false;
        }

        public boolean isRunning() {
            return this.run;
        }

        /* JADX WARNING: Removed duplicated region for block: B:75:0x019c  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x020e A[SYNTHETIC, Splitter:B:84:0x020e] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0000 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
            L_0x0000:
                boolean r0 = r11.run
                if (r0 == 0) goto L_0x0250
                r0 = 0
                r1 = 1
                java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x015b }
                org.linphone.ui.MjpegView r3 = org.linphone.p054ui.MjpegView.this     // Catch:{ Exception -> 0x015b }
                java.lang.String r3 = r3.url     // Catch:{ Exception -> 0x015b }
                r2.<init>(r3)     // Catch:{ Exception -> 0x015b }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x015b }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x015b }
                r2.setDoInput(r1)     // Catch:{ Exception -> 0x0158 }
                r2.connect()     // Catch:{ Exception -> 0x0158 }
                java.lang.String r3 = "[_a-zA-Z0-9]*boundary"
                r4 = 0
                java.lang.String r5 = "Content-Type"
                java.lang.String r5 = r2.getHeaderField(r5)     // Catch:{ Exception -> 0x0069 }
                if (r5 == 0) goto L_0x0061
                java.lang.String r6 = ";"
                java.lang.String[] r5 = r5.split(r6)     // Catch:{ Exception -> 0x0069 }
                int r6 = r5.length     // Catch:{ Exception -> 0x0069 }
                if (r6 == 0) goto L_0x0059
                int r6 = r5.length     // Catch:{ Exception -> 0x0069 }
                r8 = r0
                r7 = 0
            L_0x0034:
                if (r7 >= r6) goto L_0x004d
                r9 = r5[r7]     // Catch:{ Exception -> 0x0069 }
                java.lang.String r9 = r9.trim()     // Catch:{ Exception -> 0x0069 }
                java.lang.String r10 = "boundary="
                boolean r10 = r9.startsWith(r10)     // Catch:{ Exception -> 0x0069 }
                if (r10 == 0) goto L_0x004a
                r8 = 9
                java.lang.String r8 = r9.substring(r8)     // Catch:{ Exception -> 0x0069 }
            L_0x004a:
                int r7 = r7 + 1
                goto L_0x0034
            L_0x004d:
                if (r8 == 0) goto L_0x0051
                r3 = r8
                goto L_0x008d
            L_0x0051:
                java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x0069 }
                java.lang.String r6 = "Unable to find mjpeg boundary"
                r5.<init>(r6)     // Catch:{ Exception -> 0x0069 }
                throw r5     // Catch:{ Exception -> 0x0069 }
            L_0x0059:
                java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x0069 }
                java.lang.String r6 = "Content type was empty"
                r5.<init>(r6)     // Catch:{ Exception -> 0x0069 }
                throw r5     // Catch:{ Exception -> 0x0069 }
            L_0x0061:
                java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x0069 }
                java.lang.String r6 = "Unable to get content type"
                r5.<init>(r6)     // Catch:{ Exception -> 0x0069 }
                throw r5     // Catch:{ Exception -> 0x0069 }
            L_0x0069:
                r5 = move-exception
                org.linphone.ui.MjpegView r6 = org.linphone.p054ui.MjpegView.this     // Catch:{ Exception -> 0x0158 }
                java.lang.String r6 = r6.tag     // Catch:{ Exception -> 0x0158 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0158 }
                r7.<init>()     // Catch:{ Exception -> 0x0158 }
                java.lang.String r8 = "Cannot extract a boundary string from HTTP header with message: "
                r7.append(r8)     // Catch:{ Exception -> 0x0158 }
                java.lang.String r5 = r5.getMessage()     // Catch:{ Exception -> 0x0158 }
                r7.append(r5)     // Catch:{ Exception -> 0x0158 }
                java.lang.String r5 = ". Use a default value instead."
                r7.append(r5)     // Catch:{ Exception -> 0x0158 }
                java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0158 }
                android.util.Log.w(r6, r5)     // Catch:{ Exception -> 0x0158 }
            L_0x008d:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0158 }
                r5.<init>()     // Catch:{ Exception -> 0x0158 }
                java.lang.String r6 = "--"
                r5.append(r6)     // Catch:{ Exception -> 0x0158 }
                r5.append(r3)     // Catch:{ Exception -> 0x0158 }
                java.lang.String r3 = "\\s+(.*)\\r\\n\\r\\n"
                r5.append(r3)     // Catch:{ Exception -> 0x0158 }
                java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0158 }
                r5 = 32
                java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r5)     // Catch:{ Exception -> 0x0158 }
                java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0158 }
                java.io.InputStream r6 = r2.getInputStream()     // Catch:{ Exception -> 0x0158 }
                r5.<init>(r6)     // Catch:{ Exception -> 0x0158 }
                byte[] r0 = new byte[r4]     // Catch:{ Exception -> 0x0155 }
                r6 = 4096(0x1000, float:5.74E-42)
                byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0155 }
            L_0x00b8:
                boolean r7 = r11.run     // Catch:{ Exception -> 0x0155 }
                if (r7 == 0) goto L_0x01ba
                int r7 = r5.read(r6)     // Catch:{ Exception -> 0x012f }
                r8 = -1
                if (r7 != r8) goto L_0x00c5
                goto L_0x01ba
            L_0x00c5:
                byte[] r8 = r11.addByte(r0, r6, r4, r7)     // Catch:{ Exception -> 0x012f }
                java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x012f }
                java.lang.String r10 = "ASCII"
                r9.<init>(r8, r10)     // Catch:{ Exception -> 0x012f }
                java.util.regex.Matcher r8 = r3.matcher(r9)     // Catch:{ Exception -> 0x012f }
                boolean r10 = r8.find()     // Catch:{ Exception -> 0x012f }
                if (r10 == 0) goto L_0x012a
                java.lang.String r8 = r8.group(r4)     // Catch:{ Exception -> 0x012f }
                int r9 = r9.indexOf(r8)     // Catch:{ Exception -> 0x012f }
                int r10 = r0.length     // Catch:{ Exception -> 0x012f }
                int r9 = r9 - r10
                if (r9 <= 0) goto L_0x00eb
                byte[] r0 = r11.addByte(r0, r6, r4, r9)     // Catch:{ Exception -> 0x012f }
                goto L_0x00f0
            L_0x00eb:
                int r10 = -r9
                byte[] r0 = r11.delByte(r0, r10)     // Catch:{ Exception -> 0x012f }
            L_0x00f0:
                int r10 = r0.length     // Catch:{ Exception -> 0x012f }
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r4, r10)     // Catch:{ Exception -> 0x012f }
                if (r0 == 0) goto L_0x0112
                boolean r10 = r11.run     // Catch:{ Exception -> 0x012f }
                if (r10 == 0) goto L_0x011d
                r11.newFrame(r0)     // Catch:{ Exception -> 0x012f }
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this     // Catch:{ Exception -> 0x012f }
                java.lang.Runnable r0 = r0.runnable     // Catch:{ Exception -> 0x012f }
                if (r0 == 0) goto L_0x011d
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this     // Catch:{ Exception -> 0x012f }
                android.os.Handler r0 = r0.handler     // Catch:{ Exception -> 0x012f }
                org.linphone.ui.MjpegView r10 = org.linphone.p054ui.MjpegView.this     // Catch:{ Exception -> 0x012f }
                java.lang.Runnable r10 = r10.runnable     // Catch:{ Exception -> 0x012f }
                r0.removeCallbacks(r10)     // Catch:{ Exception -> 0x012f }
                goto L_0x011d
            L_0x0112:
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this     // Catch:{ Exception -> 0x012f }
                java.lang.String r0 = r0.tag     // Catch:{ Exception -> 0x012f }
                java.lang.String r10 = "Read image error"
                android.util.Log.e(r0, r10)     // Catch:{ Exception -> 0x012f }
            L_0x011d:
                int r0 = r8.length()     // Catch:{ Exception -> 0x012f }
                int r9 = r9 + r0
                byte[] r0 = new byte[r4]     // Catch:{ Exception -> 0x012f }
                int r7 = r7 - r9
                byte[] r0 = r11.addByte(r0, r6, r9, r7)     // Catch:{ Exception -> 0x012f }
                goto L_0x00b8
            L_0x012a:
                byte[] r0 = r11.addByte(r0, r6, r4, r7)     // Catch:{ Exception -> 0x012f }
                goto L_0x00b8
            L_0x012f:
                r0 = move-exception
                java.lang.String r3 = r0.getMessage()     // Catch:{ Exception -> 0x0155 }
                if (r3 == 0) goto L_0x01ba
                org.linphone.ui.MjpegView r3 = org.linphone.p054ui.MjpegView.this     // Catch:{ Exception -> 0x0155 }
                java.lang.String r3 = r3.tag     // Catch:{ Exception -> 0x0155 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0155 }
                r4.<init>()     // Catch:{ Exception -> 0x0155 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0155 }
                r4.append(r0)     // Catch:{ Exception -> 0x0155 }
                java.lang.String r0 = "1"
                r4.append(r0)     // Catch:{ Exception -> 0x0155 }
                java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0155 }
                android.util.Log.e(r3, r0)     // Catch:{ Exception -> 0x0155 }
                goto L_0x01ba
            L_0x0155:
                r0 = move-exception
                r3 = r0
                goto L_0x015f
            L_0x0158:
                r3 = move-exception
                r5 = r0
                goto L_0x015f
            L_0x015b:
                r2 = move-exception
                r5 = r0
                r3 = r2
                r2 = r5
            L_0x015f:
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this
                org.linphone.ui.MjpegView$OnStartStream r0 = r0.onStartStream
                r0.onStreamStarted(r1)
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this
                android.os.Handler r0 = r0.handler
                if (r0 == 0) goto L_0x0196
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this
                java.lang.Runnable r0 = r0.runnable
                if (r0 == 0) goto L_0x0196
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this
                boolean r0 = r0.alreadyStart
                if (r0 != 0) goto L_0x0196
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this
                boolean unused = r0.alreadyStart = r1
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this
                android.os.Handler r0 = r0.handler
                org.linphone.ui.MjpegView r4 = org.linphone.p054ui.MjpegView.this
                java.lang.Runnable r4 = r4.runnable
                org.linphone.ui.MjpegView r6 = org.linphone.p054ui.MjpegView.this
                long r6 = r6.delay
                r0.postDelayed(r4, r6)
            L_0x0196:
                java.lang.String r0 = r3.getMessage()
                if (r0 == 0) goto L_0x01ba
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this
                java.lang.String r0 = r0.tag
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r3 = r3.getMessage()
                r4.append(r3)
                java.lang.String r3 = "12"
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                android.util.Log.e(r0, r3)
            L_0x01ba:
                r5.close()     // Catch:{ Exception -> 0x01e1 }
                r2.disconnect()     // Catch:{ Exception -> 0x01e1 }
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this     // Catch:{ Exception -> 0x01e1 }
                java.lang.String r0 = r0.tag     // Catch:{ Exception -> 0x01e1 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e1 }
                r2.<init>()     // Catch:{ Exception -> 0x01e1 }
                java.lang.String r3 = "disconnected with "
                r2.append(r3)     // Catch:{ Exception -> 0x01e1 }
                org.linphone.ui.MjpegView r3 = org.linphone.p054ui.MjpegView.this     // Catch:{ Exception -> 0x01e1 }
                java.lang.String r3 = r3.url     // Catch:{ Exception -> 0x01e1 }
                r2.append(r3)     // Catch:{ Exception -> 0x01e1 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01e1 }
                android.util.Log.i(r0, r2)     // Catch:{ Exception -> 0x01e1 }
                goto L_0x0206
            L_0x01e1:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                if (r2 == 0) goto L_0x0206
                org.linphone.ui.MjpegView r2 = org.linphone.p054ui.MjpegView.this
                java.lang.String r2 = r2.tag
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r0 = "123"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                android.util.Log.e(r2, r0)
            L_0x0206:
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this
                int r0 = r0.msecWaitAfterReadImageError
                if (r0 <= 0) goto L_0x0000
                boolean r0 = r11.isRunning()     // Catch:{ InterruptedException -> 0x0229 }
                if (r0 == 0) goto L_0x0000
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this     // Catch:{ InterruptedException -> 0x0229 }
                org.linphone.ui.MjpegView$OnStartStream r0 = r0.onStartStream     // Catch:{ InterruptedException -> 0x0229 }
                r0.onStreamStarted(r1)     // Catch:{ InterruptedException -> 0x0229 }
                org.linphone.ui.MjpegView r0 = org.linphone.p054ui.MjpegView.this     // Catch:{ InterruptedException -> 0x0229 }
                int r0 = r0.msecWaitAfterReadImageError     // Catch:{ InterruptedException -> 0x0229 }
                long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0229 }
                java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0229 }
                goto L_0x0000
            L_0x0229:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L_0x0000
                org.linphone.ui.MjpegView r1 = org.linphone.p054ui.MjpegView.this
                java.lang.String r1 = r1.tag
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = "1234"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                android.util.Log.e(r1, r0)
                goto L_0x0000
            L_0x0250:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.linphone.p054ui.MjpegView.MjpegDownloader.run():void");
        }

        private byte[] addByte(byte[] bArr, byte[] bArr2, int i, int i2) {
            byte[] bArr3 = new byte[(bArr.length + i2)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, i, bArr3, bArr.length, i2);
            return bArr3;
        }

        private byte[] delByte(byte[] bArr, int i) {
            byte[] bArr2 = new byte[(bArr.length - i)];
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            return bArr2;
        }

        private void newFrame(Bitmap bitmap) {
            MjpegView.this.setBitmap(bitmap);
        }
    }
}
