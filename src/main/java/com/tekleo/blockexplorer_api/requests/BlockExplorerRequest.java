package com.tekleo.blockexplorer_api.requests;

import com.tekleo.blockexplorer_api.http_client.Request;

/**
 * Block explorer request
 */
public interface BlockExplorerRequest extends Request {
    @Override
    default String getBase() {
        return "https://blockexplorer.com";
    }
}