package controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Post;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String  getAllPosts(Model model) {
		Post p1=new Post();
		p1.setDate(new Date());
		p1.setTitle("Post1");
		p1.setBody("Body of the Post 1");
		
		Post p2=new Post();
		p2.setDate(new Date());
		p2.setTitle("Post2");
		p2.setBody("Body of the Post 2");
		
		ArrayList <Post> posts=new ArrayList<>();
		posts.add(p1);
		posts.add(p2);
		
		model.addAttribute("posts", posts);
		
		return "index";
	}
	
}
