package io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import io.github.thebusybiscuit.slimefun4.utils.ColoredMaterial;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;

public final class DiamondBlockPillarSurprise implements Surprise {

    @Override
    public String getName() {
        return "顶部有菱形的染色粘土柱";
    }

    @Override
    public void activate(Random random, Player p, Location l) {
        for (int i = 0; i < 8; i++) {
            l.getWorld().spawnFallingBlock(l.clone().add(0.5, (i + 1) * 4.0, 0.5), ColoredMaterial.TERRACOTTA.get(i).createBlockData());
        }

        l.getWorld().spawnFallingBlock(l.clone().add(0.5, 9 * 4.0, 0.5), Material.DIAMOND_BLOCK.createBlockData());
    }

    @Override
    public LuckLevel getLuckLevel() {
        return LuckLevel.LUCKY;
    }

}
