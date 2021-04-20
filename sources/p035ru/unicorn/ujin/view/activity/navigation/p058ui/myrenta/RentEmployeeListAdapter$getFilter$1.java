package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.widget.Filter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0014¨\u0006\t"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "charSequence", "", "publishResults", "", "filterResults", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter$getFilter$1 */
/* compiled from: RentEmployeeListAdapter.kt */
public final class RentEmployeeListAdapter$getFilter$1 extends Filter {
    final /* synthetic */ RentEmployeeListAdapter this$0;

    RentEmployeeListAdapter$getFilter$1(RentEmployeeListAdapter rentEmployeeListAdapter) {
        this.this$0 = rentEmployeeListAdapter;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (kotlin.text.StringsKt.contains$default(r12, (java.lang.CharSequence) r5, false, 2, (java.lang.Object) null) != true) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e4, code lost:
        if (kotlin.text.StringsKt.contains$default(r5, (java.lang.CharSequence) r12, false, 2, (java.lang.Object) null) != true) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "charSequence"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = r17.toString()
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter r2 = r0.this$0
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x001c
            r3 = 1
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            if (r3 == 0) goto L_0x0027
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter r1 = r0.this$0
            java.util.List r1 = r1.data
            goto L_0x0144
        L_0x0027:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            r6 = 0
            r7 = r6
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r7 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r8 = (java.util.List) r8
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter r9 = r0.this$0
            java.util.List r9 = r9.data
            java.util.Iterator r9 = r9.iterator()
        L_0x0043:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0131
            java.lang.Object r10 = r9.next()
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.EmployeeDataType r10 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.EmployeeDataType) r10
            boolean r11 = r10 instanceof p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany
            if (r11 == 0) goto L_0x0077
            if (r7 == 0) goto L_0x006c
            r11 = r8
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r12 = r11.isEmpty()
            r12 = r12 ^ r5
            if (r12 == 0) goto L_0x006c
            r3.add(r7)
            r3.addAll(r11)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r8 = (java.util.List) r8
        L_0x006c:
            boolean r11 = r8.isEmpty()
            if (r11 == 0) goto L_0x012e
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r10 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany) r10
            r7 = r10
            goto L_0x012e
        L_0x0077:
            boolean r11 = r10 instanceof p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile
            if (r11 == 0) goto L_0x012e
            r11 = r10
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile r11 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile) r11
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r12 = r11.getUserdata()
            r13 = 2
            java.lang.String r14 = "null cannot be cast to non-null type java.lang.String"
            java.lang.String r15 = "(this as java.lang.String).toLowerCase()"
            if (r12 == 0) goto L_0x00bb
            java.lang.String r12 = r12.getFullname()
            if (r12 == 0) goto L_0x00bb
            if (r12 == 0) goto L_0x00b5
            java.lang.String r12 = r12.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r15)
            if (r12 == 0) goto L_0x00bb
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            if (r1 == 0) goto L_0x00af
            java.lang.String r5 = r1.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r15)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r12, (java.lang.CharSequence) r5, (boolean) r4, (int) r13, (java.lang.Object) r6)
            r12 = 1
            if (r5 == r12) goto L_0x011e
            goto L_0x00bb
        L_0x00af:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r14)
            throw r1
        L_0x00b5:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r14)
            throw r1
        L_0x00bb:
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserCompany r5 = r11.getPosition()
            if (r5 == 0) goto L_0x00f3
            java.lang.String r5 = r5.getTitle()
            if (r5 == 0) goto L_0x00f3
            if (r5 == 0) goto L_0x00ed
            java.lang.String r5 = r5.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r15)
            if (r5 == 0) goto L_0x00f3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r1 == 0) goto L_0x00e7
            java.lang.String r12 = r1.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r15)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r12, (boolean) r4, (int) r13, (java.lang.Object) r6)
            r12 = 1
            if (r5 == r12) goto L_0x011e
            goto L_0x00f3
        L_0x00e7:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r14)
            throw r1
        L_0x00ed:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r14)
            throw r1
        L_0x00f3:
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r5 = r11.getUserdata()
            if (r5 == 0) goto L_0x012e
            java.lang.String r5 = r5.getPhone()
            if (r5 == 0) goto L_0x012e
            if (r5 == 0) goto L_0x0128
            java.lang.String r5 = r5.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r15)
            if (r5 == 0) goto L_0x012e
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r1 == 0) goto L_0x0122
            java.lang.String r11 = r1.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r15)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r5 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r5, (java.lang.CharSequence) r11, (boolean) r4, (int) r13, (java.lang.Object) r6)
            r11 = 1
            if (r5 != r11) goto L_0x012e
        L_0x011e:
            r8.add(r10)
            goto L_0x012e
        L_0x0122:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r14)
            throw r1
        L_0x0128:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r14)
            throw r1
        L_0x012e:
            r5 = 1
            goto L_0x0043
        L_0x0131:
            if (r7 == 0) goto L_0x0143
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r1 = r8.isEmpty()
            r4 = 1
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0143
            r3.add(r7)
            r3.addAll(r8)
        L_0x0143:
            r1 = r3
        L_0x0144:
            r2.dataFiltered = r1
            android.widget.Filter$FilterResults r1 = new android.widget.Filter$FilterResults
            r1.<init>()
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter r2 = r0.this$0
            java.util.List r2 = r2.dataFiltered
            r1.values = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentEmployeeListAdapter$getFilter$1.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(filterResults, "filterResults");
        RentEmployeeListAdapter rentEmployeeListAdapter = this.this$0;
        Object obj = filterResults.values;
        if (obj != null) {
            rentEmployeeListAdapter.dataFiltered = TypeIntrinsics.asMutableList(obj);
            this.this$0.notifyDataSetChanged();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.EmployeeDataType>");
    }
}
