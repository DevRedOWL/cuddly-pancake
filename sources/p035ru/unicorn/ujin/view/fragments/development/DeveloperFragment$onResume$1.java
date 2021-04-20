package p035ru.unicorn.ujin.view.fragments.development;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.developerPage.DeveloperPageData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/developerPage/DeveloperPageData;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperFragment$onResume$1 */
/* compiled from: DeveloperFragment.kt */
final class DeveloperFragment$onResume$1<T> implements Observer<DeveloperPageData> {
    final /* synthetic */ DeveloperFragment this$0;

    DeveloperFragment$onResume$1(DeveloperFragment developerFragment) {
        this.this$0 = developerFragment;
    }

    public final void onChanged(DeveloperPageData developerPageData) {
        this.this$0.showData(developerPageData);
    }
}
