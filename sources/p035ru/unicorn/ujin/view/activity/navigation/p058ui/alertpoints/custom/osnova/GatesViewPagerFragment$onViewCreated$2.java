package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.Camera;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.VideoDataSaver;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova.GatesViewPagerFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/realm/Points;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.GatesViewPagerFragment$onViewCreated$2 */
/* compiled from: GatesViewPagerFragment.kt */
final class GatesViewPagerFragment$onViewCreated$2 extends Lambda implements Function1<Resource<Points>, Unit> {
    final /* synthetic */ GatesViewPagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GatesViewPagerFragment$onViewCreated$2(GatesViewPagerFragment gatesViewPagerFragment) {
        super(1);
        this.this$0 = gatesViewPagerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Resource<Points>) (Resource) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Resource<Points> resource) {
        Points data;
        Resource.Status status = resource != null ? resource.getStatus() : null;
        if (status != null) {
            int i = GatesViewPagerFragment.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                GatesViewPagerFragment.GateViewPager access$getVpadapter$p = this.this$0.vpadapter;
                if (access$getVpadapter$p != null && access$getVpadapter$p.getItemCount() == 0) {
                    this.this$0.showMessage(resource.getMessage());
                }
            } else if (i == 2 && (data = resource.getData()) != null) {
                GatesViewPagerFragment.GateViewPager access$getVpadapter$p2 = this.this$0.vpadapter;
                if (access$getVpadapter$p2 != null && access$getVpadapter$p2.getItemCount() == 0) {
                    GatesViewPagerFragment.GateViewPager access$getVpadapter$p3 = this.this$0.vpadapter;
                    if (access$getVpadapter$p3 != null) {
                        List<Point> points = data.getPoints();
                        Intrinsics.checkNotNullExpressionValue(points, "it.points");
                        access$getVpadapter$p3.update(points);
                    }
                    List<Point> points2 = data.getPoints();
                    Intrinsics.checkNotNullExpressionValue(points2, "it.points");
                    Collection arrayList = new ArrayList();
                    for (Point camera : points2) {
                        Camera camera2 = camera.getCamera();
                        if (camera2 != null) {
                            arrayList.add(camera2);
                        }
                    }
                    BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
                    Intrinsics.checkNotNullExpressionValue(access$getBaseActivity, "baseActivity");
                    new VideoDataSaver(access$getBaseActivity).saveListOfVideo((List) arrayList, VideoDataSaver.VideoDataType.FROM_GATE_PREVIEW);
                    List<Point> points3 = data.getPoints();
                    Intrinsics.checkNotNullExpressionValue(points3, "it.points");
                    Iterable<Point> iterable = points3;
                    Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (Point name : iterable) {
                        arrayList2.add(name.getName());
                    }
                    this.this$0.updateTabs((List) arrayList2);
                }
                GatesViewPagerFragment gatesViewPagerFragment = this.this$0;
                List<Point> points4 = data.getPoints();
                Intrinsics.checkNotNullExpressionValue(points4, "it.points");
                if (gatesViewPagerFragment.checkActiveBeacon(points4) && Flavor.Companion.current().getHasBeaconsSupport()) {
                    this.this$0.drawSettingIcon();
                }
            }
        }
    }
}
