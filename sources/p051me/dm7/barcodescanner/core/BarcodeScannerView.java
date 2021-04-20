package p051me.dm7.barcodescanner.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import kotlinx.coroutines.DebugKt;

/* renamed from: me.dm7.barcodescanner.core.BarcodeScannerView */
public abstract class BarcodeScannerView extends FrameLayout implements Camera.PreviewCallback {
    private float mAspectTolerance = 0.1f;
    private boolean mAutofocusState = true;
    private float mBorderAlpha = 1.0f;
    private int mBorderColor = getResources().getColor(C5046R.C5047color.viewfinder_border);
    private int mBorderLength = getResources().getInteger(C5046R.integer.viewfinder_border_length);
    private int mBorderWidth = getResources().getInteger(C5046R.integer.viewfinder_border_width);
    private CameraHandlerThread mCameraHandlerThread;
    private CameraWrapper mCameraWrapper;
    private int mCornerRadius = 0;
    private Boolean mFlashState;
    private Rect mFramingRectInPreview;
    private boolean mIsLaserEnabled = true;
    private int mLaserColor = getResources().getColor(C5046R.C5047color.viewfinder_laser);
    private int mMaskColor = getResources().getColor(C5046R.C5047color.viewfinder_mask);
    private CameraPreview mPreview;
    private boolean mRoundedCorner = false;
    private boolean mShouldScaleToFill = true;
    private boolean mSquaredFinder = false;
    private int mViewFinderOffset = 0;
    private IViewFinder mViewFinderView;

    public BarcodeScannerView(Context context) {
        super(context);
        init();
    }

