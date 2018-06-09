package com.tekleo.blockexplorer_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Network Status Test
 *
 * @author Leo Ertuna
 * @since 09.06.2018 14:43
 */
public class NetworkStatusTest {
    private static final double DELTA = 0.0000001;

    @Test
    public void test() {
        String json = "{\n" +
                "    \"info\": {\n" +
                "        \"version\": 120100,\n" +
                "        \"protocolversion\": 70012,\n" +
                "        \"blocks\": 526707,\n" +
                "        \"timeoffset\": 0,\n" +
                "        \"connections\": 57,\n" +
                "        \"proxy\": \"\",\n" +
                "        \"difficulty\": 4940704885521.827,\n" +
                "        \"testnet\": false,\n" +
                "        \"relayfee\": 0.00001,\n" +
                "        \"errors\": \"Warning: unknown new rules activated (versionbit 1)\",\n" +
                "        \"network\": \"livenet\"\n" +
                "    }\n" +
                "}";

        NetworkStatus networkStatus = new NetworkStatus(json);

        NetworkInfo networkInfo = networkStatus.getInfo();

        assertEquals(120100, networkInfo.getVersion());
        assertEquals(70012, networkInfo.getProtocolVersion());
        assertEquals(526707, networkInfo.getNumberOfBlocks());
        assertEquals(0, networkInfo.getTimeOffset());
        assertEquals(57, networkInfo.getNumberOfConnections());
        assertEquals("", networkInfo.getProxy());
        assertEquals(4940704885521.827, networkInfo.getDifficulty(), DELTA);
        assertFalse(networkInfo.isTestNet());
        assertTrue(networkInfo.isLiveNet());
        assertEquals(0.00001, networkInfo.getRelayFee(), DELTA);
        assertEquals("Warning: unknown new rules activated (versionbit 1)", networkInfo.getErrors());
        assertEquals("livenet", networkInfo.getNetwork());
    }
}