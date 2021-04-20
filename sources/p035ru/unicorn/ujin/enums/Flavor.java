package p035ru.unicorn.ujin.enums;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.util.Flavors;
import p035ru.unicorn.ujin.view.activity.domru.RegisterDomruActivity;
import p035ru.unicorn.ujin.view.activity.pass.PassRegistrationActivity;
import p035ru.unicorn.ujin.view.activity.sapfir.SapfirRegistrationActivity;
import p035ru.unicorn.ujin.view.activity.tutorial.BaseTutorialActivity;
import p035ru.unicorn.ujin.view.activity.tutorial.sapfir.SapfirTutorialActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b4\b\u0001\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001KB\u0002\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0007¢\u0006\u0002\u0010!J\u0006\u00102\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010)\"\u0004\b+\u0010,R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0011\u0010 \u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010)R\u0011\u0010\u001a\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010)R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010)R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010)R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010)R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010)R\u0011\u0010\u001b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010)R\u0011\u0010\u001f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010)R\u0011\u0010\u001e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010)R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010)R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010)R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010)R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010)R\u0011\u0010\u0019\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010)R\u0011\u0010\u001d\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010)R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010)\"\u0004\b/\u0010,R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0019\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJ¨\u0006L"}, mo51343d2 = {"Lru/unicorn/ujin/enums/Flavor;", "", "appName", "", "builderInfoDynamicFormId", "", "isWithVideoPreview", "", "hasAppShortcut", "hasBeaconsSupport", "hasAdditionalTutorial", "isBottomNavigationVisible", "isBottomNavigationLabelsVisible", "isBottomHotkeysVisible", "isStage1Enabled", "isStage2Enabled", "isStage3Enabled", "isRegistrationEnabled", "authActivity", "Ljava/lang/Class;", "", "isDemoButtonEnabled", "stage3DefaultScreen", "tutorialActivity", "Lru/unicorn/ujin/view/activity/tutorial/BaseTutorialActivity;", "isTermsButtonVisible", "isBottomNavigationIconsGlowing", "isHasImageLogo", "isCommerceAvailable", "isUkAddingAvailable", "isJustSmartFlatAvailable", "isHasTutorialSupportMessage", "hasDynamicBottomNavigationViewSupport", "(Ljava/lang/String;ILjava/lang/String;IZZZZZZZZZZZLjava/lang/Class;ZLjava/lang/String;Ljava/lang/Class;ZZZZZZZZ)V", "getAppName", "()Ljava/lang/String;", "getAuthActivity", "()Ljava/lang/Class;", "getBuilderInfoDynamicFormId", "()I", "getHasAdditionalTutorial", "()Z", "getHasAppShortcut", "setHasAppShortcut", "(Z)V", "getHasBeaconsSupport", "getHasDynamicBottomNavigationViewSupport", "setWithVideoPreview", "getStage3DefaultScreen", "getTutorialActivity", "isBackButtonInRegistrationActivityVisible", "KORTROS", "PAN", "NEWCITY", "DADEVELOPMENT", "PIONEER", "SMARTDOMRU", "LAKEWOOD", "GUARANTEE", "VOZNESENSKIY", "ROZMARIN", "SAPFIR", "UJIN", "MORIONDIGITAL", "MYSMARTFLAT", "ORDYNKA", "LEVENCOVKA", "OSNOVA", "HEIDI", "ATLAS", "SHADYDELUX", "PASS", "NORTHMIZA", "NOVACITY", "SKAT", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.enums.Flavor */
/* compiled from: Flavor.kt */
public enum Flavor {
    KORTROS("kortros", 1, false, false, false, false, false, true, false, true, true, false, true, (boolean) null, false, (Class) null, (boolean) null, false, false, false, false, true, true, false, false, 18868604, (boolean) null),
    PAN(Flavors.PAN, 2, false, false, false, false, false, true, false, true, false, false, false, (boolean) null, false, ReactConst.SECURITYTAB, (boolean) null, false, false, false, false, false, false, false, false, 25132412, (boolean) null),
    NEWCITY(Flavors.NEWCITY, 4, true, false, false, false, false, true, false, true, true, false, true, (boolean) null, false, r2, (boolean) null, false, false, false, false, true, false, false, false, 23030136, (boolean) null),
    DADEVELOPMENT(Flavors.DADEVELOPMENT, 6, false, false, false, false, false, false, false, true, true, false, true, (boolean) null, false, r2, (boolean) null, false, false, false, false, false, false, false, false, 33516028, (boolean) null),
    PIONEER(Flavors.PIONEER, 0, false, false, false, false, false, true, false, false, false, false, false, (boolean) null, false, (Class) null, (boolean) null, false, false, false, false, false, false, false, false, 25165692, (boolean) null),
    SMARTDOMRU(Flavors.SMARTDOMRU, 0, false, false, false, false, false, true, false, false, false, false, false, RegisterDomruActivity.class, false, (Class) null, (boolean) null, false, false, false, false, false, false, false, false, 24502140, (boolean) null),
    LAKEWOOD(Flavors.LAKEWOOD, 0, false, false, false, false, false, false, false, false, false, false, false, (boolean) null, false, ReactConst.SECURITYTAB, (boolean) null, false, false, false, false, false, false, false, false, 25132796, (boolean) null),
    GUARANTEE(Flavors.GUARANTEE, 0, false, false, false, false, false, true, false, false, false, false, false, (boolean) null, false, ReactConst.SECURITYTAB, (boolean) null, false, false, false, false, false, false, false, false, 25132924, (boolean) null),
    VOZNESENSKIY(Flavors.VOZNESENSKIY, 0, false, false, false, false, false, true, false, false, false, false, false, (boolean) null, false, (Class) null, (boolean) null, false, false, false, false, false, false, false, false, 25165692, (boolean) null),
    ROZMARIN(Flavors.ROZMARIN, 0, false, false, false, false, false, true, false, false, false, false, false, (boolean) null, false, (Class) null, (boolean) null, false, false, false, false, false, false, false, false, 25165692, (boolean) null),
    SAPFIR(Flavors.SAPFIR, 0, false, false, false, false, false, false, false, false, false, false, false, SapfirRegistrationActivity.class, false, (Class) null, SapfirTutorialActivity.class, false, false, false, false, false, false, false, false, 24960700, (boolean) null),
    UJIN(Flavors.UJIN, 0, false, true, true, true, false, false, false, false, false, false, true, (boolean) null, true, (Class) null, (boolean) null, false, false, false, true, true, true, true, true, 1027972, (boolean) null),
    MORIONDIGITAL(Flavors.MORIONDIGITAL, 0, false, false, true, false, false, true, false, false, false, false, true, (boolean) null, false, ReactConst.CABINET, (boolean) null, false, false, false, false, false, false, false, false, 24997484, (boolean) null),
    MYSMARTFLAT(Flavors.MYSMARTFLATRN, 0, false, false, false, false, false, true, false, false, false, false, false, (boolean) null, true, (Class) null, (boolean) null, false, false, false, false, false, false, false, false, 25149308, (boolean) null),
    ORDYNKA(Flavors.ORDYNKA, 0, false, false, false, false, false, true, false, false, false, false, false, (boolean) null, false, (Class) null, (boolean) null, false, false, false, false, false, false, false, false, 25165692, (boolean) null),
    LEVENCOVKA(Flavors.LEVENCOVKA, 0, false, false, false, false, false, true, false, false, false, false, false, (boolean) null, true, (Class) null, (boolean) null, false, false, false, false, false, false, false, false, 33537916, (boolean) null),
    OSNOVA(Flavors.OSNOVA, 0, true, true, false, false, false, true, false, false, false, false, false, (boolean) null, true, r2, (boolean) null, false, false, false, false, false, false, false, false, 25116528, (boolean) null),
    HEIDI(Flavors.HEIDI, 0, false, false, false, false, false, true, false, false, false, false, false, (boolean) null, true, (Class) null, (boolean) null, false, false, false, false, false, false, false, false, 33537916, (boolean) null),
    ATLAS("atlas", 0, false, false, false, false, false, false, false, false, false, false, false, (boolean) null, true, (Class) null, (boolean) null, false, false, false, false, false, false, false, false, 33538044, (boolean) null),
    SHADYDELUX("shadyDelux", 0, false, false, false, false, false, false, false, false, false, false, false, (boolean) null, false, ReactConst.SECURITYTAB, (boolean) null, false, false, false, false, false, false, false, false, 33521660, (boolean) null),
    PASS(Flavors.PASS, 0, false, false, false, false, false, false, false, false, false, false, true, PassRegistrationActivity.class, false, ReactConst.CABINET, (boolean) null, false, true, false, false, false, false, false, false, 24203004, (boolean) null),
    NORTHMIZA("northMiza", 0, false, false, false, false, false, true, false, false, false, false, false, (boolean) null, true, (Class) null, (boolean) null, false, false, false, false, false, false, false, false, 33537916, (boolean) null),
    NOVACITY("novaCity", 0, false, false, false, false, false, true, false, false, false, false, false, (boolean) null, true, ReactConst.SECURITYTAB, (boolean) null, false, false, false, false, false, false, false, false, 33505148, (boolean) null),
    SKAT("skat", 0, false, false, false, false, false, true, false, false, false, false, true, (boolean) null, true, ReactConst.SECURITYTAB, (boolean) null, false, false, false, false, true, false, false, false, 31403900, (boolean) null);
    
    public static final Companion Companion = null;
    private final String appName;
    private final Class<? extends Object> authActivity;
    private final int builderInfoDynamicFormId;
    private final boolean hasAdditionalTutorial;
    private boolean hasAppShortcut;
    private final boolean hasBeaconsSupport;
    private final boolean hasDynamicBottomNavigationViewSupport;
    private final boolean isBottomHotkeysVisible;
    private final boolean isBottomNavigationIconsGlowing;
    private final boolean isBottomNavigationLabelsVisible;
    private final boolean isBottomNavigationVisible;
    private final boolean isCommerceAvailable;
    private final boolean isDemoButtonEnabled;
    private final boolean isHasImageLogo;
    private final boolean isHasTutorialSupportMessage;
    private final boolean isJustSmartFlatAvailable;
    private final boolean isRegistrationEnabled;
    private final boolean isStage1Enabled;
    private final boolean isStage2Enabled;
    private final boolean isStage3Enabled;
    private final boolean isTermsButtonVisible;
    private final boolean isUkAddingAvailable;
    private boolean isWithVideoPreview;
    private final String stage3DefaultScreen;
    private final Class<? extends BaseTutorialActivity> tutorialActivity;

    @JvmStatic
    public static final Flavor current() {
        return Companion.current();
    }

    @JvmStatic
    public static final Flavor getByFlavor(String str) {
        return Companion.getByFlavor(str);
    }

    @JvmStatic
    public static final boolean isCurrent(Flavor flavor) {
        return Companion.isCurrent(flavor);
    }

    private Flavor(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, Class<? extends Object> cls, boolean z12, String str2, Class<? extends BaseTutorialActivity> cls2, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20) {
        this.appName = str;
        this.builderInfoDynamicFormId = i;
        this.isWithVideoPreview = z;
        this.hasAppShortcut = z2;
        this.hasBeaconsSupport = z3;
        this.hasAdditionalTutorial = z4;
        this.isBottomNavigationVisible = z5;
        this.isBottomNavigationLabelsVisible = z6;
        this.isBottomHotkeysVisible = z7;
        this.isStage1Enabled = z8;
        this.isStage2Enabled = z9;
        this.isStage3Enabled = z10;
        this.isRegistrationEnabled = z11;
        this.authActivity = cls;
        this.isDemoButtonEnabled = z12;
        this.stage3DefaultScreen = str2;
        this.tutorialActivity = cls2;
        this.isTermsButtonVisible = z13;
        this.isBottomNavigationIconsGlowing = z14;
        this.isHasImageLogo = z15;
        this.isCommerceAvailable = z16;
        this.isUkAddingAvailable = z17;
        this.isJustSmartFlatAvailable = z18;
        this.isHasTutorialSupportMessage = z19;
        this.hasDynamicBottomNavigationViewSupport = z20;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final int getBuilderInfoDynamicFormId() {
        return this.builderInfoDynamicFormId;
    }

    public final boolean isWithVideoPreview() {
        return this.isWithVideoPreview;
    }

    public final void setWithVideoPreview(boolean z) {
        this.isWithVideoPreview = z;
    }

    public final boolean getHasAppShortcut() {
        return this.hasAppShortcut;
    }

    public final void setHasAppShortcut(boolean z) {
        this.hasAppShortcut = z;
    }

    public final boolean getHasBeaconsSupport() {
        return this.hasBeaconsSupport;
    }

    public final boolean getHasAdditionalTutorial() {
        return this.hasAdditionalTutorial;
    }

    public final boolean isBottomNavigationVisible() {
        return this.isBottomNavigationVisible;
    }

    public final boolean isBottomNavigationLabelsVisible() {
        return this.isBottomNavigationLabelsVisible;
    }

    public final boolean isBottomHotkeysVisible() {
        return this.isBottomHotkeysVisible;
    }

    public final boolean isStage1Enabled() {
        return this.isStage1Enabled;
    }

    public final boolean isStage2Enabled() {
        return this.isStage2Enabled;
    }

    public final boolean isStage3Enabled() {
        return this.isStage3Enabled;
    }

    public final boolean isRegistrationEnabled() {
        return this.isRegistrationEnabled;
    }

    public final Class<? extends Object> getAuthActivity() {
        return this.authActivity;
    }

    public final boolean isDemoButtonEnabled() {
        return this.isDemoButtonEnabled;
    }

    public final String getStage3DefaultScreen() {
        return this.stage3DefaultScreen;
    }

    public final Class<? extends BaseTutorialActivity> getTutorialActivity() {
        return this.tutorialActivity;
    }

    public final boolean isTermsButtonVisible() {
        return this.isTermsButtonVisible;
    }

    public final boolean isBottomNavigationIconsGlowing() {
        return this.isBottomNavigationIconsGlowing;
    }

    public final boolean isHasImageLogo() {
        return this.isHasImageLogo;
    }

    public final boolean isCommerceAvailable() {
        return this.isCommerceAvailable;
    }

    public final boolean isUkAddingAvailable() {
        return this.isUkAddingAvailable;
    }

    public final boolean isJustSmartFlatAvailable() {
        return this.isJustSmartFlatAvailable;
    }

    public final boolean isHasTutorialSupportMessage() {
        return this.isHasTutorialSupportMessage;
    }

    public final boolean getHasDynamicBottomNavigationViewSupport() {
        return this.hasDynamicBottomNavigationViewSupport;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/enums/Flavor$Companion;", "", "()V", "current", "Lru/unicorn/ujin/enums/Flavor;", "getByFlavor", "flavor", "", "isCurrent", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.enums.Flavor$Companion */
    /* compiled from: Flavor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Flavor getByFlavor(String str) {
            Intrinsics.checkNotNullParameter(str, "flavor");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return Flavor.valueOf(upperCase);
        }

        @JvmStatic
        public final Flavor current() {
            String upperCase = "kortros".toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return Flavor.valueOf(upperCase);
        }

        @JvmStatic
        public final boolean isCurrent(Flavor flavor) {
            Intrinsics.checkNotNullParameter(flavor, "flavor");
            return Intrinsics.areEqual((Object) flavor.getAppName(), (Object) "kortros");
        }
    }

    public final boolean isBackButtonInRegistrationActivityVisible() {
        return this.isStage1Enabled;
    }
}
