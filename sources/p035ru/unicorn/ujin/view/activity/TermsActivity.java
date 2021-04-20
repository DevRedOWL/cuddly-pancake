package p035ru.unicorn.ujin.view.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.data.service.FCM;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.util.Flavors;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.util.LinphoneHelper;
import p035ru.unicorn.ujin.view.activity.TermsActivity;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity;
import p035ru.unicorn.ujin.view.activity.tutorial.BaseTutorialActivity;

/* renamed from: ru.unicorn.ujin.view.activity.TermsActivity */
public class TermsActivity extends BaseActivity {
    private static final String FIRST_LAUNCH = "firstLaunch";
    private static final String FIRST_LAUNCH_UPDATE = "firstLaunchUpdate";
    private static final long LAUNCH_TIME_OUT = 1500;
    public static final int LOGREG = 10012;
    public static final String MYSMARTFLATRN_REG_REQ = "MSFregRes";
    private static final String PROFILE_TRANSFERED = "profileTransfer";
    private static final String WATCH_TUTORIAL = "watchTutorial";
    private ImageView ivLogo;
    private ImageView ivSplashBackground;
    SharedPreferences sharedPreferences;
    private boolean tutorialRunning = false;
    private TextView tvTerms;

    /* access modifiers changed from: protected */
    public int getBottomNavigationMenuId() {
        return 0;
    }

