package ci.gedoc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import ci.gedoc.model.Batch;

@EnableJpaRepositories
public interface BatchRepository extends JpaRepository<Batch, Long> {
	@Query("select b from Batch b where b.auteur_numerisation like: x")
	public Page<Batch> findByAuteurNumerisation(@Param("x") String au, Pageable pageable);
}
