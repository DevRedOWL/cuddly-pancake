package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.data.realm.UpdatePointsSession */
public class UpdatePointsSession {
    @SerializedName("action")
    private PushAction actionForPush;
    @SerializedName("next_session")
    private GeoResponse geoResponse;
    @SerializedName("reload_points")
    private int reloadPoint;

    public int getReloadPoint() {
        return this.reloadPoint;
    }

    public PushAction getActionForPush() {
        return this.actionForPush;
    }

    public GeoResponse getGeoResponse() {
        return this.geoResponse;
    }

    public void setGeoResponse(GeoResponse geoResponse2) {
        this.geoResponse = geoResponse2;
    }

    public boolean isReloadPoint() {
        return this.reloadPoint == 0;
    }
}
