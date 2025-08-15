package fish.xenos.EventSystem.impl.interfaces;


import fish.xenos.UtilsSystem.fontUtils.Fonts;
import fish.xenos.UtilsSystem.fontUtils.styled.StyledFont;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.text.ITextComponent;

import java.util.ArrayList;
import java.util.List;

public interface IMinecraft {
    Minecraft mc = Minecraft.getInstance();
    MainWindow window = mc.getMainWindow();
    BufferBuilder buffer = Tessellator.getInstance().getBuffer();
    Tessellator tessellator = Tessellator.getInstance();
    StyledFont sf_medium16 = Fonts.sf_medium[16];

    List<ITextComponent> clientMessages = new ArrayList<>();
    default void print(String input) {
    }

}
