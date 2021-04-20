package p007at.nineyards.anyline.camera;

import android.media.Image;

/* renamed from: at.nineyards.anyline.camera.b */
final class C0764b {

    /* renamed from: a */
    private Image f425a;

    C0764b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Image mo12249a() {
        return this.f425a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12250a(Image image) {
        this.f425a = image;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12251b() {
        Image image = this.f425a;
        if (image != null) {
            image.close();
            this.f425a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo12252c() {
        return this.f425a != null;
    }
}
