package com.itgate.demo.dao;

import com.itgate.demo.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IAuthority extends JpaRepository<Authority,Long> {
}
