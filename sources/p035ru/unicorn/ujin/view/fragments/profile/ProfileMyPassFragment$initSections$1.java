package p035ru.unicorn.ujin.view.fragments.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.MyPassIn;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/MyPassIn;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileMyPassFragment$initSections$1 */
/* compiled from: ProfileMyPassFragment.kt */
final class ProfileMyPassFragment$initSections$1<T> implements Consumer<MyPassIn> {
    final /* synthetic */ ProfileMyPassFragment this$0;

    ProfileMyPassFragment$initSections$1(ProfileMyPassFragment profileMyPassFragment) {
        this.this$0 = profileMyPassFragment;
    }

    public final void accept(MyPassIn myPassIn) {
        ProfileMyPassFragment profileMyPassFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(myPassIn, "data");
        profileMyPassFragment.onClick(myPassIn);
    }
}
