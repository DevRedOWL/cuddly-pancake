package p033co.infinum.goldeneye;

import kotlin.Metadata;
import p033co.infinum.goldeneye.config.CameraInfo;
import p033co.infinum.goldeneye.models.Facing;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo51343d2 = {"co/infinum/goldeneye/GoldenEye2Impl$initAvailableCameras$1$cameraInfo$1", "Lco/infinum/goldeneye/config/CameraInfo;", "facing", "Lco/infinum/goldeneye/models/Facing;", "getFacing", "()Lco/infinum/goldeneye/models/Facing;", "id", "", "kotlin.jvm.PlatformType", "getId", "()Ljava/lang/String;", "orientation", "", "getOrientation", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye2Impl$initAvailableCameras$1$cameraInfo$1 */
/* compiled from: GoldenEye2Impl.kt */
public final class GoldenEye2Impl$initAvailableCameras$1$cameraInfo$1 implements CameraInfo {
    final /* synthetic */ Facing $facing;
    final /* synthetic */ String $id;
    final /* synthetic */ Integer $orientation;
    private final Facing facing;

    /* renamed from: id */
    private final String f1130id;
    private final Integer orientation;

    GoldenEye2Impl$initAvailableCameras$1$cameraInfo$1(String str, Integer num, Facing facing2) {
        this.$id = str;
        this.$orientation = num;
        this.$facing = facing2;
        this.f1130id = str;
        this.orientation = num;
        this.facing = facing2;
    }

    public String getId() {
        return this.f1130id;
    }

    public Integer getOrientation() {
        return this.orientation;
    }

    public Facing getFacing() {
        return this.facing;
    }
}
