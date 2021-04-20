package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.notification.NotificationListResponse;
import p035ru.unicorn.ujin.data.realm.ErrorData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ServiceData;
import p035ru.unicorn.ujin.data.realm.notification.Notification;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.functions.Function;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/notification/NotificationListResponse;", "kotlin.jvm.PlatformType", "resource", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$getNotificationList$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$getNotificationList$1<T, R> implements Function<Resource<NotificationListResponse>, Resource<NotificationListResponse>> {
    public static final ProfileRemoteRepository$getNotificationList$1 INSTANCE = new ProfileRemoteRepository$getNotificationList$1();

    ProfileRemoteRepository$getNotificationList$1() {
    }

    public final Resource<NotificationListResponse> apply(Resource<NotificationListResponse> resource) {
        String str;
        ErrorData error;
        Integer error2;
        RealmList<Notification> notifications;
        Intrinsics.checkNotNullParameter(resource, "resource");
        NotificationListResponse data = resource.getData();
        int i = 1;
        if (!(data == null || (notifications = data.getNotifications()) == null)) {
            LocalRepository.getInstance().saveDataAsList(notifications, Notification.class, true);
        }
        ServiceData service = resource.getService();
        if ((service != null ? service.getError() : null) == null || ((error2 = resource.getError()) != null && error2.intValue() == 0)) {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        ServiceData service2 = resource.getService();
        if (service2 == null || (error = service2.getError()) == null || (str = error.getMessage()) == null) {
            str = resource.getMessage();
        }
        if (str == null) {
            str = "";
        }
        return Resource.success(valueOf, str, resource.getData());
    }
}
