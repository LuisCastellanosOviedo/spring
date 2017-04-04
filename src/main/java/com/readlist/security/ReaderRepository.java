package com.readlist.security;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by luis on 4/4/2017.
 */
public interface ReaderRepository extends JpaRepository<Reader,String> {
}