    /* JADX INFO: finally extract failed */
    public BarcodeScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C5046R.styleable.BarcodeScannerView, 0, 0);
        try {
            setShouldScaleToFill(obtainStyledAttributes.getBoolean(C5046R.styleable.BarcodeScannerView_shouldScaleToFill, true));
            this.mIsLaserEnabled = obtainStyledAttributes.getBoolean(C5046R.styleable.BarcodeScannerView_laserEnabled, this.mIsLaserEnabled);
            this.mLaserColor = obtainStyledAttributes.getColor(C5046R.styleable.BarcodeScannerView_laserColor, this.mLaserColor);
            this.mBorderColor = obtainStyledAttributes.getColor(C5046R.styleable.BarcodeScannerView_borderColor, this.mBorderColor);
            this.mMaskColor = obtainStyledAttributes.getColor(C5046R.styleable.BarcodeScannerView_maskColor, this.mMaskColor);
            this.mBorderWidth = obtainStyledAttributes.getDimensionPixelSize(C5046R.styleable.BarcodeScannerView_borderWidth, this.mBorderWidth);
            this.mBorderLength = obtainStyledAttributes.getDimensionPixelSize(C5046R.styleable.BarcodeScannerView_borderLength, this.mBorderLength);
            this.mRoundedCorner = obtainStyledAttributes.getBoolean(C5046R.styleable.BarcodeScannerView_roundedCorner, this.mRoundedCorner);
            this.mCornerRadius = obtainStyledAttributes.getDimensionPixelSize(C5046R.styleable.BarcodeScannerView_cornerRadius, this.mCornerRadius);
            this.mSquaredFinder = obtainStyledAttributes.getBoolean(C5046R.styleable.BarcodeScannerView_squaredFinder, this.mSquaredFinder);
            this.mBorderAlpha = obtainStyledAttributes.getFloat(C5046R.styleable.BarcodeScannerView_borderAlpha, this.mBorderAlpha);
            this.mViewFinderOffset = obtainStyledAttributes.getDimensionPixelSize(C5046R.styleable.BarcodeScannerView_finderOffset, this.mViewFinderOffset);
            obtainStyledAttributes.recycle();
            init();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void init() {
        this.mViewFinderView = createViewFinderView(getContext());
    }

    public final void setupLayout(CameraWrapper cameraWrapper) {
        removeAllViews();
        this.mPreview = new CameraPreview(getContext(), cameraWrapper, this);
        this.mPreview.setAspectTolerance(this.mAspectTolerance);
        this.mPreview.setShouldScaleToFill(this.mShouldScaleToFill);
        if (!this.mShouldScaleToFill) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setGravity(17);
            relativeLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            relativeLayout.addView(this.mPreview);
            addView(relativeLayout);
        } else {
            addView(this.mPreview);
        }
        IViewFinder iViewFinder = this.mViewFinderView;
        if (iViewFinder instanceof View) {
            addView((View) iViewFinder);
            return;
        }
        throw new IllegalArgumentException("IViewFinder object returned by 'createViewFinderView()' should be instance of android.view.View");
    }

    /* access modifiers changed from: protected */
    public IViewFinder createViewFinderView(Context context) {
        ViewFinderView viewFinderView = new ViewFinderView(context);
        viewFinderView.setBorderColor(this.mBorderColor);
        viewFinderView.setLaserColor(this.mLaserColor);
        viewFinderView.setLaserEnabled(this.mIsLaserEnabled);
        viewFinderView.setBorderStrokeWidth(this.mBorderWidth);
        viewFinderView.setBorderLineLength(this.mBorderLength);
        viewFinderView.setMaskColor(this.mMaskColor);
        viewFinderView.setBorderCornerRounded(this.mRoundedCorner);
        viewFinderView.setBorderCornerRadius(this.mCornerRadius);
        viewFinderView.setSquareViewFinder(this.mSquaredFinder);
        viewFinderView.setViewFinderOffset(this.mViewFinderOffset);
        return viewFinderView;
    }

    public void setLaserColor(int i) {
        this.mLaserColor = i;
        this.mViewFinderView.setLaserColor(this.mLaserColor);
        this.mViewFinderView.setupViewFinder();
    }

    public void setMaskColor(int i) {
        this.mMaskColor = i;
        this.mViewFinderView.setMaskColor(this.mMaskColor);
        this.mViewFinderView.setupViewFinder();
    }

    public void setBorderColor(int i) {
        this.mBorderColor = i;
        this.mViewFinderView.setBorderColor(this.mBorderColor);
        this.mViewFinderView.setupViewFinder();
    }

    public void setBorderStrokeWidth(int i) {
        this.mBorderWidth = i;
        this.mViewFinderView.setBorderStrokeWidth(this.mBorderWidth);
        this.mViewFinderView.setupViewFinder();
    }

    public void setBorderLineLength(int i) {
        this.mBorderLength = i;
        this.mViewFinderView.setBorderLineLength(this.mBorderLength);
        this.mViewFinderView.setupViewFinder();
    }

    public void setLaserEnabled(boolean z) {
        this.mIsLaserEnabled = z;
        this.mViewFinderView.setLaserEnabled(this.mIsLaserEnabled);
        this.mViewFinderView.setupViewFinder();
    }

    public void setIsBorderCornerRounded(boolean z) {
        this.mRoundedCorner = z;
        this.mViewFinderView.setBorderCornerRounded(this.mRoundedCorner);
        this.mViewFinderView.setupViewFinder();
    }

    public void setBorderCornerRadius(int i) {
        this.mCornerRadius = i;
        this.mViewFinderView.setBorderCornerRadius(this.mCornerRadius);
        this.mViewFinderView.setupViewFinder();
    }

    public void setSquareViewFinder(boolean z) {
        this.mSquaredFinder = z;
        this.mViewFinderView.setSquareViewFinder(this.mSquaredFinder);
        this.mViewFinderView.setupViewFinder();
    }

    public void setBorderAlpha(float f) {
        this.mBorderAlpha = f;
        this.mViewFinderView.setBorderAlpha(this.mBorderAlpha);
        this.mViewFinderView.setupViewFinder();
    }

    public void startCamera(int i) {
        if (this.mCameraHandlerThread == null) {
            this.mCameraHandlerThread = new CameraHandlerThread(this);
        }
        this.mCameraHandlerThread.startCamera(i);
    }

    public void setupCameraPreview(CameraWrapper cameraWrapper) {
        this.mCameraWrapper = cameraWrapper;
        CameraWrapper cameraWrapper2 = this.mCameraWrapper;
        if (cameraWrapper2 != null) {
            setupLayout(cameraWrapper2);
            this.mViewFinderView.setupViewFinder();
            Boolean bool = this.mFlashState;
            if (bool != null) {
                setFlash(bool.booleanValue());
            }
            setAutoFocus(this.mAutofocusState);
        }
    }

    public void startCamera() {
        startCamera(CameraUtils.getDefaultCameraId());
    }

    public void stopCamera() {
        if (this.mCameraWrapper != null) {
            this.mPreview.stopCameraPreview();
            this.mPreview.setCamera((CameraWrapper) null, (Camera.PreviewCallback) null);
            this.mCameraWrapper.mCamera.release();
            this.mCameraWrapper = null;
        }
        CameraHandlerThread cameraHandlerThread = this.mCameraHandlerThread;
        if (cameraHandlerThread != null) {
            cameraHandlerThread.quit();
            this.mCameraHandlerThread = null;
        }
    }

    public void stopCameraPreview() {
        CameraPreview cameraPreview = this.mPreview;
        if (cameraPreview != null) {
            cameraPreview.stopCameraPreview();
        }
    }

    /* access modifiers changed from: protected */
    public void resumeCameraPreview() {
        CameraPreview cameraPreview = this.mPreview;
        if (cameraPreview != null) {
            cameraPreview.showCameraPreview();
        }
    }

    public synchronized Rect getFramingRectInPreview(int i, int i2) {
        if (this.mFramingRectInPreview == null) {
            Rect framingRect = this.mViewFinderView.getFramingRect();
            int width = this.mViewFinderView.getWidth();
            int height = this.mViewFinderView.getHeight();
            if (!(framingRect == null || width == 0)) {
                if (height != 0) {
                    Rect rect = new Rect(framingRect);
                    if (i < width) {
                        rect.left = (rect.left * i) / width;
                        rect.right = (rect.right * i) / width;
                    }
                    if (i2 < height) {
                        rect.top = (rect.top * i2) / height;
                        rect.bottom = (rect.bottom * i2) / height;
                    }
                    this.mFramingRectInPreview = rect;
                }
            }
            return null;
        }
        return this.mFramingRectInPreview;
    }

    public void setFlash(boolean z) {
        this.mFlashState = Boolean.valueOf(z);
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        if (cameraWrapper != null && CameraUtils.isFlashSupported(cameraWrapper.mCamera)) {
            Camera.Parameters parameters = this.mCameraWrapper.mCamera.getParameters();
            if (z) {
                if (!parameters.getFlashMode().equals("torch")) {
                    parameters.setFlashMode("torch");
                } else {
                    return;
                }
            } else if (!parameters.getFlashMode().equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                parameters.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            } else {
                return;
            }
            this.mCameraWrapper.mCamera.setParameters(parameters);
        }
    }

    public boolean getFlash() {
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        if (cameraWrapper == null || !CameraUtils.isFlashSupported(cameraWrapper.mCamera) || !this.mCameraWrapper.mCamera.getParameters().getFlashMode().equals("torch")) {
            return false;
        }
        return true;
    }

    public void toggleFlash() {
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        if (cameraWrapper != null && CameraUtils.isFlashSupported(cameraWrapper.mCamera)) {
            Camera.Parameters parameters = this.mCameraWrapper.mCamera.getParameters();
            if (parameters.getFlashMode().equals("torch")) {
                parameters.setFlashMode(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            } else {
                parameters.setFlashMode("torch");
            }
            this.mCameraWrapper.mCamera.setParameters(parameters);
        }
    }

    public void setAutoFocus(boolean z) {
        this.mAutofocusState = z;
        CameraPreview cameraPreview = this.mPreview;
        if (cameraPreview != null) {
            cameraPreview.setAutoFocus(z);
        }
    }

    public void setShouldScaleToFill(boolean z) {
        this.mShouldScaleToFill = z;
    }

    public void setAspectTolerance(float f) {
        this.mAspectTolerance = f;
    }

    public byte[] getRotatedData(byte[] bArr, Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        int i = previewSize.width;
        int i2 = previewSize.height;
        int rotationCount = getRotationCount();
        if (rotationCount != 1 && rotationCount != 3) {
            return bArr;
        }
        int i3 = i2;
        byte[] bArr2 = bArr;
        int i4 = 0;
        while (i4 < rotationCount) {
            byte[] bArr3 = new byte[bArr2.length];
            for (int i5 = 0; i5 < i3; i5++) {
                for (int i6 = 0; i6 < i; i6++) {
                    bArr3[(((i6 * i3) + i3) - i5) - 1] = bArr2[(i5 * i) + i6];
                }
            }
            i4++;
            bArr2 = bArr3;
            int i7 = i3;
            i3 = i;
            i = i7;
        }
        return bArr2;
    }

    public int getRotationCount() {
        return this.mPreview.getDisplayOrientation() / 90;
    }
}
