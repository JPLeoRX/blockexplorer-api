package com.tekleo.blockexplorer_api.model;

import java.util.Objects;

/**
 * Sync Status
 *
 * @author Leo Ertuna
 * @since 09.06.2018 15:22
 */
public class SyncStatus implements Model {
    private String status;                          // Status
    private long blockChainHeight;                  // Block chain height
    private int syncPercentage;                     // Sync percentage
    private long height;                            // Height
    private String type;                            // Type

    /**
     * Full arguments constructor
     * This should be used only for cloning and constructor chaining
     * Private access
     * @param status status
     * @param blockChainHeight block chain height
     * @param syncPercentage sync percentage
     * @param height height
     * @param type type
     */
    private SyncStatus(String status, long blockChainHeight, int syncPercentage, long height, String type) {
        this.status = status;
        this.blockChainHeight = blockChainHeight;
        this.syncPercentage = syncPercentage;
        this.height = height;
        this.type = type;
    }

    /**
     * Cloning constructor
     * We simply copy all fields of another sync status
     * Private access
     * @param syncStatus sync status
     */
    private SyncStatus(SyncStatus syncStatus) {
        this(syncStatus.status, syncStatus.blockChainHeight, syncStatus.syncPercentage, syncStatus.height, syncStatus.type);
    }

    /**
     * JSON deserialization constructor
     * Create this object by deserializing a JSON string
     * @param json json
     */
    public SyncStatus(String json) {
        this(GSON.fromJson(json, SyncStatus.class));
    }

    /**
     * Getter
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Getter
     * @return is finished
     */
    public boolean isFinished() {
        return getStatus().equalsIgnoreCase("finished") && getSyncPercentage() == 100;
    }

    /**
     * Getter
     * @return block chain height
     */
    public long getBlockChainHeight() {
        return blockChainHeight;
    }

    /**
     * Getter
     * @return sync percentage
     */
    public int getSyncPercentage() {
        return syncPercentage;
    }

    /**
     * Getter
     * @return height
     */
    public long getHeight() {
        return height;
    }

    /**
     * Getter
     * @return type
     */
    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SyncStatus that = (SyncStatus) o;
        return blockChainHeight == that.blockChainHeight && syncPercentage == that.syncPercentage && height == that.height && Objects.equals(status, that.status) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, blockChainHeight, syncPercentage, height, type);
    }

    @Override
    public String toString() {
        return "SyncStatus{" +
                "status='" + status + '\'' +
                ", blockChainHeight=" + blockChainHeight +
                ", syncPercentage=" + syncPercentage +
                ", height=" + height +
                ", type='" + type + '\'' +
                '}';
    }
}