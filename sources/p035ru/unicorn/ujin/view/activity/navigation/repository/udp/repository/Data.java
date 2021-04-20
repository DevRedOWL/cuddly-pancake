package p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Data */
public class Data {
    @SerializedName("cs")
    @Expose

    /* renamed from: cs */
    private Integer f6735cs;
    @SerializedName("en-udp")
    @Expose
    private Integer enUdp;
    @SerializedName("error")
    @Expose
    private String error;
    @SerializedName("errorcod")
    @Expose
    private Integer errorcod;
    @SerializedName("hp")
    @Expose

    /* renamed from: hp */
    private Integer f6736hp;
    @SerializedName("ip")
    @Expose

    /* renamed from: ip */
    private String f6737ip;
    @SerializedName("ping-apiv2")
    @Expose
    private Integer pingApiv2;
    @SerializedName("ping-msrv")
    @Expose
    private Integer pingMsrv;
    @SerializedName("ping-rsrv")
    @Expose
    private Integer pingRsrv;
    @SerializedName("prtmain")
    @Expose
    private Integer prtmain;
    @SerializedName("prtrezerved")
    @Expose
    private Integer prtrezerved;
    @SerializedName("push1")
    @Expose
    private Integer push1;
    @SerializedName("push2")
    @Expose
    private Integer push2;
    @SerializedName("rele1")
    @Expose
    private Integer rele1;
    @SerializedName("rele1-inv")
    @Expose
    private Integer rele1Inv;
    @SerializedName("rele2")
    @Expose
    private Integer rele2;
    @SerializedName("rele2-inv")
    @Expose
    private Integer rele2Inv;
    @SerializedName("rssi")
    @Expose
    private Integer rssi;
    @SerializedName("send-now")
    @Expose
    private Boolean sendNow;
    @SerializedName("srvmain")
    @Expose
    private String srvmain;
    @SerializedName("srvrezerved")
    @Expose
    private String srvrezerved;
    @SerializedName("stat")
    @Expose
    private Integer stat;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("time-utc")
    @Expose
    private Integer timeUtc;
    @SerializedName("tm_rele1")
    @Expose
    private Integer tmRele1;
    @SerializedName("tm_rele2")
    @Expose
    private Integer tmRele2;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("uniq_id")
    @Expose
    private Integer uniqId;
    @SerializedName("ver")
    @Expose
    private String ver;

    public Integer getUniqId() {
        return this.uniqId;
    }

    public void setUniqId(Integer num) {
        this.uniqId = num;
    }

    public String getVer() {
        return this.ver;
    }

    public void setVer(String str) {
        this.ver = str;
    }

    public Integer getCs() {
        return this.f6735cs;
    }

    public void setCs(Integer num) {
        this.f6735cs = num;
    }

    public Integer getPush1() {
        return this.push1;
    }

    public void setPush1(Integer num) {
        this.push1 = num;
    }

    public Integer getTmRele1() {
        return this.tmRele1;
    }

    public void setTmRele1(Integer num) {
        this.tmRele1 = num;
    }

    public Integer getRele1() {
        return this.rele1;
    }

    public void setRele1(Integer num) {
        this.rele1 = num;
    }

    public Integer getRele1Inv() {
        return this.rele1Inv;
    }

    public void setRele1Inv(Integer num) {
        this.rele1Inv = num;
    }

    public Integer getPush2() {
        return this.push2;
    }

    public void setPush2(Integer num) {
        this.push2 = num;
    }

    public Integer getTmRele2() {
        return this.tmRele2;
    }

    public void setTmRele2(Integer num) {
        this.tmRele2 = num;
    }

    public Integer getRele2() {
        return this.rele2;
    }

    public void setRele2(Integer num) {
        this.rele2 = num;
    }

    public Integer getRele2Inv() {
        return this.rele2Inv;
    }

    public void setRele2Inv(Integer num) {
        this.rele2Inv = num;
    }

    public Boolean getSendNow() {
        return this.sendNow;
    }

    public void setSendNow(Boolean bool) {
        this.sendNow = bool;
    }

    public Integer getEnUdp() {
        return this.enUdp;
    }

    public void setEnUdp(Integer num) {
        this.enUdp = num;
    }

    public Integer getPingApiv2() {
        return this.pingApiv2;
    }

    public void setPingApiv2(Integer num) {
        this.pingApiv2 = num;
    }

    public Integer getPingMsrv() {
        return this.pingMsrv;
    }

    public void setPingMsrv(Integer num) {
        this.pingMsrv = num;
    }

    public Integer getPingRsrv() {
        return this.pingRsrv;
    }

    public void setPingRsrv(Integer num) {
        this.pingRsrv = num;
    }

    public String getSrvrezerved() {
        return this.srvrezerved;
    }

    public void setSrvrezerved(String str) {
        this.srvrezerved = str;
    }

    public Integer getPrtrezerved() {
        return this.prtrezerved;
    }

    public void setPrtrezerved(Integer num) {
        this.prtrezerved = num;
    }

    public String getSrvmain() {
        return this.srvmain;
    }

    public void setSrvmain(String str) {
        this.srvmain = str;
    }

    public Integer getPrtmain() {
        return this.prtmain;
    }

    public void setPrtmain(Integer num) {
        this.prtmain = num;
    }

    public Integer getTime() {
        return this.time;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public Integer getTimeUtc() {
        return this.timeUtc;
    }

    public void setTimeUtc(Integer num) {
        this.timeUtc = num;
    }

    public Integer getStat() {
        return this.stat;
    }

    public void setStat(Integer num) {
        this.stat = num;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public Integer getRssi() {
        return this.rssi;
    }

    public void setRssi(Integer num) {
        this.rssi = num;
    }

    public Integer getHp() {
        return this.f6736hp;
    }

    public void setHp(Integer num) {
        this.f6736hp = num;
    }

    public String getError() {
        return this.error;
    }

    public void setError(String str) {
        this.error = str;
    }

    public Integer getErrorcod() {
        return this.errorcod;
    }

    public void setErrorcod(Integer num) {
        this.errorcod = num;
    }

    public String getIp() {
        return this.f6737ip;
    }

    public String toString() {
        return "Data{uniqId=" + this.uniqId + ", ver='" + this.ver + '\'' + ", cs=" + this.f6735cs + ", push1=" + this.push1 + ", tmRele1=" + this.tmRele1 + ", rele1=" + this.rele1 + ", rele1Inv=" + this.rele1Inv + ", push2=" + this.push2 + ", tmRele2=" + this.tmRele2 + ", rele2=" + this.rele2 + ", rele2Inv=" + this.rele2Inv + ", sendNow=" + this.sendNow + ", enUdp=" + this.enUdp + ", pingApiv2=" + this.pingApiv2 + ", pingMsrv=" + this.pingMsrv + ", pingRsrv=" + this.pingRsrv + ", srvrezerved='" + this.srvrezerved + '\'' + ", prtrezerved=" + this.prtrezerved + ", srvmain='" + this.srvmain + '\'' + ", prtmain=" + this.prtmain + ", time=" + this.time + ", timeUtc=" + this.timeUtc + ", stat=" + this.stat + ", token='" + this.token + '\'' + ", rssi=" + this.rssi + ", hp=" + this.f6736hp + ", error='" + this.error + '\'' + ", errorcod=" + this.errorcod + '}';
    }
}
