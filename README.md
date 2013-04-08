constretto-android
==================

Useful [Constretto project](http://constretto.github.io/) extensions for Android.

Quickstart
----------

### 1. Add annotations to your POJO
```java
public class ScreenPreferences {
	
	@Configuration // implies that the preference name in the SharedPreferences store is "brightness"
	private String brightness;

	@Configuration("length") // implies that the preference name in the SharedPreferences store is "length"
	private Integer scale;

	public String getBrightness() {
		return brightness; 
	}

	public Integer getScale() {
		return scale;
	}

}
```

### 2. Create Constretto Configuration
```java
SharedPreferences prefs = this.getSharedPreferences("org.constretto.app", Context.MODE_PRIVATE);
ConstrettoConfiguration conf = ConstrettoAndroidBuilder.createConfigurationForSharedPreferences(prefs);
```

### 3. Inject configuration
```java
final ScreenPreferences screenPreferences = configuration.as(ScreenPreferences.class);
```

Planned features
----------------

* a ConfigurationStore implementation that wraps a [SharedPreferences](http://developer.android.com/reference/android/content/SharedPreferences.html) store
* an easy way of creating a ConstrettoConfiguration object for a SharedPreferences 

Follow development at the github [issue tracker](https://github.com/constretto/constretto-android/issues?milestone=1) 
