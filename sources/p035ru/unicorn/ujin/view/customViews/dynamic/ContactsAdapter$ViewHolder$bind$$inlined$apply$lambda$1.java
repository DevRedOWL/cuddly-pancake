package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.customViews.dynamic.ContactsAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/customViews/dynamic/ContactsAdapter$ViewHolder$bind$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.ContactsAdapter$ViewHolder$bind$$inlined$apply$lambda$1 */
/* compiled from: ContactsViewHolder.kt */
final class ContactsAdapter$ViewHolder$bind$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ Contact $contact$inlined;
    final /* synthetic */ ContactsAdapter.ViewHolder this$0;

    ContactsAdapter$ViewHolder$bind$$inlined$apply$lambda$1(ContactsAdapter.ViewHolder viewHolder, Contact contact) {
        this.this$0 = viewHolder;
        this.$contact$inlined = contact;
    }

    public final void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        MapPoint map = this.$contact$inlined.getMap();
        Double d = null;
        sb.append(map != null ? Double.valueOf(map.getX()) : null);
        sb.append(',');
        MapPoint map2 = this.$contact$inlined.getMap();
        if (map2 != null) {
            d = Double.valueOf(map2.getY());
        }
        sb.append(d);
        sb.append("?q=");
        sb.append(this.$contact$inlined.getData());
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        View view2 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        ((TextView) view2).getContext().startActivity(intent);
    }
}
