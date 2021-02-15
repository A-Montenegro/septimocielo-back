package xyz.septimocielo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.Serie;

public interface SerieDAO extends JpaRepository<Serie, Long> {

}
