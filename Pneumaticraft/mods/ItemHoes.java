package Pneumaticraft.mods;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;


public class ItemHoes extends ItemHoe
{
	private String iconIndex;	
	public ItemHoes(int par1, EnumToolMaterial par2EnumToolMaterial, String icon) 
	{
		super(par1, par2EnumToolMaterial);
		iconIndex = icon;
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}
	public String getIconIndex()
	{
		return iconIndex;
	}
	public void registerIcons(IconRegister reg)
	{
		itemIcon = reg.registerIcon("Pneumaticraft:" + iconIndex);
	}
}
