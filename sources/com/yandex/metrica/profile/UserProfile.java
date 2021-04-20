package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p039ob.C3876rf;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UserProfile {

    /* renamed from: a */
    private final List<UserProfileUpdate<? extends C3876rf>> f5395a;

    private UserProfile(List<UserProfileUpdate<? extends C3876rf>> list) {
        this.f5395a = Collections.unmodifiableList(list);
    }

    public List<UserProfileUpdate<? extends C3876rf>> getUserProfileUpdates() {
        return this.f5395a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        /* renamed from: a */
        private final LinkedList<UserProfileUpdate<? extends C3876rf>> f5396a = new LinkedList<>();

        Builder() {
        }

        public Builder apply(UserProfileUpdate<? extends C3876rf> userProfileUpdate) {
            this.f5396a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f5396a);
        }
    }
}
