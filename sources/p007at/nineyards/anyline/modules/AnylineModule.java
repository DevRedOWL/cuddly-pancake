package p007at.nineyards.anyline.modules;

import p007at.nineyards.anyline.camera.CameraOpenListener;
import p007at.nineyards.anyline.modules.AnylineModuleResultListener;

/* renamed from: at.nineyards.anyline.modules.AnylineModule */
public interface AnylineModule<T extends AnylineModuleResultListener> {
    void cancelScanning();

    void initAnyline(String str, T t);

    void setBeepOnResult(boolean z);

    void setBlinkOnResult(boolean z);

    void setCameraOpenListener(CameraOpenListener cameraOpenListener);

    void setCancelOnResult(boolean z);

    void setDebug(boolean z);

    void setVibrateOnResult(boolean z);

    void startScanning();
}
