package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.create.BaseLocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;
import p046io.reactivex.BackpressureStrategy;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableEmitter;
import p046io.reactivex.functions.Function;
import p046io.realm.Realm;
import p046io.realm.RealmResults;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.HelpDeskLocalRepository */
public class HelpDeskLocalRepository extends BaseLocalRepository {
    private static HelpDeskLocalRepository INSTANCE;

    private HelpDeskLocalRepository() {
    }

    public static HelpDeskLocalRepository getInstance() {
        if (INSTANCE == null) {
            synchronized (HelpDeskLocalRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new HelpDeskLocalRepository();
                }
            }
        }
        return INSTANCE;
    }

    public Flowable<List<ServiceTicket>> getTickets() {
        return Flowable.create($$Lambda$HelpDeskLocalRepository$ZRScCjifBUl2AniToqGqJYrlTgE.INSTANCE, BackpressureStrategy.BUFFER);
    }

    static /* synthetic */ void lambda$getTickets$0(FlowableEmitter flowableEmitter) throws Exception {
        Realm defaultInstance = Realm.getDefaultInstance();
        try {
            if (!flowableEmitter.isCancelled()) {
                flowableEmitter.onNext(defaultInstance.copyFromRealm(defaultInstance.where(ServiceTicket.class).findAll()));
                flowableEmitter.onComplete();
            }
        } catch (Exception e) {
            flowableEmitter.onError(e);
        } catch (Throwable th) {
            defaultInstance.close();
            throw th;
        }
        defaultInstance.close();
    }

    public Flowable<List<Rooms>> getRooms() {
        this.realm = Realm.getDefaultInstance();
        return this.realm.where(Rooms.class).findAllAsync().asFlowable().map(new Function() {
            public final Object apply(Object obj) {
                return HelpDeskLocalRepository.this.lambda$getRooms$1$HelpDeskLocalRepository((RealmResults) obj);
            }
        });
    }

    public /* synthetic */ List lambda$getRooms$1$HelpDeskLocalRepository(RealmResults realmResults) throws Exception {
        return this.realm.copyFromRealm(realmResults);
    }
}
