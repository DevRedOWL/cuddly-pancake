package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0018\u00010\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListAdapter$ViewHolder;", "objectList", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject;", "listener", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListAdapter$CompanyObjectListAdapterListener;", "(Ljava/util/List;Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListAdapter$CompanyObjectListAdapterListener;)V", "getItemCount", "", "onBindViewHolder", "", "vh", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CompanyObjectListAdapterListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyObjectListAdapter */
/* compiled from: CompanyObjectListAdapter.kt */
public final class CompanyObjectListAdapter extends RecyclerView.Adapter<ViewHolder> {
    /* access modifiers changed from: private */
    public final CompanyObjectListAdapterListener listener;
    /* access modifiers changed from: private */
    public final List<CompanyObject> objectList;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListAdapter$CompanyObjectListAdapterListener;", "", "onObjectSelected", "", "companyObject", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyObject;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyObjectListAdapter$CompanyObjectListAdapterListener */
    /* compiled from: CompanyObjectListAdapter.kt */
    public interface CompanyObjectListAdapterListener {
        void onObjectSelected(CompanyObject companyObject);
    }

    public CompanyObjectListAdapter(List<CompanyObject> list, CompanyObjectListAdapterListener companyObjectListAdapterListener) {
        Intrinsics.checkNotNullParameter(list, "objectList");
        Intrinsics.checkNotNullParameter(companyObjectListAdapterListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.objectList = list;
        this.listener = companyObjectListAdapterListener;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyObjectListAdapter;Landroid/view/View;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyObjectListAdapter$ViewHolder */
    /* compiled from: CompanyObjectListAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ CompanyObjectListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CompanyObjectListAdapter companyObjectListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = companyObjectListAdapter;
            view.setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ ViewHolder this$0;

                {
                    this.this$0 = r1;
                }

                public final void onClick(View view) {
                    this.this$0.this$0.listener.onObjectSelected((CompanyObject) this.this$0.this$0.objectList.get(this.this$0.getAdapterPosition()));
                }
            });
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_object, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…em_object, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "vh");
        View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "vh.itemView");
        TextView textView = (TextView) view.findViewById(C5619R.C5622id.title);
        Intrinsics.checkNotNullExpressionValue(textView, "vh.itemView.title");
        textView.setText(this.objectList.get(i).getTitle());
    }

    public int getItemCount() {
        return this.objectList.size();
    }
}
