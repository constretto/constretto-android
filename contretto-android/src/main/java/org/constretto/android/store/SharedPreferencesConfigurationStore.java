package org.constretto.android.store;

import android.content.SharedPreferences;
import org.constretto.ConfigurationStore;
import org.constretto.model.TaggedPropertySet;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zapodot
 */
public class SharedPreferencesConfigurationStore implements ConfigurationStore {

    private SharedPreferences sharedPreferences;

    public SharedPreferencesConfigurationStore(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            throw new IllegalArgumentException("The \"sharedPreferences\" argument can not be null");
        }
        this.sharedPreferences = sharedPreferences;
    }

    @Override
    public Collection<TaggedPropertySet> parseConfiguration() {
        final Map<String, ? extends Object> preferencesMap = sharedPreferences.getAll();
        final TaggedPropertySet taggedPropertySet = new TaggedPropertySet(convertValuesToString(preferencesMap), getClass());
        return Arrays.asList(taggedPropertySet);
    }

    private Map<String, String> convertValuesToString(final Map<String, ? extends Object> values) {
        Map<String, String> convertedMap = new HashMap<String, String>(values.size());
        for (String key : values.keySet()) {
            convertedMap.put(key, values.get(key).toString());
        }
        return convertedMap;
    }
}
