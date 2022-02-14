package io.github.ben3dninja.redstonearmor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static io.github.ben3dninja.redstonearmor.RedstoneArmor.MODID;

public class RedstoneArmorItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RedstoneArmorMaterial ARMOR_MATERIAL = new RedstoneArmorMaterial();

    public static final RegistryObject<Item> REDSTONE_HELMET = ITEMS.register("redstone_helmet",
            () -> new ArmorItem(ARMOR_MATERIAL, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> REDSTONE_CHEST = ITEMS.register("redstone_chestplate",
            () -> new ArmorItem(ARMOR_MATERIAL, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings",
            () -> new ArmorItem(ARMOR_MATERIAL, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ItemGroup.REDSTONE)));

    public static final RegistryObject<Item> REDSTONE_BOOTS = ITEMS.register("redstone_boots",
            () -> new ArmorItem(ARMOR_MATERIAL, EquipmentSlotType.FEET,
                    new Item.Properties().group(ItemGroup.REDSTONE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
