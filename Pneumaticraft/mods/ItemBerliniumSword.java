package Pneumaticraft.mods;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;


public class ItemBerliniumSword extends ItemSword{

	public ItemBerliniumSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		setCreativeTab(CreativeTabs.tabCombat);
		
	}
	
	
	
	public void registerIcons(IconRegister reg){
		itemIcon = reg.registerIcon("Pneumaticraft:berliniumSword");
	}
	
}
