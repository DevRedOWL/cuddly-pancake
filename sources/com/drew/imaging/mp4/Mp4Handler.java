package com.drew.imaging.mp4;

import com.drew.metadata.Metadata;
import com.drew.metadata.mp4.Mp4Directory;
import com.drew.metadata.mp4.boxes.Box;
import java.io.IOException;

public abstract class Mp4Handler<T extends Mp4Directory> {
    protected T directory = getDirectory();
    protected Metadata metadata;

    /* access modifiers changed from: protected */
    public abstract T getDirectory();

    /* access modifiers changed from: protected */
    public abstract Mp4Handler processBox(Box box, byte[] bArr) throws IOException;

    /* access modifiers changed from: protected */
    public abstract boolean shouldAcceptBox(Box box);

    /* access modifiers changed from: protected */
    public abstract boolean shouldAcceptContainer(Box box);

    public Mp4Handler(Metadata metadata2) {
        this.metadata = metadata2;
        metadata2.addDirectory(this.directory);
    }

    /* access modifiers changed from: protected */
    public Mp4Handler processContainer(Box box) throws IOException {
        return processBox(box, (byte[]) null);
    }

    public void addError(String str) {
        this.directory.addError(str);
    }
}
