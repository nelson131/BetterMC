package com.nelson131.bettermc.Item;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Boats {
    //oak boat
    protected static void createOakBoat(){
        ItemStack oakboat = new ItemStack(Material.OAK_BOAT, 1);
        ShapedRecipe oakboat1 = new ShapedRecipe(oakboat);
        ShapedRecipe oakboat2 = new ShapedRecipe(oakboat);

        oakboat1.shape("ABA", "AAA", "   ");
        oakboat2.shape("   ", "ABA", "AAA");

        oakboat1.setIngredient('A', Material.OAK_PLANKS);
        oakboat2.setIngredient('A', Material.OAK_PLANKS);
        oakboat1.setIngredient('B', Material.WOODEN_SHOVEL);
        oakboat2.setIngredient('B', Material.WOODEN_SHOVEL);

        Bukkit.getServer().addRecipe(oakboat1);
        Bukkit.getServer().addRecipe(oakboat2);
    }

    protected static void createSpruceBoat(){
        ItemStack spruceboat = new ItemStack(Material.SPRUCE_BOAT, 1);
        ShapedRecipe spruceboat1 = new ShapedRecipe(spruceboat);
        ShapedRecipe spruceboat2 = new ShapedRecipe(spruceboat);

        spruceboat1.shape("ABA", "AAA", "   ");
        spruceboat2.shape("   ", "ABA", "AAA");

        spruceboat1.setIngredient('A', Material.SPRUCE_PLANKS);
        spruceboat2.setIngredient('A', Material.SPRUCE_PLANKS);
        spruceboat1.setIngredient('B', Material.WOODEN_SHOVEL);
        spruceboat2.setIngredient('B', Material.WOODEN_SHOVEL);

        Bukkit.getServer().addRecipe(spruceboat1);
        Bukkit.getServer().addRecipe(spruceboat2);
    }
    protected static void createBirchBoat(){
        ItemStack birchboat = new ItemStack(Material.BIRCH_BOAT, 1);
        ShapedRecipe birchboat1 = new ShapedRecipe(birchboat);
        ShapedRecipe birchboat2 = new ShapedRecipe(birchboat);

        birchboat1.shape("ABA", "AAA", "   ");
        birchboat2.shape("   ", "ABA", "AAA");

        birchboat1.setIngredient('A', Material.BIRCH_PLANKS);
        birchboat2.setIngredient('A', Material.BIRCH_PLANKS);
        birchboat1.setIngredient('B', Material.WOODEN_SHOVEL);
        birchboat2.setIngredient('B', Material.WOODEN_SHOVEL);

        Bukkit.getServer().addRecipe(birchboat1);
        Bukkit.getServer().addRecipe(birchboat2);
    }
    protected static void createJungleBoat(){
        ItemStack jungleboat = new ItemStack(Material.JUNGLE_BOAT, 1);
        ShapedRecipe jungleboat1 = new ShapedRecipe(jungleboat);
        ShapedRecipe jungleboat2 = new ShapedRecipe(jungleboat);

        jungleboat1.shape("ABA", "AAA", "   ");
        jungleboat2.shape("   ", "ABA", "AAA");

        jungleboat1.setIngredient('A', Material.BIRCH_PLANKS);
        jungleboat2.setIngredient('A', Material.BIRCH_PLANKS);
        jungleboat1.setIngredient('B', Material.WOODEN_SHOVEL);
        jungleboat2.setIngredient('B', Material.WOODEN_SHOVEL);

        Bukkit.getServer().addRecipe(jungleboat1);
        Bukkit.getServer().addRecipe(jungleboat2);
    }
    protected static void createAcaciaBoat(){
        ItemStack acaciaboat = new ItemStack(Material.ACACIA_BOAT, 1);
        ShapedRecipe acaciaboat1 = new ShapedRecipe(acaciaboat);
        ShapedRecipe acaciaboat2 = new ShapedRecipe(acaciaboat);

        acaciaboat1.shape("ABA", "AAA", "   ");
        acaciaboat2.shape("   ", "ABA", "AAA");

        acaciaboat1.setIngredient('A', Material.JUNGLE_PLANKS);
        acaciaboat2.setIngredient('A', Material.JUNGLE_PLANKS);
        acaciaboat1.setIngredient('B', Material.WOODEN_SHOVEL);
        acaciaboat2.setIngredient('B', Material.WOODEN_SHOVEL);

        Bukkit.getServer().addRecipe(acaciaboat1);
        Bukkit.getServer().addRecipe(acaciaboat2);
    }
    protected static void createDarkBoat(){
        ItemStack darkboat = new ItemStack(Material.DARK_OAK_BOAT, 1);
        ShapedRecipe darkboat1 = new ShapedRecipe(darkboat);
        ShapedRecipe darkboat2 = new ShapedRecipe(darkboat);

        darkboat1.shape("ABA", "AAA", "   ");
        darkboat2.shape("   ", "ABA", "AAA");

        darkboat1.setIngredient('A', Material.DARK_OAK_PLANKS);
        darkboat2.setIngredient('A', Material.DARK_OAK_PLANKS);
        darkboat1.setIngredient('B', Material.WOODEN_SHOVEL);
        darkboat2.setIngredient('B', Material.WOODEN_SHOVEL);

        Bukkit.getServer().addRecipe(darkboat1);
        Bukkit.getServer().addRecipe(darkboat2);
    }
    protected static void createMangBoat(){
        ItemStack mangboat = new ItemStack(Material.MANGROVE_BOAT, 1);
        ShapedRecipe mangboat1 = new ShapedRecipe(mangboat);
        ShapedRecipe mangboat2 = new ShapedRecipe(mangboat);

        mangboat1.shape("ABA", "AAA", "   ");
        mangboat2.shape("   ", "ABA", "AAA");

        mangboat1.setIngredient('A', Material.DARK_OAK_PLANKS);
        mangboat2.setIngredient('A', Material.DARK_OAK_PLANKS);
        mangboat1.setIngredient('B', Material.WOODEN_SHOVEL);
        mangboat2.setIngredient('B', Material.WOODEN_SHOVEL);

        Bukkit.getServer().addRecipe(mangboat1);
        Bukkit.getServer().addRecipe(mangboat2);
    }
}
