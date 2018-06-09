package com.tekleo.blockexplorer_api;

import com.tekleo.blockexplorer_api.models.*;
import com.tekleo.blockexplorer_api.requests.*;

/**
 * Block Explorer API Implementation
 *
 * @author Leo Ertuna
 * @since 09.06.2018 17:33
 */
public class BlockExplorerApiImpl implements BlockExplorerApi {
    /**
     * Get block
     * @param hash hash of the block
     * @return block
     */
    @Override
    public Block getBlock(String hash) {
        return new Block(new GetBlockRequest(hash).send());
    }

    /**
     * Get block index
     * @param height height of the block
     * @return block index (naturally just the hash of the block)
     */
    @Override
    public BlockIndex getBlockIndex(int height) {
        return new BlockIndex(new GetBlockIndexRequest(height).send());
    }

    /**
     * Get transaction
     * @param transactionId transaction id (hash)
     * @return transaction
     */
    @Override
    public Transaction getTransaction(String transactionId) {
        return new Transaction(new GetTransactionRequest(transactionId).send());
    }

    /**
     * Check if the given address is a valid bitcoin address
     * @param address address
     * @return true if it's valid, false otherwise
     */
    @Override
    public boolean validateAddress(String address) {
        return Model.GSON.fromJson(new ValidateAddressRequest(address).send(), Boolean.class);
    }

    /**
     * Get address
     * @param address address
     * @return address
     */
    @Override
    public Address getAddress(String address) {
        return new Address(new GetAddressRequest(address).send());
    }

    /**
     * Get network status
     * @return network status
     */
    @Override
    public NetworkStatus getNetworkStatus() {
        return new NetworkStatus(new GetNetworkStatusRequest().send());
    }

    /**
     * Get sync status
     * @return sync status
     */
    @Override
    public SyncStatus getSyncStatus() {
        return new SyncStatus(new GetSyncStatusRequest().send());
    }
}