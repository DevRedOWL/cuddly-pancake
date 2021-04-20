package com.stfalcon.chatkit.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.stfalcon.chatkit.C2908R;
import com.stfalcon.chatkit.commons.Style;

class DialogListStyle extends Style {
    private int dialogAvatarHeight;
    private int dialogAvatarWidth;
    private int dialogDateColor;
    private int dialogDateSize;
    private int dialogDateStyle;
    private int dialogDividerColor;
    private boolean dialogDividerEnabled;
    private int dialogDividerLeftPadding;
    private int dialogDividerRightPadding;
    private int dialogItemBackground;
    private boolean dialogMessageAvatarEnabled;
    private int dialogMessageAvatarHeight;
    private int dialogMessageAvatarWidth;
    private int dialogMessageTextColor;
    private int dialogMessageTextSize;
    private int dialogMessageTextStyle;
    private int dialogTitleTextColor;
    private int dialogTitleTextSize;
    private int dialogTitleTextStyle;
    private int dialogUnreadBubbleBackgroundColor;
    private boolean dialogUnreadBubbleEnabled;
    private int dialogUnreadBubbleTextColor;
    private int dialogUnreadBubbleTextSize;
    private int dialogUnreadBubbleTextStyle;
    private int dialogUnreadDateColor;
    private int dialogUnreadDateStyle;
    private int dialogUnreadItemBackground;
    private int dialogUnreadMessageTextColor;
    private int dialogUnreadMessageTextStyle;
    private int dialogUnreadTitleTextColor;
    private int dialogUnreadTitleTextStyle;

