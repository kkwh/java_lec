package edu.java.mvc.controller;

import java.time.LocalDateTime;

import edu.java.mvc.model.Post;

public class PostDaoImpl implements PostDao {

private static PostDaoImpl instance = null;
	
	private PostDaoImpl() {};
	
	public static PostDaoImpl getInstance() {
		if(instance == null) {
			instance = new PostDaoImpl();
		}
		
		return instance;
	}
	
	private static final int MAX_LENGTH = 2; 
	private Post[] posts = new Post[MAX_LENGTH]; 
	private int count = 0; 
	Post post = new Post();
	LocalDateTime now = LocalDateTime.now();
	
	/**
	 * 블로그 배열에 새로운 블로그 객체를 저장할 수 있는 지를 리턴.
	 * @return 배열에 빈 공간이 있으면 true, 그렇지 않으면 false.
	 */
	public boolean isMeomoryAvailable() {
		return count < MAX_LENGTH;
	}
	
	/**
	 * 어떤 인덱스가 검색, 수정, 삭제할 때 사용 가능한 범위 안에 있는 인덱스인 지를 리턴.
	 * @param index 유효한 인덱스인 지 검사할 인덱스.
	 * @return 사용가능한 인덱스는 true, 그렇지 않으면 false.
	 */
	public boolean isValidIndex(int index) {
		return (index >= 0) && (index < count);
	}
	
	@Override
	public int create(Post c) { 
		if(isMeomoryAvailable()) {
			posts[count] = c;
			count++;
						
			post.setCreatedTime(now);
			post.setModifiedTime(now);
			
			return 1;
		} else {
			return 0;
		}
		
	}

	@Override
	public Post[] read() {
		Post[] array = new Post[count];
		
		for(int i=0; i<count; i++) {
			array[i] = posts[i];
		}
		
		post.setModifiedTime(now);
		
		return array;
	}

	@Override
	public Post read(int index) {
		if(isValidIndex(index)) {
			post.setModifiedTime(now);
			return posts[index];
		} else {
			return null;
		}
	}

	@Override
	public int update(int index, Post post) {
		if(isValidIndex(index)) {
			posts[index].setTitle(post.getTitle());
			posts[index].setContent(post.getContent());
			posts[index].setAuthor(post.getAuthor());
			
			post.setModifiedTime(now);
			
			return 1;
		} else {
			return 0;
		}
		
	}

	@Override
	public int delete(int index) {
		if (!isValidIndex(index)) {
			return 0;
		}

		for (int i = index ; i < count - 1; i++) {
			posts[i] = posts[i + 1];
		}
		posts[count - 1] = null;
		count--;
		post.setModifiedTime(now);
		
		return 1;
	}
}