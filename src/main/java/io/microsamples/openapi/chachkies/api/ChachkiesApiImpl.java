package io.microsamples.openapi.chachkies.api;

import io.microsamples.openapi.chachkies.model.Chachkie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RestController
public class ChachkiesApiImpl implements ChachkiesApi {

    @Override
    public ResponseEntity<List<Chachkie>> getChachkies() {
        return ResponseEntity.noContent().build();
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return ChachkiesApi.super.getRequest();
    }
}
