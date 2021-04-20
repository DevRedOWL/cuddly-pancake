package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.annotations.Ignore;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.Graph */
public class Graph implements Diffable<Graph> {
    @SerializedName("autosum")
    @Expose
    private Integer autosum;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("dimension")
    @Expose
    private String dimension;
    @SerializedName("lines")
    @Expose
    private List<Line> lines = null;
    @Ignore
    private String sum;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("xkey")
    @Expose
    private String xkey;
    @SerializedName("ykeys")
    @Expose
    private List<String> ykeys = null;

    public boolean areContentsTheSame(Graph graph) {
        return false;
    }

    public boolean areItemsTheSame(Graph graph) {
        return false;
    }

    public String getSum() {
        return this.sum;
    }

    public void setSum(String str) {
        this.sum = str;
    }

    public List<Line> getLines() {
        return this.lines;
    }

    public void setLines(List<Line> list) {
        this.lines = list;
    }

    public List<Datum> getData() {
        return this.data;
    }

    public void setData(List<Datum> list) {
        this.data = list;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getDimension() {
        return this.dimension;
    }

    public void setDimension(String str) {
        this.dimension = str;
    }

    public List<String> getYkeys() {
        return this.ykeys;
    }

    public void setYkeys(List<String> list) {
        this.ykeys = list;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public String getXkey() {
        return this.xkey;
    }

    public void setXkey(String str) {
        this.xkey = str;
    }

    public Integer getAutosum() {
        return this.autosum;
    }

    public void setAutosum(Integer num) {
        this.autosum = num;
    }
}
