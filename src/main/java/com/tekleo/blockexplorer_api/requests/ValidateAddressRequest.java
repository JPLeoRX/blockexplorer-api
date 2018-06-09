package com.tekleo.blockexplorer_api.requests;

import com.tekleo.blockexplorer_api.http_client.GetRequest;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ValidateAddressRequest implements BlockExplorerRequest, GetRequest {
    private String address;

    public ValidateAddressRequest(String address) {
        this.address = address;
    }

    @Override
    public String getMethod() {
        return "/api/addr-validate";
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