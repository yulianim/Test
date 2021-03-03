package com.requirement.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.requirement.domain.Requirement;

/**
 * = RequirementRepositoryImpl
 *
 * Implementation of RequirementRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = RequirementRepositoryCustom.class)
public class RequirementRepositoryImpl extends QueryDslRepositorySupportExt<Requirement> implements RequirementRepositoryCustom{

    /**
     * Default constructor
     */
    RequirementRepositoryImpl() {
        super(Requirement.class);
    }
}