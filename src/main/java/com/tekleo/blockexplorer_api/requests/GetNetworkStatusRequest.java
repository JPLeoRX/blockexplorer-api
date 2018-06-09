package com.tekleo.blockexplorer_api.requests;

import com.tekleo.blockexplorer_api.http_client.GetRequest;
import com.tekleo.blockexplorer_api.utils.MapUtils;

import java.util.List;
import java.util.Map;

public class GetNetworkStatusRequest implements BlockExplorerRequest, GetRequest {
    @Override
    public String getMethod() {
        return "/api/status";
    }

    @Override
    public List<String> getArguments() {
        return null;
    }

    @Override
    public Map<String, String> getParameters() {
        return MapUtils.fromOne("q", "getInfo");
    }
}