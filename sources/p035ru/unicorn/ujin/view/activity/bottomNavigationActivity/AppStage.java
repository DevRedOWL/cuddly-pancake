package p035ru.unicorn.ujin.view.activity.bottomNavigationActivity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/bottomNavigationActivity/AppStage;", "", "stageNum", "", "bottomNavigationId", "tutorialId", "(Ljava/lang/String;IIII)V", "getBottomNavigationId", "()I", "getStageNum", "getTutorialId", "NEW_FLAT", "COMPLEX_CONSTRUCTION", "SMARTFLAT", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage */
/* compiled from: AppStage.kt */
public enum AppStage {
    NEW_FLAT(1, R.menu.navigation, R.array.tutorial_1),
    COMPLEX_CONSTRUCTION(2, R.menu.navigation_two, R.array.tutorial_2),
    SMARTFLAT(3, R.menu.navigation_three, R.array.tutorial_3);
    
    public static final Companion Companion = null;
    private final int bottomNavigationId;
    private final int stageNum;
    private final int tutorialId;

    @JvmStatic
    public static final AppStage getByNumber(int i) {
        return Companion.getByNumber(i);
    }

    private AppStage(int i, int i2, int i3) {
        this.stageNum = i;
        this.bottomNavigationId = i2;
        this.tutorialId = i3;
    }

    public final int getBottomNavigationId() {
        return this.bottomNavigationId;
    }

    public final int getStageNum() {
        return this.stageNum;
    }

    public final int getTutorialId() {
        return this.tutorialId;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/bottomNavigationActivity/AppStage$Companion;", "", "()V", "getByNumber", "Lru/unicorn/ujin/view/activity/bottomNavigationActivity/AppStage;", "stageNum", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage$Companion */
    /* compiled from: AppStage.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AppStage getByNumber(int i) {
            AppStage appStage;
            AppStage[] values = AppStage.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    appStage = null;
                    break;
                }
                appStage = values[i2];
                if (appStage.getStageNum() == i) {
                    break;
                }
                i2++;
            }
            return appStage != null ? appStage : AppStage.SMARTFLAT;
        }
    }
}
