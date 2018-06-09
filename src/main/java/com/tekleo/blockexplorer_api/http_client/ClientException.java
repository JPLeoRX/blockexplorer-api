package com.tekleo.blockexplorer_api.http_client;

/**
 * Runtime Exception that will be used in {@link Client}
 *
 * @author Leo Ertuna
 * @since 09.06.2018 14:56
 */
public class ClientException extends RuntimeException {
    public ClientException() {

    }

    public ClientException(String message) {
        super(message);
    }

    public ClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClientException(Throwable cause) {
        super(cause);
    }

    public ClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}