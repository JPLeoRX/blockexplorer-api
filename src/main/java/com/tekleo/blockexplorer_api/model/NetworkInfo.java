package com.tekleo.blockexplorer_api.model;

import java.util.Objects;

/**
 * Network Info
 *
 * @author Leo Ertuna
 * @since 09.06.2018 14:41
 */
public class NetworkInfo implements Model {
    private long version;                           // Version
    private long protocolversion;                   // Protocol version
    private long blocks;                            // Blocks
    private long timeoffset;                        // Time offset
    private long connections;                       // Connections
    private String proxy;                           // Proxy
    private double difficulty;                      // Difficulty
    private boolean testnet;                        // Test net
    private double relayfee;                        // Relay fee
    private String errors;                          // Errors
    private String network;                         // Network

    /**
     * Full arguments constructor
     * This should be used only for cloning and constructor chaining
     * Private access
     * @param version version
     * @param protocolversion protocol version
     * @param blocks blocks
     * @param timeoffset time offset
     * @param connections connections
     * @param proxy proxy
     * @param difficulty difficulty
     * @param testnet test net
     * @param relayfee relay fee
     * @param errors errors
     * @param network network
     */
    private NetworkInfo(long version, long protocolversion, long blocks, long timeoffset, long connections, String proxy, double difficulty, boolean testnet, double relayfee, String errors, String network) {
        this.version = version;
        this.protocolversion = protocolversion;
        this.blocks = blocks;
        this.timeoffset = timeoffset;
        this.connections = connections;
        this.proxy = proxy;
        this.difficulty = difficulty;
        this.testnet = testnet;
        this.relayfee = relayfee;
        this.errors = errors;
        this.network = network;
    }

    /**
     * Cloning constructor
     * We simply copy all fields of another network info
     * Private access
     * @param networkInfo network info
     */
    private NetworkInfo(NetworkInfo networkInfo) {
        this(networkInfo.version, networkInfo.protocolversion, networkInfo.blocks, networkInfo.timeoffset, networkInfo.connections, networkInfo.proxy, networkInfo.difficulty, networkInfo.testnet, networkInfo.relayfee, networkInfo.errors, networkInfo.network);
    }

    /**
     * JSON deserialization constructor
     * Create this object by deserializing a JSON string
     * @param json json
     */
    public NetworkInfo(String json) {
        this(GSON.fromJson(json, NetworkInfo.class));
    }

    /**
     * Getter
     * @return version
     */
    public long getVersion() {
        return version;
    }

    /**
     * Getter
     * @return protocol version
     */
    public long getProtocolVersion() {
        return protocolversion;
    }

    /**
     * Getter
     * @return blocks
     */
    public long getNumberOfBlocks() {
        return blocks;
    }

    /**
     * Getter
     * @return time offset
     */
    public long getTimeOffset() {
        return timeoffset;
    }

    /**
     * Getter
     * @return connections
     */
    public long getNumberOfConnections() {
        return connections;
    }

    /**
     * Getter
     * @return proxy
     */
    public String getProxy() {
        return proxy;
    }

    /**
     * Getter
     * @return difficulty
     */
    public double getDifficulty() {
        return difficulty;
    }

    /**
     * Getter
     * @return is test net
     */
    public boolean isTestNet() {
        return testnet;
    }

    /**
     * Getter
     * @return is live net
     */
    public boolean isLiveNet() {
        return !isTestNet() && getNetwork().equalsIgnoreCase("livenet");
    }

    /**
     * Getter
     * @return relay fee
     */
    public double getRelayFee() {
        return relayfee;
    }

    /**
     * Getter
     * @return errors
     */
    public String getErrors() {
        return errors;
    }

    /**
     * Getter
     * @return network
     */
    public String getNetwork() {
        return network;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetworkInfo that = (NetworkInfo) o;
        return version == that.version && protocolversion == that.protocolversion && blocks == that.blocks && timeoffset == that.timeoffset && connections == that.connections && Double.compare(that.difficulty, difficulty) == 0 && testnet == that.testnet && Double.compare(that.relayfee, relayfee) == 0 && Objects.equals(proxy, that.proxy) && Objects.equals(errors, that.errors) && Objects.equals(network, that.network);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, protocolversion, blocks, timeoffset, connections, proxy, difficulty, testnet, relayfee, errors, network);
    }

    @Override
    public String toString() {
        return "NetworkInfo{" +
                "version=" + version +
                ", protocolversion=" + protocolversion +
                ", blocks=" + blocks +
                ", timeoffset=" + timeoffset +
                ", connections=" + connections +
                ", proxy='" + proxy + '\'' +
                ", difficulty=" + difficulty +
                ", testnet=" + testnet +
                ", relayfee=" + relayfee +
                ", errors='" + errors + '\'' +
                ", network='" + network + '\'' +
                '}';
    }
}