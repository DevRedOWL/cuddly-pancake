package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.net.Uri;
import com.facebook.common.executors.UiThreadImmediateExecutorService;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.datasource.BaseBitmapDataSubscriber;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.github.mikephil.charting.utils.Utils;
import com.zhihu.matisse.internal.loader.AlbumLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

class ImageShadowNode extends RenderableShadowNode {
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private String mAlign;

    /* renamed from: mH */
    private String f2273mH;
    private int mImageHeight;
    private int mImageWidth;
    /* access modifiers changed from: private */
    public final AtomicBoolean mLoading = new AtomicBoolean(false);
    private Matrix mMatrix = null;
    private int mMeetOrSlice;
    private Uri mUri;

    /* renamed from: mW */
    private String f2274mW;

    /* renamed from: mX */
    private String f2275mX;

    /* renamed from: mY */
    private String f2276mY;
    private String uriString;

    ImageShadowNode() {
    }

    @ReactProp(name = "x")
    public void setX(String str) {
        this.f2275mX = str;
        markUpdated();
    }

    @ReactProp(name = "y")
    public void setY(String str) {
        this.f2276mY = str;
        markUpdated();
    }

    @ReactProp(name = "width")
    public void setWidth(String str) {
        this.f2274mW = str;
        markUpdated();
    }

    @ReactProp(name = "height")
    public void seHeight(String str) {
        this.f2273mH = str;
        markUpdated();
    }

    @ReactProp(name = "src")
    public void setSrc(@Nullable ReadableMap readableMap) {
        if (readableMap != null) {
            this.uriString = readableMap.getString(AlbumLoader.COLUMN_URI);
            String str = this.uriString;
            if (str != null && !str.isEmpty()) {
                if (!readableMap.hasKey("width") || !readableMap.hasKey("height")) {
                    this.mImageWidth = 0;
                    this.mImageHeight = 0;
                } else {
                    this.mImageWidth = readableMap.getInt("width");
                    this.mImageHeight = readableMap.getInt("height");
                }
                this.mUri = Uri.parse(this.uriString);
                if (this.mUri.getScheme() == null) {
                    this.mUri = ResourceDrawableIdHelper.getInstance().getResourceDrawableUri(getThemedContext(), this.uriString);
                }
            }
        }
    }

    @ReactProp(name = "align")
    public void setAlign(String str) {
        this.mAlign = str;
        markUpdated();
    }

    @ReactProp(name = "meetOrSlice")
    public void setMeetOrSlice(int i) {
        this.mMeetOrSlice = i;
        markUpdated();
    }

    @ReactProp(name = "matrix")
    public void setMatrix(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            int matrixData = PropHelper.toMatrixData(readableArray, sRawMatrix, this.mScale);
            if (matrixData == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                }
                this.mMatrix.setValues(sRawMatrix);
            } else if (matrixData != -1) {
                FLog.m662w(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix = null;
        }
        markUpdated();
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        if (!this.mLoading.get()) {
            ImageRequest build = ImageRequestBuilder.newBuilderWithSource(new ImageSource(getThemedContext(), this.uriString).getUri()).build();
            if (Fresco.getImagePipeline().isInBitmapMemoryCache(build)) {
                tryRender(build, canvas, paint, f * this.mOpacity);
            } else {
                loadBitmap(build, canvas, paint, f * this.mOpacity);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        path.addRect(getRect(), Path.Direction.CW);
        return path;
    }

    private void loadBitmap(ImageRequest imageRequest, Canvas canvas, Paint paint, float f) {
        Fresco.getImagePipeline().fetchDecodedImage(imageRequest, getThemedContext()).subscribe(new BaseBitmapDataSubscriber() {
            public void onNewResultImpl(Bitmap bitmap) {
                ImageShadowNode.this.mLoading.set(false);
                SvgViewShadowNode svgShadowNode = ImageShadowNode.this.getSvgShadowNode();
                if (svgShadowNode != null) {
                    svgShadowNode.markUpdated();
                }
            }

            public void onFailureImpl(DataSource dataSource) {
                ImageShadowNode.this.mLoading.set(false);
                FLog.m665w(ReactConstants.TAG, dataSource.getFailureCause(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
            }
        }, UiThreadImmediateExecutorService.getInstance());
    }

    @Nonnull
    private RectF getRect() {
        double relativeOnWidth = relativeOnWidth(this.f2275mX);
        double relativeOnHeight = relativeOnHeight(this.f2276mY);
        double relativeOnWidth2 = relativeOnWidth(this.f2274mW);
        double relativeOnHeight2 = relativeOnHeight(this.f2273mH);
        if (relativeOnWidth2 == Utils.DOUBLE_EPSILON) {
            relativeOnWidth2 = (double) (((float) this.mImageWidth) * this.mScale);
        }
        if (relativeOnHeight2 == Utils.DOUBLE_EPSILON) {
            relativeOnHeight2 = (double) (((float) this.mImageHeight) * this.mScale);
        }
        return new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2));
    }

    private void doRender(Canvas canvas, Paint paint, Bitmap bitmap, float f) {
        if (this.mImageWidth == 0 || this.mImageHeight == 0) {
            this.mImageWidth = bitmap.getWidth();
            this.mImageHeight = bitmap.getHeight();
        }
        RectF rect = getRect();
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.mImageWidth, (float) this.mImageHeight);
        ViewBox.getTransform(rectF, rect, this.mAlign, this.mMeetOrSlice).mapRect(rectF);
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Path path = new Path();
        Path clipPath = getClipPath(canvas, paint);
        Path path2 = getPath(canvas, paint);
        if (clipPath != null) {
            path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
            Path path3 = new Path();
            path3.setFillType(Path.FillType.INVERSE_WINDING);
            path3.addPath(path2);
            path3.addPath(clipPath);
            Path path4 = new Path();
            path4.setFillType(Path.FillType.EVEN_ODD);
            path4.addPath(path2);
            path4.addPath(clipPath);
            canvas.clipPath(path4, Region.Op.DIFFERENCE);
            canvas.clipPath(path3, Region.Op.DIFFERENCE);
        } else {
            canvas.clipPath(path2, Region.Op.REPLACE);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
    }

    private void tryRender(ImageRequest imageRequest, Canvas canvas, Paint paint, float f) {
        CloseableReference result;
        Bitmap underlyingBitmap;
        DataSource<CloseableReference<CloseableImage>> fetchImageFromBitmapCache = Fresco.getImagePipeline().fetchImageFromBitmapCache(imageRequest, getThemedContext());
        try {
            result = fetchImageFromBitmapCache.getResult();
            if (result != null) {
                if ((result.get() instanceof CloseableBitmap) && (underlyingBitmap = ((CloseableBitmap) result.get()).getUnderlyingBitmap()) != null) {
                    doRender(canvas, paint, underlyingBitmap, f);
                }
                CloseableReference.closeSafely((CloseableReference<?>) result);
            }
            fetchImageFromBitmapCache.close();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        } catch (Exception e2) {
            try {
                throw new IllegalStateException(e2);
            } catch (Throwable th) {
                fetchImageFromBitmapCache.close();
                throw th;
            }
        } catch (Throwable th2) {
            CloseableReference.closeSafely((CloseableReference<?>) result);
            throw th2;
        }
    }

    private void bitmapTryRender(Bitmap bitmap, Canvas canvas, Paint paint, float f) {
        if (bitmap != null) {
            try {
                doRender(canvas, paint, bitmap, f);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
