package p035ru.unicorn.ujin.view.fragments.chats.newChat;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.entities.chats.Author;
import p035ru.unicorn.ujin.view.customViews.TextDrawable;
import p035ru.unicorn.ujin.view.fragments.chats.newChat.ChatParticipantsAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/chats/newChat/ChatParticipantsAdapter$ViewHolder$bind$1$2", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.newChat.ChatParticipantsAdapter$ViewHolder$bind$$inlined$let$lambda$1 */
/* compiled from: ChatParticipantsAdapter.kt */
public final class ChatParticipantsAdapter$ViewHolder$bind$$inlined$let$lambda$1 implements RequestListener<Drawable> {
    final /* synthetic */ Author $it;
    final /* synthetic */ ChatParticipantsAdapter.ViewHolder this$0;

    public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
        return true;
    }

    ChatParticipantsAdapter$ViewHolder$bind$$inlined$let$lambda$1(Author author, ChatParticipantsAdapter.ViewHolder viewHolder) {
        this.$it = author;
        this.this$0 = viewHolder;
    }

    public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
        View view = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ImageView imageView = (ImageView) view.findViewById(C5619R.C5622id.ivAvatar);
        View view2 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        Context context = view2.getContext();
        String fullName = this.$it.getFullName();
        if (fullName != null) {
            imageView.setImageDrawable(new TextDrawable(context, fullName));
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
