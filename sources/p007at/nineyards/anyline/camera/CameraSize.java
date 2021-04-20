package p007at.nineyards.anyline.camera;

import android.hardware.Camera;
import android.util.Size;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

/* renamed from: at.nineyards.anyline.camera.CameraSize */
public class CameraSize {

    /* renamed from: a */
    private final int f350a;

    /* renamed from: b */
    private final int f351b;

    public CameraSize(Camera.Size size) {
        this.f350a = size.width;
        this.f351b = size.height;
    }

    public CameraSize(Size size) {
        this.f350a = size.getWidth();
        this.f351b = size.getHeight();
    }

    public CameraSize(int i, int i2) {
        this.f350a = i;
        this.f351b = i2;
    }

    public int getWidth() {
        return this.f350a;
    }

    public int getHeight() {
        return this.f351b;
    }

    public int getLonger() {
        int i = this.f350a;
        int i2 = this.f351b;
        return i > i2 ? i : i2;
    }

    public int getShorter() {
        int i = this.f350a;
        int i2 = this.f351b;
        return i > i2 ? i2 : i;
    }

    public String toString() {
        return this.f350a + MapPoint.JsonFields.f6911x + this.f351b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraSize) {
            CameraSize cameraSize = (CameraSize) obj;
            return this.f350a == cameraSize.f350a && this.f351b == cameraSize.f351b;
        }
    }

    public int hashCode() {
        int i = this.f351b;
        int i2 = this.f350a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }
}
