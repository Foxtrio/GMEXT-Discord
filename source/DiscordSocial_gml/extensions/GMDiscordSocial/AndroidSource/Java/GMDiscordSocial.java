package ${YYAndroidPackageName};

import java.lang.String;
import java.nio.ByteBuffer;

public final class GMDiscordSocial extends GMDiscordSocialInternal {

    public GMDiscordSocial() {
        android.app.Activity activity = RunnerActivity.CurrentActivity;
        com.discord.socialsdk.DiscordSocialSdkInit.setEngineActivity(activity);
    }
}