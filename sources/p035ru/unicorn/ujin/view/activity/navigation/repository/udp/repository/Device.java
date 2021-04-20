package p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4677x99a5428f;
import p046io.realm.RealmObject;
import p046io.realm.annotations.Ignore;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device */
public class Device extends RealmObject implements C4677x99a5428f {
    @SerializedName("id")
    @PrimaryKey
    @Expose

    /* renamed from: id */
    private Long f6738id;
    private String ipAdress;
    private String name;
    @Ignore
    private SomeData someData;
    private int status;
    private String token;
    private int value;

    public Long realmGet$id() {
        return this.f6738id;
    }

    public String realmGet$ipAdress() {
        return this.ipAdress;
    }

    public String realmGet$name() {
        return this.name;
    }

    public int realmGet$status() {
        return this.status;
    }

    public String realmGet$token() {
        return this.token;
    }

    public int realmGet$value() {
        return this.value;
    }

    public void realmSet$id(Long l) {
        this.f6738id = l;
    }

    public void realmSet$ipAdress(String str) {
        this.ipAdress = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$status(int i) {
        this.status = i;
    }

    public void realmSet$token(String str) {
        this.token = str;
    }

    public void realmSet$value(int i) {
        this.value = i;
    }

    public Device(SomeData someData2, String str) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(someData2.getData().getId());
        realmSet$ipAdress(str);
        realmSet$name(someData2.getData().getDevName());
        realmSet$token(someData2.getData().getData().getToken());
        this.someData = someData2;
    }

    public Device() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Long getId() {
        return realmGet$id();
    }

    public void setId(Long l) {
        realmSet$id(l);
    }

    public String getIpAdress() {
        return realmGet$ipAdress();
    }

    public void setIpAdress(String str) {
        realmSet$ipAdress(str);
    }

    public String getName() {
        return realmGet$name();
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        if (getId().equals(device.getId()) && getIpAdress().equals(device.getIpAdress())) {
            return getName().equals(device.getName());
        }
        return false;
    }

    public int hashCode() {
        return (((getId().hashCode() * 31) + getIpAdress().hashCode()) * 31) + getName().hashCode();
    }

    public String getToken() {
        return realmGet$token();
    }

    public void setToken(String str) {
        realmSet$token(str);
    }

    public SomeData getSomeData() {
        return this.someData;
    }

    public void setSomeData(SomeData someData2) {
        this.someData = someData2;
    }

    public int getValue() {
        return realmGet$value();
    }

    public void setValue(int i) {
        realmSet$value(i);
    }

    public int getStatus() {
        return realmGet$status();
    }

    public void setStatus(int i) {
        realmSet$status(i);
    }

    public String toString() {
        return "Device{id=" + realmGet$id() + ", ipAdress='" + realmGet$ipAdress() + '\'' + ", name='" + realmGet$name() + '\'' + ", token='" + realmGet$token() + '\'' + ", value=" + realmGet$value() + ", status=" + realmGet$status() + ", someData=" + this.someData.toString() + '}';
    }
}
