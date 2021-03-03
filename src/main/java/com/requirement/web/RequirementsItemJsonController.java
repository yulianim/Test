package com.requirement.web;
import com.requirement.domain.Requirement;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = RequirementsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Requirement.class, pathPrefix = "/", type = ControllerType.ITEM)
@RooJSON
public class RequirementsItemJsonController {
}
