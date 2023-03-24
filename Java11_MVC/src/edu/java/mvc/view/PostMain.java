package edu.java.mvc.view;

import java.time.LocalDateTime;
import java.util.Scanner;

import edu.java.mvc.controller.PostDaoImpl;
import edu.java.mvc.menu.Menu;
import edu.java.mvc.model.Post;



public class PostMain {

	private final Scanner scanner = new Scanner(System.in);
	private final PostDaoImpl dao = PostDaoImpl.getInstance();
	
	public static void main(String[] args) {
		System.out.println("*** 블로그 프로그램 v0.3 ***");
		
		PostMain app = new PostMain();
		
		boolean run = true;
		while(run) {
			int n = app.showMainMenu();
			Menu menu = Menu.getValue(n);
			switch(menu) {
			case QUIT:
				run = false;
				break;
			case CREATE:
				app.insertNewPost();
				break;
			case READ_ALL:
				app.selectAllPosts();
				break;
			case READ_BY_INDEX:
				app.selectPostByIndex();
				break;
			case UPDATE:
				app.updatePost();
				break;
			case DELETE:
				app.deletePost();
				break;
			default:
				System.out.println("메인 메뉴 번호를 확인하세요...");
			}
		}
		System.out.println("*** 프로그램 종료 ***");
	}

	private void deletePost() {
		 System.out.println("\n----- 블로그 삭제 -----");
	        System.out.print("삭제할 블로그 인덱스 입력> ");
	        int index = inputNumber();
	        
	        if (!dao.isValidIndex(index)) {
	            System.out.println(">>> 해당 인덱스에는 블로그 정보가 없음.");
	            return;
	        }
	        
	        int result = dao.delete(index);
	        if (result == 1) {
	            System.out.println(">>> 블로그 삭제 성공");
	        } else {
	            System.out.println(">>> 블로그 삭제 실패");
	        }
	}

	private void updatePost() {
		System.out.println("\n----- 블로그 업데이트 -----");
		System.out.print("수정할 블로그 인덱스 입력> ");
		int index = inputNumber();
		
		if(!dao.isValidIndex(index)) {	// 유효하지 않은 인덱스이면
			System.out.println(">>> 해당 인덱스에는 블로그 정보가 없음.");
			return; // 메서드 종료
		}
		
		System.out.println("검색할 블로그 인덱스 입력");
		Post before = dao.read(index);
		System.out.println(">>> 수정 전: " + before);
		
		System.out.println("제목 입력> ");
		String title = scanner.nextLine();	
		System.out.println("내용 입력> ");
		String content = scanner.nextLine();		
		System.out.println("작성자명 입력> ");
		String author = scanner.nextLine();	
		
		LocalDateTime now = LocalDateTime.now();
		Post after = new Post(0, title, content, author, now);

		int result = dao.update(index, after);
		if (result == 1) {
			System.out.println(">>> 블로그 업데이트 성공");
		} else {
			System.out.println(">>> 블로그 업데이트 실패");
		}
	}

	private void selectPostByIndex() {
		System.out.println("\n----- 인덱스 검색 -----");
		System.out.print("검색할 블로그 인덱스 > ");
		int index = inputNumber();
		
		Post post = dao.read(index);
		
		
		if (post != null) {
			System.out.println(post);
		} else {
			System.out.println(">>> 해당 인덱스에는 블로그 정보가 없음.");
		}
	}

	
    private void selectAllPosts() {
    	System.out.println("\n----- 블로그 전체 목록 ------");
    	Post[] posts = dao.read();
    	//
    	
    	for(Post c : posts) {
    		System.out.println(c);
    	}
    }
	
	private void insertNewPost() {
		System.out.println("\n----- 새 블로그 저장 -----");
		
		if(!dao.isMeomoryAvailable()) { 
			System.out.println(">>> 블로그를 저장할 공간이 부족합니다.");
			return; 
		}
		
		System.out.print("이름 입력> ");
		String title = scanner.nextLine();
		System.out.print("전화번호 입력> ");
		String content = scanner.nextLine();
		System.out.print("이메일 입력> ");
		String author = scanner.nextLine();
		LocalDateTime now = LocalDateTime.now();
		
		Post post = new Post(0, title, content, author, now); 
		
		int result = dao.create(post);
		
		
		if(result == 1) {
			System.out.println(">>> 새 블로그 저장 성공");
		} else {
			System.out.println(">>> 새 블로그 저장 실패");
		}
	}
	
	public int showMainMenu() {
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("[0]종료 [1]블로그 추가 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
		System.out.println("------------------------------------------------------------");
		System.out.print("선택> ");
		int n = inputNumber();
		
		return n;
	}

	private int inputNumber() {
		while(true) {
			try {
				int n = Integer.parseInt(scanner.nextLine());
				return n;
				
			} catch (NumberFormatException e) {
				System.out.print("정수 입력>> ");
			}
		}
		
	}
}