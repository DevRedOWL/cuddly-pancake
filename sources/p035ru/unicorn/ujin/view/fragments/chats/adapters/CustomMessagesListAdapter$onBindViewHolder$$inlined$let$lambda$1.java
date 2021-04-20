package p035ru.unicorn.ujin.view.fragments.chats.adapters;

import android.view.View;
import android.widget.RadioGroup;
import com.stfalcon.chatkit.commons.ViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.entities.chats.Poll;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\b"}, mo51343d2 = {"<anonymous>", "", "radioGroup", "Landroid/widget/RadioGroup;", "id", "", "onCheckedChanged", "ru/unicorn/ujin/view/fragments/chats/adapters/CustomMessagesListAdapter$onBindViewHolder$3$2$2", "ru/unicorn/ujin/view/fragments/chats/adapters/CustomMessagesListAdapter$$special$$inlined$apply$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.adapters.CustomMessagesListAdapter$onBindViewHolder$$inlined$let$lambda$1 */
/* compiled from: CustomMessagesListAdapter.kt */
final class CustomMessagesListAdapter$onBindViewHolder$$inlined$let$lambda$1 implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ ViewHolder $holder$inlined;
    final /* synthetic */ Poll $poll$inlined;
    final /* synthetic */ CustomMessagesListAdapter this$0;

    CustomMessagesListAdapter$onBindViewHolder$$inlined$let$lambda$1(Poll poll, CustomMessagesListAdapter customMessagesListAdapter, ViewHolder viewHolder) {
        this.$poll$inlined = poll;
        this.this$0 = customMessagesListAdapter;
        this.$holder$inlined = viewHolder;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.this$0.getVotePoll().invoke(Integer.valueOf(this.$poll$inlined.getId()), Integer.valueOf(i));
        View view = this.$holder$inlined.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        RadioGroup radioGroup2 = (RadioGroup) view.findViewById(C5619R.C5622id.rgPoll);
        Intrinsics.checkNotNullExpressionValue(radioGroup2, "holder.itemView.rgPoll");
        radioGroup2.setEnabled(false);
    }
}
