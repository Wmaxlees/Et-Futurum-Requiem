package ganymedes01.etfuturum.world.nether.dimension.gen;

import ganymedes01.etfuturum.ModBlocks;
import ganymedes01.etfuturum.blocks.BlockNylium;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.gen.MapGenRavine;

import java.util.Random;

public class MapGenRavineHell extends MapGenRavine {

	private final float[] rs = new float[1024];

	/**
	 * We have to replace the whole function because we need to change some loops inside to do 128 height instead of 256 height.
	 */
	@Override
	protected void func_151540_a(long p_151540_1_, int p_151540_3_, int p_151540_4_, Block[] p_151540_5_, double p_151540_6_, double p_151540_8_, double p_151540_10_, float p_151540_12_, float p_151540_13_, float p_151540_14_, int p_151540_15_, int p_151540_16_, double p_151540_17_) {
		Random random = new Random(p_151540_1_);
		double d4 = p_151540_3_ * 16 + 8;
		double d5 = p_151540_4_ * 16 + 8;
		float f3 = 0.0F;
		float f4 = 0.0F;

		if (p_151540_16_ <= 0) {
			int j1 = this.range * 16 - 16;
			p_151540_16_ = j1 - random.nextInt(j1 / 4);
		}

		boolean flag1 = false;

		if (p_151540_15_ == -1) {
			p_151540_15_ = p_151540_16_ / 2;
			flag1 = true;
		}

		float f5 = 1.0F;

		for (int k1 = 0; k1 < 128; ++k1) {
			if (k1 == 0 || random.nextInt(3) == 0) {
				f5 = 1.0F + random.nextFloat() * random.nextFloat() * 1.0F;
			}

			this.rs[k1] = f5 * f5;
		}

		for (; p_151540_15_ < p_151540_16_; ++p_151540_15_) {
			double d12 = 1.5D + (double) (MathHelper.sin((float) p_151540_15_ * (float) Math.PI / (float) p_151540_16_) * p_151540_12_ * 1.0F);
			double d6 = d12 * p_151540_17_;
			d12 *= (double) random.nextFloat() * 0.25D + 0.75D;
			d6 *= (double) random.nextFloat() * 0.25D + 0.75D;
			float f6 = MathHelper.cos(p_151540_14_);
			float f7 = MathHelper.sin(p_151540_14_);
			p_151540_6_ += MathHelper.cos(p_151540_13_) * f6;
			p_151540_8_ += f7;
			p_151540_10_ += MathHelper.sin(p_151540_13_) * f6;
			p_151540_14_ *= 0.7F;
			p_151540_14_ += f4 * 0.05F;
			p_151540_13_ += f3 * 0.05F;
			f4 *= 0.8F;
			f3 *= 0.5F;
			f4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0F;
			f3 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0F;

			if (flag1 || random.nextInt(4) != 0) {
				double d7 = p_151540_6_ - d4;
				double d8 = p_151540_10_ - d5;
				double d9 = p_151540_16_ - p_151540_15_;
				double d10 = p_151540_12_ + 2.0F + 16.0F;

				if (d7 * d7 + d8 * d8 - d9 * d9 > d10 * d10) {
					return;
				}

				if (p_151540_6_ >= d4 - 16.0D - d12 * 2.0D && p_151540_10_ >= d5 - 16.0D - d12 * 2.0D && p_151540_6_ <= d4 + 16.0D + d12 * 2.0D && p_151540_10_ <= d5 + 16.0D + d12 * 2.0D) {
					int i4 = MathHelper.floor_double(p_151540_6_ - d12) - p_151540_3_ * 16 - 1;
					int l1 = MathHelper.floor_double(p_151540_6_ + d12) - p_151540_3_ * 16 + 1;
					int j4 = MathHelper.floor_double(p_151540_8_ - d6) - 1;
					int i2 = MathHelper.floor_double(p_151540_8_ + d6) + 1;
					int k4 = MathHelper.floor_double(p_151540_10_ - d12) - p_151540_4_ * 16 - 1;
					int j2 = MathHelper.floor_double(p_151540_10_ + d12) - p_151540_4_ * 16 + 1;

					if (i4 < 0) {
						i4 = 0;
					}

					if (l1 > 16) {
						l1 = 16;
					}

					if (j4 < 1) {
						j4 = 1;
					}

					if (i2 > 248) {
						i2 = 248;
					}

					if (k4 < 0) {
						k4 = 0;
					}

					if (j2 > 16) {
						j2 = 16;
					}

					boolean flag2 = false;
					int k2;
					int j3;

					for (k2 = i4; !flag2 && k2 < l1; ++k2) {
						for (int l2 = k4; !flag2 && l2 < j2; ++l2) {
							for (int i3 = i2 + 1; !flag2 && i3 >= j4 - 1; --i3) {
								j3 = (k2 * 16 + l2) * 128 + i3;

								if (i3 < 128) {
									if (isOceanBlock(p_151540_5_, j3, k2, i3, l2, p_151540_3_, p_151540_4_)) {
										flag2 = true;
									}

									if (i3 != j4 - 1 && k2 != i4 && k2 != l1 - 1 && l2 != k4 && l2 != j2 - 1) {
										i3 = j4;
									}
								}
							}
						}
					}

					if (!flag2) {
						for (k2 = i4; k2 < l1; ++k2) {
							double d13 = ((double) (k2 + p_151540_3_ * 16) + 0.5D - p_151540_6_) / d12;

							for (j3 = k4; j3 < j2; ++j3) {
								double d14 = ((double) (j3 + p_151540_4_ * 16) + 0.5D - p_151540_10_) / d12;
								int k3 = (k2 * 16 + j3) * 128 + i2;
								boolean flag = false;

								if (d13 * d13 + d14 * d14 < 1.0D) {
									for (int l3 = i2 - 1; l3 >= j4; --l3) {
										double d11 = ((double) l3 + 0.5D - p_151540_8_) / d6;

										if ((d13 * d13 + d14 * d14) * (double) this.rs[l3] + d11 * d11 / 6.0D < 1.0D) {
											if (isTopBlock(p_151540_5_, k3, k2, l3, j3, p_151540_3_, p_151540_4_)) {
												flag = true;
											}

											digBlock(p_151540_5_, k3, k2, l3, j3, p_151540_3_, p_151540_4_, flag);
										}

										--k3;
									}
								}
							}
						}

						if (flag1) {
							break;
						}
					}
				}
			}
		}
	}

	private boolean isTopBlock(Block[] blocks, int index, int x, int y, int z, int chunkX, int chunkZ) {
		return blocks[index] == worldObj.getBiomeGenForCoords(x + chunkX * 16, z + chunkZ * 16).topBlock;
	}

	@Override
	protected boolean isOceanBlock(Block[] data, int index, int x, int y, int z, int chunkX, int chunkZ) {
		return data[index] == Blocks.lava || data[index] == Blocks.flowing_lava;
	}

	@Override
	protected void digBlock(Block[] data, int index, int x, int y, int z, int chunkX, int chunkZ, boolean foundTop) {
		Block block = data[index];

		if (block == Blocks.netherrack || block instanceof BlockNylium || block == Blocks.soul_sand || block == ModBlocks.SOUL_SOIL.get() || block == ModBlocks.BLACKSTONE.get() || block == ModBlocks.BASALT.get()) {
//			if (y < 10)
//			{
//				data[index] = Blocks.flowing_lava;
//			}
//			else
//			{
			data[index] = null;
//			}
		}
	}
}
