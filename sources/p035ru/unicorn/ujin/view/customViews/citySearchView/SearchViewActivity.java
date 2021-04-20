package p035ru.unicorn.ujin.view.customViews.citySearchView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.LifecycleOwner;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.realm.ProviderCity;
import p035ru.unicorn.ujin.util.PermissionHelper;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.InternetHelper;
import p035ru.unicorn.ujin.viewModel.events.profile.CitiesProviderEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u0010\u0018\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0016H\u0007J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020\u0016H\u0014J\u0012\u0010(\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010*H\u0017J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u000eH\u0002J\b\u0010.\u001a\u00020\u0016H\u0002J\b\u0010/\u001a\u00020\u0016H\u0014J\b\u00100\u001a\u00020\u0016H\u0002J\u0017\u00101\u001a\u00020\u00162\b\u00102\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u00103R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/citySearchView/SearchViewActivity;", "Lru/unicorn/ujin/view/activity/BaseActivity;", "Lru/unicorn/ujin/util/PermissionHelper$IPermissionCallback;", "()V", "autoDetection", "", "cityList", "", "Lru/unicorn/ujin/data/realm/ProviderCity;", "currentItemId", "", "isSearchMode", "itemsList", "", "Lru/unicorn/ujin/view/customViews/citySearchView/SelectableItem;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "searchAdapter", "Lru/unicorn/ujin/view/customViews/citySearchView/SearchViewAdapter;", "checkPermissions", "", "closeView", "fillDataList", "getBottomNavigationMenuId", "", "getClosestCityIndex", "location", "Landroid/location/Location;", "handleEvent", "event", "Lru/unicorn/ujin/viewModel/events/profile/CitiesProviderEvent;", "hasBottomSheet", "hideSearchView", "initLocation", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "permissionDenied", "permission", "Lru/unicorn/ujin/util/PermissionHelper$RuntimePermissions;", "permissionGranted", "sendResult", "selectedItem", "setUpRecyclerView", "showChatsFragment", "showSearchView", "toggleProgressVisibility", "isLoading", "(Ljava/lang/Boolean;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewActivity */
/* compiled from: SearchViewActivity.kt */
public final class SearchViewActivity extends BaseActivity implements PermissionHelper.IPermissionCallback {
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public boolean autoDetection;
    private List<? extends ProviderCity> cityList = CollectionsKt.emptyList();
    private String currentItemId;
    /* access modifiers changed from: private */
    public boolean isSearchMode;
    private List<SelectableItem> itemsList;
    /* access modifiers changed from: private */
    public LocationCallback locationCallback;
    /* access modifiers changed from: private */
    public LocationRequest locationRequest;
    /* access modifiers changed from: private */
    public SearchViewAdapter searchAdapter;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public int getBottomNavigationMenuId() {
        return 0;
    }

    public boolean hasBottomSheet() {
        return false;
    }

    public void permissionDenied(PermissionHelper.RuntimePermissions runtimePermissions) {
    }

    /* access modifiers changed from: protected */
    public void showChatsFragment() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_search_view);
        ((SearchView) _$_findCachedViewById(C5619R.C5622id.searchView)).setOnQueryTextListener(new SearchViewActivity$onCreate$1(this));
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvToolbarAction);
        Intrinsics.checkNotNullExpressionValue(textView, "tvToolbarAction");
        textView.setText(getResources().getString(R.string.searchCityHint));
        ((AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivBack)).setOnClickListener(new SearchViewActivity$onCreate$2(this));
        ((AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivToolbarAction)).setOnClickListener(new SearchViewActivity$onCreate$3(this));
        ((AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivToolbarRoute)).setOnClickListener(new SearchViewActivity$onCreate$4(this));
        initLocation();
        this.currentItemId = getIntent().getStringExtra(Constants.SEARCH_SELECTED_ID);
        this.cityList = this.profileViewModel.getProviderCityList();
        Collection collection = this.cityList;
        if (collection == null || collection.isEmpty()) {
            LifecycleOwner lifecycleOwner = this;
            this.profileViewModel.getShowProgressLiveData().observe(lifecycleOwner, new SearchViewActivity$onCreate$5(this));
            this.profileViewModel.getGetCitiesProviderLiveData().observe(lifecycleOwner, new SearchViewActivity$onCreate$6(this));
            this.profileViewModel.loadProviderCityList();
            return;
        }
        fillDataList(this.cityList);
    }

    /* access modifiers changed from: private */
    public final void showSearchView() {
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvToolbarAction);
        Intrinsics.checkNotNullExpressionValue(textView, "tvToolbarAction");
        textView.setVisibility(8);
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivToolbarAction);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivToolbarAction");
        appCompatImageView.setVisibility(8);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivToolbarRoute);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "ivToolbarRoute");
        appCompatImageView2.setVisibility(8);
        SearchView searchView = (SearchView) _$_findCachedViewById(C5619R.C5622id.searchView);
        Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
        searchView.setVisibility(0);
        SearchView searchView2 = (SearchView) _$_findCachedViewById(C5619R.C5622id.searchView);
        Intrinsics.checkNotNullExpressionValue(searchView2, "searchView");
        searchView2.setIconified(false);
        ((SearchView) _$_findCachedViewById(C5619R.C5622id.searchView)).requestFocus();
    }

    /* access modifiers changed from: private */
    public final void hideSearchView() {
        SearchView searchView = (SearchView) _$_findCachedViewById(C5619R.C5622id.searchView);
        Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
        searchView.setVisibility(8);
        ((SearchView) _$_findCachedViewById(C5619R.C5622id.searchView)).setQuery("", false);
        ((SearchView) _$_findCachedViewById(C5619R.C5622id.searchView)).clearFocus();
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvToolbarAction);
        Intrinsics.checkNotNullExpressionValue(textView, "tvToolbarAction");
        textView.setVisibility(0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivToolbarAction);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivToolbarAction");
        appCompatImageView.setVisibility(0);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(C5619R.C5622id.ivToolbarRoute);
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "ivToolbarRoute");
        appCompatImageView2.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public final void handleEvent(CitiesProviderEvent citiesProviderEvent) {
        if (citiesProviderEvent.getSuccess()) {
            this.cityList = this.profileViewModel.getProviderCityList();
            fillDataList(this.cityList);
            return;
        }
        Context context = this;
        if (InternetHelper.isNetworkConnectionAvailable(context)) {
            Toast.makeText(context, getResources().getString(R.string.internalError), 1).show();
        } else {
            Toast.makeText(context, getResources().getString(R.string.noInternetConnection), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public final void toggleProgressVisibility(Boolean bool) {
        if (bool != null) {
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            progressBar.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    private final void fillDataList(List<? extends ProviderCity> list) {
        String title;
        this.itemsList = new ArrayList();
        if (!list.isEmpty()) {
            for (ProviderCity providerCity : list) {
                String regionId = providerCity.getRegionId();
                if (!(regionId == null || (title = providerCity.getTitle()) == null)) {
                    List<SelectableItem> list2 = this.itemsList;
                    if (list2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("itemsList");
                    }
                    list2.add(new SelectableItem(regionId, title, Intrinsics.areEqual((Object) this.currentItemId, (Object) regionId)));
                }
            }
            setUpRecyclerView();
        }
    }

    private final void setUpRecyclerView() {
        List<SelectableItem> list = this.itemsList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemsList");
        }
        this.searchAdapter = new SearchViewAdapter(list);
        SearchViewAdapter searchViewAdapter = this.searchAdapter;
        if (searchViewAdapter != null) {
            searchViewAdapter.setOnItemSelected(new SearchViewActivity$setUpRecyclerView$1(this));
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.recyclerView);
        Context context = this;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(this.searchAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(context, 1));
    }

    /* access modifiers changed from: private */
    public final int getClosestCityIndex(Location location) {
        int i = -1;
        if (this.cityList.isEmpty()) {
            return -1;
        }
        double d = Double.MAX_VALUE;
        int size = this.cityList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ProviderCity providerCity = (ProviderCity) this.cityList.get(i2);
            Double latitude = providerCity.getLatitude();
            if (latitude != null) {
                double doubleValue = latitude.doubleValue();
                Double longitude = providerCity.getLongitude();
                if (longitude != null) {
                    double doubleValue2 = longitude.doubleValue();
                    double latitude2 = ((doubleValue - location.getLatitude()) * (doubleValue - location.getLatitude())) + ((doubleValue2 - location.getLongitude()) * (doubleValue2 - location.getLongitude()));
                    if (latitude2 < d) {
                        i = i2;
                        d = latitude2;
                    }
                }
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public final void checkPermissions() {
        new PermissionHelper(this).checkForPermissions(this, PermissionHelper.RuntimePermissions.PERMISSION_REQUEST_FINE_LOCATION, this);
    }

    public void permissionGranted(PermissionHelper.RuntimePermissions runtimePermissions) {
        FusedLocationProviderClient fusedLocationClient = getFusedLocationClient();
        Intrinsics.checkNotNullExpressionValue(fusedLocationClient, "fusedLocationClient");
        Activity activity = this;
        fusedLocationClient.getLastLocation().addOnSuccessListener(activity, new SearchViewActivity$permissionGranted$1(this)).addOnFailureListener(activity, (OnFailureListener) SearchViewActivity$permissionGranted$2.INSTANCE);
    }

    public final void initLocation() {
        LocationRequest create = LocationRequest.create();
        create.setPriority(104);
        create.setInterval(20000);
        Unit unit = Unit.INSTANCE;
        this.locationRequest = create;
        this.locationCallback = new SearchViewActivity$initLocation$2(this);
        getFusedLocationClient().requestLocationUpdates(this.locationRequest, this.locationCallback, (Looper) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        getFusedLocationClient().removeLocationUpdates(this.locationCallback);
        super.onDestroy();
    }

    /* access modifiers changed from: private */
    public final void sendResult(SelectableItem selectableItem) {
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this);
        Intent intent = new Intent(Constants.SEARCH_RESULT);
        intent.putExtra(Constants.SEARCH_SELECTED_ID, selectableItem.getId());
        intent.putExtra(Constants.SEARCH_SELECTED_VALUE, selectableItem.getValue());
        Unit unit = Unit.INSTANCE;
        instance.sendBroadcast(intent);
        closeView();
    }

    /* access modifiers changed from: private */
    public final void closeView() {
        ((SearchView) _$_findCachedViewById(C5619R.C5622id.searchView)).clearFocus();
        finish();
    }
}
