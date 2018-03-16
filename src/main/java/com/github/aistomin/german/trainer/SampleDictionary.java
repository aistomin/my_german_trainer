package com.github.aistomin.german.trainer;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by aistomin on 16.03.18.
 * <p>
 * Sample dictionary which we use as a demo or in tests.
 */
public final class SampleDictionary {

    /**
     * Sample vocabulary.
     *
     * @return Sample vocabulary.
     * @throws JSONException      If JSON exception occurred.
     * @throws URISyntaxException If URI exception occurred.
     * @throws IOException        If read/write exception occurred.
     */
    Vocabulary vocabulary() throws JSONException, URISyntaxException, IOException {
        final String json = new String(
            Files.readAllBytes(
                Paths.get(
                    getClass().getResource("/sample.json").toURI()
                )
            )
        );
        return new Vocabulary(new JSONObject(json));
    }
}
