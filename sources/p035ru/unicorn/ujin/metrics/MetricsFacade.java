package p035ru.unicorn.ujin.metrics;

import com.yandex.metrica.YandexMetrica;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo51343d2 = {"Lru/unicorn/ujin/metrics/MetricsFacade;", "", "()V", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.metrics.MetricsFacade */
/* compiled from: MerticsFacade.kt */
public final class MetricsFacade {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Lazy idList$delegate = LazyKt.lazy(MetricsFacade$Companion$idList$2.INSTANCE);
    /* access modifiers changed from: private */
    public static final Lazy profileLocalRepository$delegate = LazyKt.lazy(MetricsFacade$Companion$profileLocalRepository$2.INSTANCE);

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0013J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/metrics/MetricsFacade$Companion;", "", "()V", "idList", "Ljava/util/ArrayList;", "", "getIdList", "()Ljava/util/ArrayList;", "idList$delegate", "Lkotlin/Lazy;", "profileLocalRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "getProfileLocalRepository", "()Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "profileLocalRepository$delegate", "reportEvent", "", "value", "map", "Ljava/util/HashMap;", "secondValue", "userAllowedToSendMetrics", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.metrics.MetricsFacade$Companion */
    /* compiled from: MerticsFacade.kt */
    public static final class Companion {
        private final boolean userAllowedToSendMetrics() {
            return true;
        }

        public final ArrayList<String> getIdList() {
            Lazy access$getIdList$cp = MetricsFacade.idList$delegate;
            Companion companion = MetricsFacade.Companion;
            return (ArrayList) access$getIdList$cp.getValue();
        }

        public final ProfileLocalRepository getProfileLocalRepository() {
            Lazy access$getProfileLocalRepository$cp = MetricsFacade.profileLocalRepository$delegate;
            Companion companion = MetricsFacade.Companion;
            return (ProfileLocalRepository) access$getProfileLocalRepository$cp.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void reportEvent(String str) {
            Intrinsics.checkNotNullParameter(str, "value");
            if (userAllowedToSendMetrics()) {
                YandexMetrica.reportEvent(str);
            }
        }

        public final void reportEvent(String str, HashMap<String, ? extends Object> hashMap) {
            Intrinsics.checkNotNullParameter(str, "value");
            if (userAllowedToSendMetrics()) {
                YandexMetrica.reportEvent(str, (Map<String, Object>) hashMap);
            }
        }

        public final void reportEvent(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "value");
            Intrinsics.checkNotNullParameter(str2, "secondValue");
            if (userAllowedToSendMetrics()) {
                YandexMetrica.reportEvent(str, str2);
            }
        }
    }
}
