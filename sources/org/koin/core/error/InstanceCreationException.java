package org.koin.core.error;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lorg/koin/core/error/InstanceCreationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "parent", "(Ljava/lang/String;Ljava/lang/Exception;)V", "koin-core"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: InstanceCreationException.kt */
public final class InstanceCreationException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstanceCreationException(String str, Exception exc) {
        super(str, exc);
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_MESSAGE);
        Intrinsics.checkParameterIsNotNull(exc, CategoryItem.Fields.parent);
    }
}
