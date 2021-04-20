package p042cz.msebera.android.httpclient.impl.conn.tsccm;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.conn.tsccm.WaitingThreadAborter */
public class WaitingThreadAborter {
    private boolean aborted;
    private WaitingThread waitingThread;

    public void abort() {
        this.aborted = true;
        WaitingThread waitingThread2 = this.waitingThread;
        if (waitingThread2 != null) {
            waitingThread2.interrupt();
        }
    }

    public void setWaitingThread(WaitingThread waitingThread2) {
        this.waitingThread = waitingThread2;
        if (this.aborted) {
            waitingThread2.interrupt();
        }
    }
}
