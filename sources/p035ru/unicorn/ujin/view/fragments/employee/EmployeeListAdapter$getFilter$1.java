package p035ru.unicorn.ujin.view.fragments.employee;

import android.widget.Filter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0014¨\u0006\t"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "charSequence", "", "publishResults", "", "filterResults", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter$getFilter$1 */
/* compiled from: EmployeeListAdapter.kt */
public final class EmployeeListAdapter$getFilter$1 extends Filter {
    final /* synthetic */ EmployeeListAdapter this$0;

    EmployeeListAdapter$getFilter$1(EmployeeListAdapter employeeListAdapter) {
        this.this$0 = employeeListAdapter;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (kotlin.text.StringsKt.contains$default(r6, (java.lang.CharSequence) r11, false, 2, (java.lang.Object) null) != true) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        if (kotlin.text.StringsKt.contains$default(r6, (java.lang.CharSequence) r11, false, 2, (java.lang.Object) null) != true) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r13) {
        /*
            r12 = this;
            java.lang.String r0 = "charSequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r13 = r13.toString()
            ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter r0 = r12.this$0
            r1 = r13
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 == 0) goto L_0x0023
            ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter r13 = r12.this$0
            java.util.List r13 = r13.employeeList
            goto L_0x00f0
        L_0x0023:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter r4 = r12.this$0
            java.util.List r4 = r4.employeeList
            java.util.Iterator r4 = r4.iterator()
        L_0x0034:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ef
            java.lang.Object r5 = r4.next()
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile r5 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile) r5
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r6 = r5.getUserdata()
            r7 = 0
            r8 = 2
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            java.lang.String r10 = "(this as java.lang.String).toLowerCase()"
            if (r6 == 0) goto L_0x007d
            java.lang.String r6 = r6.getFullname()
            if (r6 == 0) goto L_0x007d
            if (r6 == 0) goto L_0x0077
            java.lang.String r6 = r6.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r10)
            if (r6 == 0) goto L_0x007d
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r13 == 0) goto L_0x0071
            java.lang.String r11 = r13.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r10)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r6 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r11, (boolean) r3, (int) r8, (java.lang.Object) r7)
            if (r6 == r2) goto L_0x00de
            goto L_0x007d
        L_0x0071:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>(r9)
            throw r13
        L_0x0077:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>(r9)
            throw r13
        L_0x007d:
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserCompany r6 = r5.getPosition()
            if (r6 == 0) goto L_0x00b4
            java.lang.String r6 = r6.getTitle()
            if (r6 == 0) goto L_0x00b4
            if (r6 == 0) goto L_0x00ae
            java.lang.String r6 = r6.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r10)
            if (r6 == 0) goto L_0x00b4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r13 == 0) goto L_0x00a8
            java.lang.String r11 = r13.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r10)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r6 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r11, (boolean) r3, (int) r8, (java.lang.Object) r7)
            if (r6 == r2) goto L_0x00de
            goto L_0x00b4
        L_0x00a8:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>(r9)
            throw r13
        L_0x00ae:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>(r9)
            throw r13
        L_0x00b4:
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r6 = r5.getUserdata()
            if (r6 == 0) goto L_0x0034
            java.lang.String r6 = r6.getPhone()
            if (r6 == 0) goto L_0x0034
            if (r6 == 0) goto L_0x00e9
            java.lang.String r6 = r6.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r10)
            if (r6 == 0) goto L_0x0034
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r13 == 0) goto L_0x00e3
            java.lang.String r9 = r13.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r6 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r9, (boolean) r3, (int) r8, (java.lang.Object) r7)
            if (r6 != r2) goto L_0x0034
        L_0x00de:
            r1.add(r5)
            goto L_0x0034
        L_0x00e3:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>(r9)
            throw r13
        L_0x00e9:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>(r9)
            throw r13
        L_0x00ef:
            r13 = r1
        L_0x00f0:
            r0.employeeListFiltered = r13
            android.widget.Filter$FilterResults r13 = new android.widget.Filter$FilterResults
            r13.<init>()
            ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter r0 = r12.this$0
            java.util.List r0 = r0.employeeListFiltered
            r13.values = r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter$getFilter$1.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(filterResults, "filterResults");
        EmployeeListAdapter employeeListAdapter = this.this$0;
        Object obj = filterResults.values;
        if (obj != null) {
            employeeListAdapter.employeeListFiltered = (ArrayList) obj;
            this.this$0.notifyDataSetChanged();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile>");
    }
}
