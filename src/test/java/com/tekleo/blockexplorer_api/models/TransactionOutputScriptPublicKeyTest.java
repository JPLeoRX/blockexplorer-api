package com.tekleo.blockexplorer_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Transaction Output Script Public Key Test
 *
 * @author Leo Ertuna
 * @since 09.06.2018 15:49
 */
public class TransactionOutputScriptPublicKeyTest {
    @Test
    public void test() {
        String json = "{\n" +
                "                \"hex\": \"76a914c825a1ecf2a6830c4401620c3a16f1995057c2ab88ac\",\n" +
                "                \"asm\": \"OP_DUP OP_HASH160 c825a1ecf2a6830c4401620c3a16f1995057c2ab OP_EQUALVERIFY OP_CHECKSIG\",\n" +
                "                \"addresses\": [\n" +
                "                    \"1KFHE7w8BhaENAswwryaoccDb6qcT6DbYY\"\n" +
                "                ],\n" +
                "                \"type\": \"pubkeyhash\"\n" +
                "            }";

        TransactionOutputScriptPublicKey scriptPublicKey = new TransactionOutputScriptPublicKey(json);

        assertEquals("76a914c825a1ecf2a6830c4401620c3a16f1995057c2ab88ac", scriptPublicKey.getHex());
        assertEquals("OP_DUP OP_HASH160 c825a1ecf2a6830c4401620c3a16f1995057c2ab OP_EQUALVERIFY OP_CHECKSIG", scriptPublicKey.getAsm());
        assertEquals(1, scriptPublicKey.getAddresses().size());
        assertTrue(scriptPublicKey.getAddresses().contains("1KFHE7w8BhaENAswwryaoccDb6qcT6DbYY"));
        assertEquals("pubkeyhash", scriptPublicKey.getType());
    }
}