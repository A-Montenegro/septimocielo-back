package xyz.septimocielo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.Anime;

public interface AnimeDAO extends JpaRepository<Anime, Long> {

}
