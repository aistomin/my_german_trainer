package com.github.aistomin.german.trainer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aistomin on 15.03.18.
 * <p>
 * Test for {@link Verb}
 */
public final class VerbTest {

    /**
     * Check that verb instance can be created and all the fields are readable.
     */
    @Test
    public void testVerb() {
        final String key = "gehen";
        final String english = "to go";
        final String preterite = "ging";
        final String perfect = "gegangen";
        final Verb go = new Verb(key, english, preterite, perfect);
        Assert.assertEquals(key, go.getKey());
        Assert.assertEquals(english, go.getEnglish());
        Assert.assertEquals(preterite, go.getPreterite());
        Assert.assertEquals(perfect, go.getPerfect());
        Assert.assertEquals("gehen; ging; gegangen", go.toString());
    }
}