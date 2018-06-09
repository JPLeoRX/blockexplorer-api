package com.tekleo.blockexplorer_api.requests;

import com.tekleo.blockexplorer_api.http_client.GetRequest;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GetBlockIndexRequest implements BlockExplorerRequest, GetRequest {
    private int height;

    public GetBlockIndexRequest(int height) {
        this.height = height;
    }

    @Override
    public String getMethod() {
        return "/api/block-index";
    }

    @Override
    public List<String> getArguments() {
        return Collections.singletonList(String.valueOf(height));
    }

    @Override
    public Map<String, String> getParameters() {
        return null;
    }
}