package p035ru.unicorn.ujin.view.fragments.parking.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/adapters/MyParkingSlotsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/parking/adapters/MyParkingSlotsAdapter$ViewHolder;", "slotList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "Lkotlin/collections/ArrayList;", "showPlaceName", "", "onClickListener", "Lkotlin/Function1;", "", "(Ljava/util/ArrayList;ZLkotlin/jvm/functions/Function1;)V", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "getShowPlaceName", "()Z", "getSlotList", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.adapters.MyParkingSlotsAdapter */
/* compiled from: MyParkingSlotsAdapter.kt */
public final class MyParkingSlotsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final Function1<ParkingSlot, Unit> onClickListener;
    private final boolean showPlaceName;
    private final ArrayList<ParkingSlot> slotList;

    public final ArrayList<ParkingSlot> getSlotList() {
        return this.slotList;
    }

    public final boolean getShowPlaceName() {
        return this.showPlaceName;
    }

    public final Function1<ParkingSlot, Unit> getOnClickListener() {
        return this.onClickListener;
    }

    public MyParkingSlotsAdapter(ArrayList<ParkingSlot> arrayList, boolean z, Function1<? super ParkingSlot, Unit> function1) {
        Intrinsics.checkNotNullParameter(arrayList, "slotList");
        Intrinsics.checkNotNullParameter(function1, "onClickListener");
        this.slotList = arrayList;
        this.showPlaceName = z;
        this.onClickListener = function1;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/adapters/MyParkingSlotsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "parkingSlot", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "showPlaceName", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.adapters.MyParkingSlotsAdapter$ViewHolder */
    /* compiled from: MyParkingSlotsAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:46:0x020c, code lost:
            if (r4 != ((r11 == null || (r11 = r11.getId()) == null) ? -1 : r11.intValue())) goto L_0x020e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0220  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void bind(p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot r17, boolean r18) {
            /*
                r16 = this;
                r0 = r16
                java.lang.String r1 = "parkingSlot"
                r2 = r17
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                android.view.View r1 = r0.itemView
                if (r1 == 0) goto L_0x03fb
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                r1.removeAllViews()
                ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState r1 = r17.getState()
                r3 = 2131887540(0x7f1205b4, float:1.940969E38)
                r4 = 2131558941(0x7f0d021d, float:1.8743212E38)
                java.lang.String r5 = "itemView"
                r6 = 4
                r7 = 1
                r8 = 2131099752(0x7f060068, float:1.7811866E38)
                r9 = 0
                if (r1 == 0) goto L_0x024d
                java.util.ArrayList r1 = r17.getVehicleList()
                if (r1 == 0) goto L_0x0031
                int r1 = r1.size()
                goto L_0x0032
            L_0x0031:
                r1 = 0
            L_0x0032:
                if (r1 == 0) goto L_0x003e
                ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState r1 = r17.getState()
                ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle r1 = r1.getVehicle()
                if (r1 == 0) goto L_0x024d
            L_0x003e:
                if (r18 == 0) goto L_0x024d
                android.view.View r1 = r0.itemView
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                android.view.View r10 = r0.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r5)
                android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
                android.content.Context r10 = r10.getContext()
                android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
                android.view.View r11 = r0.itemView
                android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                android.view.View r10 = r10.inflate(r4, r11, r9)
                java.lang.String r11 = "this"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
                int r11 = p035ru.unicorn.C5619R.C5622id.tvSlotName
                android.view.View r11 = r10.findViewById(r11)
                android.widget.TextView r11 = (android.widget.TextView) r11
                java.lang.String r12 = "this.tvSlotName"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
                java.lang.String r13 = r17.getNumber()
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                r11.setText(r13)
                ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState r11 = r17.getState()
                ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle r11 = r11.getVehicle()
                if (r11 == 0) goto L_0x00ac
                int r13 = p035ru.unicorn.C5619R.C5622id.tvCarName
                android.view.View r13 = r10.findViewById(r13)
                android.widget.TextView r13 = (android.widget.TextView) r13
                java.lang.String r14 = "this.tvCarName"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)
                java.lang.String r14 = r11.getBrand()
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                r13.setText(r14)
                int r13 = p035ru.unicorn.C5619R.C5622id.tvCarLicencePlate
                android.view.View r13 = r10.findViewById(r13)
                android.widget.TextView r13 = (android.widget.TextView) r13
                java.lang.String r14 = "this.tvCarLicencePlate"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)
                java.lang.String r11 = r11.getLicencePlate()
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r13.setText(r11)
            L_0x00ac:
                ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState r11 = r17.getState()
                java.lang.String r11 = r11.getSlug()
                ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState$Slug r13 = p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState.Slug.INSTANCE
                java.lang.String r13 = r13.getTaken()
                boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r13)
                java.lang.String r14 = "this.tvStatus"
                java.lang.String r15 = "this.context"
                if (r13 == 0) goto L_0x0118
                int r11 = p035ru.unicorn.C5619R.C5622id.tvSlotName
                android.view.View r11 = r10.findViewById(r11)
                android.widget.TextView r11 = (android.widget.TextView) r11
                android.content.Context r13 = r10.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r15)
                android.content.res.Resources r13 = r13.getResources()
                r4 = 2131099729(0x7f060051, float:1.781182E38)
                int r13 = r13.getColor(r4)
                r11.setTextColor(r13)
                int r11 = p035ru.unicorn.C5619R.C5622id.tvStatus
                android.view.View r11 = r10.findViewById(r11)
                android.widget.TextView r11 = (android.widget.TextView) r11
                android.content.Context r13 = r10.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r15)
                android.content.res.Resources r13 = r13.getResources()
                int r4 = r13.getColor(r4)
                r11.setTextColor(r4)
                int r4 = p035ru.unicorn.C5619R.C5622id.tvStatus
                android.view.View r4 = r10.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r14)
                android.content.Context r11 = r10.getContext()
                r13 = 2131887541(0x7f1205b5, float:1.9409692E38)
                java.lang.String r11 = r11.getString(r13)
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r4.setText(r11)
                goto L_0x01c0
            L_0x0118:
                ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState$Slug r4 = p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState.Slug.INSTANCE
                java.lang.String r4 = r4.getEmpty()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r4)
                if (r4 == 0) goto L_0x0171
                int r4 = p035ru.unicorn.C5619R.C5622id.tvSlotName
                android.view.View r4 = r10.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                android.content.Context r11 = r10.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r15)
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r8)
                r4.setTextColor(r11)
                int r4 = p035ru.unicorn.C5619R.C5622id.tvStatus
                android.view.View r4 = r10.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                android.content.Context r11 = r10.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r15)
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r8)
                r4.setTextColor(r11)
                int r4 = p035ru.unicorn.C5619R.C5622id.tvStatus
                android.view.View r4 = r10.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r14)
                android.content.Context r11 = r10.getContext()
                java.lang.String r11 = r11.getString(r3)
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r4.setText(r11)
                goto L_0x01c0
            L_0x0171:
                int r4 = p035ru.unicorn.C5619R.C5622id.tvSlotName
                android.view.View r4 = r10.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                android.content.Context r11 = r10.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r15)
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r8)
                r4.setTextColor(r11)
                int r4 = p035ru.unicorn.C5619R.C5622id.tvStatus
                android.view.View r4 = r10.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                android.content.Context r11 = r10.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r15)
                android.content.res.Resources r11 = r11.getResources()
                int r11 = r11.getColor(r8)
                r4.setTextColor(r11)
                int r4 = p035ru.unicorn.C5619R.C5622id.tvStatus
                android.view.View r4 = r10.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r14)
                android.content.Context r11 = r10.getContext()
                r13 = 2131887539(0x7f1205b3, float:1.9409688E38)
                java.lang.String r11 = r11.getString(r13)
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                r4.setText(r11)
            L_0x01c0:
                java.util.ArrayList r4 = r17.getVehicleList()
                if (r4 == 0) goto L_0x01cb
                int r4 = r4.size()
                goto L_0x01cc
            L_0x01cb:
                r4 = 0
            L_0x01cc:
                if (r7 < r4) goto L_0x020e
                java.util.ArrayList r4 = r17.getVehicleList()
                if (r4 == 0) goto L_0x01d9
                int r4 = r4.size()
                goto L_0x01da
            L_0x01d9:
                r4 = 0
            L_0x01da:
                if (r4 <= 0) goto L_0x021e
                java.util.ArrayList r4 = r17.getVehicleList()
                if (r4 == 0) goto L_0x01f5
                java.lang.Object r4 = r4.get(r9)
                ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle r4 = (p035ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle) r4
                if (r4 == 0) goto L_0x01f5
                java.lang.Integer r4 = r4.getId()
                if (r4 == 0) goto L_0x01f5
                int r4 = r4.intValue()
                goto L_0x01f6
            L_0x01f5:
                r4 = -1
            L_0x01f6:
                ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState r11 = r17.getState()
                ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle r11 = r11.getVehicle()
                if (r11 == 0) goto L_0x020b
                java.lang.Integer r11 = r11.getId()
                if (r11 == 0) goto L_0x020b
                int r11 = r11.intValue()
                goto L_0x020c
            L_0x020b:
                r11 = -1
            L_0x020c:
                if (r4 == r11) goto L_0x021e
            L_0x020e:
                int r4 = p035ru.unicorn.C5619R.C5622id.divider
                android.view.View r4 = r10.findViewById(r4)
                java.lang.String r11 = "this.divider"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r11)
                r11 = 8
                r4.setVisibility(r11)
            L_0x021e:
                if (r18 != 0) goto L_0x0248
                int r4 = p035ru.unicorn.C5619R.C5622id.tvSlotName
                android.view.View r4 = r10.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r12)
                r4.setVisibility(r6)
                int r4 = p035ru.unicorn.C5619R.C5622id.guideline
                android.view.View r4 = r10.findViewById(r4)
                androidx.constraintlayout.widget.Guideline r4 = (androidx.constraintlayout.widget.Guideline) r4
                r11 = 0
                r4.setGuidelinePercent(r11)
                int r4 = p035ru.unicorn.C5619R.C5622id.divider
                android.view.View r4 = r10.findViewById(r4)
                java.lang.String r11 = "this.divider"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r11)
                r4.setVisibility(r9)
            L_0x0248:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                r1.addView(r10)
            L_0x024d:
                r1 = 0
                r4 = r1
                android.view.View r4 = (android.view.View) r4
                ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState r10 = r17.getState()
                if (r10 == 0) goto L_0x025c
                ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle r10 = r10.getVehicle()
                goto L_0x025d
            L_0x025c:
                r10 = r1
            L_0x025d:
                if (r10 == 0) goto L_0x0261
                r10 = 1
                goto L_0x0262
            L_0x0261:
                r10 = 0
            L_0x0262:
                java.util.ArrayList r11 = r17.getVehicleList()
                if (r11 == 0) goto L_0x03f5
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r12 = new java.util.ArrayList
                r13 = 10
                int r13 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r11, r13)
                r12.<init>(r13)
                java.util.Collection r12 = (java.util.Collection) r12
                java.util.Iterator r11 = r11.iterator()
            L_0x027b:
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x03f3
                java.lang.Object r13 = r11.next()
                ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle r13 = (p035ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle) r13
                java.lang.Integer r14 = r13.getId()
                ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState r15 = r17.getState()
                if (r15 == 0) goto L_0x029c
                ru.unicorn.ujin.view.fragments.parking.response.ParkingVehicle r15 = r15.getVehicle()
                if (r15 == 0) goto L_0x029c
                java.lang.Integer r15 = r15.getId()
                goto L_0x029d
            L_0x029c:
                r15 = r1
            L_0x029d:
                boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r15)
                r14 = r14 ^ r7
                if (r14 == 0) goto L_0x03e8
                android.view.View r4 = r0.itemView
                android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
                android.view.View r14 = r0.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r5)
                android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
                android.content.Context r14 = r14.getContext()
                android.view.LayoutInflater r14 = android.view.LayoutInflater.from(r14)
                android.view.View r15 = r0.itemView
                android.view.ViewGroup r15 = (android.view.ViewGroup) r15
                r1 = 2131558941(0x7f0d021d, float:1.8743212E38)
                android.view.View r14 = r14.inflate(r1, r15, r9)
                java.lang.String r15 = "it.context"
                java.lang.String r1 = "it"
                java.lang.String r7 = "it.tvSlotName"
                if (r10 != 0) goto L_0x030b
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r1)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvSlotName
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
                r1.setVisibility(r9)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvSlotName
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
                java.lang.String r10 = r17.getNumber()
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                r1.setText(r10)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvSlotName
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                android.content.Context r10 = r14.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r15)
                android.content.res.Resources r10 = r10.getResources()
                int r10 = r10.getColor(r8)
                r1.setTextColor(r10)
                r10 = 1
                goto L_0x031c
            L_0x030b:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r1)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvSlotName
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
                r1.setVisibility(r6)
            L_0x031c:
                int r1 = p035ru.unicorn.C5619R.C5622id.tvCarName
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r6 = "it.tvCarName"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
                r1.setVisibility(r9)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvCarName
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r6 = "it.tvCarName"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
                java.lang.String r6 = r13.getBrand()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r1.setText(r6)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvCarLicencePlate
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r6 = "it.tvCarLicencePlate"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
                r1.setVisibility(r9)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvCarLicencePlate
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r6 = "it.tvCarLicencePlate"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
                java.lang.String r6 = r13.getLicencePlate()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r1.setText(r6)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvStatus
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r6 = "it.tvStatus"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
                r1.setVisibility(r9)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvStatus
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                android.content.Context r6 = r14.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r15)
                android.content.res.Resources r6 = r6.getResources()
                int r6 = r6.getColor(r8)
                r1.setTextColor(r6)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvStatus
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.lang.String r6 = "it.tvStatus"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
                android.content.Context r6 = r14.getContext()
                java.lang.String r6 = r6.getString(r3)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r1.setText(r6)
                int r1 = p035ru.unicorn.C5619R.C5622id.divider
                android.view.View r1 = r14.findViewById(r1)
                if (r18 != 0) goto L_0x03d0
                int r6 = p035ru.unicorn.C5619R.C5622id.tvSlotName
                android.view.View r6 = r14.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
                r7 = 4
                r6.setVisibility(r7)
                int r6 = p035ru.unicorn.C5619R.C5622id.guideline
                android.view.View r6 = r14.findViewById(r6)
                androidx.constraintlayout.widget.Guideline r6 = (androidx.constraintlayout.widget.Guideline) r6
                r13 = 0
                r6.setGuidelinePercent(r13)
                goto L_0x03e1
            L_0x03d0:
                r7 = 4
                int r6 = p035ru.unicorn.C5619R.C5622id.divider
                android.view.View r6 = r14.findViewById(r6)
                java.lang.String r13 = "it.divider"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r13)
                r13 = 8
                r6.setVisibility(r13)
            L_0x03e1:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                r4.addView(r14)
                r4 = r1
                goto L_0x03e9
            L_0x03e8:
                r7 = 4
            L_0x03e9:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                r12.add(r1)
                r1 = 0
                r6 = 4
                r7 = 1
                goto L_0x027b
            L_0x03f3:
                java.util.List r12 = (java.util.List) r12
            L_0x03f5:
                if (r4 == 0) goto L_0x03fa
                r4.setVisibility(r9)
            L_0x03fa:
                return
            L_0x03fb:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "null cannot be cast to non-null type android.widget.LinearLayout"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.parking.adapters.MyParkingSlotsAdapter.ViewHolder.bind(ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot, boolean):void");
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_my_slot, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…m_my_slot, parent, false)");
        return new ViewHolder(inflate);
    }

    public int getItemCount() {
        return this.slotList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.itemView.setOnClickListener(new MyParkingSlotsAdapter$onBindViewHolder$1(this, i));
        ParkingSlot parkingSlot = this.slotList.get(i);
        Intrinsics.checkNotNullExpressionValue(parkingSlot, "slotList[position]");
        viewHolder.bind(parkingSlot, this.showPlaceName);
    }
}
