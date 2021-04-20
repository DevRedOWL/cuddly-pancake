package org.reactnative.camera.tasks;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.gms.vision.text.Line;
import com.google.android.gms.vision.text.Text;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import org.reactnative.camera.utils.ImageDimensions;
import org.reactnative.facedetector.FaceDetectorUtils;
import org.reactnative.frame.RNFrameFactory;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class TextRecognizerAsyncTask extends AsyncTask<Void, Void, SparseArray<TextBlock>> {
    private TextRecognizerAsyncTaskDelegate mDelegate;
    private int mHeight;
    private byte[] mImageData;
    private ImageDimensions mImageDimensions;
    private int mPaddingLeft;
    private int mPaddingTop;
    private int mRotation;
    private double mScaleX;
    private double mScaleY;
    private TextRecognizer mTextRecognizer;
    private ThemedReactContext mThemedReactContext;
    private int mWidth;

    public TextRecognizerAsyncTask(TextRecognizerAsyncTaskDelegate textRecognizerAsyncTaskDelegate, ThemedReactContext themedReactContext, byte[] bArr, int i, int i2, int i3, float f, int i4, int i5, int i6, int i7, int i8) {
        this.mDelegate = textRecognizerAsyncTaskDelegate;
        this.mThemedReactContext = themedReactContext;
        this.mImageData = bArr;
        this.mWidth = i;
        this.mHeight = i2;
        this.mRotation = i3;
        this.mImageDimensions = new ImageDimensions(i, i2, i3, i4);
        this.mScaleX = ((double) i5) / ((double) (((float) this.mImageDimensions.getWidth()) * f));
        this.mScaleY = ((double) i6) / ((double) (((float) this.mImageDimensions.getHeight()) * f));
        this.mPaddingLeft = i7;
        this.mPaddingTop = i8;
    }

    /* access modifiers changed from: protected */
    public SparseArray<TextBlock> doInBackground(Void... voidArr) {
        if (isCancelled() || this.mDelegate == null) {
            return null;
        }
        this.mTextRecognizer = new TextRecognizer.Builder(this.mThemedReactContext).build();
        return this.mTextRecognizer.detect(RNFrameFactory.buildFrame(this.mImageData, this.mWidth, this.mHeight, this.mRotation).getFrame());
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(SparseArray<TextBlock> sparseArray) {
        super.onPostExecute(sparseArray);
        TextRecognizer textRecognizer = this.mTextRecognizer;
        if (textRecognizer != null) {
            textRecognizer.release();
        }
        if (sparseArray != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                WritableMap serializeText = serializeText(sparseArray.valueAt(i));
                if (this.mImageDimensions.getFacing() == 1) {
                    serializeText = rotateTextX(serializeText);
                }
                createArray.pushMap(serializeText);
            }
            this.mDelegate.onTextRecognized(createArray);
        }
        this.mDelegate.onTextRecognizerTaskCompleted();
    }

    private WritableMap serializeText(Text text) {
        String str;
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (Text serializeText : text.getComponents()) {
            createArray.pushMap(serializeText(serializeText));
        }
        createMap.putArray("components", createArray);
        createMap.putString("value", text.getValue());
        int i = text.getBoundingBox().left;
        int i2 = text.getBoundingBox().top;
        if (text.getBoundingBox().left < this.mWidth / 2) {
            i += this.mPaddingLeft / 2;
        } else if (text.getBoundingBox().left > this.mWidth / 2) {
            i -= this.mPaddingLeft / 2;
        }
        if (text.getBoundingBox().height() < this.mHeight / 2) {
            i2 += this.mPaddingTop / 2;
        } else if (text.getBoundingBox().height() > this.mHeight / 2) {
            i2 -= this.mPaddingTop / 2;
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(MapPoint.JsonFields.f6911x, ((double) i) * this.mScaleX);
        createMap2.putDouble(MapPoint.JsonFields.f6912y, ((double) i2) * this.mScaleY);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", ((double) text.getBoundingBox().width()) * this.mScaleX);
        createMap3.putDouble("height", ((double) text.getBoundingBox().height()) * this.mScaleY);
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putMap("origin", createMap2);
        createMap4.putMap("size", createMap3);
        createMap.putMap("bounds", createMap4);
        if (text instanceof TextBlock) {
            str = "block";
        } else {
            str = text instanceof Line ? "line" : "element";
        }
        createMap.putString("type", str);
        return createMap;
    }

    private WritableMap rotateTextX(WritableMap writableMap) {
        ReadableMap map = writableMap.getMap("bounds");
        WritableMap positionTranslatedHorizontally = FaceDetectorUtils.positionTranslatedHorizontally(FaceDetectorUtils.positionMirroredHorizontally(map.getMap("origin"), this.mImageDimensions.getWidth(), this.mScaleX), -map.getMap("size").getDouble("width"));
        WritableMap createMap = Arguments.createMap();
        createMap.merge(map);
        createMap.putMap("origin", positionTranslatedHorizontally);
        writableMap.putMap("bounds", createMap);
        ReadableArray array = writableMap.getArray("components");
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < array.size(); i++) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.merge(array.getMap(i));
            rotateTextX(createMap2);
            createArray.pushMap(createMap2);
        }
        writableMap.putArray("components", createArray);
        return writableMap;
    }
}
