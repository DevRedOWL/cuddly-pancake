package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new zzm();
    public final float bearing;
    public final float tilt;
    public final float zoom;
    private final StreetViewPanoramaOrientation zzeg;

    public static final class Builder {
        public float bearing;
        public float tilt;
        public float zoom;

        public Builder() {
        }

        public Builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
            Preconditions.checkNotNull(streetViewPanoramaCamera, "StreetViewPanoramaCamera");
            this.zoom = streetViewPanoramaCamera.zoom;
            this.bearing = streetViewPanoramaCamera.bearing;
            this.tilt = streetViewPanoramaCamera.tilt;
        }

        public final Builder zoom(float f) {
            this.zoom = f;
            return this;
        }

        public final Builder orientation(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            Preconditions.checkNotNull(streetViewPanoramaOrientation, "StreetViewPanoramaOrientation");
            this.tilt = streetViewPanoramaOrientation.tilt;
            this.bearing = streetViewPanoramaOrientation.bearing;
            return this;
        }

        public final Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public final Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public final StreetViewPanoramaCamera build() {
            return new StreetViewPanoramaCamera(this.zoom, this.tilt, this.bearing);
        }
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        Preconditions.checkArgument(z, sb.toString());
        this.zoom = ((double) f) <= Utils.DOUBLE_EPSILON ? 0.0f : f;
        this.tilt = 0.0f + f2;
        this.bearing = (((double) f3) <= Utils.DOUBLE_EPSILON ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.zzeg = new StreetViewPanoramaOrientation.Builder().tilt(f2).bearing(f3).build();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.zoom);
        SafeParcelWriter.writeFloat(parcel, 3, this.tilt);
        SafeParcelWriter.writeFloat(parcel, 4, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new Builder(streetViewPanoramaCamera);
    }

    public StreetViewPanoramaOrientation getOrientation() {
        return this.zzeg;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    public String toString() {
        return Objects.toStringHelper(this).add(MapPoint.JsonFields.zoom, Float.valueOf(this.zoom)).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }
}
