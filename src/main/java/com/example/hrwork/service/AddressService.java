package com.example.hrwork.service;

import com.example.hrwork.entity.Address;

import java.util.List;

public interface AddressService {
    Address createAddress(Address address); // Create
    List<Address> getAllAddress();  // Read/fetch all

    Address updateAddress(Address address);  // Update

    void deleteAddress(Long addressId);   // Delete

    Address getAddressById(Long id);





}
