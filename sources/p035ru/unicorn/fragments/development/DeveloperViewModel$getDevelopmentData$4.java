package p035ru.unicorn.fragments.development;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.developerPage.DeveloperPageData;
import p035ru.unicorn.ujin.data.realm.DeveloperDayImageList;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/developerPage/DeveloperPageData;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.fragments.development.DeveloperViewModel$getDevelopmentData$4 */
/* compiled from: DeveloperViewModel.kt */
final class DeveloperViewModel$getDevelopmentData$4<T> implements Consumer<Resource<DeveloperPageData>> {
    final /* synthetic */ DeveloperViewModel this$0;

    DeveloperViewModel$getDevelopmentData$4(DeveloperViewModel developerViewModel) {
        this.this$0 = developerViewModel;
    }

    public final void accept(Resource<DeveloperPageData> resource) {
        DeveloperViewModel developerViewModel = this.this$0;
        MutableLiveData<DeveloperPageData> developmentLiveData = developerViewModel.getDevelopmentLiveData();
        Intrinsics.checkNotNullExpressionValue(resource, "data");
        developmentLiveData.postValue(resource.getData());
        DeveloperPageData data = resource.getData();
        Intrinsics.checkNotNullExpressionValue(data, "data.data");
        if (data.getSteps() != null) {
            DeveloperPageData data2 = resource.getData();
            Intrinsics.checkNotNullExpressionValue(data2, "data.data");
            ArrayList<DeveloperDayImageList> steps = data2.getSteps();
            Intrinsics.checkNotNullExpressionValue(steps, "data.data.steps");
            developerViewModel.setPhotolist(steps);
        }
    }
}
