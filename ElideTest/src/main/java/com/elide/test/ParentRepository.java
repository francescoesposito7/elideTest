package com.elide.test;

import com.elide.test.entities.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by SFEO11821 on 05/05/2017.
 */
public interface ParentRepository extends JpaRepository<Parent, Integer> {
}
