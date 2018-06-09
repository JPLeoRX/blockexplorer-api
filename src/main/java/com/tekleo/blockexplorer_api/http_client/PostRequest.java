package com.tekleo.blockexplorer_api.http_client;

/**
 * Post Request
 *
 * @author Leo Ertuna
 * @since 09.06.2018 14:52
 */
public interface PostRequest extends Request {
    @Override
    default Type getType() {
        return Type.POST;
    }
}