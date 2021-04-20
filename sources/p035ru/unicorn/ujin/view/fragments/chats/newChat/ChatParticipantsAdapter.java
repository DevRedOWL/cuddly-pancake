package p035ru.unicorn.ujin.view.fragments.chats.newChat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.RequestListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.entities.chats.Author;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.GlideRequest;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/newChat/ChatParticipantsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/chats/newChat/ChatParticipantsAdapter$ViewHolder;", "participantList", "", "Lru/unicorn/ujin/data/entities/chats/Author;", "ownerId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getOwnerId", "()Ljava/lang/String;", "getParticipantList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.newChat.ChatParticipantsAdapter */
/* compiled from: ChatParticipantsAdapter.kt */
public final class ChatParticipantsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final String ownerId;
    private final List<Author> participantList;

    public ChatParticipantsAdapter(List<? extends Author> list, String str) {
        Intrinsics.checkNotNullParameter(list, "participantList");
        Intrinsics.checkNotNullParameter(str, "ownerId");
        this.participantList = list;
        this.ownerId = str;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final List<Author> getParticipantList() {
        return this.participantList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chat_participant, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…rticipant, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public int getItemCount() {
        return this.participantList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/newChat/ChatParticipantsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/fragments/chats/newChat/ChatParticipantsAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.newChat.ChatParticipantsAdapter$ViewHolder */
    /* compiled from: ChatParticipantsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ ChatParticipantsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(ChatParticipantsAdapter chatParticipantsAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = chatParticipantsAdapter;
        }

        public final void bind(int i) {
            Author author = this.this$0.getParticipantList().get(i);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvParticipantName);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvParticipantName");
            textView.setText(author.getFullName());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvStatus);
            if (Intrinsics.areEqual((Object) author.getAuthorId(), (Object) this.this$0.getOwnerId())) {
                textView2.setVisibility(0);
                textView2.setText(textView2.getContext().getString(R.string.chat_owner));
            } else {
                textView2.setVisibility(4);
            }
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            GlideRequest listener = GlideApp.with((View) (ImageView) view3.findViewById(C5619R.C5622id.ivAvatar)).load(author.getAvatarUrl()).listener((RequestListener) new ChatParticipantsAdapter$ViewHolder$bind$$inlined$let$lambda$1(author, this));
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            listener.into((ImageView) view4.findViewById(C5619R.C5622id.ivAvatar));
        }
    }
}
