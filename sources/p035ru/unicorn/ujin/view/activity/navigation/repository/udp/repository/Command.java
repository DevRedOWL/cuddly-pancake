package p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository;

import com.google.gson.annotations.SerializedName;
import java.util.Random;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Command */
public class Command {
    @SerializedName("id")

    /* renamed from: id */
    private Long f6734id;
    @SerializedName("token")
    private String token;
    @SerializedName("uniq_id")
    private Integer uniqId = 1231235;

    public Command(Integer num, Long l, String str) {
        this.token = str;
        this.f6734id = l;
        this.uniqId = getNext();
    }

    private Integer getNext() {
        return Integer.valueOf(new Random().nextInt(19901) + 100);
    }

    public Long getId() {
        return this.f6734id;
    }

    public Integer getUniqId() {
        return this.uniqId;
    }

    public String getToken() {
        return this.token;
    }
}
