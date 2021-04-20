package p035ru.unicorn.ujin.view.fragments.anotherPass.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0018\u00010\u0002R\u00020\u00000\u00012\u00020\u0003:\u0002\u0017\u0018B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/adapters/ContactListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/ContactListAdapter$MyViewHolder;", "Landroid/widget/Filterable;", "contactList", "", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/Contact;", "listener", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/ContactListAdapter$ContactListAdapterListener;", "(Ljava/util/List;Lru/unicorn/ujin/view/fragments/anotherPass/adapters/ContactListAdapter$ContactListAdapterListener;)V", "contactListFiltered", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ContactListAdapterListener", "MyViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.adapters.ContactListAdapter */
/* compiled from: ContactListAdapter.kt */
public final class ContactListAdapter extends RecyclerView.Adapter<MyViewHolder> implements Filterable {
    /* access modifiers changed from: private */
    public final List<Contact> contactList;
    /* access modifiers changed from: private */
    public List<Contact> contactListFiltered = this.contactList;
    /* access modifiers changed from: private */
    public final ContactListAdapterListener listener;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/adapters/ContactListAdapter$ContactListAdapterListener;", "", "onContactSelected", "", "contact", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/Contact;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.adapters.ContactListAdapter$ContactListAdapterListener */
    /* compiled from: ContactListAdapter.kt */
    public interface ContactListAdapterListener {
        void onContactSelected(Contact contact);
    }

    public ContactListAdapter(List<Contact> list, ContactListAdapterListener contactListAdapterListener) {
        Intrinsics.checkNotNullParameter(list, "contactList");
        Intrinsics.checkNotNullParameter(contactListAdapterListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.contactList = list;
        this.listener = contactListAdapterListener;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/adapters/ContactListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lru/unicorn/ujin/view/fragments/anotherPass/adapters/ContactListAdapter;Landroid/view/View;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.adapters.ContactListAdapter$MyViewHolder */
    /* compiled from: ContactListAdapter.kt */
    public final class MyViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ ContactListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MyViewHolder(ContactListAdapter contactListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = contactListAdapter;
            view.setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ MyViewHolder this$0;

                {
                    this.this$0 = r1;
                }

                public final void onClick(View view) {
                    this.this$0.this$0.listener.onContactSelected((Contact) this.this$0.this$0.contactListFiltered.get(this.this$0.getAdapterPosition()));
                }
            });
        }
    }

    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_contact, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…m_contact, parent, false)");
        return new MyViewHolder(this, inflate);
    }

    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        Intrinsics.checkNotNullParameter(myViewHolder, "holder");
        Contact contact = this.contactListFiltered.get(i);
        CharSequence name = contact.getName();
        boolean z = false;
        if (name == null || StringsKt.isBlank(name)) {
            CharSequence surname = contact.getSurname();
            if (surname == null || StringsKt.isBlank(surname)) {
                View view = myViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
                TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvFullName);
                Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvFullName");
                textView.setText(contact.getDisplayName());
                View view2 = myViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "holder.itemView");
                TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvPhone);
                Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvPhone");
                textView2.setText(contact.getPhone());
                View view3 = myViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "holder.itemView");
                TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvEmail);
                Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.tvEmail");
                textView3.setText(contact.getEmail());
            }
        }
        CharSequence name2 = contact.getName();
        if (name2 == null || StringsKt.isBlank(name2)) {
            CharSequence surname2 = contact.getSurname();
            if (!(surname2 == null || StringsKt.isBlank(surname2))) {
                View view4 = myViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "holder.itemView");
                TextView textView4 = (TextView) view4.findViewById(C5619R.C5622id.tvFullName);
                Intrinsics.checkNotNullExpressionValue(textView4, "holder.itemView.tvFullName");
                textView4.setText(contact.getSurname());
                View view22 = myViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view22, "holder.itemView");
                TextView textView22 = (TextView) view22.findViewById(C5619R.C5622id.tvPhone);
                Intrinsics.checkNotNullExpressionValue(textView22, "holder.itemView.tvPhone");
                textView22.setText(contact.getPhone());
                View view32 = myViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view32, "holder.itemView");
                TextView textView32 = (TextView) view32.findViewById(C5619R.C5622id.tvEmail);
                Intrinsics.checkNotNullExpressionValue(textView32, "holder.itemView.tvEmail");
                textView32.setText(contact.getEmail());
            }
        }
        CharSequence name3 = contact.getName();
        if (!(name3 == null || StringsKt.isBlank(name3))) {
            CharSequence surname3 = contact.getSurname();
            if (surname3 == null || StringsKt.isBlank(surname3)) {
                View view5 = myViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "holder.itemView");
                TextView textView5 = (TextView) view5.findViewById(C5619R.C5622id.tvFullName);
                Intrinsics.checkNotNullExpressionValue(textView5, "holder.itemView.tvFullName");
                textView5.setText(contact.getName());
                View view222 = myViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view222, "holder.itemView");
                TextView textView222 = (TextView) view222.findViewById(C5619R.C5622id.tvPhone);
                Intrinsics.checkNotNullExpressionValue(textView222, "holder.itemView.tvPhone");
                textView222.setText(contact.getPhone());
                View view322 = myViewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view322, "holder.itemView");
                TextView textView322 = (TextView) view322.findViewById(C5619R.C5622id.tvEmail);
                Intrinsics.checkNotNullExpressionValue(textView322, "holder.itemView.tvEmail");
                textView322.setText(contact.getEmail());
            }
        }
        CharSequence patronymic = contact.getPatronymic();
        if (patronymic == null || StringsKt.isBlank(patronymic)) {
            z = true;
        }
        if (!z) {
            View view6 = myViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "holder.itemView");
            TextView textView6 = (TextView) view6.findViewById(C5619R.C5622id.tvFullName);
            Intrinsics.checkNotNullExpressionValue(textView6, "holder.itemView.tvFullName");
            textView6.setText(contact.getName() + " " + contact.getPatronymic() + " " + contact.getSurname());
        } else {
            View view7 = myViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view7, "holder.itemView");
            TextView textView7 = (TextView) view7.findViewById(C5619R.C5622id.tvFullName);
            Intrinsics.checkNotNullExpressionValue(textView7, "holder.itemView.tvFullName");
            textView7.setText(contact.getName() + " " + contact.getSurname());
        }
        View view2222 = myViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view2222, "holder.itemView");
        TextView textView2222 = (TextView) view2222.findViewById(C5619R.C5622id.tvPhone);
        Intrinsics.checkNotNullExpressionValue(textView2222, "holder.itemView.tvPhone");
        textView2222.setText(contact.getPhone());
        View view3222 = myViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view3222, "holder.itemView");
        TextView textView3222 = (TextView) view3222.findViewById(C5619R.C5622id.tvEmail);
        Intrinsics.checkNotNullExpressionValue(textView3222, "holder.itemView.tvEmail");
        textView3222.setText(contact.getEmail());
    }

    public int getItemCount() {
        return this.contactListFiltered.size();
    }

    public Filter getFilter() {
        return new ContactListAdapter$getFilter$1(this);
    }
}
