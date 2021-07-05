package io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky;

import java.util.Random;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.slimefunluckyblocks.SlimefunLuckyBlocks;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;

public final class UnluckyPotionsSurprise implements Surprise {
	
	@Override
	public String getName() {
		return "倒霉药水";
	}

	@Override
	public void activate(Random random, Player p, Location l) {
		l.getWorld().dropItemNaturally(l, SlimefunLuckyBlocks.createPotion(Color.GREEN, new PotionEffect(PotionEffectType.POISON, 45, 0), false));
		l.getWorld().dropItemNaturally(l, SlimefunLuckyBlocks.createPotion(Color.PURPLE, new PotionEffect(PotionEffectType.WEAKNESS, 90, 0), false));
		l.getWorld().dropItemNaturally(l, SlimefunLuckyBlocks.createPotion(Color.GRAY, new PotionEffect(PotionEffectType.SLOW, 90, 0), false));
		l.getWorld().dropItemNaturally(l, SlimefunLuckyBlocks.createPotion(Color.MAROON, new PotionEffect(PotionEffectType.HARM, 0, 0), false));
	}

	@Override
	public LuckLevel getLuckLevel() {
		return LuckLevel.LUCKY;
	}

}
