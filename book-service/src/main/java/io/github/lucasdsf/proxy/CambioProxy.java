package io.github.lucasdsf.proxy;

import io.github.lucasdsf.response.Cambio;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cambio-service")
public interface CambioProxy {

    @GetMapping(value = "cambio-service/{amount}/{from}/{to}")
    public Cambio getCambio(@PathVariable Double amount,
                            @PathVariable String from,
                            @PathVariable String to);
}
