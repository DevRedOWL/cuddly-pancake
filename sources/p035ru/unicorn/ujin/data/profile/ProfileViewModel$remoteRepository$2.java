package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/profile/repository/ProfileRemoteRepository;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$remoteRepository$2 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$remoteRepository$2 extends Lambda implements Function0<ProfileRemoteRepository> {
    public static final ProfileViewModel$remoteRepository$2 INSTANCE = new ProfileViewModel$remoteRepository$2();

    ProfileViewModel$remoteRepository$2() {
        super(0);
    }

    public final ProfileRemoteRepository invoke() {
        return new ProfileRemoteRepository();
    }
}
