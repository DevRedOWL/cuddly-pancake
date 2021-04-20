package com.swmansion.reanimated.nodes;

import android.graphics.PointF;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.NodesManager;

public class BezierNode extends Node {
    private final int mInputID;
    private final CubicBezierInterpolator mInterpolator;

    private static class CubicBezierInterpolator {

        /* renamed from: a */
        protected PointF f2312a;

        /* renamed from: b */
        protected PointF f2313b;

        /* renamed from: c */
        protected PointF f2314c;
        protected PointF end;
        protected PointF start;

        public CubicBezierInterpolator(PointF pointF, PointF pointF2) {
            this.f2312a = new PointF();
            this.f2313b = new PointF();
            this.f2314c = new PointF();
            this.start = pointF;
            this.end = pointF2;
        }

        public CubicBezierInterpolator(float f, float f2, float f3, float f4) {
            this(new PointF(f, f2), new PointF(f3, f4));
        }

        public float getInterpolation(float f) {
            return getBezierCoordinateY(getXForTime(f));
        }

        /* access modifiers changed from: protected */
        public float getBezierCoordinateY(float f) {
            this.f2314c.y = this.start.y * 3.0f;
            this.f2313b.y = ((this.end.y - this.start.y) * 3.0f) - this.f2314c.y;
            this.f2312a.y = (1.0f - this.f2314c.y) - this.f2313b.y;
            return f * (this.f2314c.y + ((this.f2313b.y + (this.f2312a.y * f)) * f));
        }

        /* access modifiers changed from: protected */
        public float getXForTime(float f) {
            float f2 = f;
            for (int i = 1; i < 14; i++) {
                float bezierCoordinateX = getBezierCoordinateX(f2) - f;
                if (((double) Math.abs(bezierCoordinateX)) < 0.001d) {
                    break;
                }
                f2 -= bezierCoordinateX / getXDerivate(f2);
            }
            return f2;
        }

        private float getXDerivate(float f) {
            return this.f2314c.x + (f * ((this.f2313b.x * 2.0f) + (this.f2312a.x * 3.0f * f)));
        }

        private float getBezierCoordinateX(float f) {
            this.f2314c.x = this.start.x * 3.0f;
            this.f2313b.x = ((this.end.x - this.start.x) * 3.0f) - this.f2314c.x;
            this.f2312a.x = (1.0f - this.f2314c.x) - this.f2313b.x;
            return f * (this.f2314c.x + ((this.f2313b.x + (this.f2312a.x * f)) * f));
        }
    }

    public BezierNode(int i, ReadableMap readableMap, NodesManager nodesManager) {
        super(i, readableMap, nodesManager);
        this.mInputID = readableMap.getInt("input");
        this.mInterpolator = new CubicBezierInterpolator((float) readableMap.getDouble("mX1"), (float) readableMap.getDouble("mY1"), (float) readableMap.getDouble("mX2"), (float) readableMap.getDouble("mY2"));
    }

    /* access modifiers changed from: protected */
    public Double evaluate() {
        return Double.valueOf((double) this.mInterpolator.getInterpolation(((Double) this.mNodesManager.getNodeValue(this.mInputID)).floatValue()));
    }
}
