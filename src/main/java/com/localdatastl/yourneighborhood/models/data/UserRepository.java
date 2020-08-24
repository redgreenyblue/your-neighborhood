package com.localdatastl.yourneighborhood.models.data;

import com.localdatastl.yourneighborhood.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
