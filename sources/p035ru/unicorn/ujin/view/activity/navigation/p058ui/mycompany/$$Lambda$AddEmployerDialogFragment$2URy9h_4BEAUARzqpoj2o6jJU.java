package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import p035ru.unicorn.ujin.util.Validator;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.-$$Lambda$AddEmployerDialogFragment$2URy9h_4-BEAUARzqpoj-2o6jJU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$AddEmployerDialogFragment$2URy9h_4BEAUARzqpoj2o6jJU implements Predicate {
    public static final /* synthetic */ $$Lambda$AddEmployerDialogFragment$2URy9h_4BEAUARzqpoj2o6jJU INSTANCE = new $$Lambda$AddEmployerDialogFragment$2URy9h_4BEAUARzqpoj2o6jJU();

    private /* synthetic */ $$Lambda$AddEmployerDialogFragment$2URy9h_4BEAUARzqpoj2o6jJU() {
    }

    public final boolean test(Object obj) {
        return Validator.isPhoneValid(String.valueOf((CharSequence) obj));
    }
}
