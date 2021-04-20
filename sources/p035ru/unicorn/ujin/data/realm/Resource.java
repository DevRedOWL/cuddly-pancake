package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.data.realm.Resource */
public class Resource<T> {
    @SerializedName("command")
    @Expose
    private String command;
    @SerializedName("data")
    private T data;
    @SerializedName("error")
    @Expose
    private Integer error;
    @SerializedName("error_code")
    @Expose
    private String errorCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("service")
    @Expose
    private ServiceData service;
    private Status status;

    /* renamed from: ru.unicorn.ujin.data.realm.Resource$Status */
    public enum Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    public Resource(T t, Status status2) {
        this.error = 0;
        this.message = "";
        this.data = t;
        this.status = status2;
    }

    public Resource(Integer num, String str, Status status2) {
        this.error = num;
        this.message = str;
        this.status = status2;
    }

    public Resource(Integer num, String str, Status status2, String str2) {
        this.error = num;
        this.message = str;
        this.status = status2;
        this.errorCode = str2;
    }

    public Resource(Status status2) {
        this.status = status2;
    }

    public static <T> Resource<T> success(Integer num, String str, T t) {
        if (num == null || num.intValue() == 0) {
            return new Resource<>(t, Status.SUCCESS);
        }
        if (str.isEmpty()) {
            str = "Произошла внутренняя ошибка. Попробуйте позднее.";
        }
        return new Resource<>(1, str, Status.ERROR);
    }

    public static <T> Resource<T> success(Integer num, String str, T t, String str2) {
        if (num == null || num.intValue() == 0) {
            return new Resource<>(t, Status.SUCCESS);
        }
        if (str.isEmpty()) {
            str = "Произошла внутренняя ошибка. Попробуйте позднее.";
        }
        return new Resource<>(1, str, Status.ERROR, str2);
    }

    public static <T> Resource<T> error(String str) {
        if (str != null && (str.contains("Unable to resolve host") || str.contains("ssl"))) {
            str = "Ошибка подключения.";
        } else if (str != null && str.contains("Not known method apartment")) {
            str = "Ошибка выполнения запроса.";
        } else if (str != null && str.contains("ust")) {
            str = "Ошибка";
        }
        return new Resource<>(1, str, Status.ERROR);
    }

    public static <T> Resource<T> loading() {
        return new Resource<>(Status.LOADING);
    }

    public String getCommand() {
        return this.command;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public Integer getError() {
        return this.error;
    }

    public void setError(Integer num) {
        this.error = num;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T t) {
        this.data = t;
    }

    public Status getStatus() {
        return this.status;
    }

    public ServiceData getService() {
        return this.service;
    }

    public void setService(ServiceData serviceData) {
        this.service = serviceData;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
