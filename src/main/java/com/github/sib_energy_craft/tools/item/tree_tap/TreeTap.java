package com.github.sib_energy_craft.tools.item.tree_tap;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;


/**
 * Tree tap tool interface<br/>
 * Rubber tree call {@link TreeTap#onUse(PlayerEntity, Hand, ItemStack)} when player use tree tap on rubber block.
 *
 * @since 0.0.1
 * @author sibmaks
 */
public interface TreeTap {
    /**
     * Called when player use tree tap on filled rubber log.<br/>
     * If method return true when rubber should be added to player inventory.<br/>
     * Otherwise, nothing happened.
     *
     * @param player player
     * @param hand hand with tree tap
     * @param treeTap tree tap item
     * @return true - interaction possible, false - otherwise
     */
    boolean onUse(PlayerEntity player, Hand hand, ItemStack treeTap);
}
