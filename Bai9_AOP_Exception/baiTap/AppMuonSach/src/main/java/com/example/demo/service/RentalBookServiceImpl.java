package com.example.demo.service;

import com.example.demo.bean.RentalBook;
import com.example.demo.repository.RentalBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalBookServiceImpl implements RentalBookService{
    @Autowired
    private RentalBookRepository rentalBookRepository;

    @Override
    public RentalBook findById(Integer id) {
        return rentalBookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(RentalBook rentalBook) {
        rentalBookRepository.save(rentalBook);
    }

    @Override
    public void delete(RentalBook rentalBook) {
        rentalBookRepository.delete(rentalBook);
    }
}
