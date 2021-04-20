package p035ru.unicorn.ujin.view.activity.navigation.repository;

import java.util.List;
import p046io.reactivex.Flowable;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$LocalRepository$CgfDzIJcjZskviQb-DKvft6QcfE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LocalRepository$CgfDzIJcjZskviQbDKvft6QcfE implements Function {
    public static final /* synthetic */ $$Lambda$LocalRepository$CgfDzIJcjZskviQbDKvft6QcfE INSTANCE = new $$Lambda$LocalRepository$CgfDzIJcjZskviQbDKvft6QcfE();

    private /* synthetic */ $$Lambda$LocalRepository$CgfDzIJcjZskviQbDKvft6QcfE() {
    }

    public final Object apply(Object obj) {
        return Flowable.fromArray((List) obj).flatMapIterable($$Lambda$LocalRepository$WNsyTcTk_LkxmQ_NlmjZjwIx9oU.INSTANCE).filter($$Lambda$LocalRepository$zGrioGY6paWoWAVBPQxuhs2VHF8.INSTANCE).toList().toFlowable();
    }
}
