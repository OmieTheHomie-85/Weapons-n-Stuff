package com.om.weaponry.item;

import com.om.weaponry.Weaponry;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Weaponry.MOD_ID);

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.WEAPONRY)));

    public static final RegistryObject<Item> BRONZE_CROSSBOW = ITEMS.register("bronze_crossbow",
            () -> new CrossbowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPONRY).durability(500)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
