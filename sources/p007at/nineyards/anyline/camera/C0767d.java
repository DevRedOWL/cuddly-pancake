package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p007at.nineyards.anyline.C0718R;
import p007at.nineyards.anyline.util.DimensUtil;

/* renamed from: at.nineyards.anyline.camera.d */
final class C0767d extends View {

    /* renamed from: a */
    RectF f436a;

    /* renamed from: b */
    private final BitmapDrawable f437b;

    /* renamed from: c */
    private final int f438c;

    /* renamed from: d */
    private Rect f439d;

    C0767d(Context context) {
        super(context);
        InputStream openRawResource = context.getResources().openRawResource(C0718R.raw.al_d6f3e042d13f4cc06b77dbdb2d2dcebaf46326e6);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[7137];
        while (true) {
            try {
                int read = openRawResource.read(bArr, 0, 7137);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException unused) {
            }
        }
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        openRawResource.close();
        byte[] decode = Base64.decode(bArr, 0);
        this.f437b = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
        this.f438c = System.identityHashCode(this.f437b);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(decode);
            if (String.format("%32s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0').equals("3733dfb0f3fbcaad7ee369b33e2296ad")) {
                setAlpha(0.6f);
                return;
            }
            throw new RuntimeException();
        } catch (NoSuchAlgorithmException unused2) {
            throw new RuntimeException();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f437b.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12259a(RectF rectF) {
        this.f436a = rectF;
        int pixFromDp = DimensUtil.getPixFromDp(getContext(), 8);
        int i = pixFromDp / 2;
        int round = Math.round(rectF.right - rectF.left);
        int round2 = Math.round(rectF.bottom - rectF.top);
        CameraView cameraView = (CameraView) getParent();
        int height = cameraView.getHeight();
        float intrinsicWidth = ((float) this.f437b.getIntrinsicWidth()) / ((float) this.f437b.getIntrinsicHeight());
        int pixFromDp2 = DimensUtil.getPixFromDp(getContext(), 150);
        int round3 = Math.round(((float) pixFromDp2) / intrinsicWidth);
        int round4 = Math.round(rectF.bottom + ((float) pixFromDp));
        float f = (float) i;
        int round5 = Math.round(rectF.right - f);
        if (pixFromDp2 > round) {
            round5 = Math.round((float) (Math.round(rectF.right - ((float) (round / 2))) + (pixFromDp2 / 2)));
            if (round5 > cameraView.getRight()) {
                round5 = Math.round((float) (cameraView.getRight() - i));
            }
            if (round5 - pixFromDp2 < cameraView.getLeft()) {
                round5 = Math.round((float) (cameraView.getLeft() + i + pixFromDp2));
            }
        }
        boolean z = true;
        boolean z2 = (pixFromDp + round3) + round4 <= height;
        boolean z3 = round >= pixFromDp2 + i;
        boolean z4 = round2 >= round3 * 3;
        if (!z2 && z3 && z4) {
            round4 = Math.round((rectF.bottom - ((float) round3)) - f);
        } else if (!z2) {
            float f2 = (float) (round3 + i);
            if (rectF.top - f2 <= ((float) cameraView.getTop())) {
                z = false;
            }
            if (z) {
                round4 = Math.round(rectF.top - f2);
            }
        }
        int i2 = round3 + round4;
        int i3 = round5 - pixFromDp2;
        if (i3 <= cameraView.getLeft()) {
            i3 = cameraView.getLeft() + i;
            round5 = i3 + pixFromDp2;
        }
        this.f437b.setBounds(i3, round4, round5, i2);
        this.f439d = new Rect(i3, round4, round5, i2);
        invalidate();
    }

    /* renamed from: a */
    public final Rect mo12258a() {
        return this.f439d;
    }
}
