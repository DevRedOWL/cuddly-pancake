package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/ProfileEditFieldLabel;", "", "label", "", "(Ljava/lang/String;II)V", "getLabel", "()I", "SURNAME", "NAME", "PATRONYMIC", "GENDER", "BIRTHDAY", "EMAIL", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileEditFieldLabel */
/* compiled from: ProfileEditFieldLabel.kt */
public enum ProfileEditFieldLabel {
    SURNAME(R.string.profileSurname),
    NAME(R.string.profileName),
    PATRONYMIC(R.string.profilePatronymic),
    GENDER(R.string.label_gender),
    BIRTHDAY(R.string.label_birthday),
    EMAIL(R.string.email);
    
    public static final Companion Companion = null;
    private final int label;

    private ProfileEditFieldLabel(int i) {
        this.label = i;
    }

    public final int getLabel() {
        return this.label;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/ProfileEditFieldLabel$Companion;", "", "()V", "contains", "", "name", "", "getLabel", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileEditFieldLabel$Companion */
    /* compiled from: ProfileEditFieldLabel.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getLabel(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            return ProfileEditFieldLabel.valueOf(upperCase).getLabel();
        }

        public final boolean contains(String str) {
            Intrinsics.checkNotNullParameter(str, "name");
            for (ProfileEditFieldLabel name : ProfileEditFieldLabel.values()) {
                String name2 = name.name();
                String upperCase = str.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
                if (Intrinsics.areEqual((Object) name2, (Object) upperCase)) {
                    return true;
                }
            }
            return false;
        }
    }
}
