package com.jakewharton.rxbinding2.widget;

import android.widget.SeekBar;

final class AutoValue_SeekBarStartChangeEvent extends SeekBarStartChangeEvent {
    private final SeekBar view;

    AutoValue_SeekBarStartChangeEvent(SeekBar seekBar) {
        if (seekBar != null) {
            this.view = seekBar;
            return;
        }
        throw new NullPointerException("Null view");
    }

    public SeekBar view() {
        return this.view;
    }

    public String toString() {
        return "SeekBarStartChangeEvent{view=" + this.view + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SeekBarStartChangeEvent) {
            return this.view.equals(((SeekBarStartChangeEvent) obj).view());
        }
        return false;
    }

    public int hashCode() {
        return this.view.hashCode() ^ 1000003;
    }
}
