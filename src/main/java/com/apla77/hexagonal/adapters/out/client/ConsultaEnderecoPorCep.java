package com.apla77.hexagonal.adapters.out.client;

import com.apla77.hexagonal.adapters.out.client.response.EnderecosResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "ConsultaEnderecoPorCep",
        url = "${apla77.client.inserirEndereco.url}"
)
public interface ConsultaEnderecoPorCep {

    @GetMapping("/{numeroCep}")
    EnderecosResponse find(@PathVariable("numeroCep") String numeroCep);
}
