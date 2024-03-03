package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("This is home url");
		model.addAttribute("name" ,"Sahil Lokhande here");
		model.addAttribute("age", 22);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Gayatri");
		friends.add("Bhushan");
		friends.add("Babu");
		
		model.addAttribute("f",friends);
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about url");
		
		return "about";
		
	}
	//ModelAndView 
	
	@RequestMapping("/help")
	public ModelAndView help(){
		System.out.println("This is help controller");
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("name", "Sakshi");
		modelAndView.addObject("num",20);
		modelAndView.setViewName("help");
		
		LocalDateTime now= LocalDateTime.now();
		modelAndView.addObject("time",now);
		return modelAndView;
		
		}

}
