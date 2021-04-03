package xyz.septimocielo.model.manga;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.manga.Manga;

public interface MangaRepository extends JpaRepository<Manga, Long> {

}
