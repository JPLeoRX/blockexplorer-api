package com.tekleo.blockexplorer_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Sync Status Test
 *
 * @author Leo Ertuna
 * @since 09.06.2018 14:43
 */
public class SyncStatusTest {
    @Test
    public void test() {
        String json = "{\n" +
                "    \"status\": \"finished\",\n" +
                "    \"blockChainHeight\": 526707,\n" +
                "    \"syncPercentage\": 100,\n" +
                "    \"height\": 526707,\n" +
                "    \"error\": null,\n" +
                "    \"type\": \"bitcore node\"\n" +
                "}";

        SyncStatus syncStatus = new SyncStatus(json);

        assertEquals("finished", syncStatus.getStatus());
        assertTrue(syncStatus.isFinished());
        assertEquals(526707, syncStatus.getBlockChainHeight());
        assertEquals(100, syncStatus.getSyncPercentage());
        assertEquals(526707, syncStatus.getHeight());
        assertEquals("bitcore node", syncStatus.getType());
    }
}