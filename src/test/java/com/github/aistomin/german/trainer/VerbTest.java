package com.github.aistomin.german.trainer;

import org.json.JSONException;
import org.json.JSONObject;
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

    /**
     * Check that we can convert a verb from/to JSON.
     *
     * @throws JSONException If JSON was not properly parsed.
     */
    @Test
    public void testJson() throws JSONException {
        final Verb live = new Verb("leben", "to live", "lebte", "gelebt");
        final JSONObject json = live.toJSON();
        Assert.assertEquals("Verb", json.getString("class"));
        Assert.assertEquals(live.getKey(), json.getString("german"));
        Assert.assertEquals(live.getEnglish(), json.getString("english"));
        Assert.assertEquals(live.getPreterite(), json.getString("preterite"));
        Assert.assertEquals(live.getPerfect(), json.getString("perfect"));
        final Verb parsed = new Verb(json);
        Assert.assertEquals(live.getKey(), parsed.getKey());
        Assert.assertEquals(live.getEnglish(), parsed.getEnglish());
        Assert.assertEquals(live.getPreterite(), parsed.getPreterite());
        Assert.assertEquals(live.getPerfect(), parsed.getPerfect());
    }
}