package p035ru.unicorn.ujin.view.adapters;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.News;
import p035ru.unicorn.ujin.util.GlideApp;
import p035ru.unicorn.ujin.view.adapters.AdapterNews;

/* renamed from: ru.unicorn.ujin.view.adapters.AdapterNews */
public class AdapterNews extends RecyclerView.Adapter<ViewHolder> {
    private final LayoutInflater mLayoutInflater;
    /* access modifiers changed from: private */
    public ArrayList<News> newsList;
    /* access modifiers changed from: private */
    public OnItemClickListener onItemClickListener;

    /* renamed from: ru.unicorn.ujin.view.adapters.AdapterNews$OnItemClickListener */
    public interface OnItemClickListener {
        void onItemClick(News news);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public AdapterNews(Context context, ArrayList<News> arrayList) {
        this.mLayoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.newsList = arrayList;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener2) {
        this.onItemClickListener = onItemClickListener2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_news, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.newsList.size();
    }

    public void setNewsList(ArrayList<News> arrayList) {
        this.newsList = arrayList;
        notifyDataSetChanged();
    }

    /* renamed from: ru.unicorn.ujin.view.adapters.AdapterNews$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: cv */
        CardView f6897cv;
        ImageView imageNews;
        TextView textView_TextNews;
        TextView textView_TitleNews;
        TextView textView_dt_news;

        public ViewHolder(View view) {
            super(view);
            this.textView_TitleNews = (TextView) view.findViewById(R.id.TextView_title_news_ID);
            this.textView_TextNews = (TextView) view.findViewById(R.id.textView_body_news_ID);
            this.imageNews = (ImageView) view.findViewById(R.id.imageView_news_ID);
            this.textView_dt_news = (TextView) view.findViewById(R.id.textView_dt_news_ID);
            this.f6897cv = (CardView) view.findViewById(R.id.cv);
        }

        public void bind(int i) {
            News news = (News) AdapterNews.this.newsList.get(i);
            this.textView_TitleNews.setText(news.getTitle());
            this.textView_TextNews.setText(Html.fromHtml(news.getText()));
            this.textView_dt_news.setText(news.getDateText());
            this.itemView.setOnClickListener(new View.OnClickListener(news) {
                private final /* synthetic */ News f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AdapterNews.ViewHolder.this.lambda$bind$0$AdapterNews$ViewHolder(this.f$1, view);
                }
            });
            if (news.getImageData() != null) {
                if (news.getImageData().getImageBytes() != null) {
                    GlideApp.with((View) this.imageNews).load(news.getImageData().getImageBytes()).into(this.imageNews);
                }
                GlideApp.with((View) this.imageNews).load(news.getImageData().getSource()).into(this.imageNews);
            }
            this.f6897cv.setVisibility((news.getImageData() == null || (news.getImageData().getImageBytes() == null && (news.getImageData().getSource() == null || news.getImageData().getSource().isEmpty()))) ? 8 : 0);
        }

        public /* synthetic */ void lambda$bind$0$AdapterNews$ViewHolder(News news, View view) {
            AdapterNews.this.onItemClickListener.onItemClick(news);
        }
    }
}
