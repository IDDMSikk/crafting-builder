package pl.iddmsdev.Craftings;

import pl.iddmsdev.Craftings.CraftingsTypes.FurnaceCrafting;
import pl.iddmsdev.Craftings.CraftingsTypes.ShapedCrafting;
import pl.iddmsdev.Craftings.CraftingsTypes.ShapelessCrafting;

import java.util.ArrayList;
import java.util.List;

public abstract class Crafting {

    int id;
    String name;
    protected static List<FurnaceCrafting> furnaceCraftings = new ArrayList<>();
    protected static List<ShapedCrafting> shapedCraftings = new ArrayList<>();
    protected static List<ShapelessCrafting> shapelessCraftings = new ArrayList<>();


    public static void getCraftings() {

    }

}
