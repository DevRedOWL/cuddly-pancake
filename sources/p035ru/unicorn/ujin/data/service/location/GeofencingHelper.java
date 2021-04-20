package p035ru.unicorn.ujin.data.service.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;

/* renamed from: ru.unicorn.ujin.data.service.location.GeofencingHelper */
public class GeofencingHelper {
    public static final int RADIUS_IN_METERS = 100;
    private Context context;
    private List<Geofence> geofenceList = new ArrayList();
    private PendingIntent geofencePendingIntent;
    GeofencingClient geofencingClient;

    static /* synthetic */ void lambda$addGeofence$0(Void voidR) {
    }

    static /* synthetic */ void lambda$addGeofence$1(Exception exc) {
    }

    static /* synthetic */ void lambda$loadGeofence$2(Void voidR) {
    }

    static /* synthetic */ void lambda$loadGeofence$3(Exception exc) {
    }

    public GeofencingHelper(Context context2) {
        this.context = context2;
        this.geofencingClient = LocationServices.getGeofencingClient(context2);
    }

    public void addGeofence(Location location) {
        this.geofencingClient.addGeofences(geofencingRequest(Collections.singletonList(location)), getGeofencePendingIntent()).addOnSuccessListener($$Lambda$GeofencingHelper$tQBLtb_CsK2v3zQSH1nKP10ejI.INSTANCE).addOnFailureListener($$Lambda$GeofencingHelper$8sxhQYjTK1k8oUpWhTY8KxfyvI.INSTANCE);
    }

    private GeofencingRequest geofencingRequest(List<Location> list) {
        String uuid = UUID.randomUUID().toString();
        for (int i = 0; i < list.size(); i++) {
            Location location = list.get(i);
            this.geofenceList.add(new Geofence.Builder().setRequestId(uuid).setTransitionTypes(1).setCircularRegion(location.getLatitude(), location.getLongitude(), 100.0f).setExpirationDuration(-1).build());
        }
        GeofencingRequest.Builder builder = new GeofencingRequest.Builder();
        builder.setInitialTrigger(1);
        builder.addGeofences(this.geofenceList);
        return builder.build();
    }

    private PendingIntent getGeofencePendingIntent() {
        PendingIntent pendingIntent = this.geofencePendingIntent;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        this.geofencePendingIntent = PendingIntent.getService(this.context, 0, new Intent(this.context, LocationService.class), 134217728);
        return this.geofencePendingIntent;
    }

    public void removeGeofence() {
        this.geofencingClient.removeGeofences(getGeofencePendingIntent());
    }

    public void loadGeofence(LocalRepository localRepository) {
        List<Location> geofence = localRepository.getGeofence();
        if (!geofence.isEmpty()) {
            this.geofencingClient.addGeofences(geofencingRequest(geofence), getGeofencePendingIntent()).addOnSuccessListener($$Lambda$GeofencingHelper$4mEhJChmHA9bvXtnQEj_xEzHkIQ.INSTANCE).addOnFailureListener($$Lambda$GeofencingHelper$498A8QWMNVD0iSLDJIcHjW8EfFk.INSTANCE);
        }
    }

    public int getGeofences() {
        return this.geofenceList.size();
    }
}
