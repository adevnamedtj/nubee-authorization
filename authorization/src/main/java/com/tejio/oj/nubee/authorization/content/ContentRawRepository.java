package com.tejio.oj.nubee.authorization.content;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tejio.oj.nubee.authorization.model.Content;
import com.tejio.oj.nubee.authorization.model.ContentRaw;

@Repository
public interface ContentRawRepository extends CrudRepository<ContentRaw, String>{

}
