package com.tekleo.blockexplorer_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Transaction Input Test
 *
 * @author Leo Ertuna
 * @since 09.06.2018 16:50
 */
public class TransactionTest {
    private static final double DELTA = 0.0000001;

    @Test
    public void test() {
        String json = "{\n" +
                "    \"txid\": \"5756ff16e2b9f881cd15b8a7e478b4899965f87f553b6210d0f8e5bf5be7df1d\",\n" +
                "    \"version\": 1,\n" +
                "    \"locktime\": 981825022,\n" +
                "    \"vin\": [\n" +
                "        {\n" +
                "            \"coinbase\": \"03a6ab05e4b883e5bda9e7a59ee4bb99e9b1bc76a3a2bb0e9c92f06e4a6349de9ccc8fbe0fad11133ed73c78ee12876334c13c02000000f09f909f2f4249503130302f4d696e65642062792073647a686162636400000000000000000000000000000000\",\n" +
                "            \"sequence\": 2765846367,\n" +
                "            \"n\": 0\n" +
                "        }\n" +
                "    ],\n" +
                "    \"vout\": [\n" +
                "        {\n" +
                "            \"value\": \"25.37726812\",\n" +
                "            \"n\": 0,\n" +
                "            \"scriptPubKey\": {\n" +
                "                \"hex\": \"76a914c825a1ecf2a6830c4401620c3a16f1995057c2ab88ac\",\n" +
                "                \"asm\": \"OP_DUP OP_HASH160 c825a1ecf2a6830c4401620c3a16f1995057c2ab OP_EQUALVERIFY OP_CHECKSIG\",\n" +
                "                \"addresses\": [\n" +
                "                    \"1KFHE7w8BhaENAswwryaoccDb6qcT6DbYY\"\n" +
                "                ],\n" +
                "                \"type\": \"pubkeyhash\"\n" +
                "            },\n" +
                "            \"spentTxId\": \"a01b32246795ca47ed77ef78d56736677ec2f2aae7b400ebbcc95cd784492dc2\",\n" +
                "            \"spentIndex\": 6,\n" +
                "            \"spentHeight\": 371831\n" +
                "        }\n" +
                "    ],\n" +
                "    \"blockhash\": \"0000000000000000027d0985fef71cbc05a5ee5cdbdc4c6baf2307e6c5db8591\",\n" +
                "    \"blockheight\": 371622,\n" +
                "    \"confirmations\": 155093,\n" +
                "    \"time\": 1440604784,\n" +
                "    \"blocktime\": 1440604784,\n" +
                "    \"isCoinBase\": true,\n" +
                "    \"valueOut\": 25.37726812,\n" +
                "    \"size\": 185\n" +
                "}";

        Transaction transaction = new Transaction(json);

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
}