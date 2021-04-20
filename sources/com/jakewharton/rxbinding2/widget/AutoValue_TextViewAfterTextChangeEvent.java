package com.jakewharton.rxbinding2.widget;

import android.text.Editable;
import android.widget.TextView;

final class AutoValue_TextViewAfterTextChangeEvent extends TextViewAfterTextChangeEvent {
    private final Editable editable;
    private final TextView view;

    AutoValue_TextViewAfterTextChangeEvent(TextView textView, Editable editable2) {
        if (textView != null) {
            this.view = textView;
            this.editable = editable2;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public TextView view() {
        return this.view;
    }

    public Editable editable() {
        return this.editable;
    }

    public String toString() {
        return "TextViewAfterTextChangeEvent{view=" + this.view + ", editable=" + this.editable + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextViewAfterTextChangeEvent)) {
            return false;
        }
        TextViewAfterTextChangeEvent textViewAfterTextChangeEvent = (TextViewAfterTextChangeEvent) obj;
        if (this.view.equals(textViewAfterTextChangeEvent.view())) {
            Editable editable2 = this.editable;
            if (editable2 == null) {
                if (textViewAfterTextChangeEvent.editable() == null) {
                    return true;
                }
            } else if (editable2.equals(textViewAfterTextChangeEvent.editable())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.view.hashCode() ^ 1000003) * 1000003;
        Editable editable2 = this.editable;
        return hashCode ^ (editable2 == null ? 0 : editable2.hashCode());
    }
}
