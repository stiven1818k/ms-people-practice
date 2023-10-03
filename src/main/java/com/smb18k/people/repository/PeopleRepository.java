package com.smb18k.people.repository;

import com.smb18k.people.model.People;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PeopleRepository extends CrudRepository <People, Long> {

    @Query("select p from People p where p.correo = :term")
    public People findByEmail(@Param("term") String term);

}
