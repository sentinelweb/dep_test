package co.uk.sentinelweb.depop.test.app;

import android.app.Application;

import depop.test.sentinelweb.uk.co.test.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by robert on 15/04/2015.
 */
public class DepopApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/Roboto-Light.ttf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }
}
