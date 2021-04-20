package p035ru.unicorn.ujin.view.fragments.anotherPass.adapters;

import android.widget.Filter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0014¨\u0006\t"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/anotherPass/adapters/ContactListAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "charSequence", "", "publishResults", "", "filterResults", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.adapters.ContactListAdapter$getFilter$1 */
/* compiled from: ContactListAdapter.kt */
public final class ContactListAdapter$getFilter$1 extends Filter {
    final /* synthetic */ ContactListAdapter this$0;

    ContactListAdapter$getFilter$1(ContactListAdapter contactListAdapter) {
        this.this$0 = contactListAdapter;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (kotlin.text.StringsKt.contains$default(r7, (java.lang.CharSequence) r12, false, 2, (java.lang.Object) null) != true) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        if (kotlin.text.StringsKt.contains$default(r7, (java.lang.CharSequence) r12, false, 2, (java.lang.Object) null) != true) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ca, code lost:
        if (kotlin.text.StringsKt.contains$default(r7, (java.lang.CharSequence) r12, false, 2, (java.lang.Object) null) != true) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        if (kotlin.text.StringsKt.contains$default(r7, (java.lang.CharSequence) r12, false, 2, (java.lang.Object) null) != true) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012c, code lost:
        if (kotlin.text.StringsKt.contains$default(r7, (java.lang.CharSequence) r10, false, 2, (java.lang.Object) null) != true) goto L_0x013b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r14) {
        /*
            r13 = this;
            java.lang.String r0 = "charSequence"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = r14.toString()
            ru.unicorn.ujin.view.fragments.anotherPass.adapters.ContactListAdapter r1 = r13.this$0
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0018
            r2 = 1
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            if (r2 == 0) goto L_0x0023
            ru.unicorn.ujin.view.fragments.anotherPass.adapters.ContactListAdapter r14 = r13.this$0
            java.util.List r14 = r14.contactList
            goto L_0x014f
        L_0x0023:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            ru.unicorn.ujin.view.fragments.anotherPass.adapters.ContactListAdapter r5 = r13.this$0
            java.util.List r5 = r5.contactList
            java.util.Iterator r5 = r5.iterator()
        L_0x0034:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x014e
            java.lang.Object r6 = r5.next()
            ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact r6 = (p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact) r6
            java.lang.String r7 = r6.getDisplayName()
            r8 = 0
            r9 = 2
            java.lang.String r10 = "null cannot be cast to non-null type java.lang.String"
            java.lang.String r11 = "(this as java.lang.String).toLowerCase()"
            if (r7 == 0) goto L_0x0077
            if (r7 == 0) goto L_0x0071
            java.lang.String r7 = r7.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)
            if (r7 == 0) goto L_0x0077
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r0 == 0) goto L_0x006b
            java.lang.String r12 = r0.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r7 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) r12, (boolean) r4, (int) r9, (java.lang.Object) r8)
            if (r7 == r3) goto L_0x0149
            goto L_0x0077
        L_0x006b:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x0071:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x0077:
            java.lang.String r7 = r6.getName()
            if (r7 == 0) goto L_0x00a8
            if (r7 == 0) goto L_0x00a2
            java.lang.String r7 = r7.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)
            if (r7 == 0) goto L_0x00a8
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r0 == 0) goto L_0x009c
            java.lang.String r12 = r0.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r7 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) r12, (boolean) r4, (int) r9, (java.lang.Object) r8)
            if (r7 == r3) goto L_0x0149
            goto L_0x00a8
        L_0x009c:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x00a2:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x00a8:
            java.lang.String r7 = r6.getSurname()
            if (r7 == 0) goto L_0x00d9
            if (r7 == 0) goto L_0x00d3
            java.lang.String r7 = r7.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)
            if (r7 == 0) goto L_0x00d9
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r0 == 0) goto L_0x00cd
            java.lang.String r12 = r0.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r7 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) r12, (boolean) r4, (int) r9, (java.lang.Object) r8)
            if (r7 == r3) goto L_0x0149
            goto L_0x00d9
        L_0x00cd:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x00d3:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x00d9:
            java.lang.String r7 = r6.getPatronymic()
            if (r7 == 0) goto L_0x010a
            if (r7 == 0) goto L_0x0104
            java.lang.String r7 = r7.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)
            if (r7 == 0) goto L_0x010a
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r0 == 0) goto L_0x00fe
            java.lang.String r12 = r0.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r7 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) r12, (boolean) r4, (int) r9, (java.lang.Object) r8)
            if (r7 == r3) goto L_0x0149
            goto L_0x010a
        L_0x00fe:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x0104:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x010a:
            java.lang.String r7 = r6.getEmail()
            if (r7 == 0) goto L_0x013b
            if (r7 == 0) goto L_0x0135
            java.lang.String r7 = r7.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)
            if (r7 == 0) goto L_0x013b
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r0 == 0) goto L_0x012f
            java.lang.String r10 = r0.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r7 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) r10, (boolean) r4, (int) r9, (java.lang.Object) r8)
            if (r7 == r3) goto L_0x0149
            goto L_0x013b
        L_0x012f:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x0135:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            r14.<init>(r10)
            throw r14
        L_0x013b:
            java.lang.String r7 = r6.getPhone()
            if (r7 == 0) goto L_0x0034
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) r14, (boolean) r4, (int) r9, (java.lang.Object) r8)
            if (r7 != r3) goto L_0x0034
        L_0x0149:
            r2.add(r6)
            goto L_0x0034
        L_0x014e:
            r14 = r2
        L_0x014f:
            r1.contactListFiltered = r14
            android.widget.Filter$FilterResults r14 = new android.widget.Filter$FilterResults
            r14.<init>()
            ru.unicorn.ujin.view.fragments.anotherPass.adapters.ContactListAdapter r0 = r13.this$0
            java.util.List r0 = r0.contactListFiltered
            r14.values = r0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.ContactListAdapter$getFilter$1.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(filterResults, "filterResults");
        ContactListAdapter contactListAdapter = this.this$0;
        Object obj = filterResults.values;
        if (obj != null) {
            contactListAdapter.contactListFiltered = (ArrayList) obj;
            this.this$0.notifyDataSetChanged();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact>");
    }
}
