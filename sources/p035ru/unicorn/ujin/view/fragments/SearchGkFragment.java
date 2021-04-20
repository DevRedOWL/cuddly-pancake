package p035ru.unicorn.ujin.view.fragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.Timer;
import kotlin.jvm.functions.Function0;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.developerPage.CarouselPhoto;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.data.realm.ComplexInfo;
import p035ru.unicorn.ujin.data.realm.Price;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.util.AnimationUtils;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.UrlCarouselViewActivity;
import p035ru.unicorn.ujin.view.adapters.AdapterPrice;
import p035ru.unicorn.ujin.view.adapters.ViewPagerAdapter;
import p035ru.unicorn.ujin.view.customViews.NonScrollableListView;
import p035ru.unicorn.ujin.view.customViews.ProgressLineView;
import p035ru.unicorn.ujin.view.fragments.SearchGkFragment;
import p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment;
import p035ru.unicorn.ujin.view.fragments.mortgage.MortgagePagerFragment;
import p035ru.unicorn.ujin.view.fragments.searchFilter.ApartmentListEvent;
import p035ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment;
import p035ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterViewModel;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.fragments.SearchGkFragment */
public class SearchGkFragment extends BaseFragment implements View.OnTouchListener {
    public static final Integer BOOK = 1111;
    public static final Integer BOOK_VISIT = 12341;
    private static final String COMPLEX_ID = "complexId";
    public static final Integer VISIT = 2222;
    int _xDelta;
    int _yDelta;
    private AdapterPrice adapterPrice;
    private int bookVisit = 0;
    private Button buttonAction;
    private View buttonCall;
    private View buttonDemo;
    private View buttonPresentation;
    private View buttonScheme;
    private View buttonSite;
    private View buttonVisit;
    boolean closeMap = false;
    Complex complex;
    private String complexDemoFlatUid;
    private String complexId;
    ComplexInfo complexInfo;
    int heightFrame;
    public RealmList<String> images_Complex = new RealmList<>();
    RelativeLayout layoutMap;
    ViewGroup.LayoutParams layoutParamsMap;
    RealmList<Price> listPrice;
    private NonScrollableListView listViewPrice;
    LinearLayout llPrices;
    private MapView mapView;
    ProfileLocalRepository profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
    private ProgressBar progressBar;
    private ProgressLineView progressLineView;
    RelativeLayout rlExpand;
    RelativeLayout rootLayout;
    ViewGroup.MarginLayoutParams rootLayout_param_map;
    ViewGroup.MarginLayoutParams rootLayout_param_mapview;
    private NestedScrollView scrollComplex;
    SearchFilterViewModel searchFilterViewModel;
    private TextView textComplexAddress;
    private TextView textComplexDescription;
    private TextView textComplexFinishDate;
    private TextView textComplexTitle;
    Timer timer;
    TextView tvExpand;
    TextView tvNoAvailableApartments;
    private View view;
    ViewPager viewPager;

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static SearchGkFragment newInstance(String str) {
        SearchGkFragment searchGkFragment = new SearchGkFragment();
        Bundle bundle = new Bundle();
        bundle.putString("complexId", str);
        searchGkFragment.setArguments(bundle);
        return searchGkFragment;
    }

    public void onStop() {
        getBaseActivity().showBottomNavigation();
        super.onStop();
    }

    public void onStart() {
        super.onStart();
        getBaseActivity().hideBottomNavigation();
    }

