package org.constretto.android.store;

import android.content.SharedPreferences;
import org.constretto.model.TaggedPropertySet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * @author zapodot
 */
@RunWith(MockitoJUnitRunner.class)
public class SharedPreferencesConfigurationStoreTest {

    @Mock
    private SharedPreferences sharedPreferences;

    @InjectMocks
    private SharedPreferencesConfigurationStore configurationStore;


    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullParameter() throws Exception {
        new SharedPreferencesConfigurationStore(null);

    }

    @Test
    public void testParseConfigurationEmpty() throws Exception {
        final Collection<TaggedPropertySet> taggedPropertySets = configurationStore.parseConfiguration();
        assertEquals(1, taggedPropertySets.size());
    }


}
