package com.tekleo.blockexplorer_api;

import com.tekleo.blockexplorer_api.models.*;

/**
 * Block Explorer API
 *
 * @author Leo Ertuna
 * @since 09.06.2018 17:24
 */
public interface BlockExplorerApi {
    /**
     * Get block
     * @param hash hash of the block
     * @return block
     */
    Block getBlock(String hash);

    /**
     * Get block index
     * @param height height of the block
     * @return block index (naturally just the hash of the block)
     */
    BlockIndex getBlockIndex(int height);

    /**
     * Get transaction
     * @param transactionId transaction id (hash)
     * @return transaction
     */
    Transaction getTransaction(String transactionId);

    /**
     * Check if the given address is a valid bitcoin address
     * @param address address
     * @return true if it's valid, false otherwise
     */
    boolean validateAddress(String address);

    /**
     * Get address
     * @param address address
     * @return address
     */
    Address getAddress(String address);

    /**
     * Get network status
     * @return network status
     */
    NetworkStatus getNetworkStatus();

    /**
     * Get sync status
     * @return sync status
     */
    SyncStatus getSyncStatus();
}