
package com.backend.api.repository;

import com.backend.api.model.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface FormacionRepository  extends JpaRepository <Formacion, Long>{
    
}