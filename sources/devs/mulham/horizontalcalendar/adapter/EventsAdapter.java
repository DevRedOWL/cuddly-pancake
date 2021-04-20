package devs.mulham.horizontalcalendar.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import devs.mulham.horizontalcalendar.C4489R;
import devs.mulham.horizontalcalendar.model.CalendarEvent;
import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventViewHolder> {
    private List<CalendarEvent> eventList;

    public EventsAdapter(List<CalendarEvent> list) {
        this.eventList = list;
    }

    public EventViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(DrawableCompat.wrap(ContextCompat.getDrawable(context, C4489R.C4491drawable.ic_circle_white_8dp)));
        return new EventViewHolder(imageView);
    }

    public void onBindViewHolder(EventViewHolder eventViewHolder, int i) {
        CalendarEvent item = getItem(i);
        ImageView imageView = (ImageView) eventViewHolder.itemView;
        imageView.setContentDescription(item.getDescription());
        DrawableCompat.setTint(imageView.getDrawable(), item.getColor());
    }

    public CalendarEvent getItem(int i) throws IndexOutOfBoundsException {
        return this.eventList.get(i);
    }

    public int getItemCount() {
        return this.eventList.size();
    }

    public void update(List<CalendarEvent> list) {
        this.eventList = list;
        notifyDataSetChanged();
    }

    static class EventViewHolder extends RecyclerView.ViewHolder {
        EventViewHolder(View view) {
            super(view);
        }
    }
}
