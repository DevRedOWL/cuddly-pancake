package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactData;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/ContactData;", "kotlin.jvm.PlatformType", "data", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.MyProfileRemoteRepository$destroyContact$1 */
/* compiled from: MyProfileRemoteRepository.kt */
final class MyProfileRemoteRepository$destroyContact$1<T, R> implements Function<SimpleResponse, Resource<ContactData>> {
    public static final MyProfileRemoteRepository$destroyContact$1 INSTANCE = new MyProfileRemoteRepository$destroyContact$1();

    MyProfileRemoteRepository$destroyContact$1() {
    }

    public final Resource<ContactData> apply(SimpleResponse simpleResponse) {
        Intrinsics.checkNotNullParameter(simpleResponse, "data");
        return Resource.success(Integer.valueOf(simpleResponse.getError()), simpleResponse.getMessage(), null);
    }
}
