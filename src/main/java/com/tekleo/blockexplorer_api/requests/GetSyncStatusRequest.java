package com.tekleo.blockexplorer_api.requests;

import com.tekleo.blockexplorer_api.http_client.GetRequest;

import java.util.List;
import java.util.Map;

public class GetSyncStatusRequest implements BlockExplorerRequest, GetRequest {
    @Override
    public String getMethod() {
        return "/api/sync";
    }

    @Override
    public List<String> getArguments() {
        return null;
    }

    @Override
    public Map<String, String> getParameters() {
        return null;
    }
}