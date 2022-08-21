package com.fernirsmodz.fernirsarmors.item;


import com.electronwill.nightconfig.core.EnumGetMethod;
import com.fernirsmodz.fernirsarmors.FernirsArmors;
import com.fernirsmodz.fernirsarmors.item.custom.AdventurerArmorItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.inventory.EquipmentSlotType.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS , FernirsArmors.MOD_ID);

    public static final RegistryObject<Item> MITHRIL = ITEMS.register("mithril",
            () -> new Item(new Item.Properties().group(ModItemGroup.FERNIRS_GROUP)));

    public static final RegistryObject<Item> IRONPLATES = ITEMS.register("iron_plates",
            () -> new Item(new Item.Properties().group(ModItemGroup.FERNIRS_GROUP)));

    //MITHRIL ARMOR

    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ArmorItem(ModArmorMaterial.MITHRIL, FEET,
                    new Item.Properties().group(ModItemGroup.FERNIRS_GROUP)));

    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ArmorItem(ModArmorMaterial.MITHRIL, LEGS,
                    new Item.Properties().group(ModItemGroup.FERNIRS_GROUP)));

    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ArmorItem(ModArmorMaterial.MITHRIL, CHEST,
                    new Item.Properties().group(ModItemGroup.FERNIRS_GROUP)));

    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new ArmorItem(ModArmorMaterial.MITHRIL, HEAD,
                    new Item.Properties().group(ModItemGroup.FERNIRS_GROUP)));


    //ADVENTURER ARMOR


    public static final RegistryObject<Item> Adventurer_Armor = ITEMS.register("adventurer_armor",
            () -> new ArmorItem(ModArmorMaterial.IRONPLATES, CHEST,
                    new Item.Properties().group(ModItemGroup.FERNIRS_GROUP)));

    public static final RegistryObject<Item> Adventurer_Helmet = ITEMS.register("adventurer_helmet",
            () -> new ArmorItem(ModArmorMaterial.IRONPLATES, HEAD,
                    new Item.Properties().group(ModItemGroup.FERNIRS_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
