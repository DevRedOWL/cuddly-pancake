package p059rx.internal.operators;

import p059rx.Notification;
import p059rx.Observable;
import p059rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorDematerialize */
public final class OperatorDematerialize<T> implements Observable.Operator<T, Notification<T>> {

    /* renamed from: rx.internal.operators.OperatorDematerialize$Holder */
    static final class Holder {
        static final OperatorDematerialize<Object> INSTANCE = new OperatorDematerialize<>();

        Holder() {
        }
    }

    public static OperatorDematerialize instance() {
        return Holder.INSTANCE;
    }

    OperatorDematerialize() {
    }

    public Subscriber<? super Notification<T>> call(final Subscriber<? super T> subscriber) {
        return new Subscriber<Notification<T>>(subscriber) {
            boolean terminated;

            public void onNext(Notification<T> notification) {
                int i = C62922.$SwitchMap$rx$Notification$Kind[notification.getKind().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        onError(notification.getThrowable());
                    } else if (i != 3) {
                        onError(new IllegalArgumentException("Unsupported notification type: " + notification));
                    } else {
                        onCompleted();
                    }
                } else if (!this.terminated) {
                    subscriber.onNext(notification.getValue());
                }
            }

            public void onError(Throwable th) {
                if (!this.terminated) {
                    this.terminated = true;
                    subscriber.onError(th);
                }
            }

            public void onCompleted() {
                if (!this.terminated) {
                    this.terminated = true;
                    subscriber.onCompleted();
                }
            }
        };
    }

    /* renamed from: rx.internal.operators.OperatorDematerialize$2 */
    static /* synthetic */ class C62922 {
        static final /* synthetic */ int[] $SwitchMap$rx$Notification$Kind = new int[Notification.Kind.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                rx.Notification$Kind[] r0 = p059rx.Notification.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$rx$Notification$Kind = r0
                int[] r0 = $SwitchMap$rx$Notification$Kind     // Catch:{ NoSuchFieldError -> 0x0014 }
                rx.Notification$Kind r1 = p059rx.Notification.Kind.OnNext     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$rx$Notification$Kind     // Catch:{ NoSuchFieldError -> 0x001f }
                rx.Notification$Kind r1 = p059rx.Notification.Kind.OnError     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$rx$Notification$Kind     // Catch:{ NoSuchFieldError -> 0x002a }
                rx.Notification$Kind r1 = p059rx.Notification.Kind.OnCompleted     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p059rx.internal.operators.OperatorDematerialize.C62922.<clinit>():void");
        }
    }
}
