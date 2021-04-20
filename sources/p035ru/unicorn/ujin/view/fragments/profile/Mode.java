package p035ru.unicorn.ujin.view.fragments.profile;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profile/Mode;", "", "Ljava/io/Serializable;", "modeString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "FROM_PROFILE", "FROM_LOGIN", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.Mode */
/* compiled from: Mode.kt */
public enum Mode implements Serializable {
    FROM_PROFILE("profile"),
    FROM_LOGIN(FirebaseAnalytics.Event.LOGIN);

    private Mode(String str) {
    }
}
