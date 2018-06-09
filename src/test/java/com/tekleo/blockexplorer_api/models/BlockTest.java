package com.tekleo.blockexplorer_api.models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Block Test
 *
 * @author Leo Ertuna
 * @since 09.06.2018 13:55
 */
public class BlockTest {
    private static final double DELTA = 0.0000001;

    @Test
    public void test() {
        String json = "{\n" +
                "    \"hash\": \"0000000000000000079c58e8b5bce4217f7515a74b170049398ed9b8428beb4a\",\n" +
                "    \"size\": 479,\n" +
                "    \"height\": 371623,\n" +
                "    \"version\": 3,\n" +
                "    \"merkleroot\": \"01a5f8b432e06c11a32b3f30e6cc9a12da207b9237fddf77850801275cf4fe01\",\n" +
                "    \"tx\": [\n" +
                "        \"ee6bc0e5f95a4ccd0f00784eab850ff8593f9045de96c6656df41c8f9f9c0888\",\n" +
                "        \"29c59ec39fc19afd84d928272b3290bbe54558f7b51f75feb858b005dea49c10\"\n" +
                "    ],\n" +
                "    \"time\": 1440604813,\n" +
                "    \"nonce\": 3431621579,\n" +
                "    \"bits\": \"181443c4\",\n" +
                "    \"difficulty\": 54256630327.88996,\n" +
                "    \"chainwork\": \"0000000000000000000000000000000000000000000998b7adec271cd0ea7258\",\n" +
                "    \"confirmations\": 155082,\n" +
                "    \"previousblockhash\": \"0000000000000000027d0985fef71cbc05a5ee5cdbdc4c6baf2307e6c5db8591\",\n" +
                "    \"nextblockhash\": \"000000000000000013677449d7375ed22f9c66a94940328081412179795a1ac5\",\n" +
                "    \"reward\": 25,\n" +
                "    \"isMainChain\": true,\n" +
                "    \"poolInfo\": {}\n" +
                "}";

        Block block = new Block(json);

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
}