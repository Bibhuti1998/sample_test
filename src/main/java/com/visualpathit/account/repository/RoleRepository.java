package com.visualpathit.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.visualpathit.account.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
}
