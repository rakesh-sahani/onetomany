/**
 * 
 */
package com.onetomany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onetomany.entity.Parent;

/**
 * @author sumit
 *
 *
 */
@Repository
public interface ParentRepository extends CrudRepository<Parent, Integer>{

}
