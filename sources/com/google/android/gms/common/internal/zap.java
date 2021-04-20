package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
final class zap implements PendingResultUtil.zaa {
    zap() {
    }

    public final ApiException zaa(Status status) {
        return ApiExceptionUtil.fromStatus(status);
    }
}
