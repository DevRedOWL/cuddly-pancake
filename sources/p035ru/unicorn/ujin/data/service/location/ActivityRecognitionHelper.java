package p035ru.unicorn.ujin.data.service.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionRequest;
import java.util.ArrayList;
import org.apache.commons.lang3.time.DateUtils;

/* renamed from: ru.unicorn.ujin.data.service.location.ActivityRecognitionHelper */
public class ActivityRecognitionHelper {
    private ActivityRecognitionClient activityRecognitionClient;
    private Context context;

    public ActivityRecognitionHelper(Context context2) {
        this.context = context2;
        this.activityRecognitionClient = ActivityRecognition.getClient(context2);
    }

    private PendingIntent createPendingIntent() {
        return PendingIntent.getService(this.context, 0, new Intent(this.context, LocationService.class), 134217728);
    }

    /* access modifiers changed from: package-private */
    public void requestActivityTransitionUpdates() {
        ActivityTransitionRequest buildTransitionRequest = buildTransitionRequest();
        PendingIntent createPendingIntent = createPendingIntent();
        this.activityRecognitionClient.requestActivityTransitionUpdates(buildTransitionRequest, createPendingIntent);
        this.activityRecognitionClient.requestActivityUpdates(DateUtils.MILLIS_PER_MINUTE, createPendingIntent);
    }

    private ActivityTransitionRequest buildTransitionRequest() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ActivityTransition.Builder().setActivityType(0).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(0).setActivityTransition(1).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(7).setActivityTransition(0).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(7).setActivityTransition(1).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(3).setActivityTransition(1).build());
        arrayList.add(new ActivityTransition.Builder().setActivityType(3).setActivityTransition(0).build());
        return new ActivityTransitionRequest(arrayList);
    }
}
