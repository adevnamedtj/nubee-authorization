package com.tejio.oj.nubee.authorization.content;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tejio.oj.nubee.authorization.model.Content;

@Repository
public interface ContentRepository extends CrudRepository<Content, String>{

}
