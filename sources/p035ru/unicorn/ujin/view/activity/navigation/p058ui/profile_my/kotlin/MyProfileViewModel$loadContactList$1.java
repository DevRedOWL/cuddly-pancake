package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactDataList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamMapper;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/ContactDataList;", "kotlin.jvm.PlatformType", "data", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileViewModel$loadContactList$1 */
/* compiled from: MyProfileViewModel.kt */
final class MyProfileViewModel$loadContactList$1<T, R> implements Function<Resource<ContactDataList>, Resource<ContactDataList>> {
    final /* synthetic */ ContactDataList $contactDataList;
    final /* synthetic */ MyProfileViewModel this$0;

    MyProfileViewModel$loadContactList$1(MyProfileViewModel myProfileViewModel, ContactDataList contactDataList) {
        this.this$0 = myProfileViewModel;
        this.$contactDataList = contactDataList;
    }

    public final Resource<ContactDataList> apply(Resource<ContactDataList> resource) {
        Integer error;
        Intrinsics.checkNotNullParameter(resource, "data");
        if (resource.getStatus() == Resource.Status.ERROR || ((error = resource.getError()) != null && error.intValue() == 1)) {
            ContactDataList contactDataList = this.$contactDataList;
            if (contactDataList == null || contactDataList.getItems().isEmpty()) {
                this.this$0.getTeamContactListLiveData().postValue(Resource.success(1, "Ошибка загрузки данных", null));
            } else {
                this.this$0.getContactListLiveData().postValue(this.$contactDataList);
                MutableLiveData<Resource<List<TeamMapper>>> teamContactListLiveData = this.this$0.getTeamContactListLiveData();
                Iterable<UserProfile> items = this.$contactDataList.getItems();
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                for (UserProfile mapTo : items) {
                    arrayList.add(TeamMapper.mapTo(mapTo));
                }
                teamContactListLiveData.postValue(Resource.success(0, "", (List) arrayList));
            }
        }
        return resource;
    }
}
