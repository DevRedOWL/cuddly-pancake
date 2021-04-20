package p035ru.unicorn.ujin.view.fragments;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.Observer;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.City;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

/* renamed from: ru.unicorn.ujin.view.fragments.SearchTownFragment */
public class SearchTownFragment extends BaseFragment {
    private static final String CITY_POS = "cityPos";
    private ArrayList<City> cities = new ArrayList<>();
    List<Complex> complexList;
    private GoogleMap googleMap;
    private MapView mapView;
    private HashMap<String, String> markerComplexMap = new HashMap<>();
    private int posTown = 0;
    View.OnClickListener townClickListener = new View.OnClickListener() {
        public final void onClick(View view) {
            SearchTownFragment.this.lambda$new$2$SearchTownFragment(view);
        }
    };
    private ArrayList<String> towns = new ArrayList<>();
    private View view;

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static SearchTownFragment newInstance(Integer num) {
        SearchTownFragment searchTownFragment = new SearchTownFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(CITY_POS, num.intValue());
        searchTownFragment.setArguments(bundle);
        return searchTownFragment;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        if (!this.cities.isEmpty()) {
            initTownSelector();
        }
    }

    private /* synthetic */ void lambda$showToolbar$0(View view2) {
        nextFragment(new SearchFilterFragment(), false, BaseActivity.FRAGMENT_SEARCH_FILTER);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_seach_town, viewGroup, false);
        this.viewModel.getCityListUpdateMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                SearchTownFragment.this.handleCityListEvent((UpdateEvent) obj);
            }
        });
        this.viewModel.getComplexListUpdateMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                SearchTownFragment.this.handleComplexListEvent((UpdateEvent) obj);
            }
        });
        this.viewModel.requestUpdateCityList(ProfileLocalRepository.Companion.getInstance().getUserToken());
        this.mapView = (MapView) this.view.findViewById(R.id.mapview_ID);
        if (this.posTown == 0) {
            this.posTown = getArguments().getInt(CITY_POS, 0);
        }
        return this.view;
    }

    /* access modifiers changed from: private */
    public void handleComplexListEvent(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            showComplexesOnMap();
        } else {
            getBaseActivity().showMessage(updateEvent.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public void handleCityListEvent(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            initTownSelector();
            this.mapView.getMapAsync(new OnMapReadyCallback() {
                public final void onMapReady(GoogleMap googleMap) {
                    SearchTownFragment.this.lambda$handleCityListEvent$1$SearchTownFragment(googleMap);
                }
            });
        }
    }

    public /* synthetic */ void lambda$handleCityListEvent$1$SearchTownFragment(GoogleMap googleMap2) {
        this.googleMap = googleMap2;
        googleMap2.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            public final boolean onMarkerClick(Marker marker) {
                return SearchTownFragment.this.handleMarkerClick(marker);
            }
        });
        this.mapView.onResume();
        this.viewModel.requestUpdateCityComplexList(ProfileLocalRepository.Companion.getInstance().getUserToken(), this.cities.get(this.posTown).getId());
    }

    public void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        this.mapView.onCreate(bundle);
    }

    /* access modifiers changed from: private */
    public boolean handleMarkerClick(Marker marker) {
        Complex complexById = getComplexById(this.markerComplexMap.get(marker.getId()));
        if (complexById == null) {
            return false;
        }
        if (complexById.getFinished().booleanValue()) {
            Toast.makeText(getContext(), complexById.getDateEnd(), 1).show();
            return false;
        }
        getBaseActivity().showComplex(this.markerComplexMap.get(marker.getId()));
        return false;
    }

    private Complex getComplexById(String str) {
        for (Complex next : this.viewModel.getCityComplexList(this.cities.get(this.posTown).getId())) {
            if (next.getId().equals(str)) {
                return next;
            }
        }
        return null;
    }

    private void initTownSelector() {
        this.cities = new ArrayList<>(this.viewModel.getCityList());
        if (this.cities.size() == 1) {
            String cityTitle = this.viewModel.getCityTitle();
            if (StringUtils.isNotEmpty(cityTitle)) {
                getBaseActivity().setTextTitle(cityTitle);
            } else {
                getBaseActivity().setTextTitle(this.cities.get(0).getTitle());
            }
        } else {
            this.towns = new ArrayList<>();
            for (int i = 0; i < this.cities.size(); i++) {
                this.towns.add(this.cities.get(i).getTitle());
            }
            getBaseActivity().initSelector(this.posTown, this.towns, this.townClickListener);
        }
    }

    public /* synthetic */ void lambda$new$2$SearchTownFragment(View view2) {
        handleTownSelected(((Integer) view2.getTag()).intValue());
    }

    private void handleTownSelected(int i) {
        this.posTown = i;
        getBaseActivity().setSelectorTitle(this.cities.get(i).getTitle());
        this.viewModel.requestUpdateCityComplexList(ProfileLocalRepository.Companion.getInstance().getUserToken(), this.cities.get(i).getId());
    }

    private void showComplexesOnMap() {
        MarkerOptions markerOptions;
        this.markerComplexMap.clear();
        GoogleMap googleMap2 = this.googleMap;
        if (googleMap2 != null) {
            googleMap2.clear();
            List<Complex> cityComplexList = this.viewModel.getCityComplexList(this.cities.get(this.posTown).getId());
            Collections.sort(cityComplexList, $$Lambda$SearchTownFragment$qJpymTsFloSCkkS8aER45JaiAqc.INSTANCE);
            if (cityComplexList.size() > 0) {
                for (Complex next : cityComplexList) {
                    LatLng latLng = new LatLng(next.getCenter().getX().doubleValue(), next.getCenter().getY().doubleValue());
                    if (next.getFinished().booleanValue()) {
                        markerOptions = new MarkerOptions().position(latLng).title(next.getTitle()).icon(AppUtils.bitmapDescriptorFromVector(getContext(), R.drawable.icon_map_pin_finished)).zIndex(1.0f);
                    } else {
                        markerOptions = new MarkerOptions().position(latLng).title(next.getTitle()).icon(AppUtils.bitmapDescriptorFromVector(getContext(), R.drawable.icon_map_pin)).zIndex(2.0f);
                    }
                    this.markerComplexMap.put(this.googleMap.addMarker(markerOptions).getId(), next.getId());
                }
            }
            this.googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(this.cities.get(this.posTown).getCenter().getX().doubleValue(), this.cities.get(this.posTown).getCenter().getY().doubleValue()), (float) this.cities.get(this.posTown).getZoom().intValue()));
        }
    }

    static /* synthetic */ int lambda$showComplexesOnMap$3(Complex complex, Complex complex2) {
        if (!complex.getFinished().booleanValue() || complex2.getFinished().booleanValue()) {
            return (complex.getFinished().booleanValue() || !complex2.getFinished().booleanValue()) ? 0 : 1;
        }
        return -1;
    }

    private Bitmap createComplexMarker(String str) {
        View inflate = getLayoutInflater().inflate(R.layout.complex_marker_layout, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.marker_text)).setText(str);
        inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(inflate.getMeasuredWidth(), inflate.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        inflate.draw(new Canvas(createBitmap));
        return createBitmap;
    }
}
