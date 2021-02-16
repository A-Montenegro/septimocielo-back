package xyz.septimocielo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.DirectorCine;

public interface DirectorCineDAO extends JpaRepository<DirectorCine, Long> {

}