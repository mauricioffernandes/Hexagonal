package com.apla77.hexagonal.adapters.out.client.mapper;

import com.apla77.hexagonal.adapters.out.client.response.EnderecosResponse;
import com.apla77.hexagonal.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoResponseMapper {

    Endereco paraEndereco(EnderecosResponse enderecosResponse);
}
