package io.microsamples.openapi.chachkies.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController
public class ChachkiesApiImpl implements ChachkiesApi {
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return ChachkiesApi.super.getRequest();
    }
}
