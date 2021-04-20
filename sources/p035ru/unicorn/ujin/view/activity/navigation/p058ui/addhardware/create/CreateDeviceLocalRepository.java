package p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create;

import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p046io.reactivex.Flowable;
import p046io.reactivex.functions.Function;
import p046io.realm.Realm;
import p046io.realm.RealmResults;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.addhardware.create.CreateDeviceLocalRepository */
public class CreateDeviceLocalRepository extends BaseLocalRepository {
    private static CreateDeviceLocalRepository INSTANCE;

    private CreateDeviceLocalRepository() {
    }

    public static CreateDeviceLocalRepository getInstance() {
        if (INSTANCE == null) {
            synchronized (CreateDeviceLocalRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CreateDeviceLocalRepository();
                }
            }
        }
        return INSTANCE;
    }

    public Flowable<List<Rooms>> getRooms() {
        this.realm = Realm.getDefaultInstance();
        return this.realm.where(Rooms.class).findAllAsync().asFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return CreateDeviceLocalRepository.this.lambda$getRooms$0$CreateDeviceLocalRepository((RealmResults) obj);
            }
        });
    }

    public /* synthetic */ List lambda$getRooms$0$CreateDeviceLocalRepository(RealmResults realmResults) throws Exception {
        return this.realm.copyFromRealm(realmResults);
    }
}
