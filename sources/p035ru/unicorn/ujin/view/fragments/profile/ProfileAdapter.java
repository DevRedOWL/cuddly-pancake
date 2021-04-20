package p035ru.unicorn.ujin.view.fragments.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B1\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/ProfileAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/profile/ProfileAdapter$ViewHolder;", "schema", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schema;", "Lkotlin/collections/ArrayList;", "clickListener", "Lkotlin/Function1;", "", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "getSchema", "()Ljava/util/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileAdapter */
/* compiled from: ProfileAdapter.kt */
public final class ProfileAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final Function1<Schema, Unit> clickListener;
    private final ArrayList<Schema> schema;

    public ProfileAdapter(ArrayList<Schema> arrayList, Function1<? super Schema, Unit> function1) {
        Intrinsics.checkNotNullParameter(arrayList, "schema");
        Intrinsics.checkNotNullParameter(function1, "clickListener");
        this.schema = arrayList;
        this.clickListener = function1;
    }

    public final Function1<Schema, Unit> getClickListener() {
        return this.clickListener;
    }

    public final ArrayList<Schema> getSchema() {
        return this.schema;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_profile_row, viewGroup, false);
        if (inflate != null) {
            return new ViewHolder(this, (TextView) inflate);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public int getItemCount() {
        return this.schema.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Schema schema2 = this.schema.get(i);
        Intrinsics.checkNotNullExpressionValue(schema2, "schema[position]");
        viewHolder.bind(schema2);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/ProfileAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/widget/TextView;", "(Lru/unicorn/ujin/view/fragments/profile/ProfileAdapter;Landroid/widget/TextView;)V", "bind", "", "schema", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schema;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileAdapter$ViewHolder */
    /* compiled from: ProfileAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ ProfileAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(ProfileAdapter profileAdapter, TextView textView) {
            super(textView);
            Intrinsics.checkNotNullParameter(textView, "itemView");
            this.this$0 = profileAdapter;
        }

        public final void bind(Schema schema) {
            Intrinsics.checkNotNullParameter(schema, "schema");
            View view = this.itemView;
            if (view != null) {
                ((TextView) view).setText(schema.getTitle());
                this.itemView.setOnClickListener(new ProfileAdapter$ViewHolder$bind$1(this, schema));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }
}
