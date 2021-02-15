package xyz.septimocielo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.Manga;

public interface MangaDAO extends JpaRepository<Manga, Long> {

}
