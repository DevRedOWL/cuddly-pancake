package p035ru.unicorn.ujin.view.fragments.anotherPass.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/adapters/AnotherPassAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/AnotherPassAdapter$ViewHolder;", "passList", "", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Passe;", "onClickListener", "Lkotlin/Function1;", "", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getOnClickListener", "()Lkotlin/jvm/functions/Function1;", "getPassList", "()Ljava/util/List;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.adapters.AnotherPassAdapter */
/* compiled from: AnotherPassAdapter.kt */
public final class AnotherPassAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final Function1<Integer, Unit> onClickListener;
    private final List<Passe> passList;

    public AnotherPassAdapter(List<Passe> list, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "passList");
        Intrinsics.checkNotNullParameter(function1, "onClickListener");
        this.passList = list;
        this.onClickListener = function1;
    }

    public final Function1<Integer, Unit> getOnClickListener() {
        return this.onClickListener;
    }

    public final List<Passe> getPassList() {
        return this.passList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_another_pass, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…ther_pass, parent, false)");
        return new ViewHolder(inflate);
    }

    public int getItemCount() {
        return this.passList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(this.passList.get(i));
        viewHolder.itemView.setOnClickListener(new AnotherPassAdapter$onBindViewHolder$1(this, i));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/adapters/AnotherPassAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "passe", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Passe;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.adapters.AnotherPassAdapter$ViewHolder */
    /* compiled from: AnotherPassAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x039f  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x03b3  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0285  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x02bd  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x02c2  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x02ce  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x02d0  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x02e0  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x02fb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void bind(p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe r15) {
            /*
                r14 = this;
                java.lang.String r0 = "passe"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                android.view.View r0 = r14.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r2 = p035ru.unicorn.C5619R.C5622id.tvName
                android.view.View r0 = r0.findViewById(r2)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r2 = "itemView.tvName"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r15.getUser_surname()
                r2.append(r3)
                r3 = 32
                r2.append(r3)
                java.lang.String r4 = r15.getUser_name()
                r2.append(r4)
                r2.append(r3)
                java.lang.String r3 = r15.getUser_patronymic()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r0.setText(r2)
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r2 = p035ru.unicorn.C5619R.C5622id.tvPassNumber
                android.view.View r0 = r0.findViewById(r2)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r2 = "itemView.tvPassNumber"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                int r3 = r15.getId()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r0.setText(r3)
                java.util.List r0 = r15.getVehicles()
                java.lang.String r3 = "itemView.tvCar"
                r4 = 8
                r5 = 0
                if (r0 == 0) goto L_0x00a3
                java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r5)
                ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle) r0
                if (r0 == 0) goto L_0x00a3
                android.view.View r6 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
                int r7 = p035ru.unicorn.C5619R.C5622id.tvCar
                android.view.View r6 = r6.findViewById(r7)
                android.widget.TextView r6 = (android.widget.TextView) r6
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
                java.lang.String r0 = r0.getBrand()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r6.setText(r0)
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r6 = p035ru.unicorn.C5619R.C5622id.tvCar
                android.view.View r0 = r0.findViewById(r6)
                android.widget.TextView r0 = (android.widget.TextView) r0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                r0.setVisibility(r5)
                goto L_0x00b9
            L_0x00a3:
                r0 = r14
                ru.unicorn.ujin.view.fragments.anotherPass.adapters.AnotherPassAdapter$ViewHolder r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.AnotherPassAdapter.ViewHolder) r0
                android.view.View r0 = r0.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r6 = p035ru.unicorn.C5619R.C5622id.tvCar
                android.view.View r0 = r0.findViewById(r6)
                android.widget.TextView r0 = (android.widget.TextView) r0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                r0.setVisibility(r4)
            L_0x00b9:
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.util.Locale r3 = java.util.Locale.getDefault()
                java.lang.String r6 = "dd.MM.yyyy"
                r0.<init>(r6, r3)
                r3 = 0
                r6 = r3
                java.util.Calendar r6 = (java.util.Calendar) r6
                java.lang.String r7 = r15.getActive_from()
                java.lang.String r8 = "yyyy-MM-dd"
                if (r7 == 0) goto L_0x00d9
                java.lang.String r7 = r15.getActive_from()
                java.util.Calendar r7 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r7, r8)
                goto L_0x00da
            L_0x00d9:
                r7 = r6
            L_0x00da:
                java.lang.String r9 = r15.getActive_to()
                if (r9 == 0) goto L_0x00e8
                java.lang.String r6 = r15.getActive_to()
                java.util.Calendar r6 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r6, r8)
            L_0x00e8:
                java.lang.Boolean r8 = r15.getWith_stuff()
                r9 = 1
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
                boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r10)
                java.lang.String r10 = "itemView.ivTmcBox"
                if (r8 == 0) goto L_0x010d
                android.view.View r8 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
                int r11 = p035ru.unicorn.C5619R.C5622id.ivTmcBox
                android.view.View r8 = r8.findViewById(r11)
                androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
                r8.setVisibility(r5)
                goto L_0x0120
            L_0x010d:
                android.view.View r8 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
                int r11 = p035ru.unicorn.C5619R.C5622id.ivTmcBox
                android.view.View r8 = r8.findViewById(r11)
                androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
                r8.setVisibility(r4)
            L_0x0120:
                java.lang.String r8 = "c "
                java.lang.String r10 = "itemView.tvCalendar"
                if (r7 == 0) goto L_0x0190
                if (r6 == 0) goto L_0x0190
                java.lang.String r11 = r15.getActive_from()
                java.lang.String r12 = r15.getActive_to()
                boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
                if (r11 == 0) goto L_0x0154
                android.view.View r11 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r12 = p035ru.unicorn.C5619R.C5622id.tvCalendar
                android.view.View r11 = r11.findViewById(r12)
                android.widget.TextView r11 = (android.widget.TextView) r11
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r10)
                java.util.Date r12 = r7.getTime()
                java.lang.String r12 = r0.format(r12)
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                r11.setText(r12)
                goto L_0x0190
            L_0x0154:
                android.view.View r11 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r12 = p035ru.unicorn.C5619R.C5622id.tvCalendar
                android.view.View r11 = r11.findViewById(r12)
                android.widget.TextView r11 = (android.widget.TextView) r11
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r10)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r8)
                java.util.Date r13 = r7.getTime()
                java.lang.String r13 = r0.format(r13)
                r12.append(r13)
                java.lang.String r13 = " по "
                r12.append(r13)
                java.util.Date r13 = r6.getTime()
                java.lang.String r13 = r0.format(r13)
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                r11.setText(r12)
            L_0x0190:
                if (r6 == 0) goto L_0x01b1
                if (r7 != 0) goto L_0x01b1
                android.view.View r11 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
                int r12 = p035ru.unicorn.C5619R.C5622id.tvCalendar
                android.view.View r11 = r11.findViewById(r12)
                android.widget.TextView r11 = (android.widget.TextView) r11
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r10)
                java.util.Date r12 = r6.getTime()
                java.lang.String r12 = r0.format(r12)
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                r11.setText(r12)
            L_0x01b1:
                if (r6 != 0) goto L_0x01d2
                if (r7 == 0) goto L_0x01d2
                android.view.View r6 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
                int r11 = p035ru.unicorn.C5619R.C5622id.tvCalendar
                android.view.View r6 = r6.findViewById(r11)
                android.widget.TextView r6 = (android.widget.TextView) r6
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r10)
                java.util.Date r7 = r7.getTime()
                java.lang.String r0 = r0.format(r7)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r6.setText(r0)
            L_0x01d2:
                java.lang.String r0 = r15.getWork_time_from()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x01e3
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 == 0) goto L_0x01e1
                goto L_0x01e3
            L_0x01e1:
                r0 = 0
                goto L_0x01e4
            L_0x01e3:
                r0 = 1
            L_0x01e4:
                java.lang.String r6 = "itemView.tvTime"
                if (r0 != 0) goto L_0x0244
                java.lang.String r0 = r15.getWork_time_to()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x01f9
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 == 0) goto L_0x01f7
                goto L_0x01f9
            L_0x01f7:
                r0 = 0
                goto L_0x01fa
            L_0x01f9:
                r0 = 1
            L_0x01fa:
                if (r0 != 0) goto L_0x0244
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r7 = p035ru.unicorn.C5619R.C5622id.tvTime
                android.view.View r0 = r0.findViewById(r7)
                android.widget.TextView r0 = (android.widget.TextView) r0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                r0.setVisibility(r5)
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r7 = p035ru.unicorn.C5619R.C5622id.tvTime
                android.view.View r0 = r0.findViewById(r7)
                android.widget.TextView r0 = (android.widget.TextView) r0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r8)
                java.lang.String r7 = r15.getWork_time_from()
                r6.append(r7)
                java.lang.String r7 = " до "
                r6.append(r7)
                java.lang.String r7 = r15.getWork_time_to()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r0.setText(r6)
                goto L_0x0257
            L_0x0244:
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r7 = p035ru.unicorn.C5619R.C5622id.tvTime
                android.view.View r0 = r0.findViewById(r7)
                android.widget.TextView r0 = (android.widget.TextView) r0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                r0.setVisibility(r4)
            L_0x0257:
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r6 = p035ru.unicorn.C5619R.C5622id.tvStatus
                android.view.View r0 = r0.findViewById(r6)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r6 = "itemView.tvStatus"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Strategy r6 = r15.getStrategy()
                java.lang.String r6 = r6.getTitle()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r0.setText(r6)
                java.lang.String r0 = r15.getComment()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                r0 = r0 ^ r9
                java.lang.String r6 = "itemView.tvPlace"
                if (r0 != 0) goto L_0x02b7
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r0 = r15.getEnterprise()
                if (r0 == 0) goto L_0x0290
                java.lang.String r0 = r0.getTitle()
                goto L_0x0291
            L_0x0290:
                r0 = r3
            L_0x0291:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x029e
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 == 0) goto L_0x029c
                goto L_0x029e
            L_0x029c:
                r0 = 0
                goto L_0x029f
            L_0x029e:
                r0 = 1
            L_0x029f:
                if (r0 != 0) goto L_0x02a2
                goto L_0x02b7
            L_0x02a2:
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r3 = p035ru.unicorn.C5619R.C5622id.tvPlace
                android.view.View r0 = r0.findViewById(r3)
                android.widget.TextView r0 = (android.widget.TextView) r0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                r0.setVisibility(r4)
                goto L_0x038d
            L_0x02b7:
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r0 = r15.getEnterprise()
                if (r0 == 0) goto L_0x02c2
                java.lang.String r0 = r0.getTitle()
                goto L_0x02c3
            L_0x02c2:
                r0 = r3
            L_0x02c3:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x02d0
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 == 0) goto L_0x02ce
                goto L_0x02d0
            L_0x02ce:
                r0 = 0
                goto L_0x02d1
            L_0x02d0:
                r0 = 1
            L_0x02d1:
                if (r0 == 0) goto L_0x02fb
                java.lang.String r0 = r15.getComment()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                r0 = r0 ^ r9
                if (r0 == 0) goto L_0x02fb
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r3 = p035ru.unicorn.C5619R.C5622id.tvPlace
                android.view.View r0 = r0.findViewById(r3)
                android.widget.TextView r0 = (android.widget.TextView) r0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                java.lang.String r3 = r15.getComment()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r0.setText(r3)
                goto L_0x037a
            L_0x02fb:
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r0 = r15.getEnterprise()
                if (r0 == 0) goto L_0x0306
                java.lang.String r0 = r0.getTitle()
                goto L_0x0307
            L_0x0306:
                r0 = r3
            L_0x0307:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x0314
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 == 0) goto L_0x0312
                goto L_0x0314
            L_0x0312:
                r0 = 0
                goto L_0x0315
            L_0x0314:
                r0 = 1
            L_0x0315:
                if (r0 != 0) goto L_0x0343
                java.lang.String r0 = r15.getComment()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 == 0) goto L_0x0343
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r7 = p035ru.unicorn.C5619R.C5622id.tvPlace
                android.view.View r0 = r0.findViewById(r7)
                android.widget.TextView r0 = (android.widget.TextView) r0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r7 = r15.getEnterprise()
                if (r7 == 0) goto L_0x033d
                java.lang.String r3 = r7.getTitle()
            L_0x033d:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r0.setText(r3)
                goto L_0x037a
            L_0x0343:
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r7 = p035ru.unicorn.C5619R.C5622id.tvPlace
                android.view.View r0 = r0.findViewById(r7)
                android.widget.TextView r0 = (android.widget.TextView) r0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r8 = r15.getEnterprise()
                if (r8 == 0) goto L_0x0362
                java.lang.String r3 = r8.getTitle()
            L_0x0362:
                r7.append(r3)
                java.lang.String r3 = ", "
                r7.append(r3)
                java.lang.String r3 = r15.getComment()
                r7.append(r3)
                java.lang.String r3 = r7.toString()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r0.setText(r3)
            L_0x037a:
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r3 = p035ru.unicorn.C5619R.C5622id.tvPlace
                android.view.View r0 = r0.findViewById(r3)
                android.widget.TextView r0 = (android.widget.TextView) r0
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                r0.setVisibility(r5)
            L_0x038d:
                java.lang.String r0 = r15.getPass_number()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x039d
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 == 0) goto L_0x039c
                goto L_0x039d
            L_0x039c:
                r9 = 0
            L_0x039d:
                if (r9 == 0) goto L_0x03b3
                android.view.View r15 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
                int r0 = p035ru.unicorn.C5619R.C5622id.tvPassNumber
                android.view.View r15 = r15.findViewById(r0)
                android.widget.TextView r15 = (android.widget.TextView) r15
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r2)
                r15.setVisibility(r4)
                goto L_0x03cc
            L_0x03b3:
                android.view.View r0 = r14.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r1 = p035ru.unicorn.C5619R.C5622id.tvPassNumber
                android.view.View r0 = r0.findViewById(r1)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r0.setVisibility(r5)
                java.lang.String r15 = r15.getPass_number()
                java.lang.CharSequence r15 = (java.lang.CharSequence) r15
                r0.setText(r15)
            L_0x03cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.AnotherPassAdapter.ViewHolder.bind(ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe):void");
        }
    }
}
