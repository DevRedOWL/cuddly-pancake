package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
import p035ru.unicorn.ujin.view.activity.navigation.api.SerialNumber;
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalSettings;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassDevice;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p035ru.unicorn.ujin.view.activity.navigation.repository.SignalCode;
import p046io.reactivex.Flowable;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\u0006\u0010\u000f\u001a\u00020\bJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\u0006\u0010\u0011\u001a\u00020\bJ\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00050\u0004J \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00130\u00050\u00042\u0006\u0010\u0017\u001a\u00020\bJ\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00130\u0004J\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00042\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bJ\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00130\u00050\u0004J\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00130\u00050\u0004J!\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00050\u00042\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010$J\"\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bJ\"\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ)\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\u0006\u0010\"\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010*¨\u0006+"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/addhardware/create/CreateDeviceRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "addHardware", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/api/SerialNumber;", "devName", "", "deviceType", "roomIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Flowable;", "addRoom", "Ljava/lang/Void;", "title", "deleteHardware", "id", "getClassDevice", "", "Lru/unicorn/ujin/view/activity/navigation/ui/addhardware/ClassDevice;", "getDeviceModel", "Lru/unicorn/ujin/view/activity/navigation/api/DeviceModel;", "name", "getHardware", "Lru/unicorn/ujin/view/activity/navigation/entity/hardware/Hardware;", "getHardwareById", "sn", "signal", "getHardwareResource", "getRooms", "Lru/unicorn/ujin/view/activity/navigation/ui/mainsmart/Rooms;", "getWindowsSettings", "Lru/unicorn/ujin/view/activity/navigation/api/SignalSettings;", "serialNumber", "", "(Ljava/lang/Long;)Lio/reactivex/Flowable;", "saveCode", "Lru/unicorn/ujin/view/activity/navigation/repository/SignalCode;", "updateDevice", "updateDeviceRoom", "roomId", "(Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Flowable;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.CreateDeviceRemoteRepository */
/* compiled from: CreateDeviceRemoteRepository.kt */
public final class CreateDeviceRemoteRepository extends BaseRemoteRepository {
    public final Flowable<Resource<Void>> addRoom(String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        Flowable<R> subscribeOn = getApi().updateRoom(getAppName(), getToken(), str).map(CreateDeviceRemoteRepository$addRoom$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$addRoom$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.updateRoom(appName, …scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<List<Rooms>>> getRooms() {
        Flowable<R> subscribeOn = getApi().getRooms(getAppName(), getToken()).map(CreateDeviceRemoteRepository$getRooms$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$getRooms$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getRooms(appName, ge…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<List<ClassDevice>>> getClassDevice() {
        Flowable<R> subscribeOn = getApi().getClassDevice(getAppName(), getToken()).map(CreateDeviceRemoteRepository$getClassDevice$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$getClassDevice$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getClassDevice(appNa…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<List<Hardware>> getHardware() {
        Flowable<R> subscribeOn = getApi().getHardware(getAppName(), getToken()).map(CreateDeviceRemoteRepository$getHardware$1.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getHardware( appName…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<List<Hardware>>> getHardwareResource() {
        Flowable<R> subscribeOn = getApi().getHardware(getAppName(), getToken()).map(CreateDeviceRemoteRepository$getHardwareResource$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$getHardwareResource$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getHardware( appName…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<List<DeviceModel>>> getDeviceModel(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Flowable<R> subscribeOn = getApi().getDeviceModel(getAppName(), getToken(), str).map(CreateDeviceRemoteRepository$getDeviceModel$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$getDeviceModel$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getDeviceModel(appNa…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<SignalCode>> saveCode(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Flowable<R> subscribeOn = getApi().saveCode(getAppName(), str, str2, getToken()).map(CreateDeviceRemoteRepository$saveCode$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$saveCode$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.saveCode(appName, id…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<Void>> updateDeviceRoom(String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "serialNumber");
        Flowable<R> subscribeOn = getApi().updateDeviceRoom(getAppName(), str, num, getToken()).map(CreateDeviceRemoteRepository$updateDeviceRoom$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$updateDeviceRoom$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.updateDeviceRoom(app…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<SerialNumber>> addHardware(String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(str, "devName");
        Intrinsics.checkNotNullParameter(str2, "deviceType");
        Flowable<R> subscribeOn = getApi().addHardware(getAppName(), str, str2, num, getToken(), "").map(CreateDeviceRemoteRepository$addHardware$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$addHardware$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.addHardware(appName,…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<Void>> updateDevice(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "serialNumber");
        Intrinsics.checkNotNullParameter(str2, "title");
        Flowable<R> subscribeOn = getApi().updateHardware(getAppName(), str, str2, getToken()).map(CreateDeviceRemoteRepository$updateDevice$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$updateDevice$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.updateHardware(appNa…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<SignalSettings>> getWindowsSettings(Long l) {
        Flowable<R> subscribeOn = getApi().getWindowSetting(getAppName(), l, "show-map", getToken()).map(CreateDeviceRemoteRepository$getWindowsSettings$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$getWindowsSettings$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getWindowSetting(app…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<Hardware>> getHardwareById(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "sn");
        Intrinsics.checkNotNullParameter(str2, "signal");
        Flowable<R> subscribeOn = getApi().getHardwareBySerialNumber(getAppName(), str, str2).map(CreateDeviceRemoteRepository$getHardwareById$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$getHardwareById$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getHardwareBySerialN…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<Void>> deleteHardware(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        Flowable<R> subscribeOn = getApi().deleteHardware(getAppName(), str, getToken()).map(CreateDeviceRemoteRepository$deleteHardware$1.INSTANCE).onErrorReturn(CreateDeviceRemoteRepository$deleteHardware$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.deleteHardware(appNa…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
