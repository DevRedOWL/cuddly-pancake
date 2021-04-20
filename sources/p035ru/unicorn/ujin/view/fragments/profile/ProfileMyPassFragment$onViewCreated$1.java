package p035ru.unicorn.ujin.view.fragments.profile;

import android.widget.ProgressBar;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.MyPassIn;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassDetailFragment2;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/data/MyPassIn;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileMyPassFragment$onViewCreated$1 */
/* compiled from: ProfileMyPassFragment.kt */
final class ProfileMyPassFragment$onViewCreated$1 extends Lambda implements Function1<List<? extends MyPassIn>, Unit> {
    final /* synthetic */ ProfileMyPassFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProfileMyPassFragment$onViewCreated$1(ProfileMyPassFragment profileMyPassFragment) {
        super(1);
        this.this$0 = profileMyPassFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<MyPassIn>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<MyPassIn> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        ProgressBar progressBar = this.this$0.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(4);
        Collection collection = list;
        this.this$0.getTextSection().show(collection.isEmpty());
        if (!collection.isEmpty() && list.size() > 1) {
            this.this$0.getPassSection().setData(list);
        } else if (collection.isEmpty() || list.size() != 1) {
            this.this$0.getTextSection().setData(new SomeString("Нет пропусков"));
        } else {
            ProfileMyPassFragment.access$getViewModell$p(this.this$0).setCurrentPass(list.get(0));
            this.this$0.popFragment();
            this.this$0.nextFragment(new PassDetailFragment2(), false, BaseActivity.FRAGMENT_MY_PASS);
        }
    }
}
