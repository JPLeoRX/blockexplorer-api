package com.tekleo.blockexplorer_api.models;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Block
 *
 * @author Leo Ertuna
 * @since 09.06.2018 13:50
 */
public class Block implements Model {
    private String hash;                            // Hash
    private long size;                              // Size
    private long height;                            // Height
    private long version;                           // Version
    private String merkleroot;                      // Merkle root
    private String[] tx;                            // Transactions
    private long time;                              // Time
    private long nonce;                             // Nonce
    private String bits;                            // Bits
    private double difficulty;                      // Difficulty
    private String chainwork;                       // Chain work
    private long confirmations;                     // Confirmations
    private String previousblockhash;               // Previous block hash
    private String nextblockhash;                   // Next block hash
    private double reward;                          // Reward
    private boolean isMainChain;                    // Is main chain

    /**
     * Full arguments constructor
     * This should be used only for cloning and constructor chaining
     * Private access
     * @param hash hash
     * @param size size
     * @param height height
     * @param version version
     * @param merkleroot merkle root
     * @param tx transactions
     * @param time time
     * @param nonce nonce
     * @param bits bits
     * @param difficulty difficulty
     * @param chainwork chain work
     * @param confirmations confirmations
     * @param previousblockhash previous block hash
     * @param nextblockhash next block hash
     * @param reward reward
     * @param isMainChain is main chain
     */
    private Block(String hash, long size, long height, long version, String merkleroot, String[] tx, long time, long nonce, String bits, double difficulty, String chainwork, long confirmations, String previousblockhash, String nextblockhash, double reward, boolean isMainChain) {
        this.hash = hash;
        this.size = size;
        this.height = height;
        this.version = version;
        this.merkleroot = merkleroot;
        this.tx = tx;
        this.time = time;
        this.nonce = nonce;
        this.bits = bits;
        this.difficulty = difficulty;
        this.chainwork = chainwork;
        this.confirmations = confirmations;
        this.previousblockhash = previousblockhash;
        this.nextblockhash = nextblockhash;
        this.reward = reward;
        this.isMainChain = isMainChain;
    }

    /**
     * Cloning constructor
     * We simply copy all fields of another block
     * Private access
     * @param block block
     */
    private Block(Block block) {
        this(block.hash, block.size, block.height, block.version, block.merkleroot, block.tx, block.time, block.nonce, block.bits, block.difficulty, block.chainwork, block.confirmations, block.previousblockhash, block.nextblockhash, block.reward, block.isMainChain);
    }

    /**
     * JSON deserialization constructor
     * Create this object by deserializing a JSON string
     * @param json json
     */
    public Block(String json) {
        this(GSON.fromJson(json, Block.class));
    }

    /**
     * Getter
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * Getter
     * @return size
     */
    public long getSize() {
        return size;
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
     * @return version
     */
    public long getVersion() {
        return version;
    }

    /**
     * Getter
     * @return merkle root
     */
    public String getMerkleRoot() {
        return merkleroot;
    }

    /**
     * Getter
     * @return transactions
     */
    public List<String> getTransactions() {
        return Arrays.asList(tx);
    }

    /**
     * Getter
     * @return time
     */
    public long getTime() {
        return time;
    }

    /**
     * Getter
     * @return nonce
     */
    public long getNonce() {
        return nonce;
    }

    /**
     * Getter
     * @return bits
     */
    public String getBits() {
        return bits;
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
     * @return chain work
     */
    public String getChainWork() {
        return chainwork;
    }

    /**
     * Getter
     * @return confirmations
     */
    public long getConfirmations() {
        return confirmations;
    }

    /**
     * Getter
     * @return previous block hash
     */
    public String getPreviousBlockHash() {
        return previousblockhash;
    }

    /**
     * Getter
     * @return next block hash
     */
    public String getNextBlockHash() {
        return nextblockhash;
    }

    /**
     * Getter
     * @return reward
     */
    public double getReward() {
        return reward;
    }

    /**
     * Getter
     * @return is main chain
     */
    public boolean isMainChain() {
        return isMainChain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return Objects.equals(hash, block.hash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }

    @Override
    public String toString() {
        return "Block{" +
                "hash='" + hash + '\'' +
                ", size=" + size +
                ", height=" + height +
                ", version=" + version +
                ", merkleroot='" + merkleroot + '\'' +
                ", tx=" + Arrays.toString(tx) +
                ", time=" + time +
                ", nonce=" + nonce +
                ", bits='" + bits + '\'' +
                ", difficulty=" + difficulty +
                ", chainwork='" + chainwork + '\'' +
                ", confirmations=" + confirmations +
                ", previousblockhash='" + previousblockhash + '\'' +
                ", nextblockhash='" + nextblockhash + '\'' +
                ", reward=" + reward +
                ", isMainChain=" + isMainChain +
                '}';
    }
}