package com.mbda.demobookapp.repository;

import com.mbda.demobookapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Long> {
}
