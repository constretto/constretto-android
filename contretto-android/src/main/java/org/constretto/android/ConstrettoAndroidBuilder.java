package org.constretto.android;

import android.content.SharedPreferences;
import org.constretto.ConstrettoBuilder;
import org.constretto.ConstrettoConfiguration;
import org.constretto.android.store.SharedPreferencesConfigurationStore;

/**
 * @author zapodot
 */
public class ConstrettoAndroidBuilder {

    public static ConstrettoConfiguration createConfigurationForSharedPreferences(SharedPreferences... preferences) {
        final ConstrettoBuilder constrettoBuilder = createConstrettoBuilderWithPreferences(preferences);
        return constrettoBuilder.getConfiguration();
    }

    public static ConstrettoBuilder createConstrettoBuilderWithPreferences(final SharedPreferences... preferences) {
        final ConstrettoBuilder constrettoBuilder = new ConstrettoBuilder(false);
        for (SharedPreferences sharedPreferences : preferences) {
            constrettoBuilder.addConfigurationStore(new SharedPreferencesConfigurationStore(sharedPreferences));
        }
        return constrettoBuilder;
    }
}
