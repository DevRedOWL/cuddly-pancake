package p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.Props */
public class Props {
    private final String url;
    private final int valColor;
    private final int valVisability;

    private Props(Builder builder) {
        this.valColor = builder.color;
        this.url = builder.url;
        this.valVisability = builder.visability;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.ticket.Props$Builder */
    public static class Builder {
        /* access modifiers changed from: private */
        public int color;
        /* access modifiers changed from: private */
        public String url;
        /* access modifiers changed from: private */
        public int visability = 0;

        public Builder setColor(int i) {
            this.color = i;
            return this;
        }

        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder setValVisability(int i) {
            this.visability = i;
            return this;
        }

        public Props build() {
            return new Props(this);
        }
    }

    public int getValColor() {
        return this.valColor;
    }

    public String getUrl() {
        return this.url;
    }

    public int getValVisability() {
        return this.valVisability;
    }
}
