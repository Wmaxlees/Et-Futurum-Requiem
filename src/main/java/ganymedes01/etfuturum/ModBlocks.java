package ganymedes01.etfuturum;

import cpw.mods.fml.common.registry.GameRegistry;
import ganymedes01.etfuturum.blocks.*;
import ganymedes01.etfuturum.blocks.itemblocks.*;
import ganymedes01.etfuturum.blocks.ores.BlockCopperOre;
import ganymedes01.etfuturum.blocks.ores.BlockDeepslateOre;
import ganymedes01.etfuturum.blocks.ores.BlockDeepslateRedstoneOre;
import ganymedes01.etfuturum.blocks.ores.BlockOreNetherGold;
import ganymedes01.etfuturum.client.sound.ModSounds;
import ganymedes01.etfuturum.configuration.configs.*;
import ganymedes01.etfuturum.tileentities.TileEntityWoodSign;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAnvilBlock;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public enum ModBlocks {
	STONE(ConfigBlocksItems.enableStones, new BlockBountifulStone()),
	PRISMARINE_BLOCK(ConfigBlocksItems.enablePrismarine, new BaseSubtypesBlock(Material.rock, "prismarine$i", "prismarine_bricks", "dark_prismarine")
			.setHardness(1.5F).setResistance(10.0F)),
	SEA_LANTERN(ConfigBlocksItems.enablePrismarine, new BlockSeaLantern()),
	DAYLIGHT_DETECTOR_INVERTED(ConfigBlocksItems.enableInvertedDaylightSensor, new BlockInvertedDaylightDetector(), null),
	RED_SANDSTONE(ConfigBlocksItems.enableRedSandstone, new BlockRedSandstone(), ItemBlockRedSandstone.class),
	BROWN_MUSHROOM(ConfigFunctions.enableSilkTouchingMushrooms, new BlockSilkedMushroom(Blocks.brown_mushroom_block, "brown")),
	RED_MUSHROOM(ConfigFunctions.enableSilkTouchingMushrooms, new BlockSilkedMushroom(Blocks.red_mushroom_block, "red")),
	COARSE_DIRT(ConfigBlocksItems.enableCoarseDirt, new BlockCoarseDirt()),
	BANNER(ConfigBlocksItems.enableBanners, new BlockBanner(), ItemBlockBanner.class),
	SLIME(ConfigBlocksItems.enableSlimeBlock, new BlockSlime()),
	SPONGE(ConfigBlocksItems.enableSponge, new BlockSponge()),
	BEETROOTS(ConfigBlocksItems.enableBeetroot, new BlockBeetroot(), null),
	PURPUR_BLOCK(ConfigBlocksItems.enableChorusFruit, new BlockPurpur()),
	PURPUR_PILLAR(ConfigBlocksItems.enableChorusFruit, new BlockPurpurPillar()),
	END_BRICKS(ConfigBlocksItems.enableChorusFruit, new BlockEndBricks()),
	GRASS_PATH(ConfigBlocksItems.enableGrassPath, new BlockGrassPath()),
	END_ROD(ConfigBlocksItems.enableChorusFruit, new BlockEndRod()),
	CHORUS_PLANT(ConfigBlocksItems.enableChorusFruit, new BlockChorusPlant()),
	CHORUS_FLOWER(ConfigBlocksItems.enableChorusFruit, new BlockChorusFlower()),
	BONE(ConfigBlocksItems.enableBoneBlock, new BlockBone()),
	RED_NETHERBRICK(ConfigBlocksItems.enableNewNetherBricks, new BlockNewNetherBrick()), //Also contains chiseled and cracked nether bricks
	ANCIENT_DEBRIS(ConfigBlocksItems.enableNetherite, new BlockAncientDebris(), ItemBlockUninflammable.class),
	NETHERITE_BLOCK(ConfigBlocksItems.enableNetherite, new BlockNetherite(), ItemBlockUninflammable.class),
	NETHER_GOLD_ORE(ConfigBlocksItems.enableNetherGold, new BlockOreNetherGold()),
	BLUE_ICE(ConfigBlocksItems.enableBlueIce, new BlockBlueIce()),
	SMOOTH_STONE(ConfigBlocksItems.enableSmoothStone, new BaseBlock(Material.rock).setUnlocalizedNameWithPrefix("smooth_stone")
			.setBlockTextureName("stone_slab_top").setHardness(2F).setResistance(6F)),
	SMOOTH_SANDSTONE(ConfigBlocksItems.enableSmoothSandstone, new BaseBlock(Material.rock).setUnlocalizedNameWithPrefix("smooth_sandstone")
			.setBlockTextureName("sandstone_top").setHardness(2F).setResistance(6F)),
	SMOOTH_RED_SANDSTONE(ConfigBlocksItems.enableRedSandstone, new BaseBlock(Material.rock).setUnlocalizedNameWithPrefix("smooth_red_sandstone")
			.setBlockTextureName("red_sandstone_top").setHardness(2F).setResistance(6F)),
	SMOOTH_QUARTZ(ConfigBlocksItems.enableSmoothQuartz, new BaseBlock(Material.rock).setUnlocalizedNameWithPrefix("smooth_quartz")
			.setBlockTextureName("quartz_block_bottom").setHardness(2F).setResistance(6F)),
	QUARTZ_BRICKS(ConfigBlocksItems.enableQuartzBricks, new BaseBlock(Material.rock).setNames("quartz_bricks")
			.setHardness(.8F).setResistance(.8F)),
	LOG_STRIPPED(ConfigBlocksItems.enableStrippedLogs, new BlockStrippedOldLog()),
	LOG2_STRIPPED(ConfigBlocksItems.enableStrippedLogs, new BlockStrippedNewLog()),
	BARK(ConfigBlocksItems.enableBarkLogs, new BlockWoodBarkOld()),
	BARK2(ConfigBlocksItems.enableBarkLogs, new BlockWoodBarkNew()),
	WOOD_STRIPPED(ConfigBlocksItems.enableStrippedLogs && ConfigBlocksItems.enableBarkLogs, new BlockStrippedOldWood()),
	WOOD2_STRIPPED(ConfigBlocksItems.enableStrippedLogs && ConfigBlocksItems.enableBarkLogs, new BlockStrippedNewWood()),
	CONCRETE(ConfigBlocksItems.enableConcrete, new BaseSubtypesBlock(Material.rock, "white_concrete", "orange_concrete", "magenta_concrete", "light_blue_concrete", "yellow_concrete", "lime_concrete", "pink_concrete",
			"gray_concrete", "light_gray_concrete", "cyan_concrete", "purple_concrete", "blue_concrete", "brown_concrete", "green_concrete", "red_concrete", "black_concrete").setNames("concrete")
			.setMapColorBaseBlock(Blocks.wool).setHardness(1.8F).setResistance(1.8F),
			BaseItemBlock.class),
	CONCRETE_POWDER(ConfigBlocksItems.enableConcrete, new BlockConcretePowder()),
	COPPER_ORE(ConfigBlocksItems.enableCopper, new BlockCopperOre()),
	DEEPSLATE_COPPER_ORE(ConfigBlocksItems.enableCopper && ConfigBlocksItems.enableDeepslate && ConfigBlocksItems.enableDeepslateOres, new BlockDeepslateOre(COPPER_ORE.get())),
	CORNFLOWER(ConfigBlocksItems.enableCornflower, new BaseFlower().setNames("cornflower")),
	LILY_OF_THE_VALLEY(ConfigBlocksItems.enableLilyOfTheValley, new BaseFlower().setNames("lily_of_the_valley")),
	WITHER_ROSE(ConfigBlocksItems.enableWitherRose, new BlockWitherRose()),
	SWEET_BERRY_BUSH(ConfigBlocksItems.enableSweetBerryBushes, new BlockBerryBush(), null),
	WHITE_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(0)),
	ORANGE_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(1)),
	MAGENTA_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(2)),
	LIGHT_BLUE_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(3)),
	YELLOW_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(4)),
	LIME_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(5)),
	PINK_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(6)),
	GRAY_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(7)),
	LIGHT_GRAY_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(8)),
	CYAN_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(9)),
	PURPLE_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(10)),
	BLUE_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(11)),
	BROWN_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(12)),
	GREEN_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(13)),
	RED_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(14)),
	BLACK_GLAZED_TERRACOTTA(ConfigBlocksItems.enableGlazedTerracotta, new BlockGlazedTerracotta(15)),
	COPPER_BLOCK(ConfigBlocksItems.enableCopper, new BlockCopper()),
	LIGHTNING_ROD(EtFuturum.TESTING, new BlockLightningRod()),
	DEEPSLATE(ConfigBlocksItems.enableDeepslate, new BlockDeepslate()),
	COBBLED_DEEPSLATE(ConfigBlocksItems.enableDeepslate, new BaseBlock(Material.rock).setNames("cobbled_deepslate")
			.setBlockSound(ModSounds.soundDeepslate).setHardness(3.5F).setResistance(6).setCreativeTab(EtFuturum.creativeTabBlocks)),
	POLISHED_DEEPSLATE(ConfigBlocksItems.enableDeepslate, new BaseBlock(Material.rock).setNames("polished_deepslate")
			.setBlockSound(ModSounds.soundDeepslate).setHardness(3.5F).setResistance(6).setCreativeTab(EtFuturum.creativeTabBlocks)),
	DEEPSLATE_BRICKS(ConfigBlocksItems.enableDeepslate, new BaseSubtypesBlock(Material.rock,
			"deepslate_bricks", "cracked_deepslate_bricks", "deepslate_tiles", "cracked_deepslate_tiles", "chiseled_deepslate").setNames("deepslate_bricks")
			.setBlockSound(ModSounds.soundDeepslateBricks).setHardness(1.5F).setResistance(6)),
	TUFF(ConfigBlocksItems.enableTuff, new BlockTuff()),
	RAW_ORE_BLOCK(ConfigBlocksItems.enableRawOres, new BaseSubtypesBlock(Material.rock, "raw_copper_block", "raw_iron_block", "raw_gold_block").setNames("raw_ore_block")
			.setToolClass("pickaxe", 1, 0).setToolClass("pickaxe", 1, 1).setToolClass("pickaxe", 2, 2)
			.setHardness(5).setResistance(6)),
	SMOOTH_BASALT(ConfigBlocksItems.enableBasalt, new BaseBlock(Material.rock).setNames("smooth_basalt")
			.setBlockSound(ModSounds.soundBasalt).setHardness(1.25F).setResistance(4.2F)),
	CALCITE(ConfigBlocksItems.enableCalcite, new BaseBlock(Material.rock).setNames("calcite")
			.setBlockSound(ModSounds.soundCalcite).setHardness(0.75F).setResistance(0.75F)),
	AMETHYST_BLOCK(ConfigBlocksItems.enableAmethyst, new BlockAmethystBlock()),
	BUDDING_AMETHYST(ConfigBlocksItems.enableAmethyst, new BlockBuddingAmethyst()),
	AMETHYST_CLUSTER_1(ConfigBlocksItems.enableAmethyst, new BlockAmethystCluster(0), ItemBlockAmethystCluster.class),
	AMETHYST_CLUSTER_2(ConfigBlocksItems.enableAmethyst, new BlockAmethystCluster(1), ItemBlockAmethystCluster.class),
	TINTED_GLASS(ConfigBlocksItems.enableAmethyst, new BlockTintedGlass()),

	// Mud
	// TODO: Change Packed Mud vs Mud Bricks Sound
	MUD(ConfigBlocksItems.enableMud, new BaseBlock(Material.ground).setBlockSound(ModSounds.soundMud).setNames("mud")
			.setHardness(0.5F).setResistance(0.5F).setCreativeTab(EtFuturum.creativeTabBlocks)),
	MUDDY_MANGROVE_ROOTS(ConfigBlocksItems.enableMud, new BlockMuddyMangroveRoots()),
	PACKED_MUD(ConfigBlocksItems.enableMud, new BlockPackedMud()),

	MOSS_BLOCK(ConfigBlocksItems.enableMoss, new BlockMoss()),
	MOSS_CARPET(ConfigBlocksItems.enableMoss, new BlockMossCarpet()),
	AZALEA(ConfigBlocksItems.enableMoss, new BlockAzalea(0)),

	STONE_WALL(ConfigBlocksItems.enableExtraVanillaWalls, new BaseWall("stone_wall", new Block[]{Blocks.stonebrick, Blocks.stonebrick, Blocks.sandstone, Blocks.brick_block}, new int[]{0, 1, 0, 0}, new String[]{"stone_brick_wall", "mossy_stone_brick_wall", "sandstone_wall", "brick_wall"})),
	NETHER_BRICK_WALL(ConfigBlocksItems.enableExtraVanillaWalls, new BaseWall("nether_brick_wall", new Block[]{Blocks.nether_brick}, new int[]{0}, null)),
	STONE_WALL_2(ConfigBlocksItems.enableStones, new BaseWall("stone_wall_2", new Block[]{STONE.get(), STONE.get(), STONE.get()}, new int[]{1, 3, 5}, new String[]{"granite_wall", "diorite_wall", "andesite_wall"})),
	RED_SANDSTONE_WALL(ConfigBlocksItems.enableRedSandstone, new BaseWall("red_sandstone_wall", new Block[]{RED_SANDSTONE.get()}, new int[]{0}, null)),
	PRISMARINE_WALL(ConfigBlocksItems.enablePrismarine, new BaseWall("prismarine_wall", new Block[]{PRISMARINE_BLOCK.get()}, new int[]{0}, null)),
	RED_NETHER_BRICK_WALL(ConfigBlocksItems.enableNewNetherBricks, new BaseWall("red_nether_brick_wall", new Block[]{RED_NETHERBRICK.get()}, new int[]{0}, null)),
	END_BRICK_WALL(ConfigBlocksItems.enableChorusFruit, new BaseWall("end_brick_wall", new Block[]{END_BRICKS.get()}, new int[]{0}, null)),
	DEEPSLATE_WALL(ConfigBlocksItems.enableDeepslate, new BaseWall("deepslate_wall", new Block[]{COBBLED_DEEPSLATE.get(), POLISHED_DEEPSLATE.get()}, new int[]{0, 0}, new String[]{"cobbled_deepslate_wall", "polished_deepslate_wall"})),
	DEEPSLATE_BRICK_WALL(ConfigBlocksItems.enableDeepslate, new BaseWall("deepslate_brick_wall", new Block[]{DEEPSLATE_BRICKS.get(), DEEPSLATE_BRICKS.get()}, new int[]{0, 2}, new String[]{"deepslate_brick_wall", "deepslate_tile_wall"})),
	MUD_BRICK_WALL(ConfigBlocksItems.enableMud, new BaseWall("mud_brick_wall", new Block[]{PACKED_MUD.get()}, new int[]{1}, new String[]{"mud_brick_wall"})),
	DEEPSLATE_COAL_ORE(ConfigBlocksItems.enableDeepslate && ConfigBlocksItems.enableDeepslateOres, new BlockDeepslateOre(Blocks.coal_ore)),
	DEEPSLATE_IRON_ORE(ConfigBlocksItems.enableDeepslate && ConfigBlocksItems.enableDeepslateOres, new BlockDeepslateOre(Blocks.iron_ore)),
	DEEPSLATE_GOLD_ORE(ConfigBlocksItems.enableDeepslate && ConfigBlocksItems.enableDeepslateOres, new BlockDeepslateOre(Blocks.gold_ore)),
	DEEPSLATE_REDSTONE_ORE(ConfigBlocksItems.enableDeepslate && ConfigBlocksItems.enableDeepslateOres, new BlockDeepslateRedstoneOre(false)),
	DEEPSLATE_LIT_REDSTONE_ORE(ConfigBlocksItems.enableDeepslate && ConfigBlocksItems.enableDeepslateOres, new BlockDeepslateRedstoneOre(true), null),
	DEEPSLATE_LAPIS_ORE(ConfigBlocksItems.enableDeepslate && ConfigBlocksItems.enableDeepslateOres, new BlockDeepslateOre(Blocks.lapis_ore)),
	DEEPSLATE_DIAMOND_ORE(ConfigBlocksItems.enableDeepslate && ConfigBlocksItems.enableDeepslateOres, new BlockDeepslateOre(Blocks.diamond_ore)),
	DEEPSLATE_EMERALD_ORE(ConfigBlocksItems.enableDeepslate && ConfigBlocksItems.enableDeepslateOres, new BlockDeepslateOre(Blocks.emerald_ore)),
	BREWING_STAND(ConfigBlocksItems.enableBrewingStands, new BlockNewBrewingStand()),
	BEACON(ConfigBlocksItems.enableColourfulBeacons, new BlockNewBeacon()),
	ENCHANTMENT_TABLE(ConfigBlocksItems.enableEnchantingTable, new BlockNewEnchantmentTable()),
	ANVIL(ConfigBlocksItems.enableAnvil, new BlockNewAnvil(), ItemAnvilBlock.class),
	DAYLIGHT_DETECTOR(ConfigBlocksItems.enableInvertedDaylightSensor && ConfigBlocksItems.enableOldBaseDaylightSensor, new BlockNewDaylightSensor()),
	FROSTED_ICE(ConfigEnchantsPotions.enableFrostWalker, new BlockFrostedIce(), null),
	LAVA_CAULDRON(ConfigBlocksItems.enableLavaCauldrons, new BlockLavaCauldron(), null),
	POTION_CAULDRON(ConfigBlocksItems.enablePotionCauldron, new BlockPotionCauldron(), null),
	OBSERVER(ConfigMixins.enableObservers, new BlockObserver()),
	TARGET(ConfigBlocksItems.enableTarget, new BlockTarget()),
	RED_SANDSTONE_STAIRS(ConfigBlocksItems.enableRedSandstone, new BaseStairs(RED_SANDSTONE.get(), 0)),
	PURPUR_STAIRS(ConfigBlocksItems.enableChorusFruit, new BaseStairs(PURPUR_BLOCK.get(), 0).setUnlocalizedNameWithPrefix("purpur")),
	RED_SANDSTONE_SLAB(ConfigBlocksItems.enableRedSandstone, new BlockRedSandstoneSlab(false)),
	DOUBLE_RED_SANDSTONE_SLAB(ConfigBlocksItems.enableRedSandstone, new BlockRedSandstoneSlab(true)),
	PURPUR_SLAB(ConfigBlocksItems.enableChorusFruit, new BlockPurpurSlab(false)),
	DOUBLE_PURPUR_SLAB(ConfigBlocksItems.enableChorusFruit, new BlockPurpurSlab(true)),
	STONE_SLAB(ConfigBlocksItems.enableExtraVanillaSlabs, new BlockStoneSlab1(false)),
	DOUBLE_STONE_SLAB(ConfigBlocksItems.enableExtraVanillaSlabs, new BlockStoneSlab1(true)),
	STONE_SLAB_2(ConfigBlocksItems.enableStones, new BaseSlab(false, Material.rock,
			"granite", "polished_granite", "diorite", "polished_diorite", "andesite", "polished_andesite").setUnlocalizedNameWithPrefix("stone_slab_2")
			.setHardness(2F).setResistance(6F)),
	DOUBLE_STONE_SLAB_2(ConfigBlocksItems.enableStones, new BaseSlab(true, Material.rock,
			"granite", "polished_granite", "diorite", "polished_diorite", "andesite", "polished_andesite").setUnlocalizedNameWithPrefix("stone_slab_2")
			.setHardness(2F).setResistance(6F)),
	PRISMARINE_STAIRS(ConfigBlocksItems.enablePrismarine, new BaseStairs(PRISMARINE_BLOCK.get(), 0).setUnlocalizedNameWithPrefix("prismarine")),
	PRISMARINE_STAIRS_BRICK(ConfigBlocksItems.enablePrismarine, new BaseStairs(PRISMARINE_BLOCK.get(), 1).setUnlocalizedNameWithPrefix("prismarine_brick")),
	PRISMARINE_STAIRS_DARK(ConfigBlocksItems.enablePrismarine, new BaseStairs(PRISMARINE_BLOCK.get(), 2).setUnlocalizedNameWithPrefix("dark_prismarine")),
	SMOOTH_SANDSTONE_STAIRS(ConfigBlocksItems.enableSmoothSandstone, new BaseStairs(SMOOTH_SANDSTONE.get(), 0)),
	SMOOTH_RED_SANDSTONE_STAIRS(ConfigBlocksItems.enableRedSandstone, new BaseStairs(SMOOTH_RED_SANDSTONE.get(), 0)),
	SMOOTH_QUARTZ_STAIRS(ConfigBlocksItems.enableSmoothQuartz, new BaseStairs(SMOOTH_QUARTZ.get(), 0)),
	RED_NETHERBRICK_STAIRS(ConfigBlocksItems.enableNewNetherBricks, new BaseStairs(RED_NETHERBRICK.get(), 0).setUnlocalizedNameWithPrefix("red_nether_brick")),
	GRANITE_STAIRS(ConfigBlocksItems.enableStones, new BaseStairs(STONE.get(), 1).setUnlocalizedNameWithPrefix("granite")),
	POLISHED_GRANITE_STAIRS(ConfigBlocksItems.enableStones, new BaseStairs(STONE.get(), 2).setUnlocalizedNameWithPrefix("polished_granite")),
	DIORITE_STAIRS(ConfigBlocksItems.enableStones, new BaseStairs(STONE.get(), 3).setUnlocalizedNameWithPrefix("diorite")),
	POLISHED_DIORITE_STAIRS(ConfigBlocksItems.enableStones, new BaseStairs(STONE.get(), 4).setUnlocalizedNameWithPrefix("polished_diorite")),
	ANDESITE_STAIRS(ConfigBlocksItems.enableStones, new BaseStairs(STONE.get(), 5).setUnlocalizedNameWithPrefix("andesite")),
	POLISHED_ANDESITE_STAIRS(ConfigBlocksItems.enableStones, new BaseStairs(STONE.get(), 6).setUnlocalizedNameWithPrefix("polished_andesite")),
	MOSSY_STONE_BRICK_STAIRS(ConfigBlocksItems.enableExtraVanillaStairs, new BaseStairs(Blocks.stonebrick, 1).setUnlocalizedNameWithPrefix("mossy_stone_brick")),
	MOSSY_COBBLESTONE_STAIRS(ConfigBlocksItems.enableExtraVanillaStairs, new BaseStairs(Blocks.mossy_cobblestone, 0).setUnlocalizedNameWithPrefix("mossy_cobblestone")),
	STONE_STAIRS(ConfigBlocksItems.enableExtraVanillaStairs, new BaseStairs(Blocks.stone, 0)),
	END_BRICK_STAIRS(ConfigBlocksItems.enableChorusFruit, new BaseStairs(END_BRICKS.get(), 0)),
	SMOOTH_SANDSTONE_SLAB(ConfigBlocksItems.enableSmoothSandstone, new BlockSmoothSandstoneSlab(0, false)),
	DOUBLE_SMOOTH_SANDSTONE_SLAB(ConfigBlocksItems.enableSmoothSandstone, new BlockSmoothSandstoneSlab(0, true)),
	SMOOTH_RED_SANDSTONE_SLAB(ConfigBlocksItems.enableRedSandstone, new BlockSmoothSandstoneSlab(1, false)),
	DOUBLE_SMOOTH_RED_SANDSTONE_SLAB(ConfigBlocksItems.enableSmoothSandstone, new BlockSmoothSandstoneSlab(1, true)),
	PRISMARINE_SLAB(ConfigBlocksItems.enablePrismarine, new BaseSlab(false, Material.rock, "prismarine", "prismarine_bricks", "dark_prismarine").setUnlocalizedNameWithPrefix("prismarine_slab")
			.setHardness(1.5F).setResistance(6.0F),
			BaseSlabItemBlock.class),
	DOUBLE_PRISMARINE_SLAB(ConfigBlocksItems.enablePrismarine, new BaseSlab(true, Material.rock, "prismarine", "prismarine_bricks", "dark_prismarine").setUnlocalizedNameWithPrefix("prismarine_slab")
			.setHardness(1.5F).setResistance(6.0F),
			BaseSlabItemBlock.class),
	SMOOTH_QUARTZ_SLAB(ConfigBlocksItems.enableSmoothQuartz, new BlockSmoothQuartzSlab(false)),
	DOUBLE_SMOOTH_QUARTZ_SLAB(ConfigBlocksItems.enableSmoothQuartz, new BlockSmoothQuartzSlab(true)),
	RED_NETHERBRICK_SLAB(ConfigBlocksItems.enableNewNetherBricks, new BaseSlab(false, Material.rock, "red_nether_bricks").setUnlocalizedNameWithPrefix("red_nether_brick_slab")
			.setResistance(6).setHardness(2.0F),
			BaseSlabItemBlock.class),
	DOUBLE_RED_NETHERBRICK_SLAB(ConfigBlocksItems.enableNewNetherBricks, new BaseSlab(true, Material.rock, "red_nether_bricks").setUnlocalizedNameWithPrefix("red_nether_brick_slab")
			.setResistance(6).setHardness(2.0F),
			BaseSlabItemBlock.class),
	END_BRICK_SLAB(ConfigBlocksItems.enableChorusFruit, new BaseSlab(false, Material.rock, "end_bricks").setUnlocalizedNameWithPrefix("end_brick_slab")
			.setResistance(9).setHardness(3.0F),
			BaseSlabItemBlock.class),
	DOUBLE_END_BRICK_SLAB(ConfigBlocksItems.enableChorusFruit, new BaseSlab(true, Material.rock, "end_bricks").setUnlocalizedNameWithPrefix("end_brick_slab")
			.setResistance(9).setHardness(3.0F),
			BaseSlabItemBlock.class),
	CUT_COPPER_SLAB(ConfigBlocksItems.enableCopper, new BlockCutCopperSlab(false)),
	DOUBLE_CUT_COPPER_SLAB(ConfigBlocksItems.enableCopper, new BlockCutCopperSlab(true)),
	DEEPSLATE_SLAB(ConfigBlocksItems.enableDeepslate, new BaseSlab(false, Material.rock, "cobbled_deepslate", "polished_deepslate").setNames("deepslate_slab")
			.setBlockSound(ModSounds.soundDeepslate).setHardness(3).setResistance(6)),
	DOUBLE_DEEPSLATE_SLAB(ConfigBlocksItems.enableDeepslate, new BaseSlab(true, Material.rock, "cobbled_deepslate", "polished_deepslate").setNames("deepslate_slab")
			.setBlockSound(ModSounds.soundDeepslate).setHardness(3).setResistance(6)),
	DEEPSLATE_BRICK_SLAB(ConfigBlocksItems.enableDeepslate, new BaseSlab(false, Material.rock, "deepslate_bricks", "deepslate_tiles").setNames("deepslate_brick_slab")
			.setBlockSound(ModSounds.soundDeepslateBricks).setHardness(3).setResistance(6)),
	DOUBLE_DEEPSLATE_BRICK_SLAB(ConfigBlocksItems.enableDeepslate, new BaseSlab(true, Material.rock, "deepslate_bricks", "deepslate_tiles").setNames("deepslate_brick_slab")
			.setBlockSound(ModSounds.soundDeepslateBricks).setHardness(3).setResistance(6)),
	MUD_BRICK_SLAB(ConfigBlocksItems.enableMud, new BaseSlab(false, Material.rock, "mud_bricks").setNames("mud_brick_slab")
			.setBlockSound(ModSounds.soundMudBricks).setHardness(3).setResistance(6)),
	DOUBLE_MUD_BRICK_SLAB(ConfigBlocksItems.enableMud, new BaseSlab(true, Material.rock, "mud_bricks").setNames("mud_brick_slab")
			.setBlockSound(ModSounds.soundMudBricks).setHardness(3).setResistance(6)),
	CUT_COPPER_STAIRS(ConfigBlocksItems.enableCopper, new BlockCutCopperStairs(4)),
	EXPOSED_CUT_COPPER_STAIRS(ConfigBlocksItems.enableCopper, new BlockCutCopperStairs(5)),
	WEATHERED_CUT_COPPER_STAIRS(ConfigBlocksItems.enableCopper, new BlockCutCopperStairs(6)),
	OXIDIZED_CUT_COPPER_STAIRS(ConfigBlocksItems.enableCopper, new BlockCutCopperStairs(7)),
	WAXED_CUT_COPPER_STAIRS(ConfigBlocksItems.enableCopper, new BlockCutCopperStairs(12)),
	WAXED_EXPOSED_CUT_COPPER_STAIRS(ConfigBlocksItems.enableCopper, new BlockCutCopperStairs(13)),
	WAXED_WEATHERED_CUT_COPPER_STAIRS(ConfigBlocksItems.enableCopper, new BlockCutCopperStairs(14)),
	WAXED_OXIDIZED_CUT_COPPER_STAIRS(ConfigBlocksItems.enableCopper, new BlockCutCopperStairs(15)),
	COBBLED_DEEPSLATE_STAIRS(ConfigBlocksItems.enableDeepslate, new BaseStairs(COBBLED_DEEPSLATE.get(), 0)),
	POLISHED_DEEPSLATE_STAIRS(ConfigBlocksItems.enableDeepslate, new BaseStairs(POLISHED_DEEPSLATE.get(), 0)),
	DEEPSLATE_BRICK_STAIRS(ConfigBlocksItems.enableDeepslate, new BaseStairs(DEEPSLATE_BRICKS.get(), 0)),
	DEEPSLATE_TILE_STAIRS(ConfigBlocksItems.enableDeepslate, new BaseStairs(DEEPSLATE_BRICKS.get(), 2).setUnlocalizedNameWithPrefix("deepslate_tile")
			.setBlockSound(ModSounds.soundDeepslateTiles)),
	MUD_BRICK_STAIRS(ConfigBlocksItems.enableMud, new BaseStairs(PACKED_MUD.get(), 1).setUnlocalizedNameWithPrefix("mud_brick")
			.setBlockSound(ModSounds.soundMudBricks)),
	IRON_TRAPDOOR(ConfigBlocksItems.enableIronTrapdoor, new BlockIronTrapdoor()),
	MAGMA(ConfigBlocksItems.enableMagmaBlock, new BlockMagma()),
	BARREL(ConfigBlocksItems.enableBarrel, new BlockBarrel()),
	LANTERN(ConfigBlocksItems.enableLantern, new BlockLantern()),
	SMOKER(ConfigBlocksItems.enableSmoker, new BlockSmoker(false)),
	LIT_SMOKER(ConfigBlocksItems.enableSmoker, new BlockSmoker(true), null),
	BLAST_FURNACE(ConfigBlocksItems.enableBlastFurnace, new BlockBlastFurnace(false)),
	LIT_BLAST_FURNACE(ConfigBlocksItems.enableBlastFurnace, new BlockBlastFurnace(true), null),
	SHULKER_BOX(ConfigBlocksItems.enableShulkerBoxes, new BlockShulkerBox(), ItemBlockShulkerBox.class),
	SMITHING_TABLE(ConfigBlocksItems.enableSmithingTable, new BlockSmithingTable()),
	COMPOSTER(ConfigBlocksItems.enableComposter, new BlockComposter()),
	STONECUTTER(ConfigBlocksItems.enableStonecutter, new BlockStonecutter(), ItemBlockDecorationWorkbench.class),
	FLETCHING_TABLE(ConfigBlocksItems.enableFletchingTable, new BlockFletchingTable(), ItemBlockDecorationWorkbench.class),
	CARTOGRAPHY_TABLE(ConfigBlocksItems.enableCartographyTable, new BlockCartographyTable(), ItemBlockDecorationWorkbench.class),
	LOOM(ConfigBlocksItems.enableLoom, new BlockLoom(), ItemBlockDecorationWorkbench.class),
	DRIPSTONE_BLOCK(EtFuturum.TESTING, new BaseBlock(Material.rock).setNames("dripstone_block")
			.setBlockSound(ModSounds.soundDripstoneBlock).setHardness(1.5F).setResistance(1F)),
	POINTED_DRIPSTONE(EtFuturum.TESTING, new BlockPointedDripstone()),
	HONEY_BLOCK(ConfigBlocksItems.enableHoney, new BlockHoney()),
	HONEYCOMB_BLOCK(ConfigBlocksItems.enableHoney, new BaseBlock(Material.clay).setNames("honeycomb_block")
			.setBlockSound(ModSounds.soundCoralBlock).setHardness(0.6F).setResistance(0.6F)),
	BEEHIVE(ConfigEntities.enableBees, new BlockBeeHive().setHiveType("beehive", true)),
	BEE_NEST(ConfigEntities.enableBees, new BlockBeeHive().setHiveType("bee_nest", true)),
	CHAIN(ConfigBlocksItems.enableChain, new BlockChain()),

	SOUL_SOIL(ConfigBlocksItems.enableSoulSoil, new BlockSoulSoil()),
	SHROOMLIGHT(ConfigBlocksItems.enableCrimsonBlocks || ConfigBlocksItems.enableWarpedBlocks, new BaseBlock(Material.gourd).setNames("shroomlight").setBlockSound(ModSounds.soundShroomlight)
			.setResistance(1).setHardness(1).setLightLevel(1)),
	NETHER_ROOTS(ConfigBlocksItems.enableCrimsonBlocks || ConfigBlocksItems.enableWarpedBlocks, new BlockNetherRoots(), BaseSubtypesPotableItemBlock.class),
	NETHER_FUNGUS(ConfigBlocksItems.enableCrimsonBlocks || ConfigBlocksItems.enableWarpedBlocks, new BlockNetherFungus(), BaseSubtypesPotableItemBlock.class),
	NETHER_SPROUTS(ConfigBlocksItems.enableWarpedBlocks, new BlockNetherSprouts()),
	NETHER_WART(ConfigBlocksItems.enableNetherwartBlock || ConfigBlocksItems.enableWarpedBlocks, new BlockNetherwart()),
	NYLIUM(ConfigBlocksItems.enableCrimsonBlocks || ConfigBlocksItems.enableWarpedBlocks, new BlockNylium()),
	CRIMSON_STEM(ConfigBlocksItems.enableCrimsonBlocks || ConfigBlocksItems.enableWarpedBlocks, new BlockNetherStem("crimson")),
	WARPED_STEM(ConfigBlocksItems.enableCrimsonBlocks || ConfigBlocksItems.enableWarpedBlocks, new BlockNetherStem("warped")),
	WEEPING_VINES(ConfigBlocksItems.enableCrimsonBlocks, new BlockWeepingVines()),
	TWISTING_VINES(ConfigBlocksItems.enableWarpedBlocks, new BlockTwistingVines()),

	WOOD_PLANKS(ConfigBlocksItems.enableCrimsonBlocks || ConfigBlocksItems.enableWarpedBlocks,
			new BlockWoodPlanks()),
	WOOD_SLAB(ConfigBlocksItems.enableCrimsonBlocks || ConfigBlocksItems.enableWarpedBlocks,
			new BlockWoodSlab(false)),
	DOUBLE_WOOD_SLAB(ConfigBlocksItems.enableCrimsonBlocks || ConfigBlocksItems.enableWarpedBlocks,
			new BlockWoodSlab(true)),

	//new wood stairs
	CRIMSON_STAIRS(ConfigBlocksItems.enableCrimsonBlocks, new BaseStairs(WOOD_PLANKS.get(), 0).setBlockSound(ModSounds.soundNetherWood).setUnlocalizedNameWithPrefix("crimson")),
	WARPED_STAIRS(ConfigBlocksItems.enableCrimsonBlocks, new BaseStairs(WOOD_PLANKS.get(), 1).setBlockSound(ModSounds.soundNetherWood).setUnlocalizedNameWithPrefix("warped")),

	//legacy fences
	//This is left as-is because fences should really be meta states anyways, so new fences use a different class, so why touch this int-based constructor?
	//Gany, did you waste 4 ID slots just because 1.8 did?
	FENCE_SPRUCE(ConfigBlocksItems.enableFences, new BlockWoodFence(1)),
	FENCE_BIRCH(ConfigBlocksItems.enableFences, new BlockWoodFence(2)),
	FENCE_JUNGLE(ConfigBlocksItems.enableFences, new BlockWoodFence(3)),
	FENCE_ACACIA(ConfigBlocksItems.enableFences, new BlockWoodFence(4)),
	FENCE_DARK_OAK(ConfigBlocksItems.enableFences, new BlockWoodFence(5)),

	//new fence, this can just be one block, meta states are fine, the fences above were made by ganymedes01 and not me hence the lack of meta usage
	WOOD_FENCE(ConfigBlocksItems.enableCrimsonBlocks || ConfigBlocksItems.enableWarpedBlocks,
			new BlockWoodFenceNew()),

	//legacy buttons
	BUTTON_SPRUCE(ConfigBlocksItems.enableWoodRedstone, new BlockWoodButton("spruce", Blocks.planks, 1, true)),
	BUTTON_BIRCH(ConfigBlocksItems.enableWoodRedstone, new BlockWoodButton("birch", Blocks.planks, 2, true)),
	BUTTON_JUNGLE(ConfigBlocksItems.enableWoodRedstone, new BlockWoodButton("jungle", Blocks.planks, 3, true)),
	BUTTON_ACACIA(ConfigBlocksItems.enableWoodRedstone, new BlockWoodButton("acacia", Blocks.planks, 4, true)),
	BUTTON_DARK_OAK(ConfigBlocksItems.enableWoodRedstone, new BlockWoodButton("dark_oak", Blocks.planks, 5, true)),

	//new buttons (different ID format)
	CRIMSON_BUTTON(ConfigBlocksItems.enableCrimsonBlocks, new BlockWoodButton("crimson", WOOD_PLANKS.get(), 0, false)),
	WARPED_BUTTON(ConfigBlocksItems.enableWarpedBlocks, new BlockWoodButton("warped", WOOD_PLANKS.get(), 1, false)),

	//legacy pressure plates
	PRESSURE_PLATE_SPRUCE(ConfigBlocksItems.enableWoodRedstone, new BlockWoodPressurePlate("spruce", Blocks.planks, 1, true)),
	PRESSURE_PLATE_BIRCH(ConfigBlocksItems.enableWoodRedstone, new BlockWoodPressurePlate("birch", Blocks.planks, 2, true)),
	PRESSURE_PLATE_JUNGLE(ConfigBlocksItems.enableWoodRedstone, new BlockWoodPressurePlate("jungle", Blocks.planks, 3, true)),
	PRESSURE_PLATE_ACACIA(ConfigBlocksItems.enableWoodRedstone, new BlockWoodPressurePlate("acacia", Blocks.planks, 4, true)),
	PRESSURE_PLATE_DARK_OAK(ConfigBlocksItems.enableWoodRedstone, new BlockWoodPressurePlate("dark_oak", Blocks.planks, 5, true)),

	//new pressure plates (different ID format)
	CRIMSON_PRESSURE_PLATE(ConfigBlocksItems.enableCrimsonBlocks, new BlockWoodPressurePlate("crimson", WOOD_PLANKS.get(), 0, false)),
	WARPED_PRESSURE_PLATE(ConfigBlocksItems.enableWarpedBlocks, new BlockWoodPressurePlate("warped", WOOD_PLANKS.get(), 1, false)),

	//legacy fence gates
	FENCE_GATE_SPRUCE(ConfigBlocksItems.enableFences, new BlockWoodFenceGate("spruce", Blocks.planks, 1, true)),
	FENCE_GATE_BIRCH(ConfigBlocksItems.enableFences, new BlockWoodFenceGate("birch", Blocks.planks, 2, true)),
	FENCE_GATE_JUNGLE(ConfigBlocksItems.enableFences, new BlockWoodFenceGate("jungle", Blocks.planks, 3, true)),
	FENCE_GATE_ACACIA(ConfigBlocksItems.enableFences, new BlockWoodFenceGate("acacia", Blocks.planks, 4, true)),
	FENCE_GATE_DARK_OAK(ConfigBlocksItems.enableFences, new BlockWoodFenceGate("dark_oak", Blocks.planks, 5, true)),

	//new fence gates (different ID format)
	CRIMSON_FENCE_GATE(ConfigBlocksItems.enableCrimsonBlocks, new BlockWoodFenceGate("crimson", WOOD_PLANKS.get(), 0, false)),
	WARPED_FENCE_GATE(ConfigBlocksItems.enableWarpedBlocks, new BlockWoodFenceGate("warped", WOOD_PLANKS.get(), 1, false)),

	//legacy doors
	DOOR_SPRUCE(ConfigBlocksItems.enableDoors, new BlockWoodDoor("spruce"), ItemBlockWoodDoor.class),
	DOOR_BIRCH(ConfigBlocksItems.enableDoors, new BlockWoodDoor("birch"), ItemBlockWoodDoor.class),
	DOOR_JUNGLE(ConfigBlocksItems.enableDoors, new BlockWoodDoor("jungle"), ItemBlockWoodDoor.class),
	DOOR_ACACIA(ConfigBlocksItems.enableDoors, new BlockWoodDoor("acacia"), ItemBlockWoodDoor.class),
	DOOR_DARK_OAK(ConfigBlocksItems.enableDoors, new BlockWoodDoor("dark_oak"), ItemBlockWoodDoor.class),

	//new doors (different ID format)
	CRIMSON_DOOR(ConfigBlocksItems.enableCrimsonBlocks, new BlockWoodDoor("crimson"), ItemBlockWoodDoor.class),
	WARPED_DOOR(ConfigBlocksItems.enableWarpedBlocks, new BlockWoodDoor("warped"), ItemBlockWoodDoor.class),

	//legacy trapdoors
	TRAPDOOR_SPRUCE(ConfigBlocksItems.enableTrapdoors, new BlockWoodTrapdoor("spruce")),
	TRAPDOOR_BIRCH(ConfigBlocksItems.enableTrapdoors, new BlockWoodTrapdoor("birch")),
	TRAPDOOR_JUNGLE(ConfigBlocksItems.enableTrapdoors, new BlockWoodTrapdoor("jungle")),
	TRAPDOOR_ACACIA(ConfigBlocksItems.enableTrapdoors, new BlockWoodTrapdoor("acacia")),
	TRAPDOOR_DARK_OAK(ConfigBlocksItems.enableTrapdoors, new BlockWoodTrapdoor("dark_oak")),

	//new trapdoors (different ID format)
	CRIMSON_TRAPDOOR(ConfigBlocksItems.enableCrimsonBlocks, new BlockWoodTrapdoor("crimson")),
	WARPED_TRAPDOOR(ConfigBlocksItems.enableWarpedBlocks, new BlockWoodTrapdoor("warped")),

	//legacy signs
	SIGN_SPRUCE(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, true, "spruce", Blocks.planks, 1), null),
	WALL_SIGN_SPRUCE(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, false, "spruce", Blocks.planks, 1), null),
	SIGN_BIRCH(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, true, "birch", Blocks.planks, 2), null),
	WALL_SIGN_BIRCH(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, false, "birch", Blocks.planks, 2), null),
	SIGN_JUNGLE(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, true, "jungle", Blocks.planks, 3), null),
	WALL_SIGN_JUNGLE(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, false, "jungle", Blocks.planks, 3), null),
	SIGN_ACACIA(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, true, "acacia", Blocks.planks, 4), null),
	WALL_SIGN_ACACIA(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, false, "acacia", Blocks.planks, 4), null),
	SIGN_DARK_OAK(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, true, "dark_oak", Blocks.planks, 5), null),
	WALL_SIGN_DARK_OAK(ConfigBlocksItems.enableSigns, new BlockWoodSign(TileEntityWoodSign.class, false, "dark_oak", Blocks.planks, 5), null),

	//new wood signs (instead of a separate ItemBlock we use the standing sign as the ItemBlock
	CRIMSON_SIGN(ConfigBlocksItems.enableCrimsonBlocks, new BlockWoodSign(TileEntityWoodSign.class, true, "crimson", WOOD_PLANKS.get(), 0), ItemBlockSign.class),
	CRIMSON_WALL_SIGN(ConfigBlocksItems.enableCrimsonBlocks, new BlockWoodSign(TileEntityWoodSign.class, false, "crimson", WOOD_PLANKS.get(), 0), null),
	WARPED_SIGN(ConfigBlocksItems.enableWarpedBlocks, new BlockWoodSign(TileEntityWoodSign.class, true, "warped", WOOD_PLANKS.get(), 1), ItemBlockSign.class),
	WARPED_WALL_SIGN(ConfigBlocksItems.enableWarpedBlocks, new BlockWoodSign(TileEntityWoodSign.class, false, "warped", WOOD_PLANKS.get(), 1), null),


	WHITE_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(0), ItemBlockDyedBed.class),
	ORANGE_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(1), ItemBlockDyedBed.class),
	MAGENTA_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(2), ItemBlockDyedBed.class),
	LIGHT_BLUE_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(3), ItemBlockDyedBed.class),
	YELLOW_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(4), ItemBlockDyedBed.class),
	LIME_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(5), ItemBlockDyedBed.class),
	PINK_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(6), ItemBlockDyedBed.class),
	GRAY_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(7), ItemBlockDyedBed.class),
	LIGHT_GRAY_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(8), ItemBlockDyedBed.class),
	CYAN_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(9), ItemBlockDyedBed.class),
	PURPLE_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(10), ItemBlockDyedBed.class),
	BLUE_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(11), ItemBlockDyedBed.class),
	BROWN_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(12), ItemBlockDyedBed.class),
	GREEN_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(13), ItemBlockDyedBed.class),
	BLACK_BED(ConfigBlocksItems.enableDyedBeds, new BlockDyedBed(15), ItemBlockDyedBed.class),

	//Legacy "classic" blocks

	CRYING_OBSIDIAN(ConfigBlocksItems.enableCryingObsidian, new BaseBlock(Material.rock).setNames("crying_obsidian")
			.setToolClass("pickaxe", 3).setHardness(50.0F).setResistance(2000.0F)),
	ROSE(ConfigTweaks.enableRoses, new BlockOldRose()),
	OLD_GRAVEL(ConfigTweaks.enableOldGravel, new BlockOldGravel()),

	//Unfinished stuff

	SCULK(/*ConfigBlocksItems.enableSculk && */EtFuturum.TESTING, new BlockSculk()),
	SCULK_CATALYST(/*ConfigBlocksItems.enableSculk && */EtFuturum.TESTING, new BlockSculkCatalyst()),

	//Creative-only stuff

	NETHERITE_STAIRS(ConfigBlocksItems.enableNetherite, new BlockNetheriteStairs(), ItemBlockUninflammable.class),
	END_GATEWAY(EtFuturum.TESTING, new BlockEndGateway()),
	LIGHT(ConfigBlocksItems.enableLightBlock, new BlockLight()),
	BARRIER(ConfigBlocksItems.enableBarrier, new BlockBarrier());

	public static final ModBlocks[] DOORS = new ModBlocks[]{DOOR_SPRUCE, DOOR_BIRCH, DOOR_JUNGLE, DOOR_ACACIA, DOOR_DARK_OAK, CRIMSON_DOOR, WARPED_DOOR};
	public static final ModBlocks[] FENCE_GATES = new ModBlocks[]{FENCE_GATE_SPRUCE, FENCE_GATE_BIRCH, FENCE_GATE_JUNGLE, FENCE_GATE_ACACIA, FENCE_GATE_DARK_OAK, CRIMSON_FENCE_GATE, WARPED_FENCE_GATE};
	public static final ModBlocks[] PRESSURE_PLATES = new ModBlocks[]{PRESSURE_PLATE_SPRUCE, PRESSURE_PLATE_BIRCH, PRESSURE_PLATE_JUNGLE, PRESSURE_PLATE_ACACIA, PRESSURE_PLATE_DARK_OAK, CRIMSON_PRESSURE_PLATE, CRIMSON_PRESSURE_PLATE};
	public static final ModBlocks[] BUTTONS = new ModBlocks[]{BUTTON_SPRUCE, BUTTON_BIRCH, BUTTON_JUNGLE, BUTTON_ACACIA, BUTTON_DARK_OAK, CRIMSON_BUTTON, CRIMSON_BUTTON};
	public static final ModBlocks[] TRAPDOORS = new ModBlocks[]{TRAPDOOR_SPRUCE, TRAPDOOR_BIRCH, TRAPDOOR_JUNGLE, TRAPDOOR_ACACIA, TRAPDOOR_DARK_OAK, CRIMSON_TRAPDOOR, CRIMSON_TRAPDOOR};

	public static final ModBlocks[] FENCES = new ModBlocks[]{FENCE_SPRUCE, FENCE_BIRCH, FENCE_JUNGLE, FENCE_ACACIA, FENCE_DARK_OAK};

	public static final ModBlocks[] BEDS = new ModBlocks[]{WHITE_BED, ORANGE_BED, MAGENTA_BED, LIGHT_BLUE_BED, YELLOW_BED, LIME_BED, PINK_BED, GRAY_BED, LIGHT_GRAY_BED, CYAN_BED,
			PURPLE_BED, BLUE_BED, BROWN_BED, GREEN_BED, BLACK_BED};
	public static final ModBlocks[] TERRACOTTA = new ModBlocks[]{WHITE_GLAZED_TERRACOTTA, ORANGE_GLAZED_TERRACOTTA, MAGENTA_GLAZED_TERRACOTTA, LIGHT_BLUE_GLAZED_TERRACOTTA,
			YELLOW_GLAZED_TERRACOTTA, LIME_GLAZED_TERRACOTTA, PINK_GLAZED_TERRACOTTA, GRAY_GLAZED_TERRACOTTA, LIGHT_GRAY_GLAZED_TERRACOTTA, CYAN_GLAZED_TERRACOTTA,
			PURPLE_GLAZED_TERRACOTTA, BLUE_GLAZED_TERRACOTTA, BROWN_GLAZED_TERRACOTTA, GREEN_GLAZED_TERRACOTTA, RED_GLAZED_TERRACOTTA, BLACK_GLAZED_TERRACOTTA};

	/*
	 * Stand-in static final fields because some mods incorrectly referenced my code directly.
	 * They should be using GameRegistry.findBlock but it is what it is I guess.
	 */

	//Immersive Cavegen
	@Deprecated
	public static final Block deepslate = DEEPSLATE.get();

	//D-Mod
	@Deprecated
	public static final Block sweet_berry_bush = SWEET_BERRY_BUSH.get();

	//WTF Cave Biomes
	@Deprecated
	public static final Block prismarine = PRISMARINE_BLOCK.get();
	@Deprecated
	public static final Block sea_lantern = SEA_LANTERN.get();
	@Deprecated
	public static final Block red_sandstone = RED_SANDSTONE.get();

	public static void init() {
		for (ModBlocks block : values()) {
			if (block.isEnabled()) {
				if (block.getItemBlock() != null || !block.getHasItemBlock()) {
					GameRegistry.registerBlock(block.get(), block.getItemBlock(), block.name().toLowerCase());
					//This part is used if the getItemBlock() is not ItemBlock.class, so we register a custom ItemBlock class as the ItemBlock
					//It is also used if the getItemBlock() == null and getHasItemBlock() is false, meaning we WANT to register it as null, making the block have no inventory item.
				} else {
					GameRegistry.registerBlock(block.get(), block.name().toLowerCase());
					//Used if getItemBlock() == null but getHasItemBlock() is true, registering it with a default inventory item.
				}
			}
		}
	}

	private final boolean isEnabled;
	private final Block theBlock;
	/**
	 * null == default ItemBlock
	 */
	private final Class<? extends ItemBlock> itemBlock;
	/**
	 * Determines if we should register the block with an ItemBlock.
	 * Set to false when the constructor that specifies the ItemBlock is specifically set to false.
	 */
	private boolean hasItemBlock;

	ModBlocks(Boolean enabled, Block block) {
		this(enabled, block,
				block instanceof ISubBlocksBlock && !(block instanceof BaseSlab) ? BaseItemBlock.class
						: block instanceof BaseSlab ? BaseSlabItemBlock.class
						: block instanceof BaseWall ? BaseWallItemBlock.class
						: block instanceof BaseFlower ? BasePotableItemBlock.class
						: null);
		hasItemBlock = true;
	}

	ModBlocks(Boolean enabled, Block block, Class<? extends ItemBlock> iblock) {
		isEnabled = enabled;
		theBlock = block;
		itemBlock = iblock;
		hasItemBlock = iblock != null;
	}

	/**
	 * If this is false, the block is initialized without an inventory item, or ItemBlock.
	 */
	public boolean getHasItemBlock() {
		return hasItemBlock;
	}

	public Block get() {
		return theBlock;
	}

	public Class<? extends ItemBlock> getItemBlock() {
		return itemBlock;
	}

	public Item getItem() {
		return Item.getItemFromBlock(get());
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public ItemStack newItemStack() {
		return newItemStack(1);
	}

	public ItemStack newItemStack(int count) {
		return newItemStack(count, 0);
	}

	public ItemStack newItemStack(int count, int meta) {
		return new ItemStack(this.get(), count, meta);
	}
}