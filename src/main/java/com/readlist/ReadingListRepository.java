package com.readlist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by luis on 4/3/2017.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {

    List<Book> findByReader(String reader);
}
