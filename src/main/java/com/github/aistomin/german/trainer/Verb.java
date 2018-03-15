package com.github.aistomin.german.trainer;

import java.util.Locale;

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
}
