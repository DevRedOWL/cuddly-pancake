package p059rx.internal.util;

import java.util.concurrent.CountDownLatch;
import p059rx.Subscription;

/* renamed from: rx.internal.util.BlockingUtils */
public final class BlockingUtils {
    private BlockingUtils() {
    }

    public static void awaitForComplete(CountDownLatch countDownLatch, Subscription subscription) {
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                subscription.unsubscribe();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
    }
}
