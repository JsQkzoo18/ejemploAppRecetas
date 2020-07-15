package com.jcse.ejemploAppRecetas.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.jcse.ejemploAppRecetas.entities.Receta;

public interface RecetaRepo extends CrudRepository <Receta, Long>{
	
	List<Receta> findbyNombre(String nombre);
	
}
