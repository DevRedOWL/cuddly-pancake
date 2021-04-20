package p035ru.unicorn.ujin.view.activity.navigation.entity;

import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel */
public class KolyaSuccesModel {
    @SerializedName("is_success")
    private boolean isSuccess;

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }
}
