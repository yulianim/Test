package com.requirement.web;
import com.requirement.domain.Requirement;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = RequirementsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Requirement.class, type = ControllerType.ITEM)
@RooThymeleaf
public class RequirementsItemThymeleafController implements ConcurrencyManager<Requirement> {
}
