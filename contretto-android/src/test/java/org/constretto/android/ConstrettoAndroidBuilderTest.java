package org.constretto.android;

import android.content.SharedPreferences;
import org.constretto.ConstrettoConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author zapodot
 */
@RunWith(MockitoJUnitRunner.class)
public class ConstrettoAndroidBuilderTest {

    @Mock
    private SharedPreferences sharedPreferences;

    @Test
    public void testCreateConfigurationForSharedPreferences() throws Exception {
        final ConstrettoConfiguration configuration = ConstrettoAndroidBuilder.createConfigurationForSharedPreferences(sharedPreferences);
        assertNotNull(configuration);

    }

    @Test
    public void testCreateConstrettoBuilderWithPreferences() throws Exception {
        assertNotNull(ConstrettoAndroidBuilder.createConstrettoBuilderWithPreferences(sharedPreferences));
    }
}
