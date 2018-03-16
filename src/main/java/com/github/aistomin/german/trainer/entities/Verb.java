package com.github.aistomin.german.trainer.entities;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by aistomin on 15.03.18.
 * <p>
 * German verb.
 */
public final class Verb extends Word {

    /**
     * Preterite form of the verb.
     */
    private final String preterite;

    /**
     * Perfect form of the verb.
     */
    private final String perfect;

    /**
     * Ctor.
     *
     * @param key       Basic German word, without article(s) or form(s).
     * @param english   English translation of the word.
     * @param preterite Preterite form of the verb.
     * @param perfect   Perfect form of the verb.
     */
    public Verb(
        final String key, final String english, final String preterite,
        final String perfect
    ) {
        super(key, english);
        this.preterite = preterite;
        this.perfect = perfect;
    }

    /**
     * JSON ctor.
     *
     * @param json JSON object.
     * @throws JSONException If parsing error occurred.
     */
    public Verb(final JSONObject json) throws JSONException {
        this(
            json.getString("german"),
            json.getString("english"),
            json.getString("preterite"),
            json.getString("perfect")
        );
    }

    /**
     * Get preterite form of the verb.
     *
     * @return Preterite form of the verb.
     */
    public String getPreterite() {
        return preterite;
    }

    /**
     * Get perfect form of the verb.
     *
     * @return Perfect form of the verb.
     */
    public String getPerfect() {
        return perfect;
    }

    @Override
    public String toString() {
        return String.format(
            Locale.getDefault(),
            "%s; %s; %s",
            getKey(),
            this.preterite,
            this.perfect
        );
    }

    @Override
    public JSONObject toJSON() throws JSONException {
        final JSONObject json = super.toJSON();
        json.put("preterite", this.preterite);
        json.put("perfect", this.perfect);
        return json;
    }
}
