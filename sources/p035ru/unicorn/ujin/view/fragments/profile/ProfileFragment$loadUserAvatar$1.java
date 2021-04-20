package p035ru.unicorn.ujin.view.fragments.profile;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import kotlin.Metadata;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.TextDrawable;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/profile/ProfileFragment$loadUserAvatar$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileFragment$loadUserAvatar$1 */
/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$loadUserAvatar$1 implements RequestListener<Drawable> {
    final /* synthetic */ ProfileFragment this$0;

    ProfileFragment$loadUserAvatar$1(ProfileFragment profileFragment) {
        this.this$0 = profileFragment;
    }

    public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
        ((AppCompatImageView) this.this$0._$_findCachedViewById(C5619R.C5622id.ivImage)).setImageDrawable(new TextDrawable(this.this$0.getContext(), ProfileFragment.access$getUser$p(this.this$0).getFullName()));
        return true;
    }

    public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
        ((AppCompatImageView) this.this$0._$_findCachedViewById(C5619R.C5622id.ivImage)).setImageDrawable(drawable);
        return true;
    }
}
