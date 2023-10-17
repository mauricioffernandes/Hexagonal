package com.apla77.hexagonal.adapters.in.controller;

import com.apla77.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.apla77.hexagonal.adapters.in.controller.request.EnderecoRequest;
import com.apla77.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.apla77.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.apla77.hexagonal.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/enderecos")
public class EnderecoController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody EnderecoRequest enderecoRequest){
        var customer = customerMapper.paraEnderecoRequest(enderecoRequest);
        insertCustomerInputPort.insert(customer, enderecoRequest.getCep());
        return ResponseEntity.ok().build();
    }


    @GetMapping("/{id")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }
}
