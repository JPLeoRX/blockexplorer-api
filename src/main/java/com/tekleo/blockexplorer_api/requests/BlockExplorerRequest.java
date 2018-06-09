package com.tekleo.blockexplorer_api.requests;

import com.tekleo.blockexplorer_api.BlockExplorerApiConfig;
import com.tekleo.blockexplorer_api.http_client.Request;

/**
 * Block explorer request
 */
public interface BlockExplorerRequest extends Request {
    @Override
    default String getBase() {
        if (BlockExplorerApiConfig.getInstance().getNetwork() == BlockExplorerApiConfig.Network.LIVE)
            return "https://blockexplorer.com";
        else if (BlockExplorerApiConfig.getInstance().getNetwork() == BlockExplorerApiConfig.Network.TEST)
            return "https://testnet.blockexplorer.com";
        else
            throw new IllegalArgumentException();
    }
}