package com.tekleo.blockexplorer_api;

import java.util.Objects;

/**
 * Block Explorer Api Config
 *
 * @author Leo Ertuna
 * @since 09.06.2018 23:34
 */
public class BlockExplorerApiConfig {
    private static BlockExplorerApiConfig INSTANCE = new BlockExplorerApiConfig();          // Singleton instance

    private Network network;                                                                // Network type

    /**
     * Private constructor
     */
    private BlockExplorerApiConfig() {
        this.network = Network.LIVE;
    }

    /**
     * Getter
     * @return network
     */
    public Network getNetwork() {
        return network;
    }

    /**
     * Setter
     * @param network network
     */
    public void setNetwork(Network network) {
        synchronized (this) {
            this.network = network;
        }
    }

    /**
     * Singleton instance getter
     * @return instance
     */
    public static BlockExplorerApiConfig getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockExplorerApiConfig that = (BlockExplorerApiConfig) o;
        return network == that.network;
    }

    @Override
    public int hashCode() {
        return Objects.hash(network);
    }

    @Override
    public String toString() {
        return "BlockExplorerApiConfig{" +
                "network=" + network +
                '}';
    }

    /**
     * Enum for types of network, we support live and test
     */
    public static enum Network {
        LIVE, TEST
    }
}