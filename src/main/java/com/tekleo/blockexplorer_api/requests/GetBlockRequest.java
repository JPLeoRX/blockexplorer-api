package com.tekleo.blockexplorer_api.requests;

import com.tekleo.blockexplorer_api.http_client.GetRequest;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GetBlockRequest implements BlockExplorerRequest, GetRequest{
    private String hash;

    public GetBlockRequest(String hash) {
        this.hash = hash;
    }

    @Override
    public String getMethod() {
        return "/api/block";
    }

    @Override
    public List<String> getArguments() {
        return Collections.singletonList(hash);
    }

    @Override
    public Map<String, String> getParameters() {
        return null;
    }
}