package p035ru.unicorn.ujin.view.adapters;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.facebook.react.uimanager.events.TouchesHelper;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Flat;
import p035ru.unicorn.ujin.view.adapters.FlatAdapter;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J6\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, mo51343d2 = {"ru/unicorn/ujin/view/adapters/FlatAdapter$ViewHolder$bind$3", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.FlatAdapter$ViewHolder$bind$3 */
/* compiled from: FlatAdapter.kt */
public final class FlatAdapter$ViewHolder$bind$3 implements RequestListener<Drawable> {
    final /* synthetic */ Flat $objFlat;
    final /* synthetic */ FlatAdapter.ViewHolder this$0;

    public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
        Intrinsics.checkNotNullParameter(obj, "model");
        Intrinsics.checkNotNullParameter(target, TouchesHelper.TARGET_KEY);
        return false;
    }

    FlatAdapter$ViewHolder$bind$3(FlatAdapter.ViewHolder viewHolder, Flat flat) {
        this.this$0 = viewHolder;
        this.$objFlat = flat;
    }

    public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
        Intrinsics.checkNotNullParameter(drawable, "resource");
        Intrinsics.checkNotNullParameter(obj, "model");
        Intrinsics.checkNotNullParameter(target, TouchesHelper.TARGET_KEY);
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        RealmViewModel viewModel = this.this$0.this$0.getViewModel();
        Flat flat = this.$objFlat;
        Intrinsics.checkNotNullExpressionValue(byteArray, "bitmapdata");
        viewModel.updateFlatSmallImage(flat, byteArray);
        return false;
    }
}
