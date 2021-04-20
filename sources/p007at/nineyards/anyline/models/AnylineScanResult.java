package p007at.nineyards.anyline.models;

import android.graphics.PointF;
import java.util.List;

/* renamed from: at.nineyards.anyline.models.AnylineScanResult */
public class AnylineScanResult<T> {

    /* renamed from: a */
    private List<PointF> f489a;

    /* renamed from: b */
    private final Integer f490b;

    /* renamed from: c */
    private final AnylineImage f491c;

    /* renamed from: d */
    private final AnylineImage f492d;

    /* renamed from: e */
    private final T f493e;

    protected AnylineScanResult(List<PointF> list, Integer num, AnylineImage anylineImage, AnylineImage anylineImage2, T t) {
        this.f493e = t;
        this.f489a = list;
        this.f490b = num;
        this.f491c = anylineImage;
        this.f492d = anylineImage2;
    }

    public AnylineImage getCutoutImage() {
        return this.f491c;
    }

    public AnylineImage getFullImage() {
        return this.f492d;
    }

    public List<PointF> getOutline() {
        return this.f489a;
    }

    public Integer getConfidence() {
        return this.f490b;
    }

    public T getResult() {
        return this.f493e;
    }

    public void setOutline(List<PointF> list) {
        this.f489a = list;
    }
}
