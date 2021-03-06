package com.drew.metadata.mp4.media;

import com.drew.lang.SequentialReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.mp4.Mp4BoxTypes;
import com.drew.metadata.mp4.Mp4MediaHandler;
import com.drew.metadata.mp4.boxes.Box;
import com.drew.metadata.mp4.boxes.HintMediaHeaderBox;
import java.io.IOException;

public class Mp4HintHandler extends Mp4MediaHandler<Mp4HintDirectory> {
    /* access modifiers changed from: protected */
    public String getMediaInformation() {
        return Mp4BoxTypes.BOX_HINT_MEDIA_INFO;
    }

    /* access modifiers changed from: protected */
    public void processSampleDescription(SequentialReader sequentialReader, Box box) throws IOException {
    }

    /* access modifiers changed from: protected */
    public void processTimeToSample(SequentialReader sequentialReader, Box box) throws IOException {
    }

    public Mp4HintHandler(Metadata metadata) {
        super(metadata);
    }

    /* access modifiers changed from: protected */
    public Mp4HintDirectory getDirectory() {
        return new Mp4HintDirectory();
    }

    /* access modifiers changed from: protected */
    public void processMediaInformation(SequentialReader sequentialReader, Box box) throws IOException {
        new HintMediaHeaderBox(sequentialReader, box).addMetadata((Mp4HintDirectory) this.directory);
    }
}
