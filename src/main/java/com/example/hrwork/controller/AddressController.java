package com.example.hrwork.controller;

import com.example.hrwork.entity.Address;
import com.example.hrwork.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses/")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping

    public List<Address> fetchAllAddress()
    {
        return addressService.getAllAddress();
    }
    @PostMapping

    public Address postAddress( @RequestBody Address address)
    {
        System.out.println(" Something has been Changes");
        System.out.println("This is also added");
        return addressService.createAddress(address);
    }

    @GetMapping("{id}")
    public Address getAddressById(@PathVariable Long id){
        return  addressService.getAddressById(id);
    }

    @DeleteMapping("{id}")
    public void deleteAddress(@PathVariable Long id){
        addressService.deleteAddress(id);

    }

    @PutMapping

    public Address updateAddress( @RequestBody Address address)
    {
        return addressService.updateAddress(address);
    }


}
