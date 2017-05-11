package com.elide.test;

import com.elide.test.entities.Child;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by SFEO11821 on 10/05/2017.
 */
public interface ChildRepository extends JpaRepository<Child,Integer> {
}
