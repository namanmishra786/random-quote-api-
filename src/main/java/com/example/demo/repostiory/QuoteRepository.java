package com.example.demo.repostiory;



import com.example.demo.model.Quote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuoteRepository extends JpaRepository<Quote,Long>{
}
