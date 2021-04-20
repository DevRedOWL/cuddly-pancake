package p007at.nineyards.anyline.camera;

/* renamed from: at.nineyards.anyline.camera.CameraOpenListener */
public interface CameraOpenListener {
    void onCameraError(Exception exc);

    void onCameraOpened(CameraController cameraController, int i, int i2);
}
