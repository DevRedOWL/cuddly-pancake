package p035ru.unicorn.ujin.view.activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.modules.storage.ReactDatabaseSupplier;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.redmadrobot.inputmask.MaskedTextChangedListener;
import com.redmadrobot.inputmask.helper.AffinityCalculationStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.realm.Splashscreen;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.market.MarketFragment;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.empty.EmptyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabFragment;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.RegViewModel;
import p035ru.unicorn.ujin.view.customViews.BottomNavigationIds;
import p035ru.unicorn.ujin.view.customViews.citySearchView.SearchViewActivity;
import p035ru.unicorn.ujin.view.customViews.keyboardVehicleMask.KeyboardVehicleMask;
import p035ru.unicorn.ujin.view.dialogs.SelectorDialog;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.DemoHubFragment;
import p035ru.unicorn.ujin.view.fragments.FavouritesListFragment;
import p035ru.unicorn.ujin.view.fragments.FlatFragment;
import p035ru.unicorn.ujin.view.fragments.SearchFragment;
import p035ru.unicorn.ujin.view.fragments.SearchGkFragment;
import p035ru.unicorn.ujin.view.fragments.SearchTownFragment;
import p035ru.unicorn.ujin.view.fragments.acceptance.AcceptanceDateFragment;
import p035ru.unicorn.ujin.view.fragments.chats.ChatFragment;
import p035ru.unicorn.ujin.view.fragments.chats.ChatParticipantsFragment;
import p035ru.unicorn.ujin.view.fragments.chats.newChat.NewChatFragment;
import p035ru.unicorn.ujin.view.fragments.development.DeveloperFragment;
import p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment;
import p035ru.unicorn.ujin.view.fragments.news.NewsListFragment;
import p035ru.unicorn.ujin.view.fragments.news.NewspieceFragment;
import p035ru.unicorn.ujin.view.fragments.profile.ApartmentListFragment;
import p035ru.unicorn.ujin.view.fragments.profile.Mode;
import p035ru.unicorn.ujin.view.fragments.profile.ProfileEditFragment;
import p035ru.unicorn.ujin.view.fragments.profile.ProfileFragment;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage4Fragment;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachment4Fragment;
import p035ru.unicorn.ujin.view.fragments.reactSmartFlat.ReactSmartFlatFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;
import p046io.reactivex.subjects.BehaviorSubject;
import p056q.rorbin.badgeview.Badge;
import p056q.rorbin.badgeview.QBadgeView;

