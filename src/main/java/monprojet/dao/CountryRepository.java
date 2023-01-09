package monprojet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import monprojet.entity.City;
import monprojet.entity.Country;

// This will be AUTO IMPLEMENTED by Spring 

public interface CountryRepository extends JpaRepository<Country, Integer> {
    //@Query(value = "SELECT SUM(population)" + " FROM City" + " WHERE id=:idPays", nativeQuery = true)
    //public Integer getPopulationTotale(Integer idPays);

}
