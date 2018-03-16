package com.github.aistomin.german.trainer;

import java.io.File;

/**
 * Created by aistomin on 16.03.18.
 * <p>
 * Program that allows to generate dictionary file.
 */
public final class Generator {

    /**
     * Application's entry point.
     *
     * @param args Arguments.
     * @throws Exception If something goes wrong.
     */
    public static void main(final String[] args) throws Exception {
        new DictionaryFile(
            new SampleDictionary().vocabulary()
        ).printTo(new File("/Users/andrej/projects/my/dictionary.json"));
    }
}
