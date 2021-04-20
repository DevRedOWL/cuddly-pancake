package p033co.infinum.goldeneye;

import android.hardware.Camera;
import kotlin.Metadata;
import p033co.infinum.goldeneye.config.CameraInfo;
import p033co.infinum.goldeneye.models.Facing;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, mo51343d2 = {"co/infinum/goldeneye/GoldenEye1Impl$initAvailableCameras$cameraInfo$1", "Lco/infinum/goldeneye/config/CameraInfo;", "facing", "Lco/infinum/goldeneye/models/Facing;", "getFacing", "()Lco/infinum/goldeneye/models/Facing;", "id", "", "getId", "()Ljava/lang/String;", "orientation", "", "getOrientation", "()I", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye1Impl$initAvailableCameras$cameraInfo$1 */
/* compiled from: GoldenEye1Impl.kt */
public final class GoldenEye1Impl$initAvailableCameras$cameraInfo$1 implements CameraInfo {
    final /* synthetic */ Facing $facing;
    final /* synthetic */ int $id;
    final /* synthetic */ Camera.CameraInfo $info;
    private final Facing facing;

    /* renamed from: id */
    private final String f1129id;
    private final int orientation;

    GoldenEye1Impl$initAvailableCameras$cameraInfo$1(int i, Camera.CameraInfo cameraInfo, Facing facing2) {
        this.$id = i;
        this.$info = cameraInfo;
        this.$facing = facing2;
        this.f1129id = String.valueOf(i);
        this.orientation = cameraInfo.orientation;
        this.facing = facing2;
    }

    public String getId() {
        return this.f1129id;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public Facing getFacing() {
        return this.facing;
    }
}
