package fish.xenos.UtilsSystem.fontUtils;

import fish.xenos.UtilsSystem.fontUtils.common.Lang;
import fish.xenos.UtilsSystem.fontUtils.styled.StyledFont;
import lombok.SneakyThrows;


public class Fonts {
    public static final String FONT_DIR = "/assets/minecraft/xenos/font/";

    //FONTS
    public static volatile StyledFont[] minecraft = new StyledFont[41];
    public static volatile StyledFont[] RobotoCondensed = new StyledFont[41];
    public static volatile StyledFont[] RobotoCondensedBold = new StyledFont[41];
    public static volatile StyledFont[] sf_bold = new StyledFont[41];
    public static volatile StyledFont[] sf_medium = new StyledFont[41];
    public static volatile StyledFont[] sf_semibold = new StyledFont[41];
    public static volatile StyledFont[] suisseintl = new StyledFont[41];

    //FONTS ICONS
    public static volatile StyledFont[] nuralpha = new StyledFont[41];
    public static volatile StyledFont[] nuricon = new StyledFont[41];

    @SneakyThrows
    public static void init() {
        long time = System.currentTimeMillis();

        minecraft[8] = new StyledFont("mc.ttf", 8, 0.0f, 0.0f, 0.0f, false, Lang.ENG_RU);
        for (int i = 10; i < 41;i++) {
            sf_bold[i] = new StyledFont("sf_bold.ttf", i, 0.0f, 0.0f, 0.0f, true, Lang.ENG_RU);
        }
        for (int i = 10; i < 41;i++) {
            sf_medium[i] = new StyledFont("sf_medium.ttf", i, 0.0f, 0.0f, 0.0f, true, Lang.ENG_RU);
        }
        for (int i = 10; i < 41;i++) {
            sf_semibold[i] = new StyledFont("sf_semibold.ttf", i, 0.0f, 0.0f, 0.0f, true, Lang.ENG_RU);
        }
        for (int i = 8; i < 41; i++) {
            nuricon[i] = new StyledFont("nur-nextgen.ttf", i, 0.0f, 0.0f, 0.0f, true, Lang.ENG_RU);
        }
        for (int i = 8; i < 41; i++) {
            nuralpha[i] = new StyledFont("nur-alpha.ttf", i, 0.0f, 0.0f, 0.0f, true, Lang.ENG_RU);
        }
        for (int i = 8; i < 41; i++) {
            suisseintl[i] = new StyledFont("suisseintl.ttf", i, 0.0f, 0.0f, 0.0f, true, Lang.ENG_RU);
        }
        for (int i = 8; i < 41; i++) {
            RobotoCondensed[i] = new StyledFont("RobotoCondensed-Regular.ttf", i, 0.0f, 0.0f, 0.0f, true, Lang.ENG_RU);
        }
        for (int i = 8; i < 41; i++) {
            RobotoCondensedBold[i] = new StyledFont("RobotoCondensed-SemiBold.ttf", i, 0.0f, 0.0f, 0.0f, true, Lang.ENG_RU);
        }
    }
}