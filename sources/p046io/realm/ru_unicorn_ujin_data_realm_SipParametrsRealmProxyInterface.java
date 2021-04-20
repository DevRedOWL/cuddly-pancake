package p046io.realm;

import p035ru.unicorn.ujin.data.realm.SipOpenDoorParam;
import p035ru.unicorn.ujin.data.realm.SipPreviewParams;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface */
public interface ru_unicorn_ujin_data_realm_SipParametrsRealmProxyInterface {
    SipOpenDoorParam realmGet$openDoorParam();

    SipPreviewParams realmGet$previewParams();

    String realmGet$sipCodecAudio();

    String realmGet$sipCodecVideo();

    String realmGet$sipDomain();

    String realmGet$sipPassword();

    Integer realmGet$sipPort();

    String realmGet$sipProxy();

    Integer realmGet$sipProxyPort();

    String realmGet$sipTransport();

    Integer realmGet$sipUser();

    String realmGet$videoSource();

    void realmSet$openDoorParam(SipOpenDoorParam sipOpenDoorParam);

    void realmSet$previewParams(SipPreviewParams sipPreviewParams);

    void realmSet$sipCodecAudio(String str);

    void realmSet$sipCodecVideo(String str);

    void realmSet$sipDomain(String str);

    void realmSet$sipPassword(String str);

    void realmSet$sipPort(Integer num);

    void realmSet$sipProxy(String str);

    void realmSet$sipProxyPort(Integer num);

    void realmSet$sipTransport(String str);

    void realmSet$sipUser(Integer num);

    void realmSet$videoSource(String str);
}
