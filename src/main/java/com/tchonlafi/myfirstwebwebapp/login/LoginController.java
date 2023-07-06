package com.tchonlafi.myfirstwebwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;




@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthentificationService authentificationService;
	
public LoginController(AuthentificationService authentificationService) {
		super();
		this.authentificationService = authentificationService;
	}


//	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		
//		model.put("name", name);
		
//		logger.debug("Request param ist {}", name);
//		logger.info("I want this printed at info level");
//		logger.warn("I want this printed at warn level");
//		System.out.println("Request param is " + name); //NOT RECOMMENDED FOR PROD CODE
		
		return "login";
	}
	
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(authentificationService.authentificate(name, password)) {
			model.put("name", name);
		    //model.put("password", password);
			return "welcome";
		}
		
		model.put("ErrorMessage", "Invalid Credentials! Please try again.");
		
			return "login";
		
	
		
		//Authentification
		//name- stephane
		//password- dummy
		
	}

}
