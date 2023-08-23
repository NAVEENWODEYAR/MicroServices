package com.oignon.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oignon.modal.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>
{

}
