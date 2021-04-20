package com.stfalcon.chatkit.messages;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.stfalcon.chatkit.C2908R;
import com.stfalcon.chatkit.commons.ImageLoader;
import com.stfalcon.chatkit.commons.ViewHolder;
import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.MessageContentType;
import com.stfalcon.chatkit.messages.MessagesListAdapter;
import com.stfalcon.chatkit.utils.DateFormatter;
import com.stfalcon.chatkit.utils.RoundedImageView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageHolders {
    private static final short VIEW_TYPE_DATE_HEADER = 130;
    private static final short VIEW_TYPE_IMAGE_MESSAGE = 132;
    private static final short VIEW_TYPE_TEXT_MESSAGE = 131;
    private ContentChecker contentChecker;
    private List<ContentTypeConfig> customContentTypes = new ArrayList();
    private Class<? extends ViewHolder<Date>> dateHeaderHolder = DefaultDateHeaderViewHolder.class;
    private int dateHeaderLayout = C2908R.layout.item_date_header;
    private HolderConfig<MessageContentType.C2912Image> incomingImageConfig = new HolderConfig<>(DefaultIncomingImageMessageViewHolder.class, C2908R.layout.item_incoming_image_message);
    private HolderConfig<IMessage> incomingTextConfig = new HolderConfig<>(DefaultIncomingTextMessageViewHolder.class, C2908R.layout.item_incoming_text_message);
    private HolderConfig<MessageContentType.C2912Image> outcomingImageConfig = new HolderConfig<>(DefaultOutcomingImageMessageViewHolder.class, C2908R.layout.item_outcoming_image_message);
    private HolderConfig<IMessage> outcomingTextConfig = new HolderConfig<>(DefaultOutcomingTextMessageViewHolder.class, C2908R.layout.item_outcoming_text_message);

    public interface ContentChecker<MESSAGE extends IMessage> {
        boolean hasContentFor(MESSAGE message, byte b);
    }

    interface DefaultMessageViewHolder {
        void applyStyle(MessagesListStyle messagesListStyle);
    }

    public MessageHolders setIncomingTextConfig(Class<? extends BaseMessageViewHolder<? extends IMessage>> cls, int i) {
        HolderConfig<IMessage> holderConfig = this.incomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        return this;
    }

    public MessageHolders setIncomingTextConfig(Class<? extends BaseMessageViewHolder<? extends IMessage>> cls, int i, Object obj) {
        HolderConfig<IMessage> holderConfig = this.incomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setIncomingTextHolder(Class<? extends BaseMessageViewHolder<? extends IMessage>> cls) {
        this.incomingTextConfig.holder = cls;
        return this;
    }

    public MessageHolders setIncomingTextHolder(Class<? extends BaseMessageViewHolder<? extends IMessage>> cls, Object obj) {
        HolderConfig<IMessage> holderConfig = this.incomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setIncomingTextLayout(int i) {
        this.incomingTextConfig.layout = i;
        return this;
    }

    public MessageHolders setIncomingTextLayout(int i, Object obj) {
        HolderConfig<IMessage> holderConfig = this.incomingTextConfig;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingTextConfig(Class<? extends BaseMessageViewHolder<? extends IMessage>> cls, int i) {
        HolderConfig<IMessage> holderConfig = this.outcomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        return this;
    }

    public MessageHolders setOutcomingTextConfig(Class<? extends BaseMessageViewHolder<? extends IMessage>> cls, int i, Object obj) {
        HolderConfig<IMessage> holderConfig = this.outcomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingTextHolder(Class<? extends BaseMessageViewHolder<? extends IMessage>> cls) {
        this.outcomingTextConfig.holder = cls;
        return this;
    }

    public MessageHolders setOutcomingTextHolder(Class<? extends BaseMessageViewHolder<? extends IMessage>> cls, Object obj) {
        HolderConfig<IMessage> holderConfig = this.outcomingTextConfig;
        holderConfig.holder = cls;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingTextLayout(int i) {
        this.outcomingTextConfig.layout = i;
        return this;
    }

    public MessageHolders setOutcomingTextLayout(int i, Object obj) {
        HolderConfig<IMessage> holderConfig = this.outcomingTextConfig;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setIncomingImageConfig(Class<? extends BaseMessageViewHolder<? extends MessageContentType.C2912Image>> cls, int i) {
        HolderConfig<MessageContentType.C2912Image> holderConfig = this.incomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        return this;
    }

    public MessageHolders setIncomingImageConfig(Class<? extends BaseMessageViewHolder<? extends MessageContentType.C2912Image>> cls, int i, Object obj) {
        HolderConfig<MessageContentType.C2912Image> holderConfig = this.incomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setIncomingImageHolder(Class<? extends BaseMessageViewHolder<? extends MessageContentType.C2912Image>> cls) {
        this.incomingImageConfig.holder = cls;
        return this;
    }

    public MessageHolders setIncomingImageHolder(Class<? extends BaseMessageViewHolder<? extends MessageContentType.C2912Image>> cls, Object obj) {
        HolderConfig<MessageContentType.C2912Image> holderConfig = this.incomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setIncomingImageLayout(int i) {
        this.incomingImageConfig.layout = i;
        return this;
    }

    public MessageHolders setIncomingImageLayout(int i, Object obj) {
        HolderConfig<MessageContentType.C2912Image> holderConfig = this.incomingImageConfig;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingImageConfig(Class<? extends BaseMessageViewHolder<? extends MessageContentType.C2912Image>> cls, int i) {
        HolderConfig<MessageContentType.C2912Image> holderConfig = this.outcomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        return this;
    }

    public MessageHolders setOutcomingImageConfig(Class<? extends BaseMessageViewHolder<? extends MessageContentType.C2912Image>> cls, int i, Object obj) {
        HolderConfig<MessageContentType.C2912Image> holderConfig = this.outcomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingImageHolder(Class<? extends BaseMessageViewHolder<? extends MessageContentType.C2912Image>> cls) {
        this.outcomingImageConfig.holder = cls;
        return this;
    }

    public MessageHolders setOutcomingImageHolder(Class<? extends BaseMessageViewHolder<? extends MessageContentType.C2912Image>> cls, Object obj) {
        HolderConfig<MessageContentType.C2912Image> holderConfig = this.outcomingImageConfig;
        holderConfig.holder = cls;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setOutcomingImageLayout(int i) {
        this.outcomingImageConfig.layout = i;
        return this;
    }

    public MessageHolders setOutcomingImageLayout(int i, Object obj) {
        HolderConfig<MessageContentType.C2912Image> holderConfig = this.outcomingImageConfig;
        holderConfig.layout = i;
        holderConfig.payload = obj;
        return this;
    }

    public MessageHolders setDateHeaderConfig(Class<? extends ViewHolder<Date>> cls, int i) {
        this.dateHeaderHolder = cls;
        this.dateHeaderLayout = i;
        return this;
    }

    public MessageHolders setDateHeaderHolder(Class<? extends ViewHolder<Date>> cls) {
        this.dateHeaderHolder = cls;
        return this;
    }

    public MessageHolders setDateHeaderLayout(int i) {
        this.dateHeaderLayout = i;
        return this;
    }

    public <TYPE extends MessageContentType> MessageHolders registerContentType(byte b, Class<? extends BaseMessageViewHolder<TYPE>> cls, int i, int i2, ContentChecker contentChecker2) {
        return registerContentType(b, cls, i, cls, i2, contentChecker2);
    }

    public <TYPE extends MessageContentType> MessageHolders registerContentType(byte b, Class<? extends BaseMessageViewHolder<TYPE>> cls, int i, Class<? extends BaseMessageViewHolder<TYPE>> cls2, int i2, ContentChecker contentChecker2) {
        if (b != 0) {
            this.customContentTypes.add(new ContentTypeConfig(b, new HolderConfig(cls, i), new HolderConfig(cls2, i2)));
            this.contentChecker = contentChecker2;
            return this;
        }
        throw new IllegalArgumentException("content type must be greater or less than '0'!");
    }

    public <TYPE extends MessageContentType> MessageHolders registerContentType(byte b, Class<? extends BaseMessageViewHolder<TYPE>> cls, Object obj, int i, Class<? extends BaseMessageViewHolder<TYPE>> cls2, Object obj2, int i2, ContentChecker contentChecker2) {
        if (b != 0) {
            this.customContentTypes.add(new ContentTypeConfig(b, new HolderConfig(cls, i, obj), new HolderConfig(cls2, i2, obj2)));
            this.contentChecker = contentChecker2;
            return this;
        }
        throw new IllegalArgumentException("content type must be greater or less than '0'!");
    }

    /* access modifiers changed from: protected */
    public ViewHolder getHolder(ViewGroup viewGroup, int i, MessagesListStyle messagesListStyle) {
        if (i == -132) {
            return getHolder(viewGroup, (HolderConfig) this.outcomingImageConfig, messagesListStyle);
        }
        if (i == -131) {
            return getHolder(viewGroup, (HolderConfig) this.outcomingTextConfig, messagesListStyle);
        }
        switch (i) {
            case 130:
                return getHolder(viewGroup, this.dateHeaderLayout, this.dateHeaderHolder, messagesListStyle, (Object) null);
            case 131:
                return getHolder(viewGroup, (HolderConfig) this.incomingTextConfig, messagesListStyle);
            case 132:
                return getHolder(viewGroup, (HolderConfig) this.incomingImageConfig, messagesListStyle);
            default:
                for (ContentTypeConfig next : this.customContentTypes) {
                    if (Math.abs(next.type) == Math.abs(i)) {
                        if (i > 0) {
                            return getHolder(viewGroup, next.incomingConfig, messagesListStyle);
                        }
                        return getHolder(viewGroup, next.outcomingConfig, messagesListStyle);
                    }
                }
                throw new IllegalStateException("Wrong message view type. Please, report this issue on GitHub with full stacktrace in description.");
        }
    }

    /* access modifiers changed from: protected */
    public void bind(ViewHolder viewHolder, Object obj, boolean z, ImageLoader imageLoader, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, DateFormatter.Formatter formatter, SparseArray<MessagesListAdapter.OnMessageViewClickListener> sparseArray) {
        if (obj instanceof IMessage) {
            BaseMessageViewHolder baseMessageViewHolder = (BaseMessageViewHolder) viewHolder;
            baseMessageViewHolder.isSelected = z;
            baseMessageViewHolder.imageLoader = imageLoader;
            viewHolder.itemView.setOnLongClickListener(onLongClickListener);
            viewHolder.itemView.setOnClickListener(onClickListener);
            for (int i = 0; i < sparseArray.size(); i++) {
                final int keyAt = sparseArray.keyAt(i);
                View findViewById = viewHolder.itemView.findViewById(keyAt);
                if (findViewById != null) {
                    final SparseArray<MessagesListAdapter.OnMessageViewClickListener> sparseArray2 = sparseArray;
                    final View view = findViewById;
                    final Object obj2 = obj;
                    findViewById.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ((MessagesListAdapter.OnMessageViewClickListener) sparseArray2.get(keyAt)).onMessageViewClick(view, (IMessage) obj2);
                        }
                    });
                }
            }
        } else if (obj instanceof Date) {
            ((DefaultDateHeaderViewHolder) viewHolder).dateHeadersFormatter = formatter;
        }
        viewHolder.onBind(obj);
    }

    /* access modifiers changed from: protected */
    public int getViewType(Object obj, String str) {
        boolean z;
        short s;
        if (obj instanceof IMessage) {
            IMessage iMessage = (IMessage) obj;
            z = iMessage.getUser().getId().contentEquals(str);
            s = getContentViewType(iMessage);
        } else {
            s = VIEW_TYPE_DATE_HEADER;
            z = false;
        }
        return z ? s * -1 : s;
    }

    private ViewHolder getHolder(ViewGroup viewGroup, HolderConfig holderConfig, MessagesListStyle messagesListStyle) {
        return getHolder(viewGroup, holderConfig.layout, holderConfig.holder, messagesListStyle, holderConfig.payload);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <HOLDER extends com.stfalcon.chatkit.commons.ViewHolder> com.stfalcon.chatkit.commons.ViewHolder getHolder(android.view.ViewGroup r5, int r6, java.lang.Class<HOLDER> r7, com.stfalcon.chatkit.messages.MessagesListStyle r8, java.lang.Object r9) {
        /*
            r4 = this;
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            android.view.View r5 = r0.inflate(r6, r5, r1)
            r6 = 2
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Class<android.view.View> r3 = android.view.View.class
            r2[r1] = r3     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r2[r0] = r3     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.reflect.Constructor r2 = r7.getDeclaredConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x002f }
            r2.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x002f }
            r6[r1] = r5     // Catch:{ NoSuchMethodException -> 0x002f }
            r6[r0] = r9     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object r6 = r2.newInstance(r6)     // Catch:{ NoSuchMethodException -> 0x002f }
            com.stfalcon.chatkit.commons.ViewHolder r6 = (com.stfalcon.chatkit.commons.ViewHolder) r6     // Catch:{ NoSuchMethodException -> 0x002f }
            goto L_0x0047
        L_0x002d:
            r5 = move-exception
            goto L_0x0054
        L_0x002f:
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x002d }
            java.lang.Class<android.view.View> r9 = android.view.View.class
            r6[r1] = r9     // Catch:{ Exception -> 0x002d }
            java.lang.reflect.Constructor r6 = r7.getDeclaredConstructor(r6)     // Catch:{ Exception -> 0x002d }
            r6.setAccessible(r0)     // Catch:{ Exception -> 0x002d }
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x002d }
            r7[r1] = r5     // Catch:{ Exception -> 0x002d }
            java.lang.Object r5 = r6.newInstance(r7)     // Catch:{ Exception -> 0x002d }
            r6 = r5
            com.stfalcon.chatkit.commons.ViewHolder r6 = (com.stfalcon.chatkit.commons.ViewHolder) r6     // Catch:{ Exception -> 0x002d }
        L_0x0047:
            boolean r5 = r6 instanceof com.stfalcon.chatkit.messages.MessageHolders.DefaultMessageViewHolder     // Catch:{ Exception -> 0x002d }
            if (r5 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            r5 = r6
            com.stfalcon.chatkit.messages.MessageHolders$DefaultMessageViewHolder r5 = (com.stfalcon.chatkit.messages.MessageHolders.DefaultMessageViewHolder) r5     // Catch:{ Exception -> 0x002d }
            r5.applyStyle(r8)     // Catch:{ Exception -> 0x002d }
        L_0x0053:
            return r6
        L_0x0054:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "Somehow we couldn't create the ViewHolder for message. Please, report this issue on GitHub with full stacktrace in description."
            r6.<init>(r7, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stfalcon.chatkit.messages.MessageHolders.getHolder(android.view.ViewGroup, int, java.lang.Class, com.stfalcon.chatkit.messages.MessagesListStyle, java.lang.Object):com.stfalcon.chatkit.commons.ViewHolder");
    }

    private short getContentViewType(IMessage iMessage) {
        if ((iMessage instanceof MessageContentType.C2912Image) && ((MessageContentType.C2912Image) iMessage).getImageUrl() != null) {
            return VIEW_TYPE_IMAGE_MESSAGE;
        }
        if (!(iMessage instanceof MessageContentType)) {
            return VIEW_TYPE_TEXT_MESSAGE;
        }
        int i = 0;
        while (i < this.customContentTypes.size()) {
            ContentTypeConfig contentTypeConfig = this.customContentTypes.get(i);
            ContentChecker contentChecker2 = this.contentChecker;
            if (contentChecker2 == null) {
                throw new IllegalArgumentException("ContentChecker cannot be null when using custom content types!");
            } else if (contentChecker2.hasContentFor(iMessage, contentTypeConfig.type)) {
                return (short) contentTypeConfig.type;
            } else {
                i++;
            }
        }
        return VIEW_TYPE_TEXT_MESSAGE;
    }

    public static abstract class BaseMessageViewHolder<MESSAGE extends IMessage> extends ViewHolder<MESSAGE> {
        protected ImageLoader imageLoader;
        boolean isSelected;
        protected Object payload;

        @Deprecated
        public BaseMessageViewHolder(View view) {
            super(view);
        }

        public BaseMessageViewHolder(View view, Object obj) {
            super(view);
            this.payload = obj;
        }

        public boolean isSelected() {
            return this.isSelected;
        }

        public boolean isSelectionModeEnabled() {
            return MessagesListAdapter.isSelectionModeEnabled;
        }

        public ImageLoader getImageLoader() {
            return this.imageLoader;
        }

        /* access modifiers changed from: protected */
        public void configureLinksBehavior(TextView textView) {
            textView.setLinksClickable(false);
            textView.setMovementMethod(new LinkMovementMethod() {
                public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
                    boolean onTouchEvent = !MessagesListAdapter.isSelectionModeEnabled ? super.onTouchEvent(textView, spannable, motionEvent) : false;
                    BaseMessageViewHolder.this.itemView.onTouchEvent(motionEvent);
                    return onTouchEvent;
                }
            });
        }
    }

    public static class IncomingTextMessageViewHolder<MESSAGE extends IMessage> extends BaseIncomingMessageViewHolder<MESSAGE> {
        protected ViewGroup bubble;
        protected TextView text;

        @Deprecated
        public IncomingTextMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        public IncomingTextMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }

        public void onBind(MESSAGE message) {
            super.onBind(message);
            ViewGroup viewGroup = this.bubble;
            if (viewGroup != null) {
                viewGroup.setSelected(isSelected());
            }
            TextView textView = this.text;
            if (textView != null) {
                textView.setText(message.getText());
            }
        }

        public void applyStyle(MessagesListStyle messagesListStyle) {
            super.applyStyle(messagesListStyle);
            ViewGroup viewGroup = this.bubble;
            if (viewGroup != null) {
                viewGroup.setPadding(messagesListStyle.getIncomingDefaultBubblePaddingLeft(), messagesListStyle.getIncomingDefaultBubblePaddingTop(), messagesListStyle.getIncomingDefaultBubblePaddingRight(), messagesListStyle.getIncomingDefaultBubblePaddingBottom());
                ViewCompat.setBackground(this.bubble, messagesListStyle.getIncomingBubbleDrawable());
            }
            TextView textView = this.text;
            if (textView != null) {
                textView.setTextColor(messagesListStyle.getIncomingTextColor());
                this.text.setTextSize(0, (float) messagesListStyle.getIncomingTextSize());
                TextView textView2 = this.text;
                textView2.setTypeface(textView2.getTypeface(), messagesListStyle.getIncomingTextStyle());
                this.text.setAutoLinkMask(messagesListStyle.getTextAutoLinkMask());
                this.text.setLinkTextColor(messagesListStyle.getIncomingTextLinkColor());
                configureLinksBehavior(this.text);
            }
        }

        private void init(View view) {
            this.bubble = (ViewGroup) view.findViewById(C2908R.C2911id.bubble);
            this.text = (TextView) view.findViewById(C2908R.C2911id.messageText);
        }
    }

    public static class OutcomingTextMessageViewHolder<MESSAGE extends IMessage> extends BaseOutcomingMessageViewHolder<MESSAGE> {
        protected ViewGroup bubble;
        protected TextView text;

        @Deprecated
        public OutcomingTextMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        public OutcomingTextMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }

        public void onBind(MESSAGE message) {
            super.onBind(message);
            ViewGroup viewGroup = this.bubble;
            if (viewGroup != null) {
                viewGroup.setSelected(isSelected());
            }
            TextView textView = this.text;
            if (textView != null) {
                textView.setText(message.getText());
            }
        }

        public final void applyStyle(MessagesListStyle messagesListStyle) {
            super.applyStyle(messagesListStyle);
            ViewGroup viewGroup = this.bubble;
            if (viewGroup != null) {
                viewGroup.setPadding(messagesListStyle.getOutcomingDefaultBubblePaddingLeft(), messagesListStyle.getOutcomingDefaultBubblePaddingTop(), messagesListStyle.getOutcomingDefaultBubblePaddingRight(), messagesListStyle.getOutcomingDefaultBubblePaddingBottom());
                ViewCompat.setBackground(this.bubble, messagesListStyle.getOutcomingBubbleDrawable());
            }
            TextView textView = this.text;
            if (textView != null) {
                textView.setTextColor(messagesListStyle.getOutcomingTextColor());
                this.text.setTextSize(0, (float) messagesListStyle.getOutcomingTextSize());
                TextView textView2 = this.text;
                textView2.setTypeface(textView2.getTypeface(), messagesListStyle.getOutcomingTextStyle());
                this.text.setAutoLinkMask(messagesListStyle.getTextAutoLinkMask());
                this.text.setLinkTextColor(messagesListStyle.getOutcomingTextLinkColor());
                configureLinksBehavior(this.text);
            }
        }

        private void init(View view) {
            this.bubble = (ViewGroup) view.findViewById(C2908R.C2911id.bubble);
            this.text = (TextView) view.findViewById(C2908R.C2911id.messageText);
        }
    }

    public static class IncomingImageMessageViewHolder<MESSAGE extends MessageContentType.C2912Image> extends BaseIncomingMessageViewHolder<MESSAGE> {
        protected ImageView image;
        protected View imageOverlay;

        /* access modifiers changed from: protected */
        public Object getPayloadForImageLoader(MESSAGE message) {
            return null;
        }

        @Deprecated
        public IncomingImageMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        public IncomingImageMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }

        public void onBind(MESSAGE message) {
            super.onBind(message);
            if (!(this.image == null || this.imageLoader == null)) {
                this.imageLoader.loadImage(this.image, message.getImageUrl(), getPayloadForImageLoader(message));
            }
            View view = this.imageOverlay;
            if (view != null) {
                view.setSelected(isSelected());
            }
        }

        public final void applyStyle(MessagesListStyle messagesListStyle) {
            super.applyStyle(messagesListStyle);
            if (this.time != null) {
                this.time.setTextColor(messagesListStyle.getIncomingImageTimeTextColor());
                this.time.setTextSize(0, (float) messagesListStyle.getIncomingImageTimeTextSize());
                this.time.setTypeface(this.time.getTypeface(), messagesListStyle.getIncomingImageTimeTextStyle());
            }
            View view = this.imageOverlay;
            if (view != null) {
                ViewCompat.setBackground(view, messagesListStyle.getIncomingImageOverlayDrawable());
            }
        }

        private void init(View view) {
            this.image = (ImageView) view.findViewById(C2908R.C2911id.image);
            this.imageOverlay = view.findViewById(C2908R.C2911id.imageOverlay);
            ImageView imageView = this.image;
            if (imageView instanceof RoundedImageView) {
                ((RoundedImageView) imageView).setCorners(C2908R.dimen.message_bubble_corners_radius, C2908R.dimen.message_bubble_corners_radius, C2908R.dimen.message_bubble_corners_radius, 0);
            }
        }
    }

    public static class OutcomingImageMessageViewHolder<MESSAGE extends MessageContentType.C2912Image> extends BaseOutcomingMessageViewHolder<MESSAGE> {
        protected ImageView image;
        protected View imageOverlay;

        /* access modifiers changed from: protected */
        public Object getPayloadForImageLoader(MESSAGE message) {
            return null;
        }

        @Deprecated
        public OutcomingImageMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        public OutcomingImageMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }

        public void onBind(MESSAGE message) {
            super.onBind(message);
            if (!(this.image == null || this.imageLoader == null)) {
                this.imageLoader.loadImage(this.image, message.getImageUrl(), getPayloadForImageLoader(message));
            }
            View view = this.imageOverlay;
            if (view != null) {
                view.setSelected(isSelected());
            }
        }

        public final void applyStyle(MessagesListStyle messagesListStyle) {
            super.applyStyle(messagesListStyle);
            if (this.time != null) {
                this.time.setTextColor(messagesListStyle.getOutcomingImageTimeTextColor());
                this.time.setTextSize(0, (float) messagesListStyle.getOutcomingImageTimeTextSize());
                this.time.setTypeface(this.time.getTypeface(), messagesListStyle.getOutcomingImageTimeTextStyle());
            }
            View view = this.imageOverlay;
            if (view != null) {
                ViewCompat.setBackground(view, messagesListStyle.getOutcomingImageOverlayDrawable());
            }
        }

        private void init(View view) {
            this.image = (ImageView) view.findViewById(C2908R.C2911id.image);
            this.imageOverlay = view.findViewById(C2908R.C2911id.imageOverlay);
            ImageView imageView = this.image;
            if (imageView instanceof RoundedImageView) {
                ((RoundedImageView) imageView).setCorners(C2908R.dimen.message_bubble_corners_radius, C2908R.dimen.message_bubble_corners_radius, 0, C2908R.dimen.message_bubble_corners_radius);
            }
        }
    }

    public static class DefaultDateHeaderViewHolder extends ViewHolder<Date> implements DefaultMessageViewHolder {
        protected String dateFormat;
        protected DateFormatter.Formatter dateHeadersFormatter;
        protected TextView text;

        public DefaultDateHeaderViewHolder(View view) {
            super(view);
            this.text = (TextView) view.findViewById(C2908R.C2911id.messageText);
        }

        public void onBind(Date date) {
            if (this.text != null) {
                String str = null;
                DateFormatter.Formatter formatter = this.dateHeadersFormatter;
                if (formatter != null) {
                    str = formatter.format(date);
                }
                TextView textView = this.text;
                if (str == null) {
                    str = DateFormatter.format(date, this.dateFormat);
                }
                textView.setText(str);
            }
        }

        public void applyStyle(MessagesListStyle messagesListStyle) {
            TextView textView = this.text;
            if (textView != null) {
                textView.setTextColor(messagesListStyle.getDateHeaderTextColor());
                this.text.setTextSize(0, (float) messagesListStyle.getDateHeaderTextSize());
                TextView textView2 = this.text;
                textView2.setTypeface(textView2.getTypeface(), messagesListStyle.getDateHeaderTextStyle());
                this.text.setPadding(messagesListStyle.getDateHeaderPadding(), messagesListStyle.getDateHeaderPadding(), messagesListStyle.getDateHeaderPadding(), messagesListStyle.getDateHeaderPadding());
            }
            this.dateFormat = messagesListStyle.getDateHeaderFormat();
            String str = this.dateFormat;
            if (str == null) {
                str = DateFormatter.Template.STRING_DAY_MONTH_YEAR.get();
            }
            this.dateFormat = str;
        }
    }

    public static abstract class BaseIncomingMessageViewHolder<MESSAGE extends IMessage> extends BaseMessageViewHolder<MESSAGE> implements DefaultMessageViewHolder {
        protected TextView time;
        protected ImageView userAvatar;

        @Deprecated
        public BaseIncomingMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        public BaseIncomingMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }

        public void onBind(MESSAGE message) {
            TextView textView = this.time;
            if (textView != null) {
                textView.setText(DateFormatter.format(message.getCreatedAt(), DateFormatter.Template.TIME));
            }
            if (this.userAvatar != null) {
                int i = 0;
                boolean z = (this.imageLoader == null || message.getUser().getAvatar() == null || message.getUser().getAvatar().isEmpty()) ? false : true;
                ImageView imageView = this.userAvatar;
                if (!z) {
                    i = 8;
                }
                imageView.setVisibility(i);
                if (z) {
                    this.imageLoader.loadImage(this.userAvatar, message.getUser().getAvatar(), (Object) null);
                }
            }
        }

        public void applyStyle(MessagesListStyle messagesListStyle) {
            TextView textView = this.time;
            if (textView != null) {
                textView.setTextColor(messagesListStyle.getIncomingTimeTextColor());
                this.time.setTextSize(0, (float) messagesListStyle.getIncomingTimeTextSize());
                TextView textView2 = this.time;
                textView2.setTypeface(textView2.getTypeface(), messagesListStyle.getIncomingTimeTextStyle());
            }
            ImageView imageView = this.userAvatar;
            if (imageView != null) {
                imageView.getLayoutParams().width = messagesListStyle.getIncomingAvatarWidth();
                this.userAvatar.getLayoutParams().height = messagesListStyle.getIncomingAvatarHeight();
            }
        }

        private void init(View view) {
            this.time = (TextView) view.findViewById(C2908R.C2911id.messageTime);
            this.userAvatar = (ImageView) view.findViewById(C2908R.C2911id.messageUserAvatar);
        }
    }

    public static abstract class BaseOutcomingMessageViewHolder<MESSAGE extends IMessage> extends BaseMessageViewHolder<MESSAGE> implements DefaultMessageViewHolder {
        protected TextView time;

        @Deprecated
        public BaseOutcomingMessageViewHolder(View view) {
            super(view);
            init(view);
        }

        public BaseOutcomingMessageViewHolder(View view, Object obj) {
            super(view, obj);
            init(view);
        }

        public void onBind(MESSAGE message) {
            TextView textView = this.time;
            if (textView != null) {
                textView.setText(DateFormatter.format(message.getCreatedAt(), DateFormatter.Template.TIME));
            }
        }

        public void applyStyle(MessagesListStyle messagesListStyle) {
            TextView textView = this.time;
            if (textView != null) {
                textView.setTextColor(messagesListStyle.getOutcomingTimeTextColor());
                this.time.setTextSize(0, (float) messagesListStyle.getOutcomingTimeTextSize());
                TextView textView2 = this.time;
                textView2.setTypeface(textView2.getTypeface(), messagesListStyle.getOutcomingTimeTextStyle());
            }
        }

        private void init(View view) {
            this.time = (TextView) view.findViewById(C2908R.C2911id.messageTime);
        }
    }

    private static class DefaultIncomingTextMessageViewHolder extends IncomingTextMessageViewHolder<IMessage> {
        public DefaultIncomingTextMessageViewHolder(View view) {
            super(view, (Object) null);
        }
    }

    private static class DefaultOutcomingTextMessageViewHolder extends OutcomingTextMessageViewHolder<IMessage> {
        public DefaultOutcomingTextMessageViewHolder(View view) {
            super(view, (Object) null);
        }
    }

    private static class DefaultIncomingImageMessageViewHolder extends IncomingImageMessageViewHolder<MessageContentType.C2912Image> {
        public DefaultIncomingImageMessageViewHolder(View view) {
            super(view, (Object) null);
        }
    }

    private static class DefaultOutcomingImageMessageViewHolder extends OutcomingImageMessageViewHolder<MessageContentType.C2912Image> {
        public DefaultOutcomingImageMessageViewHolder(View view) {
            super(view, (Object) null);
        }
    }

    private static class ContentTypeConfig<TYPE extends MessageContentType> {
        /* access modifiers changed from: private */
        public HolderConfig<TYPE> incomingConfig;
        /* access modifiers changed from: private */
        public HolderConfig<TYPE> outcomingConfig;
        /* access modifiers changed from: private */
        public byte type;

        private ContentTypeConfig(byte b, HolderConfig<TYPE> holderConfig, HolderConfig<TYPE> holderConfig2) {
            this.type = b;
            this.incomingConfig = holderConfig;
            this.outcomingConfig = holderConfig2;
        }
    }

    private class HolderConfig<T extends IMessage> {
        protected Class<? extends BaseMessageViewHolder<? extends T>> holder;
        protected int layout;
        protected Object payload;

        HolderConfig(Class<? extends BaseMessageViewHolder<? extends T>> cls, int i) {
            this.holder = cls;
            this.layout = i;
        }

        HolderConfig(Class<? extends BaseMessageViewHolder<? extends T>> cls, int i, Object obj) {
            this.holder = cls;
            this.layout = i;
            this.payload = obj;
        }
    }
}