    static DialogListStyle parse(Context context, AttributeSet attributeSet) {
        DialogListStyle dialogListStyle = new DialogListStyle(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2908R.styleable.DialogsList);
        dialogListStyle.dialogItemBackground = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogItemBackground, dialogListStyle.getColor(C2908R.C2909color.transparent));
        dialogListStyle.dialogUnreadItemBackground = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogUnreadItemBackground, dialogListStyle.getColor(C2908R.C2909color.transparent));
        dialogListStyle.dialogTitleTextColor = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogTitleTextColor, dialogListStyle.getColor(C2908R.C2909color.dialog_title_text));
        dialogListStyle.dialogTitleTextSize = obtainStyledAttributes.getDimensionPixelSize(C2908R.styleable.DialogsList_dialogTitleTextSize, context.getResources().getDimensionPixelSize(C2908R.dimen.dialog_title_text_size));
        dialogListStyle.dialogTitleTextStyle = obtainStyledAttributes.getInt(C2908R.styleable.DialogsList_dialogTitleTextStyle, 0);
        dialogListStyle.dialogUnreadTitleTextColor = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogUnreadTitleTextColor, dialogListStyle.getColor(C2908R.C2909color.dialog_title_text));
        dialogListStyle.dialogUnreadTitleTextStyle = obtainStyledAttributes.getInt(C2908R.styleable.DialogsList_dialogUnreadTitleTextStyle, 0);
        dialogListStyle.dialogMessageTextColor = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogMessageTextColor, dialogListStyle.getColor(C2908R.C2909color.dialog_message_text));
        dialogListStyle.dialogMessageTextSize = obtainStyledAttributes.getDimensionPixelSize(C2908R.styleable.DialogsList_dialogMessageTextSize, context.getResources().getDimensionPixelSize(C2908R.dimen.dialog_message_text_size));
        dialogListStyle.dialogMessageTextStyle = obtainStyledAttributes.getInt(C2908R.styleable.DialogsList_dialogMessageTextStyle, 0);
        dialogListStyle.dialogUnreadMessageTextColor = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogUnreadMessageTextColor, dialogListStyle.getColor(C2908R.C2909color.dialog_message_text));
        dialogListStyle.dialogUnreadMessageTextStyle = obtainStyledAttributes.getInt(C2908R.styleable.DialogsList_dialogUnreadMessageTextStyle, 0);
        dialogListStyle.dialogDateColor = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogDateColor, dialogListStyle.getColor(C2908R.C2909color.dialog_date_text));
        dialogListStyle.dialogDateSize = obtainStyledAttributes.getDimensionPixelSize(C2908R.styleable.DialogsList_dialogDateSize, context.getResources().getDimensionPixelSize(C2908R.dimen.dialog_date_text_size));
        dialogListStyle.dialogDateStyle = obtainStyledAttributes.getInt(C2908R.styleable.DialogsList_dialogDateStyle, 0);
        dialogListStyle.dialogUnreadDateColor = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogUnreadDateColor, dialogListStyle.getColor(C2908R.C2909color.dialog_date_text));
        dialogListStyle.dialogUnreadDateStyle = obtainStyledAttributes.getInt(C2908R.styleable.DialogsList_dialogUnreadDateStyle, 0);
        dialogListStyle.dialogUnreadBubbleEnabled = obtainStyledAttributes.getBoolean(C2908R.styleable.DialogsList_dialogUnreadBubbleEnabled, true);
        dialogListStyle.dialogUnreadBubbleBackgroundColor = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogUnreadBubbleBackgroundColor, dialogListStyle.getColor(C2908R.C2909color.dialog_unread_bubble));
        dialogListStyle.dialogUnreadBubbleTextColor = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogUnreadBubbleTextColor, dialogListStyle.getColor(C2908R.C2909color.dialog_unread_text));
        dialogListStyle.dialogUnreadBubbleTextSize = obtainStyledAttributes.getDimensionPixelSize(C2908R.styleable.DialogsList_dialogUnreadBubbleTextSize, context.getResources().getDimensionPixelSize(C2908R.dimen.dialog_unread_bubble_text_size));
        dialogListStyle.dialogUnreadBubbleTextStyle = obtainStyledAttributes.getInt(C2908R.styleable.DialogsList_dialogUnreadBubbleTextStyle, 0);
        dialogListStyle.dialogAvatarWidth = obtainStyledAttributes.getDimensionPixelSize(C2908R.styleable.DialogsList_dialogAvatarWidth, context.getResources().getDimensionPixelSize(C2908R.dimen.dialog_avatar_width));
        dialogListStyle.dialogAvatarHeight = obtainStyledAttributes.getDimensionPixelSize(C2908R.styleable.DialogsList_dialogAvatarHeight, context.getResources().getDimensionPixelSize(C2908R.dimen.dialog_avatar_height));
        dialogListStyle.dialogMessageAvatarEnabled = obtainStyledAttributes.getBoolean(C2908R.styleable.DialogsList_dialogMessageAvatarEnabled, true);
        dialogListStyle.dialogMessageAvatarWidth = obtainStyledAttributes.getDimensionPixelSize(C2908R.styleable.DialogsList_dialogMessageAvatarWidth, context.getResources().getDimensionPixelSize(C2908R.dimen.dialog_last_message_avatar_width));
        dialogListStyle.dialogMessageAvatarHeight = obtainStyledAttributes.getDimensionPixelSize(C2908R.styleable.DialogsList_dialogMessageAvatarHeight, context.getResources().getDimensionPixelSize(C2908R.dimen.dialog_last_message_avatar_height));
        dialogListStyle.dialogDividerEnabled = obtainStyledAttributes.getBoolean(C2908R.styleable.DialogsList_dialogDividerEnabled, true);
        dialogListStyle.dialogDividerColor = obtainStyledAttributes.getColor(C2908R.styleable.DialogsList_dialogDividerColor, dialogListStyle.getColor(C2908R.C2909color.dialog_divider));
        dialogListStyle.dialogDividerLeftPadding = obtainStyledAttributes.getDimensionPixelSize(C2908R.styleable.DialogsList_dialogDividerLeftPadding, context.getResources().getDimensionPixelSize(C2908R.dimen.dialog_divider_margin_left));
        dialogListStyle.dialogDividerRightPadding = obtainStyledAttributes.getDimensionPixelSize(C2908R.styleable.DialogsList_dialogDividerRightPadding, context.getResources().getDimensionPixelSize(C2908R.dimen.dialog_divider_margin_right));
        obtainStyledAttributes.recycle();
        return dialogListStyle;
    }

    private DialogListStyle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public int getDialogTitleTextColor() {
        return this.dialogTitleTextColor;
    }

    /* access modifiers changed from: protected */
    public int getDialogTitleTextSize() {
        return this.dialogTitleTextSize;
    }

    /* access modifiers changed from: protected */
    public int getDialogTitleTextStyle() {
        return this.dialogTitleTextStyle;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadTitleTextColor() {
        return this.dialogUnreadTitleTextColor;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadTitleTextStyle() {
        return this.dialogUnreadTitleTextStyle;
    }

    /* access modifiers changed from: protected */
    public int getDialogMessageTextColor() {
        return this.dialogMessageTextColor;
    }

    /* access modifiers changed from: protected */
    public int getDialogMessageTextSize() {
        return this.dialogMessageTextSize;
    }

    /* access modifiers changed from: protected */
    public int getDialogMessageTextStyle() {
        return this.dialogMessageTextStyle;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadMessageTextColor() {
        return this.dialogUnreadMessageTextColor;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadMessageTextStyle() {
        return this.dialogUnreadMessageTextStyle;
    }

    /* access modifiers changed from: protected */
    public int getDialogDateColor() {
        return this.dialogDateColor;
    }

    /* access modifiers changed from: protected */
    public int getDialogDateSize() {
        return this.dialogDateSize;
    }

    /* access modifiers changed from: protected */
    public int getDialogDateStyle() {
        return this.dialogDateStyle;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadDateColor() {
        return this.dialogUnreadDateColor;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadDateStyle() {
        return this.dialogUnreadDateStyle;
    }

    /* access modifiers changed from: protected */
    public boolean isDialogUnreadBubbleEnabled() {
        return this.dialogUnreadBubbleEnabled;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadBubbleTextColor() {
        return this.dialogUnreadBubbleTextColor;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadBubbleTextSize() {
        return this.dialogUnreadBubbleTextSize;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadBubbleTextStyle() {
        return this.dialogUnreadBubbleTextStyle;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadBubbleBackgroundColor() {
        return this.dialogUnreadBubbleBackgroundColor;
    }

    /* access modifiers changed from: protected */
    public int getDialogAvatarWidth() {
        return this.dialogAvatarWidth;
    }

    /* access modifiers changed from: protected */
    public int getDialogAvatarHeight() {
        return this.dialogAvatarHeight;
    }

    /* access modifiers changed from: protected */
    public boolean isDialogDividerEnabled() {
        return this.dialogDividerEnabled;
    }

    /* access modifiers changed from: protected */
    public int getDialogDividerColor() {
        return this.dialogDividerColor;
    }

    /* access modifiers changed from: protected */
    public int getDialogDividerLeftPadding() {
        return this.dialogDividerLeftPadding;
    }

    /* access modifiers changed from: protected */
    public int getDialogDividerRightPadding() {
        return this.dialogDividerRightPadding;
    }

    /* access modifiers changed from: protected */
    public int getDialogItemBackground() {
        return this.dialogItemBackground;
    }

    /* access modifiers changed from: protected */
    public int getDialogUnreadItemBackground() {
        return this.dialogUnreadItemBackground;
    }

    /* access modifiers changed from: protected */
    public boolean isDialogMessageAvatarEnabled() {
        return this.dialogMessageAvatarEnabled;
    }

    /* access modifiers changed from: protected */
    public int getDialogMessageAvatarWidth() {
        return this.dialogMessageAvatarWidth;
    }

    /* access modifiers changed from: protected */
    public int getDialogMessageAvatarHeight() {
        return this.dialogMessageAvatarHeight;
    }
}
