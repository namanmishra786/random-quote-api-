package com.example.demo.controller;

import com.example.demo.model.Quote;
import com.example.demo.service.QuoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/quotes")
public class Quotecontroller {

    private final QuoteService quoteService;

    @Autowired
    public Quotecontroller(QuoteService quoteService){
        this.quoteService = quoteService;
    }

    @GetMapping
    public List<Quote> getAllQuotes() {
        return quoteService.getAllQuotes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Quote> getQuoteById(@PathVariable Long id) {
        Optional<Quote> quote = quoteService.getQuoteById(id);
        return quote.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Quote> addQuote(@RequestBody Quote quote) {
        Quote savedQuote = quoteService.saveQuote(quote);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedQuote);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Quote> updateQuote(@PathVariable Long id, @RequestBody Quote quote) {
        if (!quoteService.getQuoteById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        quote.setId(id); // Ensure the ID in the request body matches the path variable ID
        Quote updatedQuote = quoteService.saveQuote(quote);
        return ResponseEntity.ok(updatedQuote);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuote(@PathVariable Long id) {
        if (!quoteService.getQuoteById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        quoteService.deleteQuote(id);
        return ResponseEntity.noContent().build();
    }
}
