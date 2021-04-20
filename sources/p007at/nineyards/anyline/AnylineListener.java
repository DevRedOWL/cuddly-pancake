package p007at.nineyards.anyline;

import p007at.nineyards.anyline.core.RunFailure;

/* renamed from: at.nineyards.anyline.AnylineListener */
public interface AnylineListener {
    void onAbortRun(RunFailure runFailure);

    void onFinishedWithOutput(Object obj);

    void onReportsVariable(String str, Object obj);
}
