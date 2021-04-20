package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import p035ru.unicorn.ujin.util.Validator;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.-$$Lambda$AddEmployerDialogFragment$B5eeLU_N7vh1yBB69_Sfa4DnXrU  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$AddEmployerDialogFragment$B5eeLU_N7vh1yBB69_Sfa4DnXrU implements Predicate {
    public static final /* synthetic */ $$Lambda$AddEmployerDialogFragment$B5eeLU_N7vh1yBB69_Sfa4DnXrU INSTANCE = new $$Lambda$AddEmployerDialogFragment$B5eeLU_N7vh1yBB69_Sfa4DnXrU();

    private /* synthetic */ $$Lambda$AddEmployerDialogFragment$B5eeLU_N7vh1yBB69_Sfa4DnXrU() {
    }

    public final boolean test(Object obj) {
        return Validator.isPhoneValid(String.valueOf((String) obj));
    }
}
