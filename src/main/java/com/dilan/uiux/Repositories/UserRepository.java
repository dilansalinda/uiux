package com.dilan.uiux.Repositories;

import com.dilan.uiux.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User: Dilan Salinda
 * Date: 2020-04-29
 * Time: 10:26 PM
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
