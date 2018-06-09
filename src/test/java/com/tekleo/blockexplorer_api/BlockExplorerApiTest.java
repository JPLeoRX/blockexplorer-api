package com.tekleo.blockexplorer_api;

import com.tekleo.blockexplorer_api.models.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlockExplorerApiTest {
    private static final double DELTA = 0.0000001;
    private static final BlockExplorerApi API = BlockExplorerApiFactory.INSTANCE.create();

    @Test
    public void getBlock() {
        Block block = API.getBlock("0000000000000000079c58e8b5bce4217f7515a74b170049398ed9b8428beb4a");

        assertEquals("0000000000000000079c58e8b5bce4217f7515a74b170049398ed9b8428beb4a", block.getHash());
        assertEquals(479, block.getSize());
        assertEquals(371623, block.getHeight());
        assertEquals(3, block.getVersion());
        assertEquals("01a5f8b432e06c11a32b3f30e6cc9a12da207b9237fddf77850801275cf4fe01", block.getMerkleRoot());
        assertEquals(2, block.getTransactions().size());
        assertTrue(block.getTransactions().contains("ee6bc0e5f95a4ccd0f00784eab850ff8593f9045de96c6656df41c8f9f9c0888"));
        assertTrue(block.getTransactions().contains("29c59ec39fc19afd84d928272b3290bbe54558f7b51f75feb858b005dea49c10"));
        assertEquals(1440604813L, block.getTime());
        assertEquals(3431621579L, block.getNonce());
        assertEquals("181443c4", block.getBits());
        assertEquals(54256630327.88996, block.getDifficulty(), DELTA);
        assertEquals("0000000000000000000000000000000000000000000998b7adec271cd0ea7258", block.getChainWork());
        assertTrue(155082 < block.getConfirmations());
        assertEquals("0000000000000000027d0985fef71cbc05a5ee5cdbdc4c6baf2307e6c5db8591", block.getPreviousBlockHash());
        assertEquals("000000000000000013677449d7375ed22f9c66a94940328081412179795a1ac5", block.getNextBlockHash());
        assertEquals(25, block.getReward(), DELTA);
        assertTrue(block.isMainChain());
    }

    @Test
    public void getBlockIndex() {
        BlockIndex blockIndex = API.getBlockIndex(7981);

        assertEquals("0000000015711ec0cd8d5b71ef8ac65df81f6ad95a0449d90ca5bf6820881efb", blockIndex.getBlockHash());
    }

    @Test
    public void getTransaction() {
        Transaction transaction = API.getTransaction("5756ff16e2b9f881cd15b8a7e478b4899965f87f553b6210d0f8e5bf5be7df1d");

        assertEquals("5756ff16e2b9f881cd15b8a7e478b4899965f87f553b6210d0f8e5bf5be7df1d", transaction.getTransactionId());
        assertEquals(1, transaction.getVersion());
        assertEquals(981825022, transaction.getLockTime());
        assertEquals(1, transaction.getInputs().size());
        assertEquals(1, transaction.getOutputs().size());
        assertEquals("0000000000000000027d0985fef71cbc05a5ee5cdbdc4c6baf2307e6c5db8591", transaction.getBlockHash());
        assertEquals(371622, transaction.getBlockHeight());
        assertTrue(155093 < transaction.getNumberOfConfirmations());
        assertEquals(1440604784, transaction.getTime());
        assertEquals(1440604784, transaction.getBlockTime());
        assertTrue(transaction.isCoinBase());
        assertEquals(25.37726812, transaction.getOutputValue(), DELTA);
        assertEquals(185, transaction.getSize());

        TransactionInput transactionInput = transaction.getInputs().get(0);

        assertEquals("03a6ab05e4b883e5bda9e7a59ee4bb99e9b1bc76a3a2bb0e9c92f06e4a6349de9ccc8fbe0fad11133ed73c78ee12876334c13c02000000f09f909f2f4249503130302f4d696e65642062792073647a686162636400000000000000000000000000000000", transactionInput.getCoinBase());
        assertEquals(2765846367L, transactionInput.getSequence());
        assertEquals(0, transactionInput.getN());

        TransactionOutput transactionOutput = transaction.getOutputs().get(0);

        assertEquals(25.37726812, transactionOutput.getValue(), DELTA);
        assertEquals(0, transactionOutput.getN());
        assertEquals("a01b32246795ca47ed77ef78d56736677ec2f2aae7b400ebbcc95cd784492dc2", transactionOutput.getSpentTransactionId());
        assertEquals(6, transactionOutput.getSpentIndex());
        assertEquals(371831, transactionOutput.getSpentHeight());

        TransactionOutputScriptPublicKey scriptPublicKey = transactionOutput.getScriptPublicKey();

        assertEquals("76a914c825a1ecf2a6830c4401620c3a16f1995057c2ab88ac", scriptPublicKey.getHex());
        assertEquals("OP_DUP OP_HASH160 c825a1ecf2a6830c4401620c3a16f1995057c2ab OP_EQUALVERIFY OP_CHECKSIG", scriptPublicKey.getAsm());
        assertEquals(1, scriptPublicKey.getAddresses().size());
        assertTrue(scriptPublicKey.getAddresses().contains("1KFHE7w8BhaENAswwryaoccDb6qcT6DbYY"));
        assertEquals("pubkeyhash", scriptPublicKey.getType());
    }

    @Test
    public void validateAddress() {
        boolean isValid = API.validateAddress("19SokJG7fgk8iTjemJ2obfMj14FM16nqzj");

        assertTrue(isValid);
    }

    @Test
    public void getAddress() {
        Address address = API.getAddress("19SokJG7fgk8iTjemJ2obfMj14FM16nqzj");

        assertEquals("19SokJG7fgk8iTjemJ2obfMj14FM16nqzj", address.getAddressStr());
        assertEquals(0, address.getBalance(), DELTA);
        assertEquals(0, address.getBalanceSat());
        assertEquals(112.91089695, address.getTotalReceived(), DELTA);
        assertEquals(11291089695L, address.getTotalReceivedSat());
        assertEquals(112.91089695, address.getTotalSent(), DELTA);
        assertEquals(11291089695L, address.getTotalSentSat());
        assertEquals(0, address.getUnconfirmedBalance(), DELTA);
        assertEquals(0, address.getUnconfirmedBalanceSat());
        assertEquals(0, address.getNumberOfUnconfirmedTransactionAppearances());
        assertEquals(364, address.getNumberOfTransactionAppearances());
        assertEquals(364, address.getTransactions().size());
        assertTrue(address.getTransactions().contains("a2afb522edeba67ae593c683154da45b231d59ffccd18806cec38ecd21994a2d"));
        assertTrue(address.getTransactions().contains("c1b579ea24a1e392cc28b05db24b7ce84d31ec5e165fa9dcca2bcaf2964171aa"));
        assertTrue(address.getTransactions().contains("a6a1fc955d82702f92ed10757da6f2e08afd23da27a879243275bccab867d7fe"));
    }

    @Test
    public void getNetworkStatus() {
        NetworkStatus networkStatus = API.getNetworkStatus();

        NetworkInfo networkInfo = networkStatus.getInfo();

        assertTrue(120100 <= networkInfo.getVersion());
        assertTrue(70012 <= networkInfo.getProtocolVersion());
        assertTrue(526707 <= networkInfo.getNumberOfBlocks());
        assertEquals(0, networkInfo.getTimeOffset());
        assertTrue(networkInfo.getNumberOfConnections() != 0);
        assertEquals("", networkInfo.getProxy());
        assertTrue(4940704885521.827 <= networkInfo.getDifficulty());
        assertFalse(networkInfo.isTestNet());
        assertTrue(networkInfo.isLiveNet());
        assertEquals(0.00001, networkInfo.getRelayFee(), DELTA);
        assertEquals("Warning: unknown new rules activated (versionbit 1)", networkInfo.getErrors());
        assertEquals("livenet", networkInfo.getNetwork());
    }

    @Test
    public void getSyncStatus() {
        SyncStatus syncStatus = API.getSyncStatus();

        assertEquals("finished", syncStatus.getStatus());
        assertTrue(syncStatus.isFinished());
        assertTrue(526707 <= syncStatus.getBlockChainHeight());
        assertTrue(80 <= syncStatus.getSyncPercentage());
        assertTrue(526707 <= syncStatus.getHeight());
        assertEquals("bitcore node", syncStatus.getType());
    }
}