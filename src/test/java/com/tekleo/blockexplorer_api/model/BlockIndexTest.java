package com.tekleo.blockexplorer_api.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Block Index Test
 *
 * @author Leo Ertuna
 * @since 09.06.2018 14:04
 */
public class BlockIndexTest {
    @Test
    public void test() {
        String json = "{\n" +
                "    \"blockHash\": \"0000000015711ec0cd8d5b71ef8ac65df81f6ad95a0449d90ca5bf6820881efb\"\n" +
                "}";

        BlockIndex blockIndex = new BlockIndex(json);

        assertEquals("0000000015711ec0cd8d5b71ef8ac65df81f6ad95a0449d90ca5bf6820881efb", blockIndex.getBlockHash());
    }
}