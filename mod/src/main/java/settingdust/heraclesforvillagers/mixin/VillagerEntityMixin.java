package settingdust.heraclesforvillagers.mixin;

import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.village.VillagerGossips;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import settingdust.heraclesforvillagers.GossipHolder;

@Mixin(VillagerEntity.class)
public class VillagerEntityMixin implements GossipHolder {
    @Shadow
    @Final
    private VillagerGossips gossip;

    @NotNull
    @Override
    public VillagerGossips getHeraclesforvillagers$gossips() {
        return gossip;
    }
}
