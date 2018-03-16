package com.github.aistomin.german.trainer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONException;

/**
 * Created by aistomin on 16.03.18.
 * <p>
 * Dictionary file generator.
 */
public final class DictionaryFile {

    /**
     * Vocabulary.
     */
    private final Vocabulary vocabulary;

    /**
     * Ctor.
     *
     * @param vocabulary Vocabulary.
     */
    public DictionaryFile(final Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    /**
     * Print the vocabluary to dictionary file.
     *
     * @param file Target file.
     * @throws IOException   If read/write exception occurred.
     * @throws JSONException If JSON exception occurred.
     */
    void printTo(final File file) throws IOException, JSONException {
        if (!file.exists() && !file.createNewFile()) {
            throw new IllegalStateException(
                "File " + file.getAbsolutePath() +
                    " not found and can not be created."
            );
        }
        Files.write(
            Paths.get(file.toURI()),
            vocabulary.toJSON().toString(2).getBytes("UTF-8")
        );
        System.out.println(
            "Dictionary " + file.getAbsolutePath() + " was generated."
        );
    }
}
