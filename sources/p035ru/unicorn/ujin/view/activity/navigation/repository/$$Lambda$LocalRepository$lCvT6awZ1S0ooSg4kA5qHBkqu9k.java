package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$LocalRepository$lCvT6awZ1S0ooSg4kA5qHBkqu9k  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LocalRepository$lCvT6awZ1S0ooSg4kA5qHBkqu9k implements Predicate {
    public static final /* synthetic */ $$Lambda$LocalRepository$lCvT6awZ1S0ooSg4kA5qHBkqu9k INSTANCE = new $$Lambda$LocalRepository$lCvT6awZ1S0ooSg4kA5qHBkqu9k();

    private /* synthetic */ $$Lambda$LocalRepository$lCvT6awZ1S0ooSg4kA5qHBkqu9k() {
    }

    public final boolean test(Object obj) {
        return LocalRepository.lambda$getHardwareBySerialNumber$9((Hardware) obj);
    }
}
