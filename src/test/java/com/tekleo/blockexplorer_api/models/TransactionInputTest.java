package com.tekleo.blockexplorer_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Transaction Input Test
 *
 * @author Leo Ertuna
 * @since 09.06.2018 16:40
 */
public class TransactionInputTest {
    @Test
    public void test() {
        String json = "{\n" +
                "            \"coinbase\": \"03a6ab05e4b883e5bda9e7a59ee4bb99e9b1bc76a3a2bb0e9c92f06e4a6349de9ccc8fbe0fad11133ed73c78ee12876334c13c02000000f09f909f2f4249503130302f4d696e65642062792073647a686162636400000000000000000000000000000000\",\n" +
                "            \"sequence\": 2765846367,\n" +
                "            \"n\": 0\n" +
                "        }";

        TransactionInput transactionInput = new TransactionInput(json);

        assertEquals("03a6ab05e4b883e5bda9e7a59ee4bb99e9b1bc76a3a2bb0e9c92f06e4a6349de9ccc8fbe0fad11133ed73c78ee12876334c13c02000000f09f909f2f4249503130302f4d696e65642062792073647a686162636400000000000000000000000000000000", transactionInput.getCoinBase());
        assertEquals(2765846367L, transactionInput.getSequence());
        assertEquals(0, transactionInput.getN());
    }
}