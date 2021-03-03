package com.requirement.web;
import com.requirement.domain.Requirement;
import com.requirement.service.api.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = RequirementDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Requirement.class)
public class RequirementDeserializer extends JsonObjectDeserializer<Requirement> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private RequirementService requirementService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param requirementService
     * @param conversionService
     */
    @Autowired
    public RequirementDeserializer(@Lazy RequirementService requirementService, ConversionService conversionService) {
        this.requirementService = requirementService;
        this.conversionService = conversionService;
    }
}
