package p035ru.unicorn.ujin.data.repository;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import p046io.realm.Realm;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/BaseLocalRepository;", "", "()V", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "realm$delegate", "Lkotlin/Lazy;", "Companion", "Holder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.BaseLocalRepository */
/* compiled from: BaseLocalRepository.kt */
public class BaseLocalRepository {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Lazy instance$delegate = LazyKt.lazy(BaseLocalRepository$Companion$instance$2.INSTANCE);
    private final Lazy realm$delegate = LazyKt.lazy(BaseLocalRepository$realm$2.INSTANCE);

    public final Realm getRealm() {
        return (Realm) this.realm$delegate.getValue();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/BaseLocalRepository$Holder;", "", "()V", "INSTANCE", "Lru/unicorn/ujin/data/repository/BaseLocalRepository;", "getINSTANCE", "()Lru/unicorn/ujin/data/repository/BaseLocalRepository;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.repository.BaseLocalRepository$Holder */
    /* compiled from: BaseLocalRepository.kt */
    private static final class Holder {
        public static final Holder INSTANCE = new Holder();

        /* renamed from: INSTANCE  reason: collision with other field name */
        private static final BaseLocalRepository f7022INSTANCE = new BaseLocalRepository();

        private Holder() {
        }

        public final BaseLocalRepository getINSTANCE() {
            return f7022INSTANCE;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/BaseLocalRepository$Companion;", "", "()V", "instance", "Lru/unicorn/ujin/data/repository/BaseLocalRepository;", "getInstance", "()Lru/unicorn/ujin/data/repository/BaseLocalRepository;", "instance$delegate", "Lkotlin/Lazy;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.repository.BaseLocalRepository$Companion */
    /* compiled from: BaseLocalRepository.kt */
    public static final class Companion {
        public final BaseLocalRepository getInstance() {
            Lazy access$getInstance$cp = BaseLocalRepository.instance$delegate;
            Companion companion = BaseLocalRepository.Companion;
            return (BaseLocalRepository) access$getInstance$cp.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
