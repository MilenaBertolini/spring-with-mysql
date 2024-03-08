package iftm.datamysql;

import org.springframework.data.repository.CrudRepository;

import iftm.datamysql.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
