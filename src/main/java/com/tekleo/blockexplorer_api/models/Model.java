package com.tekleo.blockexplorer_api.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Serializable;

/**
 * Model interface
 *
 * @author Leo Ertuna
 * @since 09.06.2018 13:31
 */
public interface Model extends Serializable {
    public static final GsonBuilder GSON_BUILDER = new GsonBuilder();
    public static final Gson GSON = GSON_BUILDER.create();
}