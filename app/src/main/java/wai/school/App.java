package wai.school;

import android.app.Application;
import android.content.Context;

import com.tencent.bugly.crashreport.CrashReport;

import c.b.BP;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.update.BmobUpdateAgent;

/**
 * Created by Finder丶畅畅 on 2017/1/14 21:25
 * QQ群481606175
 */

public class App extends Application {
    private static Context context;
    String key = "21f06c7aa89d574b8b6f12ac55df621e";

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        Bmob.initialize(this, key);
        BP.init(key);
        BmobUpdateAgent.initAppVersion();
        CrashReport.initCrashReport(getApplicationContext(), "20f15c8802", false);
    }


    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        App.context = context;
    }
}
