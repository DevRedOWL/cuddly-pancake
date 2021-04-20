package p035ru.unicorn.ujin.viewModel;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.News;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo51343d2 = {"ru/unicorn/ujin/viewModel/RealmViewModel$getNewsList$1", "Ljava/util/Comparator;", "Lru/unicorn/ujin/data/realm/News;", "compare", "", "p0", "p1", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.RealmViewModel$getNewsList$1 */
/* compiled from: RealmViewModel.kt */
public final class RealmViewModel$getNewsList$1 implements Comparator<News> {
    RealmViewModel$getNewsList$1() {
    }

    public int compare(News news, News news2) {
        Intrinsics.checkNotNullParameter(news, "p0");
        Intrinsics.checkNotNullParameter(news2, "p1");
        return news.getId().compareTo(news2.getId()) > 0 ? -1 : 1;
    }
}
