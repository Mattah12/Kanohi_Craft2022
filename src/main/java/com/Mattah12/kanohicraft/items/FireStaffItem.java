package com.Mattah12.kanohicraft.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class FireStaffItem extends Item {
    public FireStaffItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

}
