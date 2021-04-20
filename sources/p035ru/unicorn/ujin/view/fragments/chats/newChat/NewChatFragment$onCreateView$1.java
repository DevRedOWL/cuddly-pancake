package p035ru.unicorn.ujin.view.fragments.chats.newChat;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.stfalcon.chatkit.commons.ImageLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.customViews.TextDrawable;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0002\b\t"}, mo51343d2 = {"<anonymous>", "", "imageView", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "url", "", "<anonymous parameter 2>", "", "loadImage"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.newChat.NewChatFragment$onCreateView$1 */
/* compiled from: NewChatFragment.kt */
final class NewChatFragment$onCreateView$1 implements ImageLoader {
    final /* synthetic */ NewChatFragment this$0;

    NewChatFragment$onCreateView$1(NewChatFragment newChatFragment) {
        this.this$0 = newChatFragment;
    }

    public final void loadImage(ImageView imageView, String str, Object obj) {
        if (str == null || !StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
            Context context = this.this$0.getContext();
            if (str != null) {
                imageView.setImageDrawable(new TextDrawable(context, str));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        Intrinsics.checkNotNullExpressionValue(GlideApp.with((View) imageView).load(str).apply((BaseRequestOptions) RequestOptions.circleCropTransform()).into(imageView), "GlideApp.with(imageView)…         .into(imageView)");
    }
}
