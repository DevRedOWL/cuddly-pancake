package com.drew.imaging.quicktime;

import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import com.drew.metadata.file.FileSystemMetadataReader;
import com.drew.metadata.mov.QuickTimeAtomHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class QuickTimeMetadataReader {
    /* JADX INFO: finally extract failed */
    public static Metadata readMetadata(File file) throws ImageProcessingException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Metadata readMetadata = readMetadata((InputStream) fileInputStream);
            fileInputStream.close();
            new FileSystemMetadataReader().read(file, readMetadata);
            return readMetadata;
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public static Metadata readMetadata(InputStream inputStream) {
        Metadata metadata = new Metadata();
        QuickTimeReader.extract(inputStream, new QuickTimeAtomHandler(metadata));
        return metadata;
    }
}
