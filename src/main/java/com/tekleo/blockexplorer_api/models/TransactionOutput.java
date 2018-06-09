package com.tekleo.blockexplorer_api.models;

import java.util.Objects;

/**
 * Transaction Output
 *
 * @author Leo Ertuna
 * @since 09.06.2018 15:58
 */
public class TransactionOutput implements Model {
    private double value;                                           // Value
    private long n;                                                 // N
    private TransactionOutputScriptPublicKey scriptPubKey;          // Script public key
    private String spentTxId;                                       // Spent transaction id
    private long spentIndex;                                        // Spent index
    private long spentHeight;                                       // Spent height

    /**
     * Full arguments constructor
     * This should be used only for cloning and constructor chaining
     * Private access
     * @param value value
     * @param n n
     * @param scriptPubKey script public key
     * @param spentTxId spent transaction id
     * @param spentIndex spent index
     * @param spentHeight spent height
     */
    private TransactionOutput(double value, long n, TransactionOutputScriptPublicKey scriptPubKey, String spentTxId, long spentIndex, long spentHeight) {
        this.value = value;
        this.n = n;
        this.scriptPubKey = scriptPubKey;
        this.spentTxId = spentTxId;
        this.spentIndex = spentIndex;
        this.spentHeight = spentHeight;
    }

    /**
     * Cloning constructor
     * We simply copy all fields of another transaction output
     * Private access
     * @param transactionOutput transaction output
     */
    private TransactionOutput(TransactionOutput transactionOutput) {
        this(transactionOutput.value, transactionOutput.n, transactionOutput.scriptPubKey, transactionOutput.spentTxId, transactionOutput.spentIndex, transactionOutput.spentHeight);
    }

    /**
     * JSON deserialization constructor
     * Create this object by deserializing a JSON string
     * @param json json
     */
    public TransactionOutput(String json) {
        this(GSON.fromJson(json, TransactionOutput.class));
    }

    /**
     * Getter
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     * Getter
     * @return n
     */
    public long getN() {
        return n;
    }

    /**
     * Getter
     * @return script public key
     */
    public TransactionOutputScriptPublicKey getScriptPublicKey() {
        return scriptPubKey;
    }

    /**
     * Getter
     * @return spent transaction id
     */
    public String getSpentTransactionId() {
        return spentTxId;
    }

    /**
     * Getter
     * @return spent index
     */
    public long getSpentIndex() {
        return spentIndex;
    }

    /**
     * Getter
     * @return spent height
     */
    public long getSpentHeight() {
        return spentHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionOutput that = (TransactionOutput) o;
        return Double.compare(that.value, value) == 0 && n == that.n && spentIndex == that.spentIndex && spentHeight == that.spentHeight && Objects.equals(scriptPubKey, that.scriptPubKey) && Objects.equals(spentTxId, that.spentTxId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, n, scriptPubKey, spentTxId, spentIndex, spentHeight);
    }

    @Override
    public String toString() {
        return "TransactionOutput{" +
                "value=" + value +
                ", n=" + n +
                ", scriptPubKey=" + scriptPubKey +
                ", spentTxId='" + spentTxId + '\'' +
                ", spentIndex=" + spentIndex +
                ", spentHeight=" + spentHeight +
                '}';
    }
}