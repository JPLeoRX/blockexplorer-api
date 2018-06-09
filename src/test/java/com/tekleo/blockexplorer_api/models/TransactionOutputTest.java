package com.tekleo.blockexplorer_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Transaction Output Test
 *
 * @author Leo Ertuna
 * @since 09.06.2018 15:59
 */
public class TransactionOutputTest {
    private static final double DELTA = 0.0000001;

    @Test
    public void test() {
        String json = "{\n" +
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
                "        }";

        TransactionOutput transactionOutput = new TransactionOutput(json);

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