package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "onMapReady"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.MapViewHolder$bind$1 */
/* compiled from: MapViewHolder.kt */
final class MapViewHolder$bind$1 implements OnMapReadyCallback {
    final /* synthetic */ Field $item;
    final /* synthetic */ MapViewHolder this$0;

    MapViewHolder$bind$1(MapViewHolder mapViewHolder, Field field) {
        this.this$0 = mapViewHolder;
        this.$item = field;
    }

    public final void onMapReady(GoogleMap googleMap) {
        Intrinsics.checkNotNullParameter(googleMap, "googleMap");
        Field field = this.$item;
        if (field != null) {
            ArrayList<MapPoint> pointList = ((MapField) field).getPointList();
            if (pointList != null) {
                Iterable<MapPoint> iterable = pointList;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (MapPoint mapPoint : iterable) {
                    MarkerOptions position = new MarkerOptions().position(new LatLng(mapPoint.getX(), mapPoint.getY()));
                    View view = this.this$0.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    arrayList.add(googleMap.addMarker(position.icon(AppUtils.bitmapDescriptorFromVector(((MapView) view).getContext(), R.drawable.icon_map_builder_pin))));
                }
                List list = (List) arrayList;
            }
            MapPoint center = ((MapField) this.$item).getCenter();
            if (center != null) {
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(center.getX(), center.getY()), center.getZoom()));
            }
            googleMap.getUiSettings().setAllGesturesEnabled(false);
            ((MapView) this.this$0.itemView).onResume();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.MapField");
    }
}
