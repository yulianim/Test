package com.requirement.repository;
import com.requirement.domain.Requirement;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = RequirementRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Requirement.class)
public interface RequirementRepository extends DetachableJpaRepository<Requirement, Long>, RequirementRepositoryCustom {
}
