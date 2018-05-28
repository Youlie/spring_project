package tp.spring.mvc.action;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlerLog4j {
	
private static final Logger logger = Logger.getLogger(ControlerLog4j.class);
	
//	@GetMapping("/")
//	public String showIndex() {
//		return "index";
//	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getControler() {
		
		if(logger.isDebugEnabled()) {
			logger.debug("getWelcome is executed!");
		}
		
		logger.error("This is Error message");
		
		ModelAndView model = new ModelAndView("main");
		model.addObject("msg","Hello Spring MVC + Log4j");
		
		return model;
	}

}
