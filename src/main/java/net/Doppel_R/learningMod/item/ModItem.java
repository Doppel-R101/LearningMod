package net.Doppel_R.learningMod.item;

import net.Doppel_R.learningMod.dwrLearningmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, dwrLearningmod.MOD_ID);

    public static final RegistryObject<Item> MushroomBucket = ITEMS.register("mushroombucket",
            () ->new Item(new Item.Properties().stacksTo(1)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
