package com.example.Joins.Tables.All.Relations.to.DB.service;

import com.example.Joins.Tables.All.Relations.to.DB.models.Address;
import java.util.List;


public interface AddressService {
    List<Address> getAllAddresses();
    Address getAddressById(Integer id);
    Address createAddress(Address address);
    Address updateAddress(Integer id, Address address);
    void deleteAddress(Integer id);
}
