package com.tekleo.blockexplorer_api.model;

import java.util.Objects;

/**
 * Network Status
 *
 * @author Leo Ertuna
 * @since 09.06.2018 14:42
 */
public class NetworkStatus implements Model {
    private NetworkInfo info;               // Network info

    /**
     * Full arguments constructor
     * This should be used only for cloning and constructor chaining
     * Private access
     * @param info network info
     */
    private NetworkStatus(NetworkInfo info) {
        this.info = info;
    }

    /**
     * Cloning constructor
     * We simply copy all fields of another network status
     * Private access
     * @param networkStatus network status
     */
    private NetworkStatus(NetworkStatus networkStatus) {
        this(networkStatus.info);
    }

    /**
     * JSON deserialization constructor
     * Create this object by deserializing a JSON string
     * @param json json
     */
    public NetworkStatus(String json) {
        this(GSON.fromJson(json, NetworkStatus.class));
    }

    /**
     * Getter
     * @return network info
     */
    public NetworkInfo getInfo() {
        return info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetworkStatus that = (NetworkStatus) o;
        return Objects.equals(info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(info);
    }

    @Override
    public String toString() {
        return "NetworkStatus{" +
                "info=" + info +
                '}';
    }
}