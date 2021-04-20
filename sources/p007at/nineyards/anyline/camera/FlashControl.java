package p007at.nineyards.anyline.camera;

/* renamed from: at.nineyards.anyline.camera.FlashControl */
public interface FlashControl {

    /* renamed from: at.nineyards.anyline.camera.FlashControl$Mode */
    public enum Mode {
        AUTO,
        ON,
        OFF
    }

    void setAutoModeEnabled(boolean z);

    void setCameraController(CameraController cameraController);

    void setFlashOnIfAuto(boolean z);

    void setMode(Mode mode);
}
