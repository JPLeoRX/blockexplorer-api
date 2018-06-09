package com.tekleo.blockexplorer_api.models;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Transaction Output Script Public Key
 *
 * @author Leo Ertuna
 * @since 09.06.2018 15:47
 */
public class TransactionOutputScriptPublicKey implements Model {
    private String hex;                             // Hex
    private String asm;                             // Asm
    private String[] addresses;                     // Addresses
    private String type;                            // Type

    /**
     * Full arguments constructor
     * This should be used only for cloning and constructor chaining
     * Private access
     * @param hex hex
     * @param asm asm
     * @param addresses addresses
     * @param type type
     */
    private TransactionOutputScriptPublicKey(String hex, String asm, String[] addresses, String type) {
        this.hex = hex;
        this.asm = asm;
        this.addresses = addresses;
        this.type = type;
    }

    /**
     * Cloning constructor
     * We simply copy all fields of another script public key
     * Private access
     * @param scriptPublicKey script public key
     */
    private TransactionOutputScriptPublicKey(TransactionOutputScriptPublicKey scriptPublicKey) {
        this(scriptPublicKey.hex, scriptPublicKey.asm, scriptPublicKey.addresses, scriptPublicKey.type);
    }

    /**
     * JSON deserialization constructor
     * Create this object by deserializing a JSON string
     * @param json json
     */
    public TransactionOutputScriptPublicKey(String json) {
        this(GSON.fromJson(json, TransactionOutputScriptPublicKey.class));
    }

    /**
     * Getter
     * @return hex
     */
    public String getHex() {
        return hex;
    }

    /**
     * Getter
     * @return asm
     */
    public String getAsm() {
        return asm;
    }

    /**
     * Getter
     * @return addresses
     */
    public List<String> getAddresses() {
        return Arrays.asList(addresses);
    }

    /**
     * Getter
     * @return type
     */
    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionOutputScriptPublicKey that = (TransactionOutputScriptPublicKey) o;
        return Objects.equals(hex, that.hex) && Objects.equals(asm, that.asm) && Arrays.equals(addresses, that.addresses) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(hex, asm, type);
        result = 31 * result + Arrays.hashCode(addresses);
        return result;
    }

    @Override
    public String toString() {
        return "TransactionOutputScriptPublicKey{" +
                "hex='" + hex + '\'' +
                ", asm='" + asm + '\'' +
                ", addresses=" + Arrays.toString(addresses) +
                ", type='" + type + '\'' +
                '}';
    }
}