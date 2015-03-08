package machicraft.init;

import machicraft.blocks.BlockCopperBlock;
import machicraft.blocks.BlockCopperOre;
import machicraft.blocks.BlockTungstenOre;
import machicraft.help.RegisterHelper;
import machicraft.items.ItemCopperIngot;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModBlocks {
	public static Block copperOre = new BlockCopperOre(); 
	public static Block copperBlock = new BlockCopperBlock(); 
	public static Block tungstenOre = new BlockTungstenOre(); 
	
	 public static void init() {
           RegisterHelper.registerBlock(copperOre);
           RegisterHelper.registerBlock(tungstenOre);
           RegisterHelper.registerBlock(copperBlock);
     }
}
