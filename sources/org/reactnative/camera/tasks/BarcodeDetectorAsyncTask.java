package org.reactnative.camera.tasks;

import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.firebase.messaging.Constants;
import org.reactnative.barcodedetector.BarcodeFormatUtils;
import org.reactnative.barcodedetector.RNBarcodeDetector;
import org.reactnative.camera.utils.ImageDimensions;
import org.reactnative.frame.RNFrameFactory;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class BarcodeDetectorAsyncTask extends AsyncTask<Void, Void, SparseArray<Barcode>> {
    private RNBarcodeDetector mBarcodeDetector;
    private BarcodeDetectorAsyncTaskDelegate mDelegate;
    private int mHeight;
    private byte[] mImageData;
    private ImageDimensions mImageDimensions;
    private int mPaddingLeft;
    private int mPaddingTop;
    private int mRotation;
    private double mScaleX;
    private double mScaleY;
    private int mWidth;

    public BarcodeDetectorAsyncTask(BarcodeDetectorAsyncTaskDelegate barcodeDetectorAsyncTaskDelegate, RNBarcodeDetector rNBarcodeDetector, byte[] bArr, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, int i8) {
        this.mImageData = bArr;
        this.mWidth = i;
        this.mHeight = i2;
        this.mRotation = i3;
        this.mDelegate = barcodeDetectorAsyncTaskDelegate;
        this.mBarcodeDetector = rNBarcodeDetector;
        this.mImageDimensions = new ImageDimensions(i, i2, i3, i4);
        this.mScaleX = ((double) i5) / ((double) (((float) this.mImageDimensions.getWidth()) * f));
        this.mScaleY = ((double) i6) / ((double) (((float) this.mImageDimensions.getHeight()) * f));
        this.mPaddingLeft = i7;
        this.mPaddingTop = i8;
    }

    /* access modifiers changed from: protected */
    public SparseArray<Barcode> doInBackground(Void... voidArr) {
        RNBarcodeDetector rNBarcodeDetector;
        if (isCancelled() || this.mDelegate == null || (rNBarcodeDetector = this.mBarcodeDetector) == null || !rNBarcodeDetector.isOperational()) {
            return null;
        }
        return this.mBarcodeDetector.detect(RNFrameFactory.buildFrame(this.mImageData, this.mWidth, this.mHeight, this.mRotation));
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(SparseArray<Barcode> sparseArray) {
        super.onPostExecute(sparseArray);
        if (sparseArray == null) {
            this.mDelegate.onBarcodeDetectionError(this.mBarcodeDetector);
            return;
        }
        if (sparseArray.size() > 0) {
            this.mDelegate.onBarcodesDetected(serializeEventData(sparseArray));
        }
        this.mDelegate.onBarcodeDetectingTaskCompleted();
    }

    private WritableArray serializeEventData(SparseArray<Barcode> sparseArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            Barcode valueAt = sparseArray.valueAt(i);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("data", valueAt.displayValue);
            createMap.putString(Constants.MessagePayloadKeys.RAW_DATA, valueAt.rawValue);
            createMap.putString("type", BarcodeFormatUtils.get(valueAt.format));
            createMap.putMap("bounds", processBounds(valueAt.getBoundingBox()));
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    private WritableMap processBounds(Rect rect) {
        WritableMap createMap = Arguments.createMap();
        int i = rect.left;
        int i2 = rect.top;
        if (rect.left < this.mWidth / 2) {
            i += this.mPaddingLeft / 2;
        } else if (rect.left > this.mWidth / 2) {
            i -= this.mPaddingLeft / 2;
        }
        if (rect.top < this.mHeight / 2) {
            i2 += this.mPaddingTop / 2;
        } else if (rect.top > this.mHeight / 2) {
            i2 -= this.mPaddingTop / 2;
        }
        createMap.putDouble(MapPoint.JsonFields.f6911x, ((double) i) * this.mScaleX);
        createMap.putDouble(MapPoint.JsonFields.f6912y, ((double) i2) * this.mScaleY);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", ((double) rect.width()) * this.mScaleX);
        createMap2.putDouble("height", ((double) rect.height()) * this.mScaleY);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putMap("origin", createMap);
        createMap3.putMap("size", createMap2);
        return createMap3;
    }
}
