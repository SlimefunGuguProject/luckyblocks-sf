package io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public final class LuckyAxeSurprise implements Surprise {
	
	private final ItemStack axe;
	
	public LuckyAxeSurprise() {
		axe = new CustomItem(Material.GOLDEN_AXE, "&e&l幸运斧头");
		axe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		axe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
		axe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 10);
		axe.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
	}
	
	@Override
	public String getName() {
		return "幸运斧头";
	}

	@Override
	public void activate(Random random, Player p, Location l) {
		l.getWorld().dropItemNaturally(l, axe.clone());
	}

	@Override
	public LuckLevel getLuckLevel() {
		return LuckLevel.LUCKY;
	}

}
