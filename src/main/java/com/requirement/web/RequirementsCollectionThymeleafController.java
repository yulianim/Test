package com.requirement.web;
import com.requirement.domain.Requirement;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = RequirementsCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Requirement.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class RequirementsCollectionThymeleafController {
}
