package com.rakion99.usernamemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;

public class Guinick2 extends GuiButton
{

    public Guinick2(int p_i1041_1_, int p_i1041_2_, int p_i1041_3_)
    {
        super(p_i1041_1_, p_i1041_2_, p_i1041_3_, 20, 20, "");
    }

    public void drawButton(Minecraft mc, int mouseX, int mouseY)
    {
        if (this.visible)
        {
            mc.getTextureManager().bindTexture(GuiButton.BUTTON_TEXTURES);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            boolean var4 = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            int var5 = 146;

            if (var4)
            {
                var5 += this.height;
            }

            this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, var5, this.width, this.height);
        }
    }
}
