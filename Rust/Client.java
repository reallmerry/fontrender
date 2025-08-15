package fish.xenos;

import fish.xenos.UtilsSystem.fontUtils.Fonts;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.minecraft.client.Minecraft;

import java.io.File;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {

    public static final String VIA_NAME = "Xenos Client";
    public static final String client_name = "Xenos";
    public static final String client_name_small = "Xenos";
    public static final String client_release = "";
    public static final String client_version = "ver-1.0.0";

    @Getter
    private static Client instance;
    private final File clientDir = new File(Minecraft.getInstance().gameDir + "\\xenos");
    private final File filesDir = new File(Minecraft.getInstance().gameDir + "\\xenos\\files");

    public Client() {
        instance = this;

        if (!clientDir.exists()) {
            clientDir.mkdirs();
        }
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        clientLoad();
    }

    private void clientLoad() {
        Fonts.init();
    }


}
