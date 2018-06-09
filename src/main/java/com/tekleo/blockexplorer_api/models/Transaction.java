package com.tekleo.blockexplorer_api.models;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Transaction
 *
 * @author Leo Ertuna
 * @since 09.06.2018 16:49
 */
public class Transaction implements Model {
    private String txid;                            // Transaction id
    private long version;                           // Version
    private long locktime;                          // Lock time
    private TransactionInput[] vin;                 // Inputs
    private TransactionOutput[] vout;               // Outputs
    private String blockhash;                       // Block hash
    private long blockheight;                       // Block height
    private long confirmations;                     // Confirmations
    private long time;                              // Time
    private long blocktime;                         // Block time
    private boolean isCoinBase;                     // Is coin base
    private double valueOut;                        // Output value
    private long size;                              // Size

    /**
     * Full arguments constructor
     * This should be used only for cloning and constructor chaining
     * Private access
     * @param txid transaction id
     * @param version version
     * @param locktime lock time
     * @param vin inputs
     * @param vout outputs
     * @param blockhash block hash
     * @param blockheight block height
     * @param confirmations confirmations
     * @param time time
     * @param blocktime block time
     * @param isCoinBase is coin base
     * @param valueOut output value
     * @param size size
     */
    private Transaction(String txid, long version, long locktime, TransactionInput[] vin, TransactionOutput[] vout, String blockhash, long blockheight, long confirmations, long time, long blocktime, boolean isCoinBase, double valueOut, long size) {
        this.txid = txid;
        this.version = version;
        this.locktime = locktime;
        this.vin = vin;
        this.vout = vout;
        this.blockhash = blockhash;
        this.blockheight = blockheight;
        this.confirmations = confirmations;
        this.time = time;
        this.blocktime = blocktime;
        this.isCoinBase = isCoinBase;
        this.valueOut = valueOut;
        this.size = size;
    }

    /**
     * Cloning constructor
     * We simply copy all fields of another transaction
     * Private access
     * @param transaction transaction
     */
    private Transaction(Transaction transaction) {
        this(transaction.txid, transaction.version, transaction.locktime, transaction.vin, transaction.vout, transaction.blockhash, transaction.blockheight, transaction.confirmations, transaction.time, transaction.blocktime, transaction.isCoinBase, transaction.valueOut, transaction.size);
    }

    /**
     * JSON deserialization constructor
     * Create this object by deserializing a JSON string
     * @param json json
     */
    public Transaction(String json) {
        this(GSON.fromJson(json, Transaction.class));
    }

    /**
     * Getter
     * @return transaction id
     */
    public String getTransactionId() {
        return txid;
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
     * @return lock time
     */
    public long getLockTime() {
        return locktime;
    }

    /**
     * Getter
     * @return inputs
     */
    public List<TransactionInput> getInputs() {
        return Arrays.asList(vin);
    }

    /**
     * Getter
     * @return outputs
     */
    public List<TransactionOutput> getOutputs() {
        return Arrays.asList(vout);
    }

    /**
     * Getter
     * @return block hash
     */
    public String getBlockHash() {
        return blockhash;
    }

    /**
     * Getter
     * @return block height
     */
    public long getBlockHeight() {
        return blockheight;
    }

    /**
     * Getter
     * @return number of confirmations
     */
    public long getNumberOfConfirmations() {
        return confirmations;
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
     * @return block time
     */
    public long getBlockTime() {
        return blocktime;
    }

    /**
     * Getter
     * @return is coin base
     */
    public boolean isCoinBase() {
        return isCoinBase;
    }

    /**
     * Getter
     * @return output value
     */
    public double getOutputValue() {
        return valueOut;
    }

    /**
     * Getter
     * @return size
     */
    public long getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(txid, that.txid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(txid);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "txid='" + txid + '\'' +
                ", version=" + version +
                ", locktime=" + locktime +
                ", vin=" + Arrays.toString(vin) +
                ", vout=" + Arrays.toString(vout) +
                ", blockhash='" + blockhash + '\'' +
                ", blockheight=" + blockheight +
                ", confirmations=" + confirmations +
                ", time=" + time +
                ", blocktime=" + blocktime +
                ", isCoinBase=" + isCoinBase +
                ", valueOut=" + valueOut +
                ", size=" + size +
                '}';
    }
}