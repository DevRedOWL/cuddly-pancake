package p035ru.unicorn.ujin.data;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/data/NoInternetException;", "Ljava/io/IOException;", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.NoInternetException */
/* compiled from: NoConnectionInterceptor.kt */
public final class NoInternetException extends IOException {
    public String getMessage() {
        return "Нет доступа в Интернет, проверьте подключенный WIFi или соединение для передачи данных";
    }
}
