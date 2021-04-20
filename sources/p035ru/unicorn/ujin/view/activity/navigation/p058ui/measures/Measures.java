package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.Measures */
public class Measures {
    @SerializedName("dashboard")
    @Expose
    private String dashboard;
    @SerializedName("graph")
    @Expose
    private List<Graph> graph = null;
    @SerializedName("legend")
    @Expose
    private List<List<Legend>> legend = null;
    @SerializedName("lines")
    @Expose
    private Lines lines;

    public Lines getLines() {
        return this.lines;
    }

    public void setLines(Lines lines2) {
        this.lines = lines2;
    }

    public List<Graph> getGraph() {
        return this.graph;
    }

    public void setGraph(List<Graph> list) {
        this.graph = list;
    }

    public List<List<Legend>> getLegend() {
        return this.legend;
    }

    public void setLegend(List<List<Legend>> list) {
        this.legend = list;
    }

    public String getDashboard() {
        return this.dashboard;
    }

    public void setDashboard(String str) {
        this.dashboard = str;
    }
}
