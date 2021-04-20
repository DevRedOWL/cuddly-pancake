package p046io.realm;

import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.FilesUrl;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceStatus;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceDataRealmProxyInterface */
public interface C4689x93e0fb82 {
    String realmGet$agreementMessage();

    String realmGet$companyTitle();

    String realmGet$description();

    RealmList<FilesUrl> realmGet$files();

    Integer realmGet$id();

    ServiceStatus realmGet$status();

    String realmGet$title();

    void realmSet$agreementMessage(String str);

    void realmSet$companyTitle(String str);

    void realmSet$description(String str);

    void realmSet$files(RealmList<FilesUrl> realmList);

    void realmSet$id(Integer num);

    void realmSet$status(ServiceStatus serviceStatus);

    void realmSet$title(String str);
}
