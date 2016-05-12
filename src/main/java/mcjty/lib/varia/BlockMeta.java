package mcjty.lib.varia;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class BlockMeta {
    private final Block block;
    private final byte meta;

    public static final BlockMeta STONE = new BlockMeta(Blocks.STONE, 0);

    public BlockMeta(Block block, byte meta) {
        this.block = block;
        this.meta = meta;
    }

    public BlockMeta(Block block, int meta) {
        this.block = block;
        this.meta = (byte)meta;
    }

    public Block getBlock() {
        return block;
    }

    public byte getMeta() {
        return meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlockMeta blockMeta = (BlockMeta) o;

        if (meta != blockMeta.meta) return false;
        if (!block.equals(blockMeta.block)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Block.REGISTRY.getIDForObject(block);
        result = 31 * result + meta;
        return result;
    }

    @Override
    public String toString() {
        return "BlockMeta{" +
                "block=" + block +
                ", meta=" + meta +
                '}';
    }
}
