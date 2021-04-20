package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.realm.Point;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/data/realm/Point;", "kotlin.jvm.PlatformType", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment$subscribeOnEvents$1 */
/* compiled from: ListOfGateFragment.kt */
final class ListOfGateFragment$subscribeOnEvents$1 extends Lambda implements Function1<List<Point>, Unit> {
    final /* synthetic */ String $id;
    final /* synthetic */ ListOfGateFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListOfGateFragment$subscribeOnEvents$1(ListOfGateFragment listOfGateFragment, String str) {
        super(1);
        this.this$0 = listOfGateFragment;
        this.$id = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<Point>) (List) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<p035ru.unicorn.ujin.data.realm.Point> r11) {
        /*
            r10 = this;
            java.util.Iterator r11 = r11.iterator()
        L_0x0004:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = r11.next()
            ru.unicorn.ujin.data.realm.Point r0 = (p035ru.unicorn.ujin.data.realm.Point) r0
            java.lang.String r1 = r0.getId()
            java.lang.String r2 = r10.$id
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0004
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment r1 = r10.this$0
            r1.setPoint(r0)
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment r1 = r10.this$0
            int r2 = p035ru.unicorn.C5619R.C5622id.title
            android.view.View r1 = r1._$_findCachedViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = "title"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r3 = r0.getName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment r1 = r10.this$0
            int r3 = p035ru.unicorn.C5619R.C5622id.title
            android.view.View r1 = r1._$_findCachedViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            ru.unicorn.ujin.enums.Flavor$Companion r2 = p035ru.unicorn.ujin.enums.Flavor.Companion
            ru.unicorn.ujin.enums.Flavor r2 = r2.current()
            boolean r2 = r2.isWithVideoPreview()
            r3 = 0
            if (r2 == 0) goto L_0x0055
            r2 = 4
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            r1.setVisibility(r2)
            ru.unicorn.ujin.data.realm.BeaconAction r1 = r0.getBeaconAction()
            if (r1 == 0) goto L_0x0004
            r1 = 0
            if (r0 == 0) goto L_0x0067
            ru.unicorn.ujin.data.realm.BeaconAction r2 = r0.getBeaconAction()
            goto L_0x0068
        L_0x0067:
            r2 = r1
        L_0x0068:
            if (r2 == 0) goto L_0x006f
            ru.unicorn.ujin.data.realm.BeaconActionDescription r4 = r2.getBeaconActionDescriptionIn()
            goto L_0x0070
        L_0x006f:
            r4 = r1
        L_0x0070:
            java.lang.String r5 = "open"
            r6 = 8
            r7 = 1
            if (r4 == 0) goto L_0x00b4
            ru.unicorn.ujin.data.realm.BeaconActionDescription r4 = r2.getBeaconActionDescriptionIn()
            java.lang.String r8 = "beaconAction.beaconActionDescriptionIn"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r8)
            java.lang.String r4 = r4.getTitle()
            java.lang.String r9 = "beaconAction.beaconActionDescriptionIn.title"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r9)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0093
            r4 = 1
            goto L_0x0094
        L_0x0093:
            r4 = 0
        L_0x0094:
            if (r4 == 0) goto L_0x00b4
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment r4 = r10.this$0
            int r9 = p035ru.unicorn.C5619R.C5622id.open
            android.view.View r4 = r4._$_findCachedViewById(r9)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r4 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            ru.unicorn.ujin.data.realm.BeaconActionDescription r5 = r2.getBeaconActionDescriptionIn()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            java.lang.String r5 = r5.getTitle()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            goto L_0x00c4
        L_0x00b4:
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment r4 = r10.this$0
            int r8 = p035ru.unicorn.C5619R.C5622id.open
            android.view.View r4 = r4._$_findCachedViewById(r8)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r4 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r4.setVisibility(r6)
        L_0x00c4:
            if (r2 == 0) goto L_0x00ca
            ru.unicorn.ujin.data.realm.BeaconActionDescription r1 = r2.getBeaconActionDescriptionOut()
        L_0x00ca:
            if (r1 == 0) goto L_0x0102
            ru.unicorn.ujin.data.realm.BeaconActionDescription r1 = r2.getBeaconActionDescriptionOut()
            java.lang.String r4 = "beaconAction.beaconActionDescriptionOut"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.String r1 = r1.getTitle()
            java.lang.String r5 = ""
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x0102
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment r1 = r10.this$0
            int r5 = p035ru.unicorn.C5619R.C5622id.close
            android.view.View r1 = r1._$_findCachedViewById(r5)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            java.lang.String r5 = "close"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            ru.unicorn.ujin.data.realm.BeaconActionDescription r2 = r2.getBeaconActionDescriptionOut()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.String r2 = r2.getTitle()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            goto L_0x010f
        L_0x0102:
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment r1 = r10.this$0
            int r2 = p035ru.unicorn.C5619R.C5622id.close
            android.view.View r1 = r1._$_findCachedViewById(r2)
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r1 = (p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton) r1
            r1.setVisibility(r6)
        L_0x010f:
            ru.unicorn.ujin.data.realm.Camera r0 = r0.getCamera()
            java.lang.String r1 = "cv"
            if (r0 == 0) goto L_0x0143
            java.lang.String r2 = r0.getPreview()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0125
            r2 = 1
            goto L_0x0126
        L_0x0125:
            r2 = 0
        L_0x0126:
            if (r2 == 0) goto L_0x0143
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment r2 = r10.this$0
            int r4 = p035ru.unicorn.C5619R.C5622id.f6510cv
            android.view.View r2 = r2._$_findCachedViewById(r4)
            androidx.cardview.widget.CardView r2 = (androidx.cardview.widget.CardView) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r2.setVisibility(r3)
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment r1 = r10.this$0
            java.lang.String r0 = r0.getVideourl()
            r1.startPreview(r0, r7)
            goto L_0x0004
        L_0x0143:
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment r0 = r10.this$0
            int r2 = p035ru.unicorn.C5619R.C5622id.f6510cv
            android.view.View r0 = r0._$_findCachedViewById(r2)
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0.setVisibility(r6)
            goto L_0x0004
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova.ListOfGateFragment$subscribeOnEvents$1.invoke(java.util.List):void");
    }
}
