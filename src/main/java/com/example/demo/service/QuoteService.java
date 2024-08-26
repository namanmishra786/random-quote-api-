package com.example.demo.service;

import com.example.demo.model.Quote;
import com.example.demo.repostiory.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class QuoteService {
    private final QuoteRepository quoteRepository;

    @Autowired
    public  QuoteService(QuoteRepository quoteRepository){
        this.quoteRepository = quoteRepository;
    }

    public List<Quote> getAllQuotes(){
        return quoteRepository.findAll();

    }

    public Optional<Quote> getQuoteById(Long id ){
        return quoteRepository.findById(id);
    }
    public Quote saveQuote(Quote quote) {
        return quoteRepository.save(quote);
    }

    public void deleteQuote(Long id) {
        quoteRepository.deleteById(id);
    }





}
