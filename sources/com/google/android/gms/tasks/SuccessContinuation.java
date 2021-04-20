package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@17.2.0 */
public interface SuccessContinuation<TResult, TContinuationResult> {
    Task<TContinuationResult> then(TResult tresult) throws Exception;
}
