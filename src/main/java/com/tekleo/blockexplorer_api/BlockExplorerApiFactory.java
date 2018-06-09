package com.tekleo.blockexplorer_api;

/**
 * Block Explorer API Factory
 *
 * @author Leo Ertuna
 * @since 09.06.2018 17:34
 */
public class BlockExplorerApiFactory {
    /**
     * Static instance of this factory
     */
    public static BlockExplorerApiFactory INSTANCE = new BlockExplorerApiFactory();

    /**
     * Create new {@link BlockExplorerApi} object
     * @return block explorer api
     */
    public BlockExplorerApi create() {
        return new BlockExplorerApiImpl();
    }
}