/* renamed from: ru.unicorn.ujin.view.activity.BaseActivity */
public abstract class BaseActivity extends AppCompatActivity implements BaseFragment.FragmentListener, FragmentManager.OnBackStackChangedListener, DefaultHardwareBackBtnHandler {
    protected static final String CURRENT_CITY_ID = "currentCityId";
    protected static final String CURRENT_COMPLEX_ID = "currentComplexId";
    protected static final String DEMO_FLAT_ID = "demoFlatId";
    protected static final String DEMO_FLAT_UID = "demoFlatUID";
    public static final String FRAGMENT_ABOUT_APP = "fragmentAboutApp";
    public static final String FRAGMENT_ABSTRACT_TICKET = "fragmentAbstractTicket";
    public static final String FRAGMENT_ACCEPTANCE_DATE = "fragmentAcceptanceDate";
    public static final String FRAGMENT_ANOTHER_PASS = "fragmentAnotherPass";
    public static final String FRAGMENT_ANOTHER_PASS_DETAIL = "fragmentAnotherPassDetail";
    public static final String FRAGMENT_ANOTHER_PASS_LIST = "fragmentAnotherPassList";
    public static final String FRAGMENT_APARTMENT_LIST = "fragmentApartmentList";
    public static final String FRAGMENT_BLE_START = "fragmentBleStart";
    public static final String FRAGMENT_BUILDER = "fragmentBuilder";
    public static final String FRAGMENT_CABINET = "fragmentCabinet";
    public static final String FRAGMENT_CARD_START = "fragmentCardStart";
    public static final String FRAGMENT_CHAT = "fragmentChat";
    public static final String FRAGMENT_CHATS = "fragmentChats";
    public static final String FRAGMENT_CHAT_PARTICIPANTS = "fragmentChatParticipants";
    public static final String FRAGMENT_CITY = "fragmentCity";
    public static final String FRAGMENT_COMPANIES = "fragmentCompanies";
    public static final String FRAGMENT_COMPANY = "fragmentCompany";
    public static final String FRAGMENT_COMPLEX = "fragmentComplex";
    public static final String FRAGMENT_COUPON_INFO = "fragmentCouponInfo";
    public static final String FRAGMENT_DEMO_HUB = "fragmentDemoHub";
    public static final String FRAGMENT_DEVELOPMENT = "fragmentDevelopment";
    public static final String FRAGMENT_DEVELOPMENT_STAGES = "fragmentDevelopmentStages";
    public static final String FRAGMENT_DYNAMIC = "fragmentDynamic";
    public static final String FRAGMENT_EMPTY = "fragmentEmpty";
    public static final String FRAGMENT_FACE_START = "fragmentFaceStart";
    public static final String FRAGMENT_FAVOURITES = "fragmentFavourites";
    public static final String FRAGMENT_FAVOURITE_FLAT = "fragmentFavouriteFlat";
    public static final String FRAGMENT_FINGER_START = "fragmentFingerStart";
    public static final String FRAGMENT_FLAT = "fragmentFlat";
    public static final String FRAGMENT_FLAT_LIST = "fragmentFlatList";
    public static final String FRAGMENT_LOAN = "fragmentLoan";
    protected static final String FRAGMENT_MARKETPLACE = "fragmentMarketPlace";
    public static final String FRAGMENT_MY_COMPANY = "fragmentMyCompany";
    public static final String FRAGMENT_MY_FLAT = "myFlat";
    public static final String FRAGMENT_MY_PASS = "fragmentMyPass";
    public static final String FRAGMENT_MY_VEHICLE_LIST = "fragmentMyVehicleList";
    public static final String FRAGMENT_NEWS = "fragmentNews";
    public static final String FRAGMENT_NEWSPIECE = "fragmentNewspiece";
    public static final String FRAGMENT_NEW_ACCOUNT = "fragmentNewSubAc";
    public static final String FRAGMENT_NEW_CHAT = "fragmentNewChat";
    public static final String FRAGMENT_NEW_SUB_ACCOUNT = "fragmentNewSubAccount";
    public static final String FRAGMENT_OFFER = "fragmentOffer";
    public static final String FRAGMENT_OFFERS = "fragmentOffers";
    public static final String FRAGMENT_OSS_LIST = "fragmentOssList";
    public static final String FRAGMENT_OSS_QUESTION = "fragmentOssQuestion";
    public static final String FRAGMENT_OSS_SMS = "fragmentOssSMS";
    public static final String FRAGMENT_PARKING_ADD_VEHICLE_TO_SLOT = "fragmentParkingAddVehicleToSlot";
    public static final String FRAGMENT_PARKING_GUEST_INFO = "fragmentParkingGuestInfo";
    public static final String FRAGMENT_PARKING_MY_SLOTS = "fragmentParkingMySlots";
    public static final String FRAGMENT_PARKING_NEW_RENT = "fragmentParkingNewRent";
    public static final String FRAGMENT_PARKING_NEW_RENT_GUEST = "fragmentParkingNewRentGuest";
    public static final String FRAGMENT_PARKING_NEW_RENT_SLOTS = "fragmentParkingNewRentSlots";
    public static final String FRAGMENT_PARKING_RENT = "fragmentParkingRent";
    public static final String FRAGMENT_PARKING_RENT_SLOT = "fragmentParkingRentSlot";
    public static final String FRAGMENT_PARKING_SLOT_INFO = "fragmentParkingSlotInfo";
    public static final String FRAGMENT_PARKING_SLOT_PLAN = "fragmentParkingSlotPlan";
    public static final String FRAGMENT_PASSWORD_EDIT = "fragmentPasswordEdit";
    public static final String FRAGMENT_PRIVACY = "fragmentPrivacy";
    public static final String FRAGMENT_PROFILE = "fragmentProfile";
    public static final String FRAGMENT_PROFILE_CHOOSER = "fragmentProfileChooser";
    public static final String FRAGMENT_PROFILE_EDIT = "fragmentProfileEdit";
    public static final String FRAGMENT_PROVIDER_SERVICE = "fragmentProviderService";
    public static final String FRAGMENT_RENT_OBJECT = "fragmentRentObject";
    public static final String FRAGMENT_RENT_OBJECT_LIST = "fragmentRentObjectList";
    public static final String FRAGMENT_RETURN_TICKET = "fragmentReturnTicket";
    public static final String FRAGMENT_SEARCH = "fragmentSearch";
    public static final String FRAGMENT_SEARCH_FILTER = "fragmentSearchFilter";
    protected static final String FRAGMENT_SECURITY = "fragmentSecurity";
    public static final String FRAGMENT_SERVICE = "fragmentService";
    public static final String FRAGMENT_SMARTFLAT = "fragmentSmartFlat";
    public static final String FRAGMENT_SUB_ACCOUNT_LIST = "fragmentSubAccountList";
    protected static final String FRAGMENT_TICKETS = "fragmentTickets";
    protected static final String FRAGMENT_TICKET_INFO = "fragmentTicketInfo";
    public static final String FRAGMENT_VIDEO = "fragmentVideo";
    protected static final int LOGIN_REQ = 2001;
    public static final int LOGIN_RES = 2002;
    protected static final int MENU_CHOSE_OTHER_FLAT = 1003;
    protected static final int MENU_FLAT = 1100;
    protected static final int MENU_LOGIN = 1000;
    protected static final int MENU_LOGOOUT_FROM_DEMO = 1005;
    protected static final int MENU_LOGOUT = 1001;
    protected static final int MENU_MY_FLAT = 1004;
    protected static final int MENU_PROFILE = 1002;
    public static final int PROFILE_EXIT_RES = 100221;
    private static final int PROFILE_FROM3STAGE_REQ = 1003;
    public static final String PROFILE_LOGOUT = "logout";
    private static final int PROFILE_REQ = 1001;
    public static final int PROFILE_RES = 1002;
    public static final int REQUEST_CODE_LOCATION = 100;
    protected RelativeLayout appBarLayout;
    private Badge badge;
    private AlertDialog bluetoothAlertDialog;
    private final BottomNavigationView.OnNavigationItemSelectedListener bottomNavigationClickListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        public final boolean onNavigationItemSelected(MenuItem menuItem) {
            return BaseActivity.this.lambda$new$0$BaseActivity(menuItem);
        }
    };
    public View bottomNavigationOuterView;
    public BottomNavigationView bottomNavigationView;
    protected BottomSheetBehavior bottomSheetBehavior;
    private final Boolean bottomViewFirstClick = true;
    public LinearLayout centerLayout;
    private CoordinatorLayout coordinatorLayout;
    Apartment currentApartment = null;
    public String currentComplexId = "";
    public ReactDatabaseSupplier databaseSupplier;
    public String demoFlatId = "";
    protected String demoFlatUid = "";
    private ArrayList<EditText> editTextList = new ArrayList<>();
    private FloatingActionButton fabHelp;
    boolean firstImgLoad = true;
    @Deprecated
    public Flavor flavor;
    private FusedLocationProviderClient fusedLocationClient;
    protected ImageView imageTitle;
    protected boolean isBottomSheetInitialized = false;
    protected boolean isBottomViewInitialized = false;
    protected boolean isChoosingApartmentVisible = false;
    private boolean isDoubleClickedSmartFlat = false;
    private boolean isDoubleClickedTwice = false;
    /* access modifiers changed from: protected */
    public ImageView ivHot;
    public AppCompatImageView ivLeft;
    public KeyboardVehicleMask keyboardVehicleMask;
    private int lastSelectedId = -1;
    protected LinearLayout layoutSelector;
    public LinearLayout llBottomSheet;
    public LinearLayout llButtonsRight;
    private LinearLayout llTwoTitles;
    private AlertDialog locationAlertDialog;
    public FrameLayout mainFrame;
    MaskedTextChangedListener maskedTextChangedListener;
    /* access modifiers changed from: protected */
    public boolean needToShowMyFlatImmediatelly = false;
    public boolean openMarketFromReact;
    private ConstraintLayout parentLayout;
    protected ProfileLocalRepository profileLocalRepository;
    public ProfileViewModel profileViewModel;
    protected PermissionListener reactPermissionListener;
    boolean restartActivity = true;
    private View root;
    public SimpleViewModel simpleViewModel;
    protected View textDemo;
    protected TextView textSelectorTitle;
    protected TextView textTitle;
    public String token;
    private View toolbarShadow;
    private TextView tvTitle1;
    private TextView tvTitle2;
    private final BehaviorSubject<Integer> twiceBackPressedClick = BehaviorSubject.create();
    protected RealmViewModel viewModel;

    /* access modifiers changed from: protected */
    public abstract int getBottomNavigationMenuId();

    public abstract boolean hasBottomSheet();

    public void onBackStackChanged() {
    }

    public void onFinish(String str) {
    }

    /* access modifiers changed from: protected */
    public abstract void showChatsFragment();

    public /* synthetic */ boolean lambda$new$0$BaseActivity(MenuItem menuItem) {
        hideSoftKeyboard(this);
        Schema schema = this.profileLocalRepository.getSchema(menuItem.toString());
        if (schema == null || !schema.getAction().equals(Schema.EMPTY)) {
            switch (menuItem.getItemId()) {
                case R.id.navigation_builder_id:
                    showBuilderFragment();
                    break;
                case R.id.navigation_cabinet:
                    showCabinet();
                    break;
                case R.id.navigation_cameras:
                    showReactSmartFlatFragment(ReactConst.CAMERASTAB);
                    break;
                case R.id.navigation_chats_id:
                    if (this.flavor.getAppName().equals(Flavor.NEWCITY.getAppName())) {
                        StageActivity stageActivity = (StageActivity) this;
                        if (stageActivity.getAppStage() == AppStage.NEW_FLAT || stageActivity.getAppStage() == AppStage.COMPLEX_CONSTRUCTION) {
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://portal.novyigorod.ru/online/app")));
                            return false;
                        }
                    }
                    showChatsFragment();
                    break;
                case R.id.navigation_development_id:
                    onNextFragment(DeveloperFragment.newInstance(this.currentComplexId), true, FRAGMENT_DEVELOPMENT);
                    break;
                case R.id.navigation_favourites_id:
                    showFavouritesFragment();
                    break;
                case R.id.navigation_market:
                    showMarketFragment();
                    break;
                case R.id.navigation_more_id:
                    if (this.profileViewModel.isUserLoggedIn() || this.profileViewModel.isDemo()) {
                        onNextFragment(ProfileFragment.newInstance(this.needToShowMyFlatImmediatelly ? ProfileFragment.Companion.getCURRENT_APARTMENT() : ""), true, FRAGMENT_PROFILE);
                        this.needToShowMyFlatImmediatelly = false;
                        break;
                    } else {
                        showRegistrationActivity();
                        return false;
                    }
                case R.id.navigation_my_flat_id:
                    showMyFlatFragment();
                    break;
                case R.id.navigation_news_id:
                    showNewsListFragment();
                    break;
                case R.id.navigation_search_id:
                    if (!this.flavor.getAppName().equals(Flavor.KORTROS.getAppName())) {
                        showCity(0, true);
                        break;
                    } else {
                        showSearchFragment();
                        break;
                    }
                case R.id.navigation_security:
                    if (!"kortros".equals(Flavor.LAKEWOOD)) {
                        showFragment(SmartNavFragment.start(2), FRAGMENT_SECURITY, true);
                        break;
                    } else {
                        startStageThree(ReactConst.SECURITYTAB, false);
                        break;
                    }
                case R.id.navigation_service:
                    if (!"kortros".equals(Flavor.LAKEWOOD)) {
                        showFragment(SmartNavFragment.start(3), FRAGMENT_SERVICE, true);
                        break;
                    } else {
                        startStageThree(ReactConst.SERVICE, false);
                        break;
                    }
                case R.id.navigation_smartflat:
                    startStageThree(ReactConst.SMARTFLAT, false);
                    break;
            }
            this.lastSelectedId = menuItem.getItemId();
            return true;
        }
        showEmptyFragment(schema.getActionValue(), schema.getTitle());
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.flavor = Flavor.getByFlavor("kortros");
        this.viewModel = ((MainApplication) getApplication()).getRealmViewModel();
        this.profileViewModel = (ProfileViewModel) ViewModelProviders.m13of((FragmentActivity) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(ProfileViewModel.class);
        this.simpleViewModel = (SimpleViewModel) ViewModelProviders.m13of((FragmentActivity) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(SimpleViewModel.class);
        this.profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_base_bottom_navigation);
        this.databaseSupplier = ReactDatabaseSupplier.getInstance(getApplicationContext());
        this.fusedLocationClient = LocationServices.getFusedLocationProviderClient((Activity) this);
        this.root = findViewById(R.id.parent);
        handleKeyboardVisibilityu();
        initViews();
        this.bottomNavigationView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                BaseActivity.this.lambda$onCreate$1$BaseActivity();
            }
        });
        if (this.flavor == Flavor.NOVACITY) {
            this.bottomNavigationView.setItemIconTintList((ColorStateList) null);
        }
    }

    public /* synthetic */ void lambda$onCreate$1$BaseActivity() {
        if (this.flavor == Flavor.PAN) {
            BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) this.bottomNavigationView.getChildAt(0);
            View findViewById = bottomNavigationMenuView.getChildAt(bottomNavigationMenuView.getChildCount() - 1).findViewById(R.id.icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            layoutParams.height = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
            layoutParams.width = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public void handleKeyboardVisibilityu() {
        this.root.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                BaseActivity.this.lambda$handleKeyboardVisibilityu$2$BaseActivity();
            }
        });
    }

    public /* synthetic */ void lambda$handleKeyboardVisibilityu$2$BaseActivity() {
        int height = this.root.getRootView().getHeight() - this.root.getHeight();
        boolean z = true;
        boolean z2 = !needToShowBottomNavigation();
        if (height <= 250 && !z2) {
            z = false;
        }
        int i = 8;
        this.bottomNavigationView.setVisibility(z ? 8 : 0);
        this.bottomNavigationOuterView.setVisibility(z ? 8 : 0);
        LinearLayout linearLayout = this.llBottomSheet;
        if (!z && hasBottomSheet()) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (z || !hasBottomSheet()) {
            this.mainFrame.setPadding(0, 0, 0, 0);
        } else if (hasBottomSheet()) {
            this.mainFrame.setPadding(0, 0, 0, AppUtils.dpToPx(getApplicationContext(), 35));
        }
    }

    public boolean needToShowBottomNavigation() {
        boolean isApartmentBottomNavigationVisible = isApartmentBottomNavigationVisible();
        boolean isCurrentCommerce = this.profileViewModel.getUser().isCurrentCommerce();
        DemoHubFragment demoHubFragment = (DemoHubFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_DEMO_HUB);
        boolean z = demoHubFragment != null && demoHubFragment.isVisible();
        if (Flavor.current().getHasDynamicBottomNavigationViewSupport() && ((!this.simpleViewModel.getBottomNavigationSchema().isEmpty() || this.simpleViewModel.isSchemaLoading()) && !this.isChoosingApartmentVisible && isApartmentBottomNavigationVisible)) {
            return true;
        }
        if (!z && !this.isChoosingApartmentVisible) {
            if (isCurrentCommerce || this.flavor == Flavor.MORIONDIGITAL) {
                return true;
            }
            if (this instanceof StageActivity) {
                StageActivity stageActivity = (StageActivity) this;
                if (stageActivity.getAppStage() == AppStage.NEW_FLAT || stageActivity.getAppStage() == AppStage.COMPLEX_CONSTRUCTION) {
                    return true;
                }
            }
            if (this.profileViewModel.isDemo()) {
                return true;
            }
            if (!this.flavor.isBottomNavigationVisible() || !isApartmentBottomNavigationVisible) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void initViews() {
        this.appBarLayout = (RelativeLayout) findViewById(R.id.appBar);
        this.toolbarShadow = findViewById(R.id.toolbarShadow);
        this.mainFrame = (FrameLayout) findViewById(R.id.main_container);
        this.imageTitle = (ImageView) findViewById(R.id.imageTitle);
        this.textDemo = findViewById(R.id.textDemoTitle);
        this.textTitle = (TextView) findViewById(R.id.textTitle);
        this.layoutSelector = (LinearLayout) findViewById(R.id.layoutSelector);
        this.textSelectorTitle = (TextView) findViewById(R.id.textSelectorTitle);
        this.ivLeft = (AppCompatImageView) findViewById(R.id.imageLeft);
        this.llTwoTitles = (LinearLayout) findViewById(R.id.llTwoTitles);
        this.tvTitle1 = (TextView) findViewById(R.id.tvTitle1);
        this.tvTitle2 = (TextView) findViewById(R.id.tvTitle2);
        this.llButtonsRight = (LinearLayout) findViewById(R.id.llButtonsRight);
        this.centerLayout = (LinearLayout) findViewById(R.id.centerLayout);
        this.parentLayout = (ConstraintLayout) findViewById(R.id.parent);
        this.coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator);
        this.bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        this.bottomNavigationOuterView = findViewById(R.id.navigationView);
        initBottomNavigation();
        this.llBottomSheet = (LinearLayout) findViewById(R.id.bottom_sheet);
        this.ivHot = (ImageView) findViewById(R.id.iv_hotkeys);
        this.fabHelp = (FloatingActionButton) findViewById(R.id.fabHelp);
        this.fabHelp.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                BaseActivity.this.lambda$initViews$3$BaseActivity(view);
            }
        });
    }

    public /* synthetic */ void lambda$initViews$3$BaseActivity(View view) {
        showChatsFragment();
    }

    private boolean isApartmentBottomNavigationVisible() {
        Apartment currentApartment2 = getCurrentApartment();
        if (currentApartment2 == null) {
            currentApartment2 = new Apartment();
            currentApartment2.setShowBottomNavigation(false);
        }
        return currentApartment2.isBottomNavigationVisible().booleanValue();
    }

    private void initBottomNavigation() {
        if (!Flavor.current().getHasDynamicBottomNavigationViewSupport()) {
            this.bottomNavigationView.getMenu().clear();
            if (getBottomNavigationMenuId() != 0) {
                this.bottomNavigationView.inflateMenu(getBottomNavigationMenuId());
            }
        } else if (!ProfileLocalRepository.Companion.getInstance().getBottomNavigationSchema().isEmpty()) {
            fillBottomNavigationView();
        } else {
            if (!isApartmentBottomNavigationVisible()) {
                hideBottomNavigation();
            }
            this.simpleViewModel.getSchema(false);
            this.simpleViewModel.getSchemasMutableLiveData().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    BaseActivity.this.onGetSchema((Schemas) obj);
                }
            });
        }
        this.bottomNavigationView.setOnNavigationItemSelectedListener(this.bottomNavigationClickListener);
        if (this.flavor.isBottomNavigationLabelsVisible()) {
            this.bottomNavigationView.setLabelVisibilityMode(1);
        } else {
            this.bottomNavigationView.setLabelVisibilityMode(2);
        }
        if (this.flavor.isBottomNavigationIconsGlowing()) {
            this.bottomNavigationView.setItemIconSize(AppUtils.dpToPx(getApplicationContext(), 32));
            this.bottomNavigationView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    BaseActivity.this.lambda$initBottomNavigation$4$BaseActivity();
                }
            });
        }
        this.keyboardVehicleMask = (KeyboardVehicleMask) findViewById(R.id.keyboardVehicle);
        this.keyboardVehicleMask.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                BaseActivity.this.lambda$initBottomNavigation$5$BaseActivity();
            }
        });
    }

    public /* synthetic */ void lambda$initBottomNavigation$4$BaseActivity() {
        if (this.firstImgLoad) {
            this.firstImgLoad = false;
            for (int i = 0; i < this.bottomNavigationView.getMenu().size(); i++) {
                MenuItem item = this.bottomNavigationView.getMenu().getItem(i);
                item.setIcon(highlightImage(item.getIcon()));
            }
        }
    }

    public /* synthetic */ void lambda$initBottomNavigation$5$BaseActivity() {
        boolean z = true;
        boolean z2 = this.root.getRootView().getHeight() - this.root.getHeight() < 250;
        if (!needToShowBottomNavigation() || this.keyboardVehicleMask.getVisibility() != 8 || !z2) {
            z = false;
        }
        this.bottomNavigationView.setVisibility(z ? 0 : 8);
        this.bottomNavigationOuterView.setVisibility(z ? 0 : 8);
        this.llBottomSheet.setVisibility((!z || !hasBottomSheet()) ? 8 : 0);
        if (this.keyboardVehicleMask.getVisibility() != 8 || !hasBottomSheet() || !z2) {
            this.mainFrame.setPadding(0, 0, 0, 0);
        } else {
            this.mainFrame.setPadding(0, 0, 0, AppUtils.dpToPx(getApplicationContext(), 35));
        }
    }

    /* access modifiers changed from: private */
    public void onGetSchema(Schemas schemas) {
        if (!this.isBottomViewInitialized) {
            fillBottomNavigationView();
        }
    }

    private void fillBottomNavigationView() {
        this.bottomNavigationView.getMenu().clear();
        List<Schema> bottomNavigationSchema = ProfileLocalRepository.Companion.getInstance().getBottomNavigationSchema();
        if (bottomNavigationSchema != null && bottomNavigationSchema.size() > 0) {
            for (int i = 0; i < bottomNavigationSchema.size(); i++) {
                Schema schema = bottomNavigationSchema.get(i);
                BottomNavigationIds byStringId = BottomNavigationIds.getByStringId(schema.getActionValue());
                if (!(byStringId == null || byStringId == BottomNavigationIds.HOTKEYS)) {
                    this.bottomNavigationView.getMenu().add(0, byStringId.getIntId(), 0, schema.getTitle());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.root.findViewById(R.id.testImage1));
            arrayList.add(this.root.findViewById(R.id.testImage2));
            arrayList.add(this.root.findViewById(R.id.testImage3));
            arrayList.add(this.root.findViewById(R.id.testImage4));
            arrayList.add(this.root.findViewById(R.id.testImage5));
            for (int i2 = 0; i2 < bottomNavigationSchema.size(); i2++) {
                Schema schema2 = bottomNavigationSchema.get(i2);
                BottomNavigationIds byStringId2 = BottomNavigationIds.getByStringId(schema2.getActionValue());
                if (!(byStringId2 == null || byStringId2 == BottomNavigationIds.HOTKEYS)) {
                    loadIconIntoMenuItem(schema2.getIconUrl(), i2, (ImageView) arrayList.get(i2));
                }
            }
            if (needToShowBottomNavigation()) {
                showBottomNavigation();
            } else {
                hideBottomNavigation();
            }
            this.isBottomViewInitialized = true;
            this.simpleViewModel.setIsSchemaLoading(false);
        }
    }

    private void loadIconIntoMenuItem(final String str, final int i, ImageView imageView) {
        Glide.with((FragmentActivity) this).load(str).addListener(new RequestListener<Drawable>() {
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                return false;
            }

            public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                Log.d("BOTTOM_", "loaded " + str);
                BaseActivity.this.bottomNavigationView.getMenu().getItem(i).setIcon(drawable);
                return true;
            }
        }).into(imageView);
    }

    public void hideHotKeys() {
        this.llBottomSheet.setVisibility(8);
        this.mainFrame.setPadding(0, 0, 0, 0);
    }

    public void showHotKeys() {
        if (this.flavor.isBottomNavigationVisible() && hasBottomSheet()) {
            this.llBottomSheet.setVisibility(8);
            this.mainFrame.setPadding(0, 0, 0, 0);
        }
    }

    public Drawable highlightImage(Drawable drawable) {
        int dpToPx = AppUtils.dpToPx(getApplicationContext(), 8);
        int i = dpToPx / 2;
        int dpToPx2 = AppUtils.dpToPx(getApplicationContext(), 5);
        Bitmap drawableToBitmap = AppUtils.drawableToBitmap(drawable);
        Bitmap extractAlpha = drawableToBitmap.extractAlpha();
        Bitmap createBitmap = Bitmap.createBitmap(drawableToBitmap.getWidth() + dpToPx, drawableToBitmap.getHeight() + dpToPx, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(getApplicationContext().getResources().getColor(R.color.brandMain));
        paint.setMaskFilter(new BlurMaskFilter((float) dpToPx2, BlurMaskFilter.Blur.OUTER));
        float f = (float) i;
        canvas.drawBitmap(extractAlpha, f, f, paint);
        canvas.drawBitmap(drawableToBitmap, f, f, (Paint) null);
        return new BitmapDrawable(getResources(), createBitmap);
    }

    /* access modifiers changed from: protected */
    public void showReactSmartFlatFragment(String str) {
        if (!this.isDoubleClickedSmartFlat) {
            this.isDoubleClickedSmartFlat = true;
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    BaseActivity.this.lambda$showReactSmartFlatFragment$6$BaseActivity();
                }
            }, 2000);
            saveKeyValuePair(ReactConst.TAB_NAME, str);
            saveKeyValuePair("token", this.profileViewModel.getUserToken());
            showFragment(ReactSmartFlatFragment.newInstance(str), FRAGMENT_SMARTFLAT, true);
        }
    }

    public /* synthetic */ void lambda$showReactSmartFlatFragment$6$BaseActivity() {
        this.isDoubleClickedSmartFlat = false;
    }

    public void showFragment(Fragment fragment, String str, boolean z) {
        BottomSheetBehavior bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null && bottomSheetBehavior2.getState() == 3) {
            this.bottomSheetBehavior.setState(4);
        }
        if (z) {
            clearBackStack();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag(str) == null || str.equals("") || getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            supportFragmentManager.beginTransaction().replace(this.mainFrame.getId(), fragment, str).addToBackStack(str).commitAllowingStateLoss();
            return;
        }
        supportFragmentManager.popBackStackImmediate(str, 1);
        supportFragmentManager.beginTransaction().replace(this.mainFrame.getId(), fragment, str).addToBackStack(str).commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    public void clearBackStack() {
        getSupportFragmentManager().popBackStackImmediate((String) null, 1);
    }

    public void showCabinet() {
        this.bottomNavigationView.getMenu().findItem(R.id.navigation_cabinet).setChecked(true);
        showFragment(ProfileTabFragment.start(), FRAGMENT_CABINET, true);
    }

    public void showMarketFragment() {
        showFragment(MarketFragment.Companion.newInstance(), FRAGMENT_MARKETPLACE, true);
    }

    /* access modifiers changed from: protected */
    public void showSearchFragment() {
        hideToolbar();
        showFragment(SearchFragment.newInstance(), FRAGMENT_SEARCH, true);
    }

    public void showCity(int i, boolean z) {
        showFragment(SearchTownFragment.newInstance(Integer.valueOf(i)), FRAGMENT_CITY, false);
    }

    public void showComplex(String str) {
        showFragment(SearchGkFragment.newInstance(str), FRAGMENT_COMPLEX, false);
    }

    public void showFlat(String str, Integer num, String str2) {
        showFragment(FlatFragment.newInstance(str, false, true, num, str2), FRAGMENT_FLAT, false);
    }

    /* access modifiers changed from: protected */
    public void showFavouritesFragment() {
        showFragment(FavouritesListFragment.newInstance(), FRAGMENT_FAVOURITES, true);
    }

    public void showFavouriteFlat(String str) {
        showFragment(FlatFragment.newInstance(str, false, true), FRAGMENT_FAVOURITE_FLAT, false);
    }

    /* access modifiers changed from: protected */
    public void showBuilderFragment() {
        showFragment(DynamicFragment.newInstance(this.flavor.getBuilderInfoDynamicFormId(), ToolbarButtons.PROFILE), FRAGMENT_DYNAMIC, true);
    }

    /* access modifiers changed from: protected */
    public void showNewsListFragment() {
        showFragment(NewsListFragment.newInstance(), FRAGMENT_NEWS, true);
    }

    public void showNewsFragment(String str) {
        showFragment(NewspieceFragment.newInstance(str), FRAGMENT_NEWSPIECE, false);
    }

    public void showChatFragment(Chat chat, String str, boolean z) {
        showFragment(ChatFragment.newInstance(chat.getId(), str, z), FRAGMENT_CHAT, true);
    }

    public void showChatFragment(Chat chat, String str) {
        showChatFragment(chat, str, false);
    }

    public void showMyFlatFragment() {
        showMyFlatFragment(true);
    }

    public void showMyFlatFragment(boolean z) {
        onNextFragment(FlatFragment.newInstance(StringUtils.isEmpty(this.demoFlatUid) ? getCurrentFlatUid() : this.demoFlatUid, true, false), z, FRAGMENT_MY_FLAT);
    }

    public void showEmptyFragment(String str, String str2) {
        showFragment(EmptyFragment.start(str, str2), FRAGMENT_EMPTY, true);
    }

    private String getCurrentFlatUid() {
        String userToken = this.profileLocalRepository.getUserToken();
        Iterator<Apartment> it = this.profileLocalRepository.getUser().getApartmentList().iterator();
        String str = "";
        while (it.hasNext()) {
            Apartment next = it.next();
            if (next.getUserToken().equals(userToken)) {
                str = next.getUid();
            }
        }
        return str;
    }

    public void showAcceptanceDateFragment() {
        showFragment(AcceptanceDateFragment.Companion.newInstance(), FRAGMENT_ACCEPTANCE_DATE, false);
    }

    public void showImageLogo() {
        Splashscreen splashscreen = this.profileViewModel.getSplashscreen();
        if (splashscreen != null && splashscreen.getToolbarUrl() != null && !splashscreen.getToolbarUrl().isEmpty()) {
            loadImageTitle(splashscreen);
        } else if (needToShowDefaultToolbar() && this.profileViewModel.isSplashscreenLoaded()) {
            showDefaultToolbarTitle();
        }
    }

    public boolean needToShowDefaultToolbar() {
        return ((ProfileFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_PROFILE)) == null && ((ReactSmartFlatFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_SMARTFLAT)) == null && ((ApartmentListFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_APARTMENT_LIST)) == null && ((SearchFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_SEARCH)) == null && ((ProfileChooserFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_PROFILE_CHOOSER)) == null;
    }

    public void showDefaultToolbarTitle() {
        if (this.flavor.isHasImageLogo()) {
            this.appBarLayout.setVisibility(0);
            this.toolbarShadow.setVisibility(0);
            this.imageTitle.setVisibility(0);
            this.imageTitle.setImageResource(R.drawable.logo_text);
            this.textTitle.setVisibility(4);
            if (this.profileViewModel.isDemo()) {
                this.textDemo.setVisibility(0);
                ((LinearLayout.LayoutParams) this.imageTitle.getLayoutParams()).setMargins(0, -((int) getResources().getDimension(R.dimen.demoLogoMargin)), 0, (int) getResources().getDimension(R.dimen.demoLogoMargin));
                return;
            }
            this.textDemo.setVisibility(8);
            ((LinearLayout.LayoutParams) this.imageTitle.getLayoutParams()).setMargins(0, 0, 0, 0);
            return;
        }
        setTextTitle(this.flavor.name());
    }

    public void clearDefaultToolbarTitle() {
        this.appBarLayout.setVisibility(0);
        this.toolbarShadow.setVisibility(0);
        this.imageTitle.setVisibility(0);
        this.imageTitle.setImageResource(0);
        this.imageTitle.setImageDrawable((Drawable) null);
        this.imageTitle.requestLayout();
        this.imageTitle.invalidate();
        this.textTitle.setVisibility(4);
        if (this.profileViewModel.isDemo()) {
            this.textDemo.setVisibility(0);
            ((LinearLayout.LayoutParams) this.imageTitle.getLayoutParams()).setMargins(0, -((int) getResources().getDimension(R.dimen.demoLogoMargin)), 0, (int) getResources().getDimension(R.dimen.demoLogoMargin));
            return;
        }
        this.textDemo.setVisibility(8);
        ((LinearLayout.LayoutParams) this.imageTitle.getLayoutParams()).setMargins(0, 0, 0, 0);
    }

    public void loadImageTitle(Splashscreen splashscreen) {
        clearDefaultToolbarTitle();
        if (splashscreen != null && splashscreen.getToolbarUrl() != null && !splashscreen.getToolbarUrl().isEmpty()) {
            ((RequestBuilder) Glide.with((View) this.imageTitle).load(splashscreen.getToolbarUrl()).dontAnimate()).listener(new RequestListener<Drawable>() {
                public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                    BaseActivity.this.profileViewModel.setSplashScreenLoaded(true);
                    BaseActivity.this.showDefaultToolbarTitle();
                    return false;
                }

                public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                    BaseActivity.this.imageTitle.setLayerType(1, (Paint) null);
                    BaseActivity.this.imageTitle.setColorFilter(BaseActivity.this.getResources().getColor(R.color.toolbarLogoTint), PorterDuff.Mode.SRC_ATOP);
                    ((LinearLayout.LayoutParams) BaseActivity.this.imageTitle.getLayoutParams()).setMargins(0, 16, 0, 16);
                    BaseActivity.this.imageTitle.requestLayout();
                    BaseActivity.this.imageTitle.invalidate();
                    BaseActivity.this.imageTitle.setImageDrawable(drawable);
                    BaseActivity.this.profileViewModel.setSplashScreenLoaded(true);
                    return false;
                }
            }).into(this.imageTitle);
        }
    }

    public void setTextTitle(String str) {
        this.imageTitle.setVisibility(8);
        this.appBarLayout.setVisibility(0);
        this.toolbarShadow.setVisibility(0);
        this.textTitle.setVisibility(0);
        this.textTitle.setText(str);
    }

    public void setTextTitleAccent(String str) {
        setTextTitle(str);
        this.textTitle.setTextColor(getResources().getColor(R.color.demoCrossColor));
    }

    public void setToolbarBackground(int i) {
        this.appBarLayout.setBackgroundColor(i);
    }

    public void hideToolbar() {
        this.appBarLayout.setVisibility(8);
        this.toolbarShadow.setVisibility(8);
    }

    public void hideToolbarShadow() {
        this.toolbarShadow.setVisibility(8);
    }

    public void showProfile(String str) {
        onNextFragment(ProfileFragment.newInstance(str), false, FRAGMENT_PROFILE);
    }

    public void showProfile(String str, boolean z) {
        onNextFragment(ProfileFragment.newInstance(str, z), false, FRAGMENT_PROFILE);
    }

    public void logout() {
        if (this.profileLocalRepository.isDemo()) {
            this.profileViewModel.setDemoStage(0);
            if (thereIsActivityStack() || !this.flavor.isStage1Enabled()) {
                if (!this.flavor.isStage1Enabled()) {
                    clearProfileDataForLogout();
                }
                if (!this.profileLocalRepository.isUserLoggedIn()) {
                    startActivity(new Intent(this, this.flavor.getAuthActivity()));
                }
                finish();
                return;
            }
            finish();
            return;
        }
        ((RegViewModel) ViewModelProviders.m12of((FragmentActivity) this).get(RegViewModel.class)).sendFCMToken(true);
        clearProfileDataForLogout();
        if (!(this instanceof StageActivity)) {
            return;
        }
        if (this.flavor.isStage1Enabled()) {
            startStageOne();
            return;
        }
        startActivity(new Intent(this, this.flavor.getAuthActivity()));
        finish();
    }

    /* access modifiers changed from: protected */
    public void clearProfileDataForLogout() {
        this.profileViewModel.setSplashScreenLoaded(false);
        this.profileLocalRepository.clearProfileForLogout(getApplicationContext());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == FlatFragment.BOOK_VISIT.intValue()) {
            FlatFragment flatFragment = (FlatFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_FLAT);
            if (flatFragment != null) {
                flatFragment.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        if (i == 53213 || i == 42141) {
            ChatFragment chatFragment = (ChatFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_CHAT);
            if (chatFragment != null) {
                chatFragment.onActivityResult(i, i2, intent);
            } else {
                List<Fragment> fragments = getSupportFragmentManager().getFragments();
                Fragment fragment = fragments.get(fragments.size() - 1);
                if (fragment != null) {
                    fragment.onActivityResult(i, i2, intent);
                }
            }
            ProfileEditFragment profileEditFragment = (ProfileEditFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_PROFILE_EDIT);
            if (profileEditFragment != null) {
                profileEditFragment.onActivityResult(i, i2, intent);
            }
        }
        User user = this.profileLocalRepository.getUser();
        if (i == 1001 && i2 == 100221) {
            if (intent.getBooleanExtra(PROFILE_LOGOUT, false)) {
                logout();
            }
        } else if (i == 1003 && i2 == 1002) {
            if (intent.getBooleanExtra(PROFILE_LOGOUT, false)) {
                logout();
            } else {
                finish();
            }
        } else if (i != LOGIN_REQ || i2 != 2002) {
        } else {
            if (user.getStage() == 1) {
                startStageOne();
            } else if (user.getStage() == 2) {
                startStageTwo(false);
            } else if (user.getStage() == 3) {
                startStageThree(ReactConst.SMARTFLAT, false);
                finish();
            }
        }
    }

    public RealmViewModel getViewModel() {
        return this.viewModel;
    }

    public FusedLocationProviderClient getFusedLocationClient() {
        return this.fusedLocationClient;
    }

    public void initSelector(int i, ArrayList<String> arrayList, View.OnClickListener onClickListener) {
        this.layoutSelector.setVisibility(0);
        this.textTitle.setVisibility(4);
        this.imageTitle.setVisibility(4);
        this.layoutSelector.setOnClickListener(new View.OnClickListener(onClickListener, arrayList) {
            private final /* synthetic */ View.OnClickListener f$1;
            private final /* synthetic */ ArrayList f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                BaseActivity.this.lambda$initSelector$7$BaseActivity(this.f$1, this.f$2, view);
            }
        });
        setSelectorTitle(arrayList.get(i));
    }

    public /* synthetic */ void lambda$initSelector$7$BaseActivity(View.OnClickListener onClickListener, ArrayList arrayList, View view) {
        SelectorDialog selectorDialog = new SelectorDialog();
        selectorDialog.setClickListener(onClickListener);
        selectorDialog.setData(arrayList);
        selectorDialog.show(getSupportFragmentManager(), "dialog");
    }

    public void showSelector() {
        this.layoutSelector.setVisibility(0);
        this.textTitle.setVisibility(4);
        this.imageTitle.setVisibility(4);
    }

    public void setSelectorTitle(String str) {
        this.textSelectorTitle.setText(str);
    }

    public void showRegistrationActivity() {
        showRegistrationActivity(Integer.valueOf(LOGIN_REQ));
    }

    public void showRegistrationActivity(Integer num) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        intent.putExtra("requestCode", num);
        startActivityForResult(intent, num.intValue());
    }

    public void showDemo2Stage(String str, String str2) {
        showDemo2Stage(str, str2, (String) null);
    }

    public void showDemo2Stage(String str, String str2, String str3) {
        this.profileViewModel.setDemoStage(2);
        Bundle bundle = new Bundle();
        bundle.putString(DEMO_FLAT_UID, str);
        bundle.putString(CURRENT_COMPLEX_ID, str2);
        bundle.putString(DEMO_FLAT_ID, str3);
        startActivity(StageActivity.start(getApplicationContext(), AppStage.COMPLEX_CONSTRUCTION, bundle, false));
    }

    public void showDemo3Stage() {
        this.profileViewModel.setDemoStage(3);
        startActivity(StageActivity.start(getApplicationContext(), AppStage.SMARTFLAT, this.flavor.getStage3DefaultScreen(), false));
    }

    public void startStageOne(Bundle bundle) {
        Intent start = StageActivity.start(getApplicationContext(), AppStage.NEW_FLAT, false);
        start.putExtras(bundle);
        startActivity(start);
        finish();
    }

    public void startStageOne() {
        startActivity(StageActivity.start(getApplicationContext(), AppStage.NEW_FLAT, false));
        finish();
    }

    public void startStageTwo(Boolean bool) {
        if (getIntent() == null || getIntent().getExtras() == null) {
            startActivity(StageActivity.start(getApplicationContext(), AppStage.COMPLEX_CONSTRUCTION, bool.booleanValue()));
        } else {
            startActivity(StageActivity.start(getApplicationContext(), AppStage.COMPLEX_CONSTRUCTION, getIntent().getExtras(), bool.booleanValue()));
        }
        finish();
    }

    public void startStageTwo(String str, Boolean bool) {
        if (getIntent() == null || getIntent().getExtras() == null) {
            startActivity(StageActivity.start(getApplicationContext(), AppStage.COMPLEX_CONSTRUCTION, str, bool.booleanValue()));
        } else {
            startActivity(StageActivity.start(getApplicationContext(), AppStage.COMPLEX_CONSTRUCTION, str, getIntent().getExtras(), bool.booleanValue()));
        }
        finish();
    }

    public void startStageThree(String str, Boolean bool) {
        if (this.restartActivity) {
            if (getIntent() == null || getIntent().getExtras() == null) {
                startActivity(StageActivity.start(getApplicationContext(), AppStage.SMARTFLAT, str, bool.booleanValue()));
            } else {
                startActivity(StageActivity.start(getApplicationContext(), AppStage.SMARTFLAT, str, getIntent().getExtras(), bool.booleanValue()));
            }
            finish();
            return;
        }
        showReactSmartFlatFragment(ReactConst.SMARTFLAT);
    }

    public void startStageThreeFromApartmentChooser(String str) {
        this.restartActivity = true;
        startActivity(StageActivity.start(getApplicationContext(), AppStage.SMARTFLAT, str, true));
        finish();
    }

    public void startStageThreeFromProfileChooser(String str) {
        this.restartActivity = true;
        startActivity(StageActivity.start(getApplicationContext(), AppStage.SMARTFLAT, str, false));
        finish();
    }

    public void saveKeyValuePair(String str, String str2) {
        SQLiteStatement compileStatement = this.databaseSupplier.get().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
        try {
            this.databaseSupplier.get().beginTransaction();
            compileStatement.clearBindings();
            compileStatement.bindString(1, str);
            compileStatement.bindString(2, str2);
            compileStatement.execute();
            this.databaseSupplier.get().setTransactionSuccessful();
            try {
                this.databaseSupplier.get().endTransaction();
            } catch (Exception e) {
                Log.w("AsyncStorage", e.getMessage(), e);
            }
        } catch (Exception e2) {
            Log.w("AsyncStorage", e2.getMessage(), e2);
            this.databaseSupplier.get().endTransaction();
        } catch (Throwable th) {
            try {
                this.databaseSupplier.get().endTransaction();
            } catch (Exception e3) {
                Log.w("AsyncStorage", e3.getMessage(), e3);
            }
            throw th;
        }
    }

    public void showMessage(String str) {
        if (StringUtils.isNotEmpty(str)) {
            AlertDialog.Builder positiveButton = new AlertDialog.Builder(this).setMessage((CharSequence) str).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) $$Lambda$BaseActivity$AQ6Oq_kvJavXwMn4JgeSOmLtOE.INSTANCE);
            if (!isFinishing()) {
                positiveButton.show();
            }
        }
    }

    public void showMessage(int i) {
        showMessage(getString(i));
    }

    public void showChatListFragmentAfterDelete() {
        getSupportFragmentManager().popBackStack((String) null, 1);
        showChatsFragment();
    }

    public void showNewChat(boolean z, String str) {
        showFragment(NewChatFragment.newInstance(z, str), FRAGMENT_NEW_CHAT, false);
    }

    public void showParticipantsFragment(Chat chat, String str) {
        showFragment(ChatParticipantsFragment.newInstance(chat, str), FRAGMENT_CHAT_PARTICIPANTS, false);
    }

    public void setToolbarCenter(String str, String str2) {
        hideToolbarCenter();
        this.llTwoTitles.setVisibility(0);
        this.tvTitle1.setText(str);
        this.tvTitle2.setText(str2);
    }

    private void hideToolbarCenter() {
        this.llTwoTitles.setVisibility(8);
        this.layoutSelector.setVisibility(8);
        this.imageTitle.setVisibility(8);
        this.textTitle.setVisibility(8);
    }

    public void setToolbarRight(ArrayList<View> arrayList) {
        this.llButtonsRight.setVisibility(0);
        this.llButtonsRight.removeAllViews();
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            this.llButtonsRight.addView(it.next());
        }
    }

    public boolean hasToolbarRight() {
        return this.llButtonsRight.getChildCount() > 0;
    }

    public void addToolbarRight(ArrayList<View> arrayList) {
        this.llButtonsRight.setVisibility(0);
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            this.llButtonsRight.addView(it.next());
        }
    }

    public void setCenterLayout(View view) {
        this.textTitle.setVisibility(4);
        this.centerLayout.setVisibility(0);
        this.centerLayout.removeAllViews();
        this.centerLayout.addView(view);
    }

    public void resetToolbarAndNavigation() {
        resetToolbar();
        setContentThroughBottomNavigation(false);
        this.fabHelp.setVisibility(8);
        if (needToShowBottomNavigation()) {
            this.bottomNavigationView.setVisibility(0);
            this.bottomNavigationOuterView.setVisibility(0);
        } else {
            this.bottomNavigationOuterView.setVisibility(8);
            this.bottomNavigationView.setVisibility(8);
        }
        if (!hasBottomSheet()) {
            hideHotKeys();
        }
        onBackStackChanged();
    }

    public void resetToolbar() {
        this.ivLeft.setVisibility(8);
        hideToolbarCenter();
        this.llButtonsRight.removeAllViews();
        this.llButtonsRight.setVisibility(4);
        this.appBarLayout.setVisibility(0);
        this.toolbarShadow.setVisibility(0);
        this.centerLayout.removeAllViews();
        this.centerLayout.setVisibility(8);
        this.textTitle.setTextColor(getResources().getColor(R.color.brandToolbarTextColor));
        this.textDemo.setVisibility(8);
        ((LinearLayout.LayoutParams) this.imageTitle.getLayoutParams()).setMargins(0, 0, 0, 0);
    }

    public void removeToolbarElevation() {
        this.toolbarShadow.setVisibility(8);
    }

    public void setTitleClickListener(View.OnClickListener onClickListener) {
        this.textTitle.setOnClickListener(onClickListener);
    }

    public void startSearchViewActivity(String str) {
        Intent intent = new Intent(this, SearchViewActivity.class);
        intent.putExtra(Constants.SEARCH_SELECTED_ID, str);
        startActivity(intent);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.BaseActivity$5 */
    static /* synthetic */ class C57795 {
        static final /* synthetic */ int[] $SwitchMap$ru$unicorn$ujin$view$toolbar$ToolbarButtons = new int[ToolbarButtons.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                ru.unicorn.ujin.view.toolbar.ToolbarButtons[] r0 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$unicorn$ujin$view$toolbar$ToolbarButtons = r0
                int[] r0 = $SwitchMap$ru$unicorn$ujin$view$toolbar$ToolbarButtons     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.view.toolbar.ToolbarButtons r1 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.BACK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$view$toolbar$ToolbarButtons     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.view.toolbar.ToolbarButtons r1 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.BACK_TO     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$view$toolbar$ToolbarButtons     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.view.toolbar.ToolbarButtons r1 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.PROFILE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$view$toolbar$ToolbarButtons     // Catch:{ NoSuchFieldError -> 0x0035 }
                ru.unicorn.ujin.view.toolbar.ToolbarButtons r1 = p035ru.unicorn.ujin.view.toolbar.ToolbarButtons.NONE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.BaseActivity.C57795.<clinit>():void");
        }
    }

    public void setToolbarLeft(ToolbarButtons toolbarButtons) {
        int i = C57795.$SwitchMap$ru$unicorn$ujin$view$toolbar$ToolbarButtons[toolbarButtons.ordinal()];
        if (i == 1) {
            this.ivLeft.setVisibility(0);
            this.ivLeft.setImageResource(R.drawable.icon_back);
            this.ivLeft.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    BaseActivity.this.lambda$setToolbarLeft$9$BaseActivity(view);
                }
            });
        } else if (i == 2) {
            this.ivLeft.setImageResource(R.drawable.icon_back);
            this.ivLeft.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    BaseActivity.this.lambda$setToolbarLeft$10$BaseActivity(view);
                }
            });
        } else if (i == 3) {
            this.ivLeft.setVisibility(0);
            this.ivLeft.setImageResource(R.drawable.ic_svg_profile);
            this.ivLeft.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    BaseActivity.this.handleProfileClick(view);
                }
            });
        } else if (i == 4) {
            this.ivLeft.setVisibility(4);
            this.ivLeft.setOnClickListener((View.OnClickListener) null);
        }
    }

    public /* synthetic */ void lambda$setToolbarLeft$9$BaseActivity(View view) {
        onBackPressed();
    }

    public /* synthetic */ void lambda$setToolbarLeft$10$BaseActivity(View view) {
        setCabinetChecked();
    }

    public void handleProfileClick(View view) {
        if (this.profileViewModel.isUserLoggedIn() || this.profileViewModel.isDemo()) {
            onNextFragment(new ProfileFragment(), false, FRAGMENT_PROFILE);
        } else {
            startActivityForResult(new Intent(this, RegistrationActivity.class), LOGIN_REQ);
        }
    }

    public void onNextFragment(Fragment fragment, boolean z, String str) {
        showFragment(fragment, str, z);
    }

    public void onBackFragment() {
        getSupportFragmentManager().popBackStackImmediate();
    }

    public void onBackFragment(BaseFragment baseFragment) {
        getSupportFragmentManager().popBackStackImmediate();
        onNextFragment(baseFragment, false, baseFragment.getTag());
    }

    public void popFragment() {
        getSupportFragmentManager().popBackStack();
    }

    public void popTo(String str) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag(str) != null && !str.equals("") && getSupportFragmentManager().getBackStackEntryCount() > 1) {
            supportFragmentManager.popBackStackImmediate(str, 0);
        }
    }

    public void pop() {
        getSupportFragmentManager().popBackStackImmediate();
    }

    public Apartment getCurrentApartment() {
        if (this.currentApartment == null) {
            String userToken = this.profileViewModel.getUserToken();
            Iterator<Apartment> it = this.profileViewModel.getCombineApartments().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Apartment next = it.next();
                if (next.getUserToken().equals(userToken)) {
                    this.currentApartment = next;
                    break;
                }
            }
        }
        return this.currentApartment;
    }

    public void setBottomItemClick(int i) {
        this.bottomNavigationView.setSelectedItemId(i);
    }

    public void setChatsChecked() {
        this.bottomNavigationView.findViewById(R.id.navigation_chats_id).performClick();
    }

    public void setMarketChecked() {
        this.bottomNavigationView.findViewById(R.id.navigation_market).performClick();
    }

    /* access modifiers changed from: protected */
    public void setServicesChecked() {
        this.bottomNavigationView.findViewById(R.id.navigation_service).performClick();
    }

    /* access modifiers changed from: protected */
    public void setSecurityChecked() {
        this.bottomNavigationView.findViewById(R.id.navigation_security).performClick();
    }

    /* access modifiers changed from: protected */
    public void setCabinetChecked() {
        this.bottomNavigationView.findViewById(R.id.navigation_cabinet).performClick();
    }

    public void hideBottomNavigation() {
        this.bottomNavigationOuterView.setVisibility(8);
    }

    public void showBottomNavigation() {
        this.bottomNavigationOuterView.setVisibility(0);
    }

    public void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (activity.getCurrentFocus() != null && inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public void setSmartflatChecked(boolean z) {
        this.restartActivity = z;
        this.bottomNavigationView.setSelectedItemId(R.id.navigation_smartflat);
    }

    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        AlertDialog alertDialog = this.bluetoothAlertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.bluetoothAlertDialog = null;
        }
        AlertDialog alertDialog2 = this.locationAlertDialog;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
            this.locationAlertDialog = null;
        }
        super.onStop();
    }

    public boolean thereIsActivityStack() {
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(5);
        if (runningTasks.isEmpty() || runningTasks.get(0).numRunning <= 1) {
            return false;
        }
        return true;
    }

    public boolean isApplicationSentToBackground(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
        if (runningTasks.isEmpty()) {
            return false;
        }
        ComponentName componentName = null;
        if (Build.VERSION.SDK_INT >= 29) {
            componentName = runningTasks.get(0).topActivity;
        }
        if (componentName == null || !componentName.getPackageName().equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    public void onBackPressed() {
        Flavor current = Flavor.current();
        if (!current.isStage1Enabled() && (this instanceof StageActivity) && ((StageActivity) this).getAppStage() != AppStage.NEW_FLAT && !current.isJustSmartFlatAvailable() && !current.isCommerceAvailable() && current.isUkAddingAvailable()) {
            new AlertDialog.Builder(this).setTitle((int) R.string.finishRegistrationDialogTitle).setMessage((int) R.string.finishRegistrationDialogMessage).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) $$Lambda$BaseActivity$t_FWx9fxlKRtkEctBLkBTamrnE.INSTANCE).show();
        } else if (this.keyboardVehicleMask.getVisibility() == 0) {
            this.keyboardVehicleMask.setVisibility(8);
        } else {
            UIHelper.hideKeyboard(getApplicationContext(), this.ivLeft);
            FlatFragment flatFragment = (FlatFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_MY_FLAT);
            boolean z = this instanceof StageActivity;
            if (z && ((StageActivity) this).getAppStage() == AppStage.SMARTFLAT && flatFragment != null && flatFragment.isVisible() && getSupportFragmentManager().getBackStackEntryCount() == 1) {
                startStageThree(ReactConst.SMARTFLAT, false);
            }
            ProfileFragment profileFragment = (ProfileFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_PROFILE);
            ReactSmartFlatFragment reactSmartFlatFragment = (ReactSmartFlatFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_SMARTFLAT);
            DemoHubFragment demoHubFragment = (DemoHubFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_DEMO_HUB);
            ApartmentListFragment apartmentListFragment = (ApartmentListFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_APARTMENT_LIST);
            ProfileChooserStage4Fragment profileChooserStage4Fragment = (ProfileChooserStage4Fragment) getSupportFragmentManager().findFragmentByTag("profileChooserAddBc4");
            ProfileChooserUkAttachment4Fragment profileChooserUkAttachment4Fragment = (ProfileChooserUkAttachment4Fragment) getSupportFragmentManager().findFragmentByTag("profileChooserAddUk4");
            if (apartmentListFragment != null && apartmentListFragment.getMode() == Mode.FROM_LOGIN) {
                logout();
            } else if ((profileChooserStage4Fragment != null && profileChooserStage4Fragment.isVisible()) || (profileChooserUkAttachment4Fragment != null && profileChooserUkAttachment4Fragment.isVisible())) {
                getSupportFragmentManager().popBackStackImmediate("profileChooserAddBc3", 1);
            } else if (z && ((StageActivity) this).getAppStage() == AppStage.SMARTFLAT && profileFragment != null) {
                standardBackPressed();
            } else if (reactSmartFlatFragment == null || reactSmartFlatFragment.getMReactNativeHost() == null) {
                if (demoHubFragment == null || !demoHubFragment.isVisible() || !this.profileViewModel.isDemo()) {
                    standardBackPressed();
                } else {
                    demoHubFragment.handleDemoLogout();
                }
            } else if (this.isDoubleClickedTwice) {
                finish();
            } else {
                reactSmartFlatFragment.getMReactNativeHost().getReactInstanceManager().onBackPressed();
                popTo(FRAGMENT_SMARTFLAT);
            }
        }
    }

    public void reactMainScreenBackPressed() {
        if (this.isDoubleClickedTwice) {
            finish();
            return;
        }
        Snackbar.make((View) this.parentLayout, (CharSequence) getString(R.string.label_click_twice), -1).show();
        this.isDoubleClickedTwice = true;
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                BaseActivity.this.lambda$reactMainScreenBackPressed$12$BaseActivity();
            }
        }, 2000);
    }

    public /* synthetic */ void lambda$reactMainScreenBackPressed$12$BaseActivity() {
        this.isDoubleClickedTwice = false;
    }

    public void standardBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            if (!this.isDoubleClickedTwice) {
                showDefault();
                Snackbar.make((View) this.parentLayout, (CharSequence) getString(R.string.label_click_twice), -1).show();
                this.isDoubleClickedTwice = true;
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        BaseActivity.this.lambda$standardBackPressed$13$BaseActivity();
                    }
                }, 2000);
                return;
            }
            finish();
        } else if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            finish();
            boolean isDemo = this.profileLocalRepository.isDemo();
        } else {
            runOnUiThread(new Runnable() {
                public final void run() {
                    BaseActivity.this.lambda$standardBackPressed$14$BaseActivity();
                }
            });
        }
    }

    public /* synthetic */ void lambda$standardBackPressed$13$BaseActivity() {
        this.isDoubleClickedTwice = false;
    }

    public /* synthetic */ void lambda$standardBackPressed$14$BaseActivity() {
        super.onBackPressed();
    }

    private void showDefault() {
        int hashCode = "kortros".hashCode();
        setSmartflatChecked(false);
    }

    public void rnBackPressed() {
        FlatFragment flatFragment = (FlatFragment) getSupportFragmentManager().findFragmentByTag(FRAGMENT_MY_FLAT);
        if (flatFragment == null || !flatFragment.isVisible()) {
            onBackPressed();
        } else {
            runOnUiThread(new Runnable() {
                public final void run() {
                    BaseActivity.this.standardBackPressed();
                }
            });
        }
    }

    public void setContentThroughBottomNavigation(Boolean bool) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.coordinatorLayout.getLayoutParams();
        if (bool.booleanValue()) {
            layoutParams.bottomToBottom = R.id.parent;
            layoutParams.bottomToTop = -1;
        } else {
            layoutParams.bottomToTop = R.id.navigationView;
            layoutParams.bottomToBottom = -1;
        }
        this.coordinatorLayout.requestLayout();
    }

    public void showBadge(boolean z) {
        View findViewById = this.bottomNavigationView.findViewById(R.id.navigation_service);
        if (this.badge == null) {
            this.badge = new QBadgeView(this);
            this.badge.setBadgeGravity(BadgeDrawable.TOP_END);
            this.badge.setGravityOffset(12.0f, 0.0f, true);
            this.badge.setBadgeTextColor(ContextCompat.getColor(this, R.color.brandMain));
            this.badge.setBadgeTextSize(6.0f, false);
            this.badge.setBadgeBackgroundColor(ContextCompat.getColor(this, R.color.brandMain));
        }
        this.badge.setBadgeNumber(z ? 1 : 0);
        this.badge.bindTarget(findViewById);
    }

    public void showHelpButton() {
        this.fabHelp.setVisibility(0);
    }

    public void showUrl(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    private boolean hasPermission(String str) {
        return getPackageManager().checkPermission(str, getPackageName()) == 0;
    }

    public void addEditTextToVehicleMask(EditText editText, EditText editText2) {
        this.editTextList.add(editText);
        ArrayList arrayList = new ArrayList();
        arrayList.add(KeyboardVehicleMask.INPUT_VEHICLE_MASK);
        this.maskedTextChangedListener = new MaskedTextChangedListener(KeyboardVehicleMask.INPUT_VEHICLE_MASK, arrayList, new ArrayList(), AffinityCalculationStrategy.PREFIX, true, editText, new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                BaseActivity.this.keyboardVehicleMask.onInputChanged(editable.length());
            }
        }, (MaskedTextChangedListener.ValueListener) null);
        editText.addTextChangedListener(this.maskedTextChangedListener);
        this.keyboardVehicleMask.onInputChanged(0);
        editText.clearFocus();
        hideSoftKeyboard(this);
        editText.setCursorVisible(false);
        editText.setOnTouchListener(new View.OnTouchListener() {
            private int CLICK_ACTION_THRESHOLD = 200;
            private float startX;
            private float startY;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                EditText editText = (EditText) view;
                int inputType = editText.getInputType();
                editText.setInputType(0);
                view.onTouchEvent(motionEvent);
                editText.setInputType(inputType);
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.startX = motionEvent.getX();
                    this.startY = motionEvent.getY();
                } else if (action == 1) {
                    if (isAClick(this.startX, motionEvent.getX(), this.startY, motionEvent.getY()) && BaseActivity.this.keyboardVehicleMask.getVisibility() == 8) {
                        BaseActivity.this.keyboardVehicleMask.setVisibility(0);
                    }
                }
                return true;
            }

            private boolean isAClick(float f, float f2, float f3, float f4) {
                float abs = Math.abs(f - f2);
                float abs2 = Math.abs(f3 - f4);
                int i = this.CLICK_ACTION_THRESHOLD;
                return abs <= ((float) i) && abs2 <= ((float) i);
            }
        });
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener(editText, editText2) {
            private final /* synthetic */ EditText f$1;
            private final /* synthetic */ EditText f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onFocusChange(View view, boolean z) {
                BaseActivity.this.lambda$addEditTextToVehicleMask$15$BaseActivity(this.f$1, this.f$2, view, z);
            }
        });
    }

    public /* synthetic */ void lambda$addEditTextToVehicleMask$15$BaseActivity(EditText editText, EditText editText2, View view, boolean z) {
        if (z) {
            this.keyboardVehicleMask.setEditText(editText);
            hideSoftKeyboard(this);
            this.keyboardVehicleMask.setVisibility(0);
            KeyboardVehicleMask keyboardVehicleMask2 = this.keyboardVehicleMask;
            keyboardVehicleMask2.onInputChanged(keyboardVehicleMask2.editText.getText().length());
            if (editText2 != null) {
                editText2.setVisibility(0);
                return;
            }
            return;
        }
        this.keyboardVehicleMask.setVisibility(8);
        if (editText2 != null) {
            editText2.setVisibility(8);
        }
    }

    public void removeEditTextFromVehicleMask(EditText editText) {
        this.editTextList.remove(editText);
        editText.clearFocus();
        editText.setCursorVisible(true);
        editText.setOnTouchListener((View.OnTouchListener) null);
        editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        editText.removeTextChangedListener(this.maskedTextChangedListener);
        this.keyboardVehicleMask.setVisibility(8);
    }

    public void setRegistrationStarted() {
        if (this.profileLocalRepository.getUser().getApartmentList().size() == 0 || (this.profileLocalRepository.getUser().getApartmentList().size() == 1 && this.profileLocalRepository.getUser().getApartmentList().get(0).getTitle().equals("Без адреса"))) {
            getSharedPreferences(getPackageName(), 0).edit().putBoolean("registration_finished", false).apply();
        }
    }

    public void setRegistrationFinished() {
        getSharedPreferences(getPackageName(), 0).edit().putBoolean("registration_finished", true).apply();
    }

    public boolean isRegistrationFinished() {
        return getSharedPreferences(getPackageName(), 0).getBoolean("registration_finished", true);
    }
}
