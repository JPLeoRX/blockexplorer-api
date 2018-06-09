package com.tekleo.blockexplorer_api.model;

import java.util.Objects;

/**
 * Block Index
 *
 * @author Leo Ertuna
 * @since 09.06.2018 14:03
 */
public class BlockIndex implements Model {
    private String blockHash;                                   // Block hash

    /**
     * Cloning constructor
     * We simply copy all fields of another block
     * Private access
     * @param blockIndex block index
     */
    private BlockIndex(BlockIndex blockIndex) {
        this.blockHash = blockIndex.blockHash;
    }

    /**
     * JSON deserialization constructor
     * Create this object by deserializing a JSON string
     * @param json json
     */
    public BlockIndex(String json) {
        this(GSON.fromJson(json, BlockIndex.class));
    }

    /**
     * Getter
     * @return block hash
     */
    public String getBlockHash() {
        return blockHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockIndex that = (BlockIndex) o;
        return Objects.equals(blockHash, that.blockHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockHash);
    }

    @Override
    public String toString() {
        return "BlockIndex{" +
                "blockHash='" + blockHash + '\'' +
                '}';
    }
}