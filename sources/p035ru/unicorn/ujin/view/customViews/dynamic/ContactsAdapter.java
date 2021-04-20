package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/ContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/customViews/dynamic/ContactsAdapter$ViewHolder;", "contacts", "", "Lru/unicorn/ujin/view/dialogs/dataEntry/Contact;", "(Ljava/util/List;)V", "getContacts", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.ContactsAdapter */
/* compiled from: ContactsViewHolder.kt */
public final class ContactsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final List<Contact> contacts;

    public ContactsAdapter(List<Contact> list) {
        Intrinsics.checkNotNullParameter(list, "contacts");
        this.contacts = list;
    }

    public final List<Contact> getContacts() {
        return this.contacts;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.field_contact, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…d_contact, parent, false)");
        return new ViewHolder(inflate);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/ContactsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "contact", "Lru/unicorn/ujin/view/dialogs/dataEntry/Contact;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.customViews.dynamic.ContactsAdapter$ViewHolder */
    /* compiled from: ContactsViewHolder.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void bind(p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact r10) {
            /*
                r9 = this;
                java.lang.String r0 = "contact"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                android.view.View r0 = r9.itemView
                if (r0 == 0) goto L_0x0149
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r1 = r10.getType()
                java.lang.String r2 = "address"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
                java.lang.String r3 = "itemView.context"
                r4 = 1
                java.lang.String r5 = "itemView"
                r6 = 0
                if (r1 == 0) goto L_0x0060
                android.text.SpannableString r1 = new android.text.SpannableString
                java.lang.String r7 = r10.getData()
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r1.<init>(r7)
                android.text.style.UnderlineSpan r7 = new android.text.style.UnderlineSpan
                r7.<init>()
                int r8 = r1.length()
                r1.setSpan(r7, r6, r8, r6)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                android.view.View r1 = r9.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                android.widget.TextView r1 = (android.widget.TextView) r1
                android.content.Context r1 = r1.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                android.content.res.Resources r1 = r1.getResources()
                r7 = 2131099751(0x7f060067, float:1.7811864E38)
                int r1 = r1.getColor(r7)
                r0.setTextColor(r1)
                ru.unicorn.ujin.view.customViews.dynamic.ContactsAdapter$ViewHolder$bind$$inlined$apply$lambda$1 r1 = new ru.unicorn.ujin.view.customViews.dynamic.ContactsAdapter$ViewHolder$bind$$inlined$apply$lambda$1
                r1.<init>(r9, r10)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                goto L_0x0077
            L_0x0060:
                java.lang.String r1 = r10.getData()
                android.text.Spanned r1 = android.text.Html.fromHtml(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                r0.setLinksClickable(r4)
                android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
                r0.setMovementMethod(r1)
            L_0x0077:
                java.lang.String r0 = r10.getData()
                if (r0 == 0) goto L_0x0094
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r1 = "href"
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r7 = 2
                r8 = 0
                boolean r0 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r1, (boolean) r6, (int) r7, (java.lang.Object) r8)
                if (r0 != 0) goto L_0x0094
                android.view.View r0 = r9.itemView
                android.widget.TextView r0 = (android.widget.TextView) r0
                r1 = 15
                android.text.util.Linkify.addLinks(r0, r1)
            L_0x0094:
                java.lang.String r0 = r10.getType()
                if (r0 == 0) goto L_0x0148
                java.lang.String r0 = r10.getType()
                java.lang.String r1 = "other"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
                r0 = r0 ^ r4
                if (r0 == 0) goto L_0x0148
                android.view.View r0 = r9.itemView
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r1 = r10.getType()
                if (r1 != 0) goto L_0x00b2
                goto L_0x00e8
            L_0x00b2:
                int r4 = r1.hashCode()
                switch(r4) {
                    case -1147692044: goto L_0x00de;
                    case 116079: goto L_0x00d2;
                    case 96619420: goto L_0x00c6;
                    case 106642798: goto L_0x00ba;
                    default: goto L_0x00b9;
                }
            L_0x00b9:
                goto L_0x00e8
            L_0x00ba:
                java.lang.String r4 = "phone"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x00e8
                r1 = 2131231387(0x7f08029b, float:1.8078854E38)
                goto L_0x00e9
            L_0x00c6:
                java.lang.String r4 = "email"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x00e8
                r1 = 2131231385(0x7f080299, float:1.807885E38)
                goto L_0x00e9
            L_0x00d2:
                java.lang.String r4 = "url"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x00e8
                r1 = 2131231388(0x7f08029c, float:1.8078856E38)
                goto L_0x00e9
            L_0x00de:
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x00e8
                r1 = 2131231386(0x7f08029a, float:1.8078852E38)
                goto L_0x00e9
            L_0x00e8:
                r1 = 0
            L_0x00e9:
                r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r6, r6, r6)
                android.view.View r0 = r9.itemView
                r1 = 2131230861(0x7f08008d, float:1.8077787E38)
                r0.setBackgroundResource(r1)
                android.view.View r0 = r9.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                android.widget.TextView r0 = (android.widget.TextView) r0
                android.view.View r1 = r9.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                android.widget.TextView r1 = (android.widget.TextView) r1
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                android.view.View r4 = r9.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                android.widget.TextView r4 = (android.widget.TextView) r4
                android.content.Context r4 = r4.getContext()
                r6 = 40
                int r4 = p035ru.unicorn.ujin.util.AppUtils.dpToPx(r4, r6)
                r1.height = r4
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                r0.setLayoutParams(r1)
                java.lang.String r10 = r10.getType()
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r2)
                if (r10 == 0) goto L_0x0148
                android.view.View r10 = r9.itemView
                android.widget.TextView r10 = (android.widget.TextView) r10
                android.view.View r0 = r9.itemView
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                android.widget.TextView r0 = (android.widget.TextView) r0
                android.content.Context r0 = r0.getContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131100263(0x7f060267, float:1.7812903E38)
                int r0 = r0.getColor(r1)
                r10.setTextColor(r0)
            L_0x0148:
                return
            L_0x0149:
                java.lang.NullPointerException r10 = new java.lang.NullPointerException
                java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.customViews.dynamic.ContactsAdapter.ViewHolder.bind(ru.unicorn.ujin.view.dialogs.dataEntry.Contact):void");
        }
    }

    public int getItemCount() {
        return this.contacts.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(this.contacts.get(i));
    }
}
