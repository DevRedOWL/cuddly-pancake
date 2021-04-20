package p035ru.unicorn.ujin.viewModel.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.entities.chats.Poll;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/viewModel/events/PollEvent;", "", "success", "", "message", "", "pollId", "", "poll", "Lru/unicorn/ujin/data/entities/chats/Poll;", "(ZLjava/lang/String;Ljava/lang/Integer;Lru/unicorn/ujin/data/entities/chats/Poll;)V", "getMessage", "()Ljava/lang/String;", "getPoll", "()Lru/unicorn/ujin/data/entities/chats/Poll;", "getPollId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.viewModel.events.PollEvent */
/* compiled from: PollEvent.kt */
public final class PollEvent {
    private final String message;
    private final Poll poll;
    private final Integer pollId;
    private final boolean success;

    public PollEvent(boolean z, String str, Integer num, Poll poll2) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.success = z;
        this.message = str;
        this.pollId = num;
        this.poll = poll2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Poll getPoll() {
        return this.poll;
    }

    public final Integer getPollId() {
        return this.pollId;
    }

    public final boolean getSuccess() {
        return this.success;
    }
}
