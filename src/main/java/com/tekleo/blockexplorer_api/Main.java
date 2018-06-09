package com.tekleo.blockexplorer_api;

import com.tekleo.blockexplorer_api.requests.*;

public class Main {
    public static void main(String[] args) {
        BlockExplorerApiConfig.getInstance().setNetwork(BlockExplorerApiConfig.Network.TEST);

        GetBlockRequest blockRequest = new GetBlockRequest("0000000000000000079c58e8b5bce4217f7515a74b170049398ed9b8428beb4a");
        GetBlockIndexRequest blockIndexRequest = new GetBlockIndexRequest(21123);
        GetTransactionRequest transactionRequest = new GetTransactionRequest("5756ff16e2b9f881cd15b8a7e478b4899965f87f553b6210d0f8e5bf5be7df1d");
        GetAddressRequest addressRequest = new GetAddressRequest("19SokJG7fgk8iTjemJ2obfMj14FM16nqzj");
        ValidateAddressRequest validateAddressRequest = new ValidateAddressRequest("19SokJG7fgk8iTjemJ2obfMj14FM16nqzj");
        GetNetworkStatusRequest networkStatusRequest = new GetNetworkStatusRequest();
        GetSyncStatusRequest syncStatusRequest = new GetSyncStatusRequest();

        System.out.println(blockRequest.getUrl());
        System.out.println(blockIndexRequest.getUrl());
        System.out.println(transactionRequest.getUrl());
        System.out.println(addressRequest.getUrl());
        System.out.println(validateAddressRequest.getUrl());
        System.out.println(networkStatusRequest.getUrl());
        System.out.println(syncStatusRequest.getUrl());

    }
}
