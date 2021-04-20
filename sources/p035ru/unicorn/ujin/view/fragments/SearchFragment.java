package p035ru.unicorn.ujin.view.fragments;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.City;
import p035ru.unicorn.ujin.util.PermissionHelper;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment;

/* renamed from: ru.unicorn.ujin.view.fragments.SearchFragment */
public class SearchFragment extends BaseFragment implements PermissionHelper.IPermissionCallback {
    private ImageView imageCity;
    private ImageView imageFilter;

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static SearchFragment newInstance() {
        return new SearchFragment();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().hideToolbar();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_seach, viewGroup, false);
        this.imageCity = (ImageView) inflate.findViewById(R.id.imageView_searchCity_ID);
        this.imageFilter = (ImageView) inflate.findViewById(R.id.imageView_searchFilter_ID);
        inflate.findViewById(R.id.ivProfile).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                SearchFragment.this.lambda$onCreateView$0$SearchFragment(view);
            }
        });
        this.imageCity.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                SearchFragment.this.lambda$onCreateView$1$SearchFragment(view);
            }
        });
        this.imageFilter.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                SearchFragment.this.lambda$onCreateView$2$SearchFragment(view);
            }
        });
        this.viewModel.requestUpdateCityList(ProfileLocalRepository.Companion.getInstance().getUserToken());
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$SearchFragment(View view) {
        getBaseActivity().handleProfileClick(view);
    }

    public /* synthetic */ void lambda$onCreateView$1$SearchFragment(View view) {
        getBaseActivity().showCity(0, false);
    }

    public /* synthetic */ void lambda$onCreateView$2$SearchFragment(View view) {
        nextFragment(new SearchFilterFragment(), false, BaseActivity.FRAGMENT_SEARCH_FILTER);
    }

    private void checkPermissions() {
        new PermissionHelper(getBaseActivity()).checkForPermissions(getBaseActivity(), PermissionHelper.RuntimePermissions.PERMISSION_REQUEST_FINE_LOCATION, this);
    }

    private int getClosestCityIndex(Location location) {
        ArrayList<City> cityList = this.viewModel.getCityList();
        double d = Double.MAX_VALUE;
        int i = -1;
        for (int i2 = 0; i2 < cityList.size(); i2++) {
            City city = cityList.get(i2);
            double doubleValue = ((city.getCenter().getX().doubleValue() - location.getLatitude()) * (city.getCenter().getX().doubleValue() - location.getLatitude())) + ((city.getCenter().getY().doubleValue() - location.getLongitude()) * (city.getCenter().getY().doubleValue() - location.getLongitude()));
            if (doubleValue < d) {
                i = i2;
                d = doubleValue;
            }
        }
        return i;
    }

    public void permissionGranted(PermissionHelper.RuntimePermissions runtimePermissions) {
        getBaseActivity().getFusedLocationClient().getLastLocation().addOnSuccessListener((Activity) getBaseActivity(), new OnSuccessListener() {
            public final void onSuccess(Object obj) {
                SearchFragment.this.lambda$permissionGranted$3$SearchFragment((Location) obj);
            }
        }).addOnFailureListener((Activity) getBaseActivity(), (OnFailureListener) new OnFailureListener() {
            public final void onFailure(Exception exc) {
                SearchFragment.this.lambda$permissionGranted$4$SearchFragment(exc);
            }
        });
    }

    public /* synthetic */ void lambda$permissionGranted$3$SearchFragment(Location location) {
        int closestCityIndex = location != null ? getClosestCityIndex(location) : -1;
        if (closestCityIndex != -1) {
            getBaseActivity().showCity(closestCityIndex, false);
        } else {
            showDefaultCity();
        }
    }

    public /* synthetic */ void lambda$permissionGranted$4$SearchFragment(Exception exc) {
        if (this.viewModel.getCityList().size() > 0) {
            getBaseActivity().showCity(0, false);
        }
    }

    public void permissionDenied(PermissionHelper.RuntimePermissions runtimePermissions) {
        showDefaultCity();
    }

    private void showError(int i) {
        Toast.makeText(getActivity(), getResources().getText(i), 0).show();
    }

    private void showDefaultCity() {
        if (this.viewModel.getCityList().size() > 0) {
            getBaseActivity().showCity(0, false);
        } else {
            showError(R.string.internalError);
        }
    }

    private void showLocationSettingsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage((CharSequence) getContext().getResources().getString(R.string.locationEnabledError)).setPositiveButton((CharSequence) getContext().getResources().getString(R.string.settings), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                SearchFragment.this.lambda$showLocationSettingsDialog$5$SearchFragment(dialogInterface, i);
            }
        }).setNegativeButton((CharSequence) getContext().getResources().getString(R.string.cancel), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                SearchFragment.this.lambda$showLocationSettingsDialog$6$SearchFragment(dialogInterface, i);
            }
        });
        builder.show();
    }

    public /* synthetic */ void lambda$showLocationSettingsDialog$5$SearchFragment(DialogInterface dialogInterface, int i) {
        getContext().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    public /* synthetic */ void lambda$showLocationSettingsDialog$6$SearchFragment(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        showDefaultCity();
    }

    private boolean isLocationEnabled() {
        return ((LocationManager) getContext().getSystemService(FirebaseAnalytics.Param.LOCATION)).isProviderEnabled("gps");
    }
}
