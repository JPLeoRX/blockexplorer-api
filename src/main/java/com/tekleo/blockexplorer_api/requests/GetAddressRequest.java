package com.tekleo.blockexplorer_api.requests;

import com.tekleo.blockexplorer_api.http_client.GetRequest;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GetAddressRequest implements BlockExplorerRequest, GetRequest {
    private String address;

    public GetAddressRequest(String address) {
        this.address = address;
    }

    @Override
    public String getMethod() {
        return "/api/addr";
    }

    @Override
    public List<String> getArguments() {
        return Collections.singletonList(address);
    }

    @Override
    public Map<String, String> getParameters() {
        return null;
    }
}
