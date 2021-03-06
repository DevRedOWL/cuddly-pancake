package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public abstract class RenderableShadowNode extends VirtualNode {
    private static final int CAP_BUTT = 0;
    private static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    private static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    private static final int JOIN_ROUND = 1;
    @Nullable
    protected ArrayList<String> mAttributeList;
    @Nullable
    public ReadableArray mFill;
    public float mFillOpacity = 1.0f;
    public Path.FillType mFillRule = Path.FillType.WINDING;
    @Nullable
    private ArrayList<String> mLastMergedList;
    @Nullable
    private ArrayList<Object> mOriginProperties;
    @Nullable
    protected ArrayList<String> mPropList;
    @Nullable
    public ReadableArray mStroke;
    @Nullable
    public String[] mStrokeDasharray;
    public float mStrokeDashoffset = 0.0f;
    public Paint.Cap mStrokeLinecap = Paint.Cap.ROUND;
    public Paint.Join mStrokeLinejoin = Paint.Join.ROUND;
    public float mStrokeMiterlimit = 4.0f;
    public float mStrokeOpacity = 1.0f;
    public String mStrokeWidth = "1";

    /* access modifiers changed from: protected */
    public abstract Path getPath(Canvas canvas, Paint paint);

    @ReactProp(defaultInt = 1, name = "clipRule")
    public /* bridge */ /* synthetic */ void clipRule(int i) {
        super.clipRule(i);
    }

    public /* bridge */ /* synthetic */ RectF getClientRect() {
        return super.getClientRect();
    }

    public /* bridge */ /* synthetic */ boolean isResponsible() {
        return super.isResponsible();
    }

    public /* bridge */ /* synthetic */ boolean isVirtual() {
        return super.isVirtual();
    }

    public /* bridge */ /* synthetic */ boolean isVirtualAnchor() {
        return super.isVirtualAnchor();
    }

    public /* bridge */ /* synthetic */ void markUpdated() {
        super.markUpdated();
    }

    @ReactProp(name = "clipPath")
    public /* bridge */ /* synthetic */ void setClipPath(String str) {
        super.setClipPath(str);
    }

    @ReactProp(name = "matrix")
    public /* bridge */ /* synthetic */ void setMatrix(@Nullable ReadableArray readableArray) {
        super.setMatrix(readableArray);
    }

    @ReactProp(name = "name")
    public /* bridge */ /* synthetic */ void setName(String str) {
        super.setName(str);
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public /* bridge */ /* synthetic */ void setOpacity(float f) {
        super.setOpacity(f);
    }

    @ReactProp(name = "responsible")
    public /* bridge */ /* synthetic */ void setResponsible(boolean z) {
        super.setResponsible(z);
    }

    @ReactProp(name = "fill")
    public void setFill(@Nullable ReadableArray readableArray) {
        this.mFill = readableArray;
        markUpdated();
    }

    @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(float f) {
        this.mFillOpacity = f;
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "fillRule")
    public void setFillRule(int i) {
        if (i == 0) {
            this.mFillRule = Path.FillType.EVEN_ODD;
        } else if (i != 1) {
            throw new JSApplicationIllegalArgumentException("fillRule " + this.mFillRule + " unrecognized");
        }
        markUpdated();
    }

    @ReactProp(name = "stroke")
    public void setStroke(@Nullable ReadableArray readableArray) {
        this.mStroke = readableArray;
        markUpdated();
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(float f) {
        this.mStrokeOpacity = f;
        markUpdated();
    }

    @ReactProp(name = "strokeDasharray")
    public void setStrokeDasharray(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            int size = readableArray.size();
            this.mStrokeDasharray = new String[size];
            for (int i = 0; i < size; i++) {
                this.mStrokeDasharray[i] = readableArray.getString(i);
            }
        } else {
            this.mStrokeDasharray = null;
        }
        markUpdated();
    }

    @ReactProp(name = "strokeDashoffset")
    public void setStrokeDashoffset(float f) {
        this.mStrokeDashoffset = f * this.mScale;
        markUpdated();
    }

    @ReactProp(name = "strokeWidth")
    public void setStrokeWidth(String str) {
        this.mStrokeWidth = str;
        markUpdated();
    }

    @ReactProp(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(float f) {
        this.mStrokeMiterlimit = f;
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(int i) {
        if (i == 0) {
            this.mStrokeLinecap = Paint.Cap.BUTT;
        } else if (i == 1) {
            this.mStrokeLinecap = Paint.Cap.ROUND;
        } else if (i == 2) {
            this.mStrokeLinecap = Paint.Cap.SQUARE;
        } else {
            throw new JSApplicationIllegalArgumentException("strokeLinecap " + this.mStrokeLinecap + " unrecognized");
        }
        markUpdated();
    }

    @ReactProp(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(int i) {
        if (i == 0) {
            this.mStrokeLinejoin = Paint.Join.MITER;
        } else if (i == 1) {
            this.mStrokeLinejoin = Paint.Join.ROUND;
        } else if (i == 2) {
            this.mStrokeLinejoin = Paint.Join.BEVEL;
        } else {
            throw new JSApplicationIllegalArgumentException("strokeLinejoin " + this.mStrokeLinejoin + " unrecognized");
        }
        markUpdated();
    }

    @ReactProp(name = "propList")
    public void setPropList(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i = 0; i < readableArray.size(); i++) {
                this.mPropList.add(propertyNameToFieldName(readableArray.getString(i)));
            }
        }
        markUpdated();
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.mOpacity;
        if (f2 > 0.01f) {
            if (this.mPath == null) {
                this.mPath = getPath(canvas, paint);
                this.mPath.setFillType(this.mFillRule);
            }
            RectF rectF = new RectF();
            this.mPath.computeBounds(rectF, true);
            new Matrix(canvas.getMatrix()).mapRect(rectF);
            setClientRect(rectF);
            clip(canvas, paint);
            if (setupFillPaint(paint, this.mFillOpacity * f2)) {
                canvas.drawPath(this.mPath, paint);
            }
            if (setupStrokePaint(paint, f2 * this.mStrokeOpacity)) {
                canvas.drawPath(this.mPath, paint);
            }
        }
    }

    private boolean setupFillPaint(Paint paint, float f) {
        ReadableArray readableArray = this.mFill;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f, this.mFill);
        return true;
    }

    private boolean setupStrokePaint(Paint paint, float f) {
        ReadableArray readableArray;
        paint.reset();
        double relativeOnOther = relativeOnOther(this.mStrokeWidth);
        if (relativeOnOther == Utils.DOUBLE_EPSILON || (readableArray = this.mStroke) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.mStrokeLinecap);
        paint.setStrokeJoin(this.mStrokeLinejoin);
        paint.setStrokeMiter(this.mStrokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) relativeOnOther);
        setupPaint(paint, f, this.mStroke);
        String[] strArr = this.mStrokeDasharray;
        if (strArr == null) {
            return true;
        }
        int length = strArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) relativeOnOther(this.mStrokeDasharray[i]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.mStrokeDashoffset));
        return true;
    }

    private void setupPaint(Paint paint, float f, ReadableArray readableArray) {
        Brush definedBrush;
        int i = readableArray.getInt(0);
        if (i == 0) {
            paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f) * 255.0d : (double) (f * 255.0f)), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        } else if (i == 1 && (definedBrush = getSvgShadowNode().getDefinedBrush(readableArray.getString(1))) != null) {
            if (this.mBox == null) {
                this.mBox = new RectF();
                this.mPath.computeBounds(this.mBox, true);
            }
            definedBrush.setupPaint(paint, this.mBox, this.mScale, f);
        }
    }

    public int hitTest(float[] fArr) {
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            if (this.mRegion == null && this.mPath != null) {
                this.mRegion = getRegion(this.mPath);
            }
            if (this.mRegion != null && this.mRegion.contains(round, round2)) {
                Path clipPath = getClipPath();
                if (clipPath != null) {
                    if (this.mClipRegionPath != clipPath) {
                        this.mClipRegionPath = clipPath;
                        this.mClipRegion = getRegion(clipPath);
                    }
                    if (!this.mClipRegion.contains(round, round2)) {
                        return -1;
                    }
                }
                return getReactTag();
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Region getRegion(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom)));
        return region;
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    /* access modifiers changed from: package-private */
    public void mergeProperties(RenderableShadowNode renderableShadowNode) {
        ArrayList<String> attributeList = renderableShadowNode.getAttributeList();
        if (attributeList != null && attributeList.size() != 0) {
            this.mOriginProperties = new ArrayList<>();
            ArrayList<String> arrayList = this.mPropList;
            this.mAttributeList = arrayList == null ? new ArrayList<>() : new ArrayList<>(arrayList);
            int i = 0;
            int size = attributeList.size();
            while (i < size) {
                try {
                    String str = attributeList.get(i);
                    Field field = getClass().getField(str);
                    Object obj = field.get(renderableShadowNode);
                    this.mOriginProperties.add(field.get(this));
                    if (!hasOwnProperty(str)) {
                        this.mAttributeList.add(str);
                        field.set(this, obj);
                    }
                    i++;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            this.mLastMergedList = attributeList;
        }
    }

    /* access modifiers changed from: package-private */
    public void resetProperties() {
        ArrayList<String> arrayList = this.mLastMergedList;
        if (arrayList != null && this.mOriginProperties != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
                }
                this.mLastMergedList = null;
                this.mOriginProperties = null;
                this.mAttributeList = this.mPropList;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private String propertyNameToFieldName(String str) {
        Matcher matcher = Pattern.compile("^(\\w)").matcher(str);
        StringBuffer stringBuffer = new StringBuffer("m");
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private boolean hasOwnProperty(String str) {
        ArrayList<String> arrayList = this.mAttributeList;
        return arrayList != null && arrayList.contains(str);
    }
}
