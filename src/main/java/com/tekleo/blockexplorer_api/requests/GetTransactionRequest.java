package com.tekleo.blockexplorer_api.requests;

import com.tekleo.blockexplorer_api.http_client.GetRequest;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GetTransactionRequest implements BlockExplorerRequest, GetRequest {
    private String hash;

    public GetTransactionRequest(String hash) {
        this.hash = hash;
    }

    @Override
    public String getMethod() {
        return "/api/tx";
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