package com.tekleo.blockexplorer_api.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Address
 *
 * @author Leo Ertuna
 * @since 09.06.2018 13:28
 */
public class Address implements Model {
    private String addrStr;                                     // Address
    private double balance;                                     // Balance in BTC
    private long balanceSat;                                    // Balance in Satoshi
    private double totalReceived;                               // Total received in BTC
    private long totalReceivedSat;                              // Total received in Satoshi
    private double totalSent;                                   // Total sent in BTC
    private long totalSentSat;                                  // Total sent in Satoshi
    private double unconfirmedBalance;                          // Unconfirmed balance in BTC
    private long unconfirmedBalanceSat;                         // Unconfirmed balance in Satoshi
    private int unconfirmedTxApperances;                        // Unconfirmed transaction appearances
    private int txApperances;                                   // Transaction appearances
    private String[] transactions;                              // Transactions

    /**
     * Full arguments constructor
     * This should be used only for cloning and constructor chaining
     * Private access
     * @param addrStr address
     * @param balance balance in BTC
     * @param balanceSat balance in Satoshi
     * @param totalReceived total received in BTC
     * @param totalReceivedSat total received in Satoshi
     * @param totalSent total sent in BTC
     * @param totalSentSat total sent in Satoshi
     * @param unconfirmedBalance unconfirmed balance in BTC
     * @param unconfirmedBalanceSat unconfirmed balance in Satoshi
     * @param unconfirmedTxApperances unconfirmed transaction appearances
     * @param txApperances transaction appearances
     * @param transactions transactions
     */
    private Address(String addrStr, double balance, long balanceSat, double totalReceived, long totalReceivedSat, double totalSent, long totalSentSat, double unconfirmedBalance, long unconfirmedBalanceSat, int unconfirmedTxApperances, int txApperances, String[] transactions) {
        this.addrStr = addrStr;
        this.balance = balance;
        this.balanceSat = balanceSat;
        this.totalReceived = totalReceived;
        this.totalReceivedSat = totalReceivedSat;
        this.totalSent = totalSent;
        this.totalSentSat = totalSentSat;
        this.unconfirmedBalance = unconfirmedBalance;
        this.unconfirmedBalanceSat = unconfirmedBalanceSat;
        this.unconfirmedTxApperances = unconfirmedTxApperances;
        this.txApperances = txApperances;
        this.transactions = transactions;
    }

    /**
     * Cloning constructor
     * We simply copy all fields of another address
     * Private access
     * @param address address
     */
    private Address(Address address) {
        this(address.addrStr, address.balance, address.balanceSat, address.totalReceived, address.totalReceivedSat, address.totalSent, address.totalSentSat, address.unconfirmedBalance, address.unconfirmedBalanceSat, address.unconfirmedTxApperances, address.txApperances, address.transactions);
    }

    /**
     * JSON deserialization constructor
     * Create this object by deserializing a JSON string
     * @param json json
     */
    public Address(String json) {
        this(GSON.fromJson(json, Address.class));
    }

    /**
     * Getter
     * @return address
     */
    public String getAddressStr() {
        return addrStr;
    }

    /**
     * Getter
     * @return balance in BTC
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Getter
     * @return balance in Satoshi
     */
    public long getBalanceSat() {
        return balanceSat;
    }

    /**
     * Getter
     * @return total received in BTC
     */
    public double getTotalReceived() {
        return totalReceived;
    }

    /**
     * Getter
     * @return total received in Satoshi
     */
    public long getTotalReceivedSat() {
        return totalReceivedSat;
    }

    /**
     * Getter
     * @return total sent in BTC
     */
    public double getTotalSent() {
        return totalSent;
    }

    /**
     * Getter
     * @return total sent in Satoshi
     */
    public long getTotalSentSat() {
        return totalSentSat;
    }

    /**
     * Getter
     * @return unconfirmed balance in BTC
     */
    public double getUnconfirmedBalance() {
        return unconfirmedBalance;
    }

    /**
     * Getter
     * @return unconfirmed balance in Satoshi
     */
    public long getUnconfirmedBalanceSat() {
        return unconfirmedBalanceSat;
    }

    /**
     * Getter
     * @return unconfirmed transaction appearances
     */
    public int getNumberOfUnconfirmedTransactionAppearances() {
        return unconfirmedTxApperances;
    }

    /**
     * Getter
     * @return transaction appearances
     */
    public int getNumberOfTransactionAppearances() {
        return txApperances;
    }

    /**
     * Getter
     * @return transactions
     */
    public List<String> getTransactions() {
        return Arrays.asList(transactions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(addrStr, address.addrStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addrStr);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addrStr='" + addrStr + '\'' +
                ", balance=" + balance +
                ", balanceSat=" + balanceSat +
                ", totalReceived=" + totalReceived +
                ", totalReceivedSat=" + totalReceivedSat +
                ", totalSent=" + totalSent +
                ", totalSentSat=" + totalSentSat +
                ", unconfirmedBalance=" + unconfirmedBalance +
                ", unconfirmedBalanceSat=" + unconfirmedBalanceSat +
                ", unconfirmedTxApperances=" + unconfirmedTxApperances +
                ", txApperances=" + txApperances +
                ", transactions=" + Arrays.toString(transactions) +
                '}';
    }
}