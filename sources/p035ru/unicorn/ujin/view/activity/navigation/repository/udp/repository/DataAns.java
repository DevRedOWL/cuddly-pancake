package p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.DataAns */
public class DataAns {
    @SerializedName("answer")
    @Expose
    private List<Answer> answer = null;

    public List<Answer> getAnswer() {
        return this.answer;
    }

    public void setAnswer(List<Answer> list) {
        this.answer = list;
    }
}
