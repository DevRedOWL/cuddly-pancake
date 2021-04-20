package p035ru.unicorn.ujin.view.fragments.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import p035ru.unicorn.ujin.data.realm.profile.User;

@Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileFragment$initProfileValues$1 */
/* compiled from: ProfileFragment.kt */
final /* synthetic */ class ProfileFragment$initProfileValues$1 extends MutablePropertyReference0Impl {
    ProfileFragment$initProfileValues$1(ProfileFragment profileFragment) {
        super(profileFragment, ProfileFragment.class, "user", "getUser()Lru/unicorn/ujin/data/realm/profile/User;", 0);
    }

    public Object get() {
        return ProfileFragment.access$getUser$p((ProfileFragment) this.receiver);
    }

    public void set(Object obj) {
        ((ProfileFragment) this.receiver).user = (User) obj;
    }
}
