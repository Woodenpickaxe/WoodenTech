package me.woodentech.slimefunaddon;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
public class ExampleAddon extends JavaPlugin implements SlimefunAddon {
    @Override
    public void onEnable() {
        Config cfg = new Config(this);
        NamespacedKey categoryId = new NamespacedKey(this, "end_tech_helper");
        CustomItemStack categoryItem = new CustomItemStack(Material.END_STONE, "&4末地科技拓展");
        ItemGroup itemGroup = new ItemGroup(categoryId, categoryItem);
        SlimefunItemStack itemStack = new SlimefunItemStack("ULTRA_HIGH_SPEED_PARTICLE_COLLECTION_CORE", Material.GLOWSTONE, "超高速粒子收集核心", "", "从宇宙中以超级高的速度收集粒子！");
        ItemStack[] recipe = {
                SlimefunItems.QUIRP_OSCILLATOR,SlimefunItems.ZOT_OVERLOADER,SlimefunItems.QUIRP_OSCILLATOR,
                SlimefunItems.ZOT_OVERLOADER,SlimefunItems.STABLEBLOCK,SlimefunItems.ZOT_OVERLOADER,
                SlimefunItems.QUIRP_OSCILLATOR,SlimefunItems.ZOT_OVERLOADER,SlimefunItems.QUIRP_OSCILLATOR
        };
        SlimefunItem sfItem = new SlimefunItem(itemGroup, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
        sfItem.register(this);
    }
    @Override
    public void onDisable() {

    }
    @Override
    public String getBugTrackerURL() {
        return null;
    }
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }
}
