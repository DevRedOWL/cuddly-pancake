package p035ru.unicorn.ujin.view.activity.navigation.entity.hardware;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.hardware.Type */
public class Type {
    @SerializedName("hardware_type_name")
    @Expose
    private String hardwareTypeName;
    @SerializedName("type_id")
    @Expose
    private Integer typeId;

    public Integer getTypeId() {
        return this.typeId;
    }

    public void setTypeId(Integer num) {
        this.typeId = num;
    }

    public String getHardwareTypeName() {
        return this.hardwareTypeName;
    }

    public void setHardwareTypeName(String str) {
        this.hardwareTypeName = str;
    }
}
