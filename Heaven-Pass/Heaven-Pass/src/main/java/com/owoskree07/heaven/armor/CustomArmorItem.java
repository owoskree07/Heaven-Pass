package com.owoskree07.heaven.armor;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public abstract class CustomArmorItem extends ArmorItem
{
	private EffectInstance armorEffect;
	private final Effect armorEffectType;
	private final boolean isTickSlot;
	private final Class<?> itemClass;

	public CustomArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder)
	{
		super(materialIn, slot, builder);
		this.armorEffect = getEffectInstance();
		this.armorEffectType = armorEffect.getPotion();
		this.isTickSlot = slot == EquipmentSlotType.FEET;
		this.itemClass = getItemClass();
	}

	@Override
	public void onArmorTick (final ItemStack stack, final World world, final PlayerEntity player)
	{
		if (!isTickSlot || !hasFullArmor(itemClass, player))
			return;

		giveEffect(player);
	}

	abstract public EffectInstance getEffectInstance();

	abstract public Class<?> getItemClass();

	private void giveEffect(final PlayerEntity player)
	{
		EffectInstance playerEff = player.getActivePotionEffect(this.armorEffectType);
		if (playerEff == null)
			player.addPotionEffect(this.armorEffect);
		else if (playerEff.getAmplifier() > 1 && playerEff.getDuration() <= 1)
		{
			this.armorEffect = getEffectInstance();
			player.addPotionEffect(this.armorEffect);
		}
	}

	private static boolean hasFullArmor (final Class<?> armorType, final PlayerEntity player)
	{
		Iterable<ItemStack> armorList = player.getArmorInventoryList();
		for(ItemStack stack : armorList){
			if (stack.getItem().getClass() != armorType){
				return false;
			}
		}
		return true;
	}
}
