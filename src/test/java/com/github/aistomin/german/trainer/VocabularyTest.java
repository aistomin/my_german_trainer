package com.github.aistomin.german.trainer;

import com.github.aistomin.german.trainer.entities.Word;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aistomin on 15.03.18.
 * <p>
 * Test for {@link Vocabulary}
 */
public class VocabularyTest {

    /**
     * Test that we can convert vocabulary from/to JSON.
     *
     * @throws Exception If something goes wrong :)
     */
    @Test
    public void testJSON() throws Exception {
        final String json = new String(
            Files.readAllBytes(
                Paths.get(
                    getClass().getResource("/sample.json").toURI()
                )
            )
        );
        final Vocabulary vocabulary = new Vocabulary(new JSONObject(json));
        final List<String> expected = Arrays.asList(
            "Table", "Cat", "Girl", "to go", "black"
        );
        final List<Word> words = vocabulary.getWords();
        Assert.assertEquals(expected.size(), words.size());
        for (final Word word : words) {
            Assert.assertTrue(expected.contains(word.getEnglish()));
        }
        Assert.assertEquals(json, vocabulary.toJSON().toString(2));
    }
}
