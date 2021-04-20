package com.google.android.play.core.tasks;

public class NativeOnCompleteListener implements OnCompleteListener<Object> {

    /* renamed from: a */
    private final long f2197a;

    /* renamed from: b */
    private final int f2198b;

    public NativeOnCompleteListener(long j, int i) {
        this.f2197a = j;
        this.f2198b = i;
    }

    public native void nativeOnComplete(long j, int i, Object obj, int i2);

    public void onComplete(Task<Object> task) {
        if (!task.isComplete()) {
            int i = this.f2198b;
            StringBuilder sb = new StringBuilder(50);
            sb.append("onComplete called for incomplete task: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (task.isSuccessful()) {
            nativeOnComplete(this.f2197a, this.f2198b, task.getResult(), 0);
        } else {
            Exception exception = task.getException();
            if (!(exception instanceof C2416j)) {
                nativeOnComplete(this.f2197a, this.f2198b, (Object) null, -100);
                return;
            }
            int errorCode = ((C2416j) exception).getErrorCode();
            if (errorCode != 0) {
                nativeOnComplete(this.f2197a, this.f2198b, (Object) null, errorCode);
                return;
            }
            int i2 = this.f2198b;
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("TaskException has error code 0 on task: ");
            sb2.append(i2);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
