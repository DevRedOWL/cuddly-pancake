package com.drew.metadata.mp4.media;

import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mp4.Mp4MediaHandler;
import com.drew.metadata.mp4.boxes.Box;
import java.io.IOException;

public class Mp4TextHandler extends Mp4MediaHandler<Mp4TextDirectory> {
    /* access modifiers changed from: protected */
    public String getMediaInformation() {
        return "text";
    }

    /* access modifiers changed from: protected */
    public void processMediaInformation(SequentialReader sequentialReader, Box box) throws IOException {
    }

    /* access modifiers changed from: protected */
    public void processSampleDescription(SequentialReader sequentialReader, Box box) throws IOException {
    }

    /* access modifiers changed from: protected */
    public void processTimeToSample(SequentialReader sequentialReader, Box box) throws IOException {
    }

    public Mp4TextHandler(Metadata metadata) {
        super(metadata);
    }

    /* access modifiers changed from: protected */
    public Mp4TextDirectory getDirectory() {
        return (Mp4TextDirectory) this.directory;
    }
}