    public boolean hasBottomSheet() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void showChatsFragment() {
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, TermsActivity.class));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_terms);
        if (Build.VERSION.SDK_INT >= 23 && (this.flavor.name().equals(Flavors.SMARTDOMRU) || this.flavor.name().equals(Flavors.MORIONDIGITAL) || this.flavor.name().equals(Flavors.UJIN))) {
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
        this.sharedPreferences = getSharedPreferences(getString(R.string.app_name_app), 0);
        this.tvTerms = (TextView) findViewById(R.id.tvTerms);
        makeLink(this.tvTerms, getResources().getString(R.string.termsOfUseLinkText), new View.OnClickListener() {
            public final void onClick(View view) {
                TermsActivity.this.lambda$onCreate$0$TermsActivity(view);
            }
        });
        makeLink(this.tvTerms, getResources().getString(R.string.serviceRulesLinkText), new View.OnClickListener() {
            public final void onClick(View view) {
                TermsActivity.this.lambda$onCreate$1$TermsActivity(view);
            }
        });
        if (this.flavor.isTermsButtonVisible()) {
            setTermsVisibility();
        }
        findViewById(R.id.buttonBegin).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                TermsActivity.this.lambda$onCreate$2$TermsActivity(view);
            }
        });
        this.ivSplashBackground = (ImageView) findViewById(R.id.splashBackground);
        this.ivLogo = (ImageView) findViewById(R.id.imageView4);
        if (this.profileViewModel.getSplashscreen() == null) {
            this.ivSplashBackground.setVisibility(8);
            this.ivLogo.setVisibility(0);
        } else {
            this.ivLogo.setVisibility(8);
            this.ivSplashBackground.setVisibility(0);
            GlideApp.with((View) this.ivSplashBackground).load(this.profileViewModel.getSplashscreen().getBackgroundUrl()).diskCacheStrategy(DiskCacheStrategy.ALL).into(this.ivSplashBackground);
        }
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                TermsActivity.this.gotoMain();
            }
        }, LAUNCH_TIME_OUT);
    }

    public /* synthetic */ void lambda$onCreate$0$TermsActivity(View view) {
        showTerms();
    }

    public /* synthetic */ void lambda$onCreate$1$TermsActivity(View view) {
        showServiceRules();
    }

    public /* synthetic */ void lambda$onCreate$2$TermsActivity(View view) {
        buttonBeginClick();
    }

    private void setTermsVisibility() {
        if (!this.sharedPreferences.getBoolean(FIRST_LAUNCH, true)) {
            findViewById(R.id.buttonBegin).setVisibility(4);
            this.tvTerms.setVisibility(4);
        }
    }

    private void showTerms() {
        startActivity(new Intent(this, WebViewActivity.class).putExtra("url", getString(R.string.termsOfUseLink)));
    }

    private void showServiceRules() {
        startActivity(new Intent(this, WebViewActivity.class).putExtra("url", getString(R.string.serviceRulesLink)));
    }

    /* access modifiers changed from: private */
    public void gotoMain() {
        int i;
        this.sharedPreferences.edit().putBoolean("launchFromTerms", true).apply();
        if (this.sharedPreferences.getBoolean(FIRST_LAUNCH, true) && this.flavor.isTermsButtonVisible()) {
            return;
        }
        if (this.sharedPreferences.getBoolean(WATCH_TUTORIAL, false) || getResources().getIntArray(R.array.tutorial).length <= 0) {
            registerToken();
            Bundle bundle = new Bundle();
            Intent intent = getIntent();
            if (!(intent == null || intent.getExtras() == null)) {
                bundle = intent.getExtras();
                if (StringUtils.isNotEmpty(bundle.getString(FCM.APARTMENT_ID))) {
                    try {
                        i = Integer.valueOf(bundle.getString(FCM.APARTMENT_ID)).intValue();
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    if (i != -1) {
                        Iterator<Apartment> it = this.profileViewModel.getUserApartments().iterator();
                        while (it.hasNext()) {
                            Apartment next = it.next();
                            if (next.getId().intValue() == i) {
                                this.profileViewModel.applyFlat(next.getUserToken(), next.getStage().intValue());
                                this.profileViewModel.loadBuilding(next.getBuildingId());
                            }
                        }
                    }
                }
            }
            this.profileViewModel.appOpened();
            proceedToStages(bundle);
        } else if (!this.tutorialRunning) {
            this.tutorialRunning = true;
            Intent intent2 = new Intent(this, Flavor.current().getTutorialActivity());
            intent2.putExtra(BaseTutorialActivity.ARG_ARRAY_ID, R.array.tutorial);
            intent2.putExtra(BaseTutorialActivity.ARG_SHOW_LAST_STEP, true);
            startActivityForResult(intent2, BaseTutorialActivity.WATCH_TUTORIAL_REQUEST_CODE);
        }
    }

    private void proceedToStages(Bundle bundle) {
        User user = this.profileViewModel.getUser();
        String defaultBottomNavigationTab = this.profileLocalRepository.getDefaultBottomNavigationTab();
        if (user.getUserLoggenIn()) {
            if (!Flavor.current().isStage1Enabled() || !Flavor.current().isStage2Enabled()) {
                if (Flavor.current().isStage3Enabled()) {
                    startActivity(StageActivity.start(getApplicationContext(), AppStage.SMARTFLAT, defaultBottomNavigationTab, bundle, false));
                    finish();
                }
            } else if (user.getStage() == 1) {
                startStageOne();
            } else if (user.getStage() == 2) {
                startActivity(StageActivity.start(getApplicationContext(), AppStage.COMPLEX_CONSTRUCTION, bundle, false));
                finish();
            } else if (user.getStage() == 3) {
                startActivity(StageActivity.start(getApplicationContext(), AppStage.SMARTFLAT, defaultBottomNavigationTab, bundle, false));
                finish();
            } else {
                startActivity(StageActivity.start(getApplicationContext(), AppStage.NEW_FLAT, false));
                finish();
            }
        } else if (Flavor.current().isStage1Enabled()) {
            startStageOne(bundle);
        } else {
            startActivityForResult(new Intent(this, this.flavor.getAuthActivity()), LOGREG);
        }
    }

    private void checkVideoPermissionFirst() {
        Dexter.withActivity(this).withPermission("android.permission.CAMERA").withListener(new PermissionListener() {
            public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
                TermsActivity.this.gotoMain();
            }

            public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
                TermsActivity.this.gotoMain();
            }

            public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TermsActivity.this);
                builder.setMessage((CharSequence) TermsActivity.this.getResources().getString(R.string.cameraRationaleError)).setPositiveButton((CharSequence) TermsActivity.this.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PermissionToken.this.continuePermissionRequest();
                    }
                }).setNegativeButton((CharSequence) TermsActivity.this.getResources().getString(R.string.button_CANCEL), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        TermsActivity.C57821.lambda$onPermissionRationaleShouldBeShown$1(PermissionToken.this, dialogInterface, i);
                    }
                });
                builder.show().setCanceledOnTouchOutside(false);
            }

            static /* synthetic */ void lambda$onPermissionRationaleShouldBeShown$1(PermissionToken permissionToken, DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                permissionToken.cancelPermissionRequest();
            }
        }).check();
    }

    private void buttonBeginClick() {
        applyFirstLaunch();
        gotoMain();
    }

    private void applyFirstLaunch() {
        this.sharedPreferences.edit().putBoolean(FIRST_LAUNCH, false).apply();
    }

    private void applyWatchTutorial() {
        this.sharedPreferences.edit().putBoolean(WATCH_TUTORIAL, true).apply();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 555) {
            this.tutorialRunning = false;
            applyWatchTutorial();
            gotoMain();
        } else if (i == 10012) {
            gotoMain();
        }
    }

    /* access modifiers changed from: package-private */
    public void registerToken() {
        String userToken = this.profileLocalRepository.getUserToken();
        if (!userToken.equals("")) {
            LinphoneHelper.pushToken(this, userToken, true);
        }
    }

    private void makeLink(final TextView textView, String str, final View.OnClickListener onClickListener) {
        SpannableString spannableString = new SpannableString(textView.getText());
        C57832 r1 = new ClickableSpan() {
            public void onClick(View view) {
                Selection.setSelection((Spannable) textView.getText(), 0);
                textView.invalidate();
                onClickListener.onClick(textView);
            }

            public void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        };
        int indexOf = textView.getText().toString().indexOf(str);
        spannableString.setSpan(r1, indexOf, str.length() + indexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.textHypertextLink)), indexOf, str.length() + indexOf, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    private void underlineView(TextView textView, String str) {
        SpannableString spannableString = new SpannableString(textView.getText());
        int indexOf = textView.getText().toString().indexOf(str);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(getResources().getColor(R.color.textHypertextLink));
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.underlineThickness = 2.0f;
        }
        UnderlineSpan underlineSpan = new UnderlineSpan();
        underlineSpan.updateDrawState(textPaint);
        spannableString.setSpan(underlineSpan, indexOf, str.length() + indexOf, 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    private void removeUnderline(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        for (UnderlineSpan removeSpan : (UnderlineSpan[]) spannableString.getSpans(0, spannableString.length(), UnderlineSpan.class)) {
            spannableString.removeSpan(removeSpan);
        }
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }
}