    public boolean onTouch(View view2, MotionEvent motionEvent) {
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            view2.setBackgroundColor(-3355444);
            this._yDelta = rawY - this.rootLayout_param_map.topMargin;
        } else if (action == 1) {
            view2.setBackgroundColor(-1);
            if (this.rootLayout_param_map.topMargin < 5) {
                this.rootLayout_param_map.topMargin = 0;
            } else {
                boolean z = this.closeMap;
            }
        } else if (action == 2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.rootLayout_param_map;
            marginLayoutParams.topMargin = rawY - this._yDelta;
            this.rootLayout.setLayoutParams(marginLayoutParams);
            if (this.rootLayout_param_map.topMargin < 5) {
                this.rootLayout_param_map.topMargin = 0;
            }
        } else if (action != 5) {
        }
        this.layoutMap.invalidate();
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.viewModel.getModelUpdateMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                SearchGkFragment.this.handleEvent((UpdateEvent) obj);
            }
        });
        this.view = layoutInflater.inflate(R.layout.fragment_seach_gk, viewGroup, false);
        this.searchFilterViewModel = (SearchFilterViewModel) ViewModelProviders.m10of((Fragment) this).get(SearchFilterViewModel.class);
        initViews(this.view);
        this.complexId = getArguments().getString("complexId");
        this.complex = this.viewModel.getComplexById(this.complexId);
        String userToken = ProfileLocalRepository.Companion.getInstance().getUserToken();
        if (this.complex != null) {
            this.viewModel.requestUpdateComplexInfo(userToken, this.complex.getId(), this.complex.getBuildingId());
            setVisibilityLayout(false);
        }
        return this.view;
    }

    public void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        showComplexInfo();
        this.mapView.onCreate(bundle);
        this.mapView.getMapAsync(new OnMapReadyCallback() {
            public final void onMapReady(GoogleMap googleMap) {
                SearchGkFragment.this.lambda$onViewCreated$0$SearchGkFragment(googleMap);
            }
        });
        getChildFragmentManager().beginTransaction().add((int) R.id.mortgageBlockFragment, (Fragment) MortgagePagerFragment.Companion.newInstance(this.complexId, true), "fragmentMortgagePager").commitAllowingStateLoss();
    }

    public /* synthetic */ void lambda$onViewCreated$0$SearchGkFragment(GoogleMap googleMap) {
        this.mapView.onResume();
        LatLng latLng = new LatLng(this.complex.getCenter().getX().doubleValue(), this.complex.getCenter().getY().doubleValue());
        googleMap.addMarker(new MarkerOptions().position(latLng).icon(AppUtils.bitmapDescriptorFromVector(getContext(), R.drawable.icon_map_pin)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 13.0f));
    }

    private void setVisibilityLayout(boolean z) {
        int i = 0;
        this.layoutMap.setVisibility(z ? 0 : 8);
        ProgressBar progressBar2 = this.progressBar;
        if (z) {
            i = 8;
        }
        progressBar2.setVisibility(i);
    }

    private void requestApartments() {
        this.listPrice = this.complexInfo.getPriceList();
        this.adapterPrice = new AdapterPrice(this.view.getContext(), this.listPrice);
        this.listViewPrice.setAdapter(this.adapterPrice);
        if (this.listPrice.isEmpty()) {
            this.llPrices.setVisibility(8);
            this.tvNoAvailableApartments.setVisibility(0);
        } else {
            this.llPrices.setVisibility(0);
            this.tvNoAvailableApartments.setVisibility(8);
        }
        this.listViewPrice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                SearchGkFragment.this.lambda$requestApartments$1$SearchGkFragment(adapterView, view, i, j);
            }
        });
    }

    public /* synthetic */ void lambda$requestApartments$1$SearchGkFragment(AdapterView adapterView, View view2, int i, long j) {
        priceClicked(i);
    }

    private void initViews(View view2) {
        this.scrollComplex = (NestedScrollView) view2.findViewById(R.id.ScrollView_ID);
        this.mapView = (MapView) view2.findViewById(R.id.mapview_GK_ID);
        this.buttonAction = (Button) view2.findViewById(R.id.button_action_ID);
        this.rootLayout = (RelativeLayout) view2.findViewById(R.id.relativeRoot_ID);
        this.layoutMap = (RelativeLayout) view2.findViewById(R.id.relativeLayout_map_ID);
        this.textComplexTitle = (TextView) view2.findViewById(R.id.textView_GK_Head);
        this.textComplexAddress = (TextView) view2.findViewById(R.id.textView_GK_adress);
        this.textComplexFinishDate = (TextView) view2.findViewById(R.id.textView_GK_date_end);
        this.textComplexDescription = (TextView) view2.findViewById(R.id.textDescription);
        this.viewPager = (ViewPager) view2.findViewById(R.id.viewPager_ID);
        this.listViewPrice = (NonScrollableListView) view2.findViewById(R.id.ListView_price_ID);
        this.progressLineView = (ProgressLineView) view2.findViewById(R.id.progressLine);
        this.llPrices = (LinearLayout) view2.findViewById(R.id.llMinimalPrices);
        this.tvNoAvailableApartments = (TextView) view2.findViewById(R.id.tvNoAvailableApartments);
        this.buttonDemo = this.view.findViewById(R.id.buttonDemo);
        this.buttonSite = this.view.findViewById(R.id.buttonShowSite);
        this.buttonVisit = this.view.findViewById(R.id.button_visit_ID);
        this.buttonCall = this.view.findViewById(R.id.buttonShowApartments);
        this.buttonScheme = this.view.findViewById(R.id.buttonScheme);
        this.buttonPresentation = this.view.findViewById(R.id.buttonPresentation);
        this.progressBar = (ProgressBar) this.view.findViewById(R.id.progressBar);
        this.tvExpand = (TextView) this.view.findViewById(R.id.tvExpand);
        this.rlExpand = (RelativeLayout) this.view.findViewById(R.id.rlExpand);
    }

    private boolean onViewPagerTouch(MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this._yDelta = rawY - this.rootLayout_param_map.topMargin;
            this._xDelta = rawX;
        } else if (action != 1) {
            if (action != 2) {
                if (action != 5) {
                }
            } else if (StrictMath.abs(rawY - this._yDelta) - 50 > StrictMath.abs(rawX - this._xDelta)) {
                int i = this.rootLayout_param_map.topMargin;
                int i2 = this._yDelta;
                if (i >= rawY - i2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = this.rootLayout_param_map;
                    marginLayoutParams.topMargin = rawY - i2;
                    this.rootLayout.setLayoutParams(marginLayoutParams);
                    if (this.rootLayout_param_map.topMargin < 15) {
                        this.rootLayout_param_map.topMargin = 0;
                        return false;
                    }
                } else if (this.scrollComplex.getScrollY() == 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = this.rootLayout_param_map;
                    marginLayoutParams2.topMargin = rawY - this._yDelta;
                    this.rootLayout.setLayoutParams(marginLayoutParams2);
                    if (this.rootLayout_param_map.topMargin < 15) {
                        this.rootLayout_param_map.topMargin = 0;
                        return false;
                    }
                }
            } else {
                this.timer.cancel();
                this.timer = new Timer();
                this.timer.scheduleAtFixedRate(new TimerTask(), 4000, 4000);
            }
        }
        return false;
    }

    private boolean onScrollComplexTouch(MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this._yDelta = rawY - this.rootLayout_param_map.topMargin;
            this._xDelta = rawX;
        } else if (action != 1) {
            if (action != 2) {
                if (action != 5) {
                }
            } else if (StrictMath.abs(rawY - this._yDelta) > StrictMath.abs(rawX - this._xDelta)) {
                int i = this.rootLayout_param_map.topMargin;
                int i2 = this._yDelta;
                if (i < rawY - i2) {
                    if (this.scrollComplex.getScrollY() == 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = this.rootLayout_param_map;
                        marginLayoutParams.topMargin = rawY - this._yDelta;
                        this.rootLayout.setLayoutParams(marginLayoutParams);
                        if (this.rootLayout_param_map.topMargin < 15) {
                            this.rootLayout_param_map.topMargin = 0;
                        }
                    }
                    return false;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = this.rootLayout_param_map;
                marginLayoutParams2.topMargin = rawY - i2;
                this.rootLayout.setLayoutParams(marginLayoutParams2);
                if (this.rootLayout_param_map.topMargin < 15) {
                    this.rootLayout_param_map.topMargin = 0;
                    return false;
                }
            }
        } else if (this.rootLayout_param_map.topMargin < 5) {
            this.rootLayout_param_map.topMargin = 0;
            return false;
        }
        this.layoutMap.invalidate();
        return true;
    }

    private void showComplexInfo() {
        if (this.complex != null) {
            this.complexInfo = this.viewModel.getComplexInfoById(this.complex.getId());
            ComplexInfo complexInfo2 = this.complexInfo;
            if (complexInfo2 != null) {
                this.complexDemoFlatUid = complexInfo2.getDemoFlatUid();
                getBaseActivity().setTextTitle(this.complexInfo.getTitle());
                if (StringUtils.isNotEmpty(this.complexInfo.getSchemaLink())) {
                    this.buttonScheme.setVisibility(0);
                    this.buttonScheme.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            SearchGkFragment.this.lambda$showComplexInfo$2$SearchGkFragment(view);
                        }
                    });
                } else {
                    this.buttonScheme.setVisibility(8);
                }
                if (StringUtils.isNotEmpty(this.complexInfo.getPresentationLink())) {
                    this.buttonPresentation.setVisibility(0);
                    this.buttonPresentation.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            SearchGkFragment.this.lambda$showComplexInfo$3$SearchGkFragment(view);
                        }
                    });
                } else {
                    this.buttonPresentation.setVisibility(8);
                }
                this.buttonCall.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        SearchGkFragment.this.lambda$showComplexInfo$4$SearchGkFragment(view);
                    }
                });
                this.buttonVisit.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        SearchGkFragment.this.lambda$showComplexInfo$5$SearchGkFragment(view);
                    }
                });
                this.buttonSite.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        SearchGkFragment.this.lambda$showComplexInfo$6$SearchGkFragment(view);
                    }
                });
                this.buttonDemo.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        SearchGkFragment.this.lambda$showComplexInfo$7$SearchGkFragment(view);
                    }
                });
                this.buttonDemo.setVisibility(this.complexInfo.getShowDemo().booleanValue() ? 0 : 8);
                this.images_Complex = this.complex.getImgSliders();
                this.textComplexTitle.setText(this.complex.getTitle());
                if (getBaseActivity().flavor.getAppName().equals(Flavor.NEWCITY.getAppName()) || getBaseActivity().flavor.getAppName().equals(Flavor.DADEVELOPMENT.getAppName())) {
                    this.textComplexAddress.setVisibility(8);
                    this.textComplexFinishDate.setVisibility(8);
                    this.progressLineView.setVisibility(8);
                } else {
                    this.textComplexAddress.setText(this.complex.getAddress());
                    this.textComplexFinishDate.setText(this.complexInfo.getDateEnd());
                    this.progressLineView.setProgress((int) (this.complexInfo.getBuildProgress().doubleValue() * 100.0d));
                }
                this.viewPager.setAdapter(new ViewPagerAdapter(getBaseActivity(), this.viewModel, this.complex.getId()));
                this.viewPager.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.padding));
                this.viewPager.setClipToPadding(false);
                Timer timer2 = this.timer;
                if (timer2 != null) {
                    timer2.cancel();
                }
                this.timer = new Timer();
                this.timer.scheduleAtFixedRate(new TimerTask(), 2000, 4000);
                this.textComplexDescription.setText(Html.fromHtml(this.complexInfo.getDescription()));
                this.textComplexDescription.setMovementMethod(LinkMovementMethod.getInstance());
                new Handler().post(new Runnable() {
                    public final void run() {
                        SearchGkFragment.this.lambda$showComplexInfo$11$SearchGkFragment();
                    }
                });
                this.buttonAction.setText(this.complexInfo.getAction().getActionTitle());
                this.buttonAction.setOnClickListener(new View.OnClickListener(this.complexInfo.getAction().getActionNumber()) {
                    private final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        SearchGkFragment.this.lambda$showComplexInfo$12$SearchGkFragment(this.f$1, view);
                    }
                });
                requestApartments();
                setVisibilityLayout(true);
            }
        }
    }

    public /* synthetic */ void lambda$showComplexInfo$2$SearchGkFragment(View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CarouselPhoto(this.complexInfo.getSchemaLink(), this.complexInfo.getSchemaLink(), "Схема ЖК"));
        UrlCarouselViewActivity.start(getBaseActivity(), arrayList, (ArrayList<Integer>) null, "Схема ЖК", 0, false);
    }

    public /* synthetic */ void lambda$showComplexInfo$3$SearchGkFragment(View view2) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.complexInfo.getPresentationLink())));
    }

    public /* synthetic */ void lambda$showComplexInfo$4$SearchGkFragment(View view2) {
        String actionNumber = this.complexInfo.getAction().getActionNumber();
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + actionNumber)));
    }

    public /* synthetic */ void lambda$showComplexInfo$5$SearchGkFragment(View view2) {
        if (getBaseActivity().flavor.getAppName().equals(Flavor.DADEVELOPMENT.getAppName())) {
            nextFragment(DynamicFragment.newInstance(13, ToolbarButtons.BACK), false, BaseActivity.FRAGMENT_DYNAMIC);
        } else if (this.profileLocalRepository.isUserLoggedIn()) {
            this.viewModel.requestVisitFlat(this.profileLocalRepository.getUserToken(), this.complex.getUid());
            this.viewModel.getRequestVisitFlatMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    SearchGkFragment.this.handleVisitFlatEvent((UpdateEvent) obj);
                }
            });
        } else {
            this.bookVisit = VISIT.intValue();
            showRegistrationRequiredAlert();
        }
    }

    public /* synthetic */ void lambda$showComplexInfo$6$SearchGkFragment(View view2) {
        if (this.complexInfo.getSite() != null) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.complexInfo.getSite())));
        }
    }

    public /* synthetic */ void lambda$showComplexInfo$7$SearchGkFragment(View view2) {
        demoClickListener();
    }

    public /* synthetic */ void lambda$showComplexInfo$11$SearchGkFragment() {
        if (this.textComplexDescription.getLineCount() > 5) {
            int lineCount = this.textComplexDescription.getLineCount();
            this.textComplexDescription.setMaxLines(5);
            this.tvExpand.setOnClickListener(new View.OnClickListener(lineCount) {
                private final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    SearchGkFragment.this.lambda$null$10$SearchGkFragment(this.f$1, view);
                }
            });
            return;
        }
        this.rlExpand.setVisibility(8);
    }

    public /* synthetic */ void lambda$null$10$SearchGkFragment(int i, View view2) {
        if (this.tvExpand.getText().equals(getResources().getString(R.string.expand))) {
            AnimationUtils.INSTANCE.animateViewMaxLines(i, this.textComplexDescription, new Function0() {
                public final Object invoke() {
                    return SearchGkFragment.this.lambda$null$8$SearchGkFragment();
                }
            });
        } else {
            AnimationUtils.INSTANCE.animateViewMaxLines(5, this.textComplexDescription, new Function0() {
                public final Object invoke() {
                    return SearchGkFragment.this.lambda$null$9$SearchGkFragment();
                }
            });
        }
    }

    public /* synthetic */ Object lambda$null$8$SearchGkFragment() {
        this.tvExpand.setText(getResources().getString(R.string.wrap));
        return null;
    }

    public /* synthetic */ Object lambda$null$9$SearchGkFragment() {
        this.tvExpand.setText(getResources().getString(R.string.expand));
        return null;
    }

    public /* synthetic */ void lambda$showComplexInfo$12$SearchGkFragment(String str, View view2) {
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + str)));
    }

    private void showRegistrationRequiredAlert() {
        new AlertDialog.Builder(getContext()).setMessage((int) R.string.youNeedToLogIn).setPositiveButton((int) R.string.login, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                SearchGkFragment.this.lambda$showRegistrationRequiredAlert$13$SearchGkFragment(dialogInterface, i);
            }
        }).setNegativeButton((int) R.string.cancel, (DialogInterface.OnClickListener) $$Lambda$SearchGkFragment$MUps5P3xcGI0rfR4p4jSG3bPS90.INSTANCE).show();
    }

    public /* synthetic */ void lambda$showRegistrationRequiredAlert$13$SearchGkFragment(DialogInterface dialogInterface, int i) {
        registerAndProceed();
    }

    private void registerAndProceed() {
        getBaseActivity().showRegistrationActivity(BOOK_VISIT);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == BOOK_VISIT.intValue() && i2 == 2002 && this.bookVisit == VISIT.intValue()) {
            this.viewModel.getRequestVisitFlatMutableLiveData().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    SearchGkFragment.this.handleVisitFlatEvent((UpdateEvent) obj);
                }
            });
            this.viewModel.requestVisitFlat(this.profileLocalRepository.getUserToken(), "");
        }
    }

    /* access modifiers changed from: private */
    public void handleVisitFlatEvent(UpdateEvent updateEvent) {
        showMessage(updateEvent.getMessage());
    }

    public void demoClickListener() {
        nextFragment(DemoHubFragment.newInstance(this.complexDemoFlatUid, this.complexId, (String) null), false, BaseActivity.FRAGMENT_DEMO_HUB);
    }

    private void priceClicked(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Price price = this.listPrice.get(i);
        SearchFilterViewModel searchFilterViewModel2 = (SearchFilterViewModel) ViewModelProviders.m10of((Fragment) this).get(SearchFilterViewModel.class);
        searchFilterViewModel2.getApartmentListLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                SearchGkFragment.this.lambda$priceClicked$15$SearchGkFragment((ApartmentListEvent) obj);
            }
        });
        if (StringUtils.isNotEmpty(this.complex.getBuildingId())) {
            str = this.complex.getBuildingId();
        } else {
            str = "0";
        }
        String id = this.complex.getId();
        if (price.getTypeApartment().intValue() == 0) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        if (price.getTypeApartment().intValue() == 1) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        if (price.getTypeApartment().intValue() == 2) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        if (price.getTypeApartment().intValue() == 3) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        if (price.getTypeApartment().intValue() == 4) {
            str6 = "1";
        } else {
            str6 = "0";
        }
        searchFilterViewModel2.requestApartmentList(id, str2, str3, str4, str5, str6, str, "0", "0", "0", "0", "0", "0", "0", (String) null, (String) null);
    }

    public /* synthetic */ void lambda$priceClicked$15$SearchGkFragment(ApartmentListEvent apartmentListEvent) {
        if (apartmentListEvent.getSuccess() && apartmentListEvent.getApartmentList() != null) {
            nextFragment(FlatListFragment.newInstance(apartmentListEvent, this.complexId), false, BaseActivity.FRAGMENT_FLAT_LIST);
        }
    }

    /* access modifiers changed from: protected */
    public void handleEvent(UpdateEvent updateEvent) {
        showComplexInfo();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        ComplexInfo complexInfo2 = this.complexInfo;
        if (complexInfo2 != null && StringUtils.isNotEmpty(complexInfo2.getTitle())) {
            getBaseActivity().setTextTitle(this.complexInfo.getTitle());
        }
        if (getBaseActivity().flavor.getAppName().equals(Flavor.NEWCITY.getAppName())) {
            ArrayList arrayList = new ArrayList();
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.toolbar_button_24dp, getBaseActivity().llButtonsRight, false);
            imageView.setColorFilter(ContextCompat.getColor(getContext(), R.color.toolbarIconTint), PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    SearchGkFragment.this.lambda$showToolbar$16$SearchGkFragment(view);
                }
            });
            imageView.setImageResource(R.drawable.icon_filter);
            arrayList.add(imageView);
            getBaseActivity().setToolbarRight(arrayList);
        }
        if (getBaseActivity().flavor.getAppName().equals(Flavor.PAN.getAppName())) {
            getBaseActivity().setContentThroughBottomNavigation(true);
        }
    }

    public /* synthetic */ void lambda$showToolbar$16$SearchGkFragment(View view2) {
        if (this.complex != null) {
            nextFragment(SearchFilterFragment.Companion.newInstance(this.complex.getId()), false, BaseActivity.FRAGMENT_SEARCH_FILTER);
        }
    }

    public void onDetach() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        super.onDetach();
    }

    /* renamed from: ru.unicorn.ujin.view.fragments.SearchGkFragment$TimerTask */
    public class TimerTask extends java.util.TimerTask {
        public TimerTask() {
        }

        public void run() {
            SearchGkFragment.this.getActivity().runOnUiThread(new Runnable() {
                public final void run() {
                    SearchGkFragment.TimerTask.this.lambda$run$0$SearchGkFragment$TimerTask();
                }
            });
        }

        public /* synthetic */ void lambda$run$0$SearchGkFragment$TimerTask() {
            if (SearchGkFragment.this.complexInfo != null && SearchGkFragment.this.complexInfo.getImageList() != null) {
                if (SearchGkFragment.this.viewPager.getCurrentItem() == SearchGkFragment.this.complexInfo.getImageList().size() - 1) {
                    SearchGkFragment.this.viewPager.setCurrentItem(0);
                } else {
                    SearchGkFragment.this.viewPager.setCurrentItem(SearchGkFragment.this.viewPager.getCurrentItem() + 1);
                }
            }
        }
    }
}
