package ganymedes01.etfuturum.blocks;

import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.client.sound.ModSounds;
import ganymedes01.etfuturum.configuration.configs.ConfigFunctions;
import ganymedes01.etfuturum.core.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockWoodPressurePlate extends BlockPressurePlate {

	private final int meta;
	private final Block baseBlock;
	private final boolean flammable;

	public BlockWoodPressurePlate(String type, Block block, int meta, boolean flammable) {
		super(null, Material.wood, Sensitivity.everything);
		this.meta = meta;
		baseBlock = block;
		this.flammable = flammable;
		setBlockName(Utils.getUnlocalisedName(type + "_pressure_plate"));
		disableStats();
		setHardness(0.5F);
		setCreativeTab(EtFuturum.creativeTabBlocks);
		if (type.equals("crimson") || type.equals("warped")) {
			Utils.setBlockSound(this, ModSounds.soundNetherWood);
		} else if (type.equals("cherry")) {
			Utils.setBlockSound(this, ModSounds.soundCherryWood);
		} else if (type.equals("bamboo")) {
			Utils.setBlockSound(this, ModSounds.soundBambooWood);
		} else {
			setStepSound(Block.soundTypeWood);
		}
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return baseBlock.getIcon(side, this.meta);
	}

	@Override
	public void registerBlockIcons(IIconRegister ignored) {
	}

	@Override
	public boolean isFlammable(IBlockAccess aWorld, int aX, int aY, int aZ, ForgeDirection aSide) {
		return ConfigFunctions.enableExtraBurnableBlocks && flammable;
	}

	@Override
	public int getFlammability(IBlockAccess aWorld, int aX, int aY, int aZ, ForgeDirection aSide) {
		return isFlammable(aWorld, aX, aY, aZ, aSide) ? 20 : 0;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess aWorld, int aX, int aY, int aZ, ForgeDirection aSide) {
		return isFlammable(aWorld, aX, aY, aZ, aSide) ? 5 : 0;
	}
}