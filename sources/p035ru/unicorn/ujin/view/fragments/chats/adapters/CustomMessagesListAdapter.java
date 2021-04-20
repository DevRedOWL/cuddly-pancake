package p035ru.unicorn.ujin.view.fragments.chats.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.stfalcon.chatkit.commons.ImageLoader;
import com.stfalcon.chatkit.commons.ViewHolder;
import com.stfalcon.chatkit.messages.MessageHolders;
import com.stfalcon.chatkit.messages.MessagesListAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.entities.chats.Message;
import p035ru.unicorn.ujin.data.entities.chats.Poll;
import p035ru.unicorn.ujin.data.entities.chats.PollOption;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.customViews.PollOptionResultView;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders.CustomIncomingMessageViewHolder;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders.CustomOutcomingMessageViewHolder;
import p035ru.unicorn.ujin.view.fragments.chats.adapters.viewHolders.SystemMessageViewHolder;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u001c\u0010\u0012\u001a\u00020\f2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u001c\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bR#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/adapters/CustomMessagesListAdapter;", "Lcom/stfalcon/chatkit/messages/MessagesListAdapter;", "Lru/unicorn/ujin/data/entities/chats/Message;", "senderId", "", "messageHolders", "Lcom/stfalcon/chatkit/messages/MessageHolders;", "imageLoader", "Lcom/stfalcon/chatkit/commons/ImageLoader;", "votePoll", "Lkotlin/Function2;", "", "", "(Ljava/lang/String;Lcom/stfalcon/chatkit/messages/MessageHolders;Lcom/stfalcon/chatkit/commons/ImageLoader;Lkotlin/jvm/functions/Function2;)V", "getVotePoll", "()Lkotlin/jvm/functions/Function2;", "getItemViewType", "position", "onBindViewHolder", "holder", "Lcom/stfalcon/chatkit/commons/ViewHolder;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updatePoll", "poll", "Lru/unicorn/ujin/data/entities/chats/Poll;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.adapters.CustomMessagesListAdapter */
/* compiled from: CustomMessagesListAdapter.kt */
public final class CustomMessagesListAdapter extends MessagesListAdapter<Message> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int DELETED_MESSAGE_TYPE = 123124;
    public static final int SYSTEM_MESSAGE_TYPE = 123123;
    private final Function2<Integer, Integer, Unit> votePoll;

    public final Function2<Integer, Integer, Unit> getVotePoll() {
        return this.votePoll;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomMessagesListAdapter(String str, MessageHolders messageHolders, ImageLoader imageLoader, Function2<? super Integer, ? super Integer, Unit> function2) {
        super(str, messageHolders, imageLoader);
        Intrinsics.checkNotNullParameter(str, "senderId");
        Intrinsics.checkNotNullParameter(messageHolders, "messageHolders");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(function2, "votePoll");
        this.votePoll = function2;
    }

    public ViewHolder<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        if (i == 123123) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_message_system, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…ge_system, parent, false)");
            return new SystemMessageViewHolder(inflate, (Unit) null);
        }
        ViewHolder<?> onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        Intrinsics.checkNotNullExpressionValue(onCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    public int getItemViewType(int i) {
        if (((MessagesListAdapter.Wrapper) this.items.get(i)).item instanceof Message) {
            DATA data = ((MessagesListAdapter.Wrapper) this.items.get(i)).item;
            if (data == null) {
                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.entities.chats.Message");
            } else if (((Message) data).getSystem()) {
                return SYSTEM_MESSAGE_TYPE;
            }
        }
        return super.getItemViewType(i);
    }

    public void onBindViewHolder(ViewHolder<?> viewHolder, int i) {
        Poll poll;
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        super.onBindViewHolder((ViewHolder) viewHolder, i);
        if ((viewHolder instanceof CustomOutcomingMessageViewHolder) || (viewHolder instanceof CustomIncomingMessageViewHolder)) {
            View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
            View view2 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "holder.itemView");
            Context context = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "holder.itemView.context");
            ((TextView) view.findViewById(C5619R.C5622id.messageText)).setTextColor(context.getResources().getColor(R.color.chat_outcoming_text_color));
            View view3 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "holder.itemView");
            TextView textView = (TextView) view3.findViewById(C5619R.C5622id.messageTime);
            Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.messageTime");
            textView.setVisibility(0);
            View view4 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "holder.itemView");
            RadioGroup radioGroup = (RadioGroup) view4.findViewById(C5619R.C5622id.rgPoll);
            radioGroup.removeAllViews();
            radioGroup.setVisibility(8);
            radioGroup.setEnabled(true);
            View view5 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "holder.itemView");
            LinearLayout linearLayout = (LinearLayout) view5.findViewById(C5619R.C5622id.llPollResults);
            linearLayout.removeAllViews();
            linearLayout.setVisibility(8);
        }
        boolean z = viewHolder instanceof CustomIncomingMessageViewHolder;
        if (z) {
            View view6 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "holder.itemView");
            View view7 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view7, "holder.itemView");
            Context context2 = view7.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "holder.itemView.context");
            ((TextView) view6.findViewById(C5619R.C5622id.messageText)).setTextColor(context2.getResources().getColor(R.color.chat_incoming_text_color));
            View view8 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view8, "holder.itemView");
            CardView cardView = (CardView) view8.findViewById(C5619R.C5622id.cardView);
            Intrinsics.checkNotNullExpressionValue(cardView, "holder.itemView.cardView");
            cardView.setVisibility(0);
            View view9 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view9, "holder.itemView");
            TextView textView2 = (TextView) view9.findViewById(C5619R.C5622id.tvAuthorName);
            Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvAuthorName");
            textView2.setVisibility(0);
        }
        if (!(viewHolder instanceof SystemMessageViewHolder)) {
            DATA data = ((MessagesListAdapter.Wrapper) this.items.get(i)).item;
            if (data instanceof Message) {
                int i2 = i + 1;
                if (this.items.size() > i2 && (((MessagesListAdapter.Wrapper) this.items.get(i2)).item instanceof Message)) {
                    String autor = ((Message) data).getAutor();
                    DATA data2 = ((MessagesListAdapter.Wrapper) this.items.get(i2)).item;
                    if (data2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.entities.chats.Message");
                    } else if (Intrinsics.areEqual((Object) autor, (Object) ((Message) data2).getAutor()) && z) {
                        View view10 = viewHolder.itemView;
                        Intrinsics.checkNotNullExpressionValue(view10, "holder.itemView");
                        CardView cardView2 = (CardView) view10.findViewById(C5619R.C5622id.cardView);
                        Intrinsics.checkNotNullExpressionValue(cardView2, "holder.itemView.cardView");
                        cardView2.setVisibility(8);
                        View view11 = viewHolder.itemView;
                        Intrinsics.checkNotNullExpressionValue(view11, "holder.itemView");
                        TextView textView3 = (TextView) view11.findViewById(C5619R.C5622id.tvAuthorName);
                        Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.tvAuthorName");
                        textView3.setVisibility(8);
                    }
                }
                int i3 = i - 1;
                if (i3 >= 0 && (((MessagesListAdapter.Wrapper) this.items.get(i3)).item instanceof Message)) {
                    DATA data3 = ((MessagesListAdapter.Wrapper) this.items.get(i3)).item;
                    if (data3 != null) {
                        Message message = (Message) data;
                        if (Intrinsics.areEqual((Object) ((Message) data3).getAutor(), (Object) message.getAutor())) {
                            DATA data4 = ((MessagesListAdapter.Wrapper) this.items.get(i3)).item;
                            if (data4 != null) {
                                Long timestamp = ((Message) data4).getTimestamp();
                                long j = 0;
                                long longValue = timestamp != null ? timestamp.longValue() : 0;
                                Long timestamp2 = message.getTimestamp();
                                if (timestamp2 != null) {
                                    j = timestamp2.longValue();
                                }
                                if (longValue - j < ((long) 60)) {
                                    View view12 = viewHolder.itemView;
                                    Intrinsics.checkNotNullExpressionValue(view12, "holder.itemView");
                                    TextView textView4 = (TextView) view12.findViewById(C5619R.C5622id.messageTime);
                                    Intrinsics.checkNotNullExpressionValue(textView4, "holder.itemView.messageTime");
                                    textView4.setVisibility(8);
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.entities.chats.Message");
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.entities.chats.Message");
                    }
                }
                Message message2 = (Message) data;
                if (Intrinsics.areEqual((Object) message2.getType(), (Object) "poll") && (poll = message2.getPoll()) != null) {
                    View view13 = viewHolder.itemView;
                    Intrinsics.checkNotNullExpressionValue(view13, "holder.itemView");
                    TextView textView5 = (TextView) view13.findViewById(C5619R.C5622id.messageText);
                    Intrinsics.checkNotNullExpressionValue(textView5, "holder.itemView.messageText");
                    textView5.setText(poll.getTitle());
                    if (poll.getVoted()) {
                        View view14 = viewHolder.itemView;
                        Intrinsics.checkNotNullExpressionValue(view14, "holder.itemView");
                        LinearLayout linearLayout2 = (LinearLayout) view14.findViewById(C5619R.C5622id.llPollResults);
                        linearLayout2.setVisibility(0);
                        for (PollOption pollOption : poll.getOptionList()) {
                            View view15 = viewHolder.itemView;
                            Intrinsics.checkNotNullExpressionValue(view15, "holder.itemView");
                            PollOptionResultView pollOptionResultView = new PollOptionResultView(view15.getContext());
                            pollOptionResultView.setProgress(pollOption.getPercent());
                            pollOptionResultView.setText(pollOption.getTitle());
                            Unit unit = Unit.INSTANCE;
                            linearLayout2.addView(pollOptionResultView);
                        }
                        return;
                    }
                    View view16 = viewHolder.itemView;
                    Intrinsics.checkNotNullExpressionValue(view16, "holder.itemView");
                    RadioGroup radioGroup2 = (RadioGroup) view16.findViewById(C5619R.C5622id.rgPoll);
                    radioGroup2.setVisibility(0);
                    View view17 = viewHolder.itemView;
                    Intrinsics.checkNotNullExpressionValue(view17, "holder.itemView");
                    LayoutInflater from = LayoutInflater.from(view17.getContext());
                    for (PollOption pollOption2 : poll.getOptionList()) {
                        View inflate = from.inflate(R.layout.item_poll_option, radioGroup2, false);
                        if (inflate != null) {
                            RadioButton radioButton = (RadioButton) inflate;
                            radioButton.setText(pollOption2.getTitle());
                            radioButton.setId(pollOption2.getId());
                            Unit unit2 = Unit.INSTANCE;
                            radioGroup2.addView(radioButton);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.RadioButton");
                        }
                    }
                    radioGroup2.setOnCheckedChangeListener(new CustomMessagesListAdapter$onBindViewHolder$$inlined$let$lambda$1(poll, this, viewHolder));
                    LinearLayout linearLayout3 = radioGroup2;
                }
            }
        }
    }

    public final void updatePoll(Poll poll) {
        Intrinsics.checkNotNullParameter(poll, "poll");
        List list = this.items;
        Intrinsics.checkNotNullExpressionValue(list, FirebaseAnalytics.Param.ITEMS);
        Collection arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                Object next = it.next();
                MessagesListAdapter.Wrapper wrapper = (MessagesListAdapter.Wrapper) next;
                if (wrapper.item instanceof Message) {
                    DATA data = wrapper.item;
                    if (data != null) {
                        Poll poll2 = ((Message) data).getPoll();
                        if (poll2 != null && poll2.getId() == poll.getId()) {
                            z = true;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.entities.chats.Message");
                    }
                }
                if (z) {
                    arrayList.add(next);
                }
            } else {
                MessagesListAdapter.Wrapper wrapper2 = (MessagesListAdapter.Wrapper) ((List) arrayList).get(0);
                DATA data2 = wrapper2 != null ? wrapper2.item : null;
                if (data2 != null) {
                    ((Message) data2).setPoll(poll);
                    notifyDataSetChanged();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.data.entities.chats.Message");
            }
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/adapters/CustomMessagesListAdapter$Companion;", "", "()V", "DELETED_MESSAGE_TYPE", "", "SYSTEM_MESSAGE_TYPE", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.adapters.CustomMessagesListAdapter$Companion */
    /* compiled from: CustomMessagesListAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
