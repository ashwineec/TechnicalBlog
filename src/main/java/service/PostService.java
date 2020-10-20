package service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import model.Post;

@Service
public class PostService {

	public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("This is your Post");
        post1.setBody("This is your Post. It has some valid content");
        post1.setDate(new Date());
        posts.add(post1);

        return posts;

    }
	
}
