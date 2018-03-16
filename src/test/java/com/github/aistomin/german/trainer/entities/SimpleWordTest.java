package com.github.aistomin.german.trainer.entities;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aistomin on 16.03.18.
 * <p>
 * Test for {@link SimpleWord}
 */
public class SimpleWordTest {

    /**
     * Check that simple word instance can be created and all the fields are
     * readable and can be obtained via JSON object.
     *
     * @throws JSONException If JSON was not properly parsed.
     */
    @Test
    public void testSimpleWord() throws JSONException {
        final String key = "schwarz";
        final String english = "black";
        final SimpleWord word = new SimpleWord(key, english);
        Assert.assertEquals(key, word.getKey());
        Assert.assertEquals(english, word.getEnglish());
        final JSONObject json = word.toJSON();
        Assert.assertEquals(key, json.getString("german"));
        Assert.assertEquals(english, json.getString("english"));
    }
}