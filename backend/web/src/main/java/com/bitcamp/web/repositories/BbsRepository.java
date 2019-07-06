package com.bitcamp.web.repositories;

import com.bitcamp.web.entities.Bbs;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * BbsRepository
 */
@Repository
public interface BbsRepository extends CrudRepository<Bbs, Long> {
}