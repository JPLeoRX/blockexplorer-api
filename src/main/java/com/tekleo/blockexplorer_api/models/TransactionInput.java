package com.tekleo.blockexplorer_api.models;

import java.util.Objects;

/**
 * Transaction Input
 *
 * @author Leo Ertuna
 * @since 09.06.2018 16:38
 */
public class TransactionInput implements Model {
    private String coinbase;                // Coin base
    private long sequence;                  // Sequence
    private long n;                         // N

    /**
     * Full arguments constructor
     * This should be used only for cloning and constructor chaining
     * Private access
     * @param coinbase coin base
     * @param sequence sequence
     * @param n n
     */
    private TransactionInput(String coinbase, long sequence, long n) {
        this.coinbase = coinbase;
        this.sequence = sequence;
        this.n = n;
    }

    /**
     * Cloning constructor
     * We simply copy all fields of another transaction input
     * Private access
     * @param transactionInput transaction input
     */
    private TransactionInput(TransactionInput transactionInput) {
        this(transactionInput.coinbase, transactionInput.sequence, transactionInput.n);
    }

    /**
     * JSON deserialization constructor
     * Create this object by deserializing a JSON string
     * @param json json
     */
    public TransactionInput(String json) {
        this(GSON.fromJson(json, TransactionInput.class));
    }

    /**
     * Getter
     * @return coin base
     */
    public String getCoinBase() {
        return coinbase;
    }

    /**
     * Getter
     * @return sequence
     */
    public long getSequence() {
        return sequence;
    }

    /**
     * Getter
     * @return n
     */
    public long getN() {
        return n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionInput that = (TransactionInput) o;
        return sequence == that.sequence && n == that.n && Objects.equals(coinbase, that.coinbase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coinbase, sequence, n);
    }

    @Override
    public String toString() {
        return "TransactionInput{" +
                "coinbase='" + coinbase + '\'' +
                ", sequence=" + sequence +
                ", n=" + n +
                '}';
    }
}