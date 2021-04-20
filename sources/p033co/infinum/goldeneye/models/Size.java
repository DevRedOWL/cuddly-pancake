package p033co.infinum.goldeneye.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0002J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0013J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001a"}, mo51343d2 = {"Lco/infinum/goldeneye/models/Size;", "", "width", "", "height", "(II)V", "aspectRatio", "", "getAspectRatio", "()F", "getHeight", "()I", "getWidth", "compareTo", "other", "component1", "component2", "copy", "equals", "", "", "hashCode", "isOver1080p", "toString", "", "Companion", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.models.Size */
/* compiled from: Size.kt */
public final class Size implements Comparable<Size> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Size UNKNOWN = new Size(0, 0);
    private final float aspectRatio;
    private final int height;
    private final int width;

    public static /* synthetic */ Size copy$default(Size size, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = size.width;
        }
        if ((i3 & 2) != 0) {
            i2 = size.height;
        }
        return size.copy(i, i2);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final Size copy(int i, int i2) {
        return new Size(i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Size) {
                Size size = (Size) obj;
                if (this.width == size.width) {
                    if (this.height == size.height) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ")";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r0.width;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Size(int r1, int r2) {
        /*
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            int r1 = r0.height
            if (r1 == 0) goto L_0x0013
            int r2 = r0.width
            if (r2 == 0) goto L_0x0013
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            goto L_0x0015
        L_0x0013:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0015:
            r0.aspectRatio = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033co.infinum.goldeneye.models.Size.<init>(int, int):void");
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lco/infinum/goldeneye/models/Size$Companion;", "", "()V", "UNKNOWN", "Lco/infinum/goldeneye/models/Size;", "getUNKNOWN", "()Lco/infinum/goldeneye/models/Size;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
    /* renamed from: co.infinum.goldeneye.models.Size$Companion */
    /* compiled from: Size.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Size getUNKNOWN() {
            return Size.UNKNOWN;
        }
    }

    public int compareTo(Size size) {
        Intrinsics.checkParameterIsNotNull(size, Contact.Type.other);
        return (size.height * size.width) - (this.width * this.height);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean isOver1080p() {
        return this.width > 1080 && this.height > 1080;
    }
}
