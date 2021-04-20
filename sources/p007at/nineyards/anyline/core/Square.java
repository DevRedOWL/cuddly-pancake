package p007at.nineyards.anyline.core;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Point;
import org.opencv.core.Rect;

/* renamed from: at.nineyards.anyline.core.Square */
public class Square {

    /* renamed from: a */
    private transient long f460a;
    protected transient boolean swigCMemOwn;

    protected Square(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f460a = j;
    }

    protected static long getCPtr(Square square) {
        if (square == null) {
            return 0;
        }
        return square.f460a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f460a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Square(this.f460a);
            }
            this.f460a = 0;
        }
    }

    public List<PointF> toPointFList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PointF((float) upLeft().f6481x, (float) upLeft().f6482y));
        arrayList.add(new PointF((float) upRight().f6481x, (float) upRight().f6482y));
        arrayList.add(new PointF((float) downRight().f6481x, (float) downRight().f6482y));
        arrayList.add(new PointF((float) downLeft().f6481x, (float) downLeft().f6482y));
        return arrayList;
    }

    public Square() {
        this(anyline_coreJNI.new_Square__SWIG_0(), true);
    }

    public Square(Square square) {
        this(anyline_coreJNI.new_Square__SWIG_1(getCPtr(square), square), true);
    }

    public Square(Rect rect) {
        this(anyline_coreJNI.new_Square__SWIG_2(rect), true);
    }

    public Square(Point point, Point point2, Point point3, Point point4) {
        this(anyline_coreJNI.new_Square__SWIG_3(point, point2, point3, point4), true);
    }

    public Point upLeft() {
        return anyline_coreJNI.Square_upLeft(this.f460a, this);
    }

    public Point upRight() {
        return anyline_coreJNI.Square_upRight(this.f460a, this);
    }

    public Point downLeft() {
        return anyline_coreJNI.Square_downLeft(this.f460a, this);
    }

    public Point downRight() {
        return anyline_coreJNI.Square_downRight(this.f460a, this);
    }

    public void setUpLeft(Point point) {
        anyline_coreJNI.Square_setUpLeft(this.f460a, this, point);
    }

    public void setUpRight(Point point) {
        anyline_coreJNI.Square_setUpRight(this.f460a, this, point);
    }

    public void setDownLeft(Point point) {
        anyline_coreJNI.Square_setDownLeft(this.f460a, this, point);
    }

    public void setDownRight(Point point) {
        anyline_coreJNI.Square_setDownRight(this.f460a, this, point);
    }

    public double area() {
        return anyline_coreJNI.Square_area(this.f460a, this);
    }

    public double boundingX() {
        return anyline_coreJNI.Square_boundingX(this.f460a, this);
    }

    public double boundingY() {
        return anyline_coreJNI.Square_boundingY(this.f460a, this);
    }

    public double boundingWidth() {
        return anyline_coreJNI.Square_boundingWidth(this.f460a, this);
    }

    public double boundingHeight() {
        return anyline_coreJNI.Square_boundingHeight(this.f460a, this);
    }

    public double innerX() {
        return anyline_coreJNI.Square_innerX(this.f460a, this);
    }

    public double innerY() {
        return anyline_coreJNI.Square_innerY(this.f460a, this);
    }

    public double innerWidth() {
        return anyline_coreJNI.Square_innerWidth(this.f460a, this);
    }

    public double innerHeight() {
        return anyline_coreJNI.Square_innerHeight(this.f460a, this);
    }

    public double ratio() {
        return anyline_coreJNI.Square_ratio(this.f460a, this);
    }

    public double upperWidth() {
        return anyline_coreJNI.Square_upperWidth(this.f460a, this);
    }

    public double lowerWidth() {
        return anyline_coreJNI.Square_lowerWidth(this.f460a, this);
    }

    public double maxWidth() {
        return anyline_coreJNI.Square_maxWidth(this.f460a, this);
    }

    public double leftHeight() {
        return anyline_coreJNI.Square_leftHeight(this.f460a, this);
    }

    public double rightHeight() {
        return anyline_coreJNI.Square_rightHeight(this.f460a, this);
    }

    public double maxHeight() {
        return anyline_coreJNI.Square_maxHeight(this.f460a, this);
    }

    public void setPoints(Point point, Point point2, Point point3, Point point4) {
        anyline_coreJNI.Square_setPoints(this.f460a, this, point, point2, point3, point4);
    }
}
