package p035ru.unicorn.ujin.view.fragments.searchFilter;

import android.os.CountDownTimer;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/searchFilter/SearchFilterFragment$countDownTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "p0", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment$countDownTimer$1 */
/* compiled from: SearchFilterFragment.kt */
public final class SearchFilterFragment$countDownTimer$1 extends CountDownTimer {
    final /* synthetic */ SearchFilterFragment this$0;

    public void onTick(long j) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchFilterFragment$countDownTimer$1(SearchFilterFragment searchFilterFragment, long j, long j2) {
        super(j, j2);
        this.this$0 = searchFilterFragment;
    }

    public void onFinish() {
        this.this$0.setTimerFinished(true);
        this.this$0.requestFlatFilter();
    }
}
