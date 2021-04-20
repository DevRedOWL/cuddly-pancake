package p035ru.unicorn.ujin.view.adapters;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.developerPage.DeveloperPageDataDocument;
import p035ru.unicorn.ujin.view.adapters.DocumentAdapter;

/* renamed from: ru.unicorn.ujin.view.adapters.DocumentAdapter */
public class DocumentAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<DeveloperPageDataDocument> items;

    public DocumentAdapter(ArrayList<DeveloperPageDataDocument> arrayList) {
        this.items = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_document, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.items.size();
    }

    /* renamed from: ru.unicorn.ujin.view.adapters.DocumentAdapter$ViewHolder */
    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageDocumentType;
        private TextView textDocumentDate;
        private TextView textDocumentName;

        ViewHolder(View view) {
            super(view);
            this.textDocumentName = (TextView) view.findViewById(R.id.textDocumentName);
            this.textDocumentDate = (TextView) view.findViewById(R.id.textDocumentDate);
            this.imageDocumentType = (ImageView) view.findViewById(R.id.imageDocumentType);
        }

        /* access modifiers changed from: package-private */
        public void bind(int i) {
            this.imageDocumentType.setImageResource(R.drawable.icon_pdf);
            this.textDocumentName.setText(DocumentAdapter.this.items.get(i).getTitle());
            this.textDocumentDate.setText(DocumentAdapter.this.items.get(i).getDt());
            this.itemView.setOnClickListener(new View.OnClickListener(i) {
                private final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    DocumentAdapter.ViewHolder.this.lambda$bind$0$DocumentAdapter$ViewHolder(this.f$1, view);
                }
            });
        }

        public /* synthetic */ void lambda$bind$0$DocumentAdapter$ViewHolder(int i, View view) {
            this.itemView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(DocumentAdapter.this.items.get(i).getUrl())));
        }
    }
}
