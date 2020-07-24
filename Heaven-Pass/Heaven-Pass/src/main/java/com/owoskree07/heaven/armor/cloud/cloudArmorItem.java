package com.owoskree07.heaven.armor.cloud;

import com.owoskree07.heaven.armor.CustomArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class cloudArmorItem extends CustomArmorItem
{
	public cloudArmorItem (IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
	}

	@Override
	public Class getItemClass()
	{
		return this.getClass();
	}

	@Override
	public EffectInstance getEffectInstance()
	{
		return new EffectInstance(Effects.SLOW_FALLING, 0, 0, false, false);
	}
}
