package com.stfalcon.chatkit.messages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.legacy.widget.Space;
import com.stfalcon.chatkit.C2908R;
import java.lang.reflect.Field;

public class MessageInput extends RelativeLayout implements View.OnClickListener, TextWatcher, View.OnFocusChangeListener {
    protected ImageButton attachmentButton;
    protected Space attachmentButtonSpace;
    private AttachmentsListener attachmentsListener;
    private int delayTypingStatusMillis;
    private CharSequence input;
    private InputListener inputListener;
    /* access modifiers changed from: private */
    public boolean isTyping;
    private boolean lastFocus;
    protected EditText messageInput;
    protected ImageButton messageSendButton;
    protected Space sendButtonSpace;
    /* access modifiers changed from: private */
    public TypingListener typingListener;
    private Runnable typingTimerRunnable = new Runnable() {
        public void run() {
            if (MessageInput.this.isTyping) {
                boolean unused = MessageInput.this.isTyping = false;
                if (MessageInput.this.typingListener != null) {
                    MessageInput.this.typingListener.onStopTyping();
                }
            }
        }
    };

    public interface AttachmentsListener {
        void onAddAttachments();
    }

    public interface InputListener {
        boolean onSubmit(CharSequence charSequence);
    }

    public interface TypingListener {
        void onStartTyping();

        void onStopTyping();
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public MessageInput(Context context) {
        super(context);
        init(context);
    }

    public MessageInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public MessageInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public void setInputListener(InputListener inputListener2) {
        this.inputListener = inputListener2;
    }

    public void setAttachmentsListener(AttachmentsListener attachmentsListener2) {
        this.attachmentsListener = attachmentsListener2;
    }

    public EditText getInputEditText() {
        return this.messageInput;
    }

    public ImageButton getButton() {
        return this.messageSendButton;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C2908R.C2911id.messageSendButton) {
            if (onSubmit()) {
                this.messageInput.setText("");
            }
            removeCallbacks(this.typingTimerRunnable);
            post(this.typingTimerRunnable);
        } else if (id == C2908R.C2911id.attachmentButton) {
            onAddAttachments();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.input = charSequence;
        this.messageSendButton.setEnabled(this.input.length() > 0);
        if (charSequence.length() > 0) {
            if (!this.isTyping) {
                this.isTyping = true;
                TypingListener typingListener2 = this.typingListener;
                if (typingListener2 != null) {
                    typingListener2.onStartTyping();
                }
            }
            removeCallbacks(this.typingTimerRunnable);
            postDelayed(this.typingTimerRunnable, (long) this.delayTypingStatusMillis);
        }
    }

    public void onFocusChange(View view, boolean z) {
        TypingListener typingListener2;
        if (this.lastFocus && !z && (typingListener2 = this.typingListener) != null) {
            typingListener2.onStopTyping();
        }
        this.lastFocus = z;
    }

    private boolean onSubmit() {
        InputListener inputListener2 = this.inputListener;
        return inputListener2 != null && inputListener2.onSubmit(this.input);
    }

    private void onAddAttachments() {
        AttachmentsListener attachmentsListener2 = this.attachmentsListener;
        if (attachmentsListener2 != null) {
            attachmentsListener2.onAddAttachments();
        }
    }

    private void init(Context context, AttributeSet attributeSet) {
        init(context);
        MessageInputStyle parse = MessageInputStyle.parse(context, attributeSet);
        this.messageInput.setMaxLines(parse.getInputMaxLines());
        this.messageInput.setHint(parse.getInputHint());
        this.messageInput.setText(parse.getInputText());
        int i = 0;
        this.messageInput.setTextSize(0, (float) parse.getInputTextSize());
        this.messageInput.setTextColor(parse.getInputTextColor());
        this.messageInput.setHintTextColor(parse.getInputHintColor());
        ViewCompat.setBackground(this.messageInput, parse.getInputBackground());
        setCursor(parse.getInputCursorDrawable());
        this.attachmentButton.setVisibility(parse.showAttachmentButton() ? 0 : 8);
        this.attachmentButton.setImageDrawable(parse.getAttachmentButtonIcon());
        this.attachmentButton.getLayoutParams().width = parse.getAttachmentButtonWidth();
        this.attachmentButton.getLayoutParams().height = parse.getAttachmentButtonHeight();
        ViewCompat.setBackground(this.attachmentButton, parse.getAttachmentButtonBackground());
        Space space = this.attachmentButtonSpace;
        if (!parse.showAttachmentButton()) {
            i = 8;
        }
        space.setVisibility(i);
        this.attachmentButtonSpace.getLayoutParams().width = parse.getAttachmentButtonMargin();
        this.messageSendButton.setImageDrawable(parse.getInputButtonIcon());
        this.messageSendButton.getLayoutParams().width = parse.getInputButtonWidth();
        this.messageSendButton.getLayoutParams().height = parse.getInputButtonHeight();
        ViewCompat.setBackground(this.messageSendButton, parse.getInputButtonBackground());
        this.sendButtonSpace.getLayoutParams().width = parse.getInputButtonMargin();
        if (getPaddingLeft() == 0 && getPaddingRight() == 0 && getPaddingTop() == 0 && getPaddingBottom() == 0) {
            setPadding(parse.getInputDefaultPaddingLeft(), parse.getInputDefaultPaddingTop(), parse.getInputDefaultPaddingRight(), parse.getInputDefaultPaddingBottom());
        }
        this.delayTypingStatusMillis = parse.getDelayTypingStatus();
    }

    private void init(Context context) {
        inflate(context, C2908R.layout.view_message_input, this);
        this.messageInput = (EditText) findViewById(C2908R.C2911id.messageInput);
        this.messageSendButton = (ImageButton) findViewById(C2908R.C2911id.messageSendButton);
        this.attachmentButton = (ImageButton) findViewById(C2908R.C2911id.attachmentButton);
        this.sendButtonSpace = (Space) findViewById(C2908R.C2911id.sendButtonSpace);
        this.attachmentButtonSpace = (Space) findViewById(C2908R.C2911id.attachmentButtonSpace);
        this.messageSendButton.setOnClickListener(this);
        this.attachmentButton.setOnClickListener(this);
        this.messageInput.addTextChangedListener(this);
        this.messageInput.setText("");
        this.messageInput.setOnFocusChangeListener(this);
    }

    private void setCursor(Drawable drawable) {
        Class cls;
        Object obj;
        if (drawable != null) {
            try {
                TextView.class.getDeclaredField("mCursorDrawableRes").setAccessible(true);
                if (Build.VERSION.SDK_INT < 16) {
                    obj = this.messageInput;
                    cls = TextView.class;
                } else {
                    Field declaredField = TextView.class.getDeclaredField("mEditor");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(this.messageInput);
                    cls = obj.getClass();
                }
                Field declaredField2 = cls.getDeclaredField("mCursorDrawable");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, new Drawable[]{drawable, drawable});
            } catch (Exception unused) {
            }
        }
    }

    public void setTypingListener(TypingListener typingListener2) {
        this.typingListener = typingListener2;
    }
}
