package com.example.Joins.Tables.All.Relations.to.DB.service;

import com.example.Joins.Tables.All.Relations.to.DB.models.Address;
import com.example.Joins.Tables.All.Relations.to.DB.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Integer id) {
        return addressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Address not found with id " + id));
    }

    @Override
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Integer id, Address address) {
        if (!addressRepository.existsById(id)) {
            throw new RuntimeException("Address not found with id " + id);
        }
        address.setId(id);
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddress(Integer id) {
        if (!addressRepository.existsById(id)) {
            throw new RuntimeException("Address not found with id " + id);
        }
        addressRepository.deleteById(id);
    }
}
