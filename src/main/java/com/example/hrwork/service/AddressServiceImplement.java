package com.example.hrwork.service;

import com.example.hrwork.entity.Address;
import com.example.hrwork.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImplement  implements AddressService{

    @Autowired
    private AddressRepository addressRepository;
    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address updateAddress(Address address) {
        Address update = addressRepository.findById(address.getAddress_id()).orElse(null);
        if(update !=null){

            update.setCity(address.getCity());
            update.setState(address.getState());
            update.setZipcode(address.getZipcode());
            update.setStreet_name(address.getStreet_name());
            update.setCountry(address.getCountry());

            addressRepository.save(update);
            return update;
        }
        return  null;
    }

    @Override
    public void deleteAddress(Long addressId) {
        addressRepository.deleteById(addressId);


    }

    @Override
    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }
}
