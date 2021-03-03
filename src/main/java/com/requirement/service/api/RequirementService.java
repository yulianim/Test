package com.requirement.service.api;
import com.requirement.domain.Requirement;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = RequirementService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Requirement.class)
public interface RequirementService extends EntityResolver<Requirement, Long>, ValidatorService<Requirement> {
}
