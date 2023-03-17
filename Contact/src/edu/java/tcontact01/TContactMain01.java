package edu.java.tcontact01;

import java.util.Scanner;

public class TContactMain01 {
    // 상수(constant)
    private static final int MAX_LENGTH = 1; // 연락처 배열의 최대 길이(원소 개수).
    
    // field
    private ContactLec[] contacts = new ContactLec[MAX_LENGTH]; // 연락처를 저장할 배열.
    private int count = 0; // 연락처 배열에 현재까지 저장된 연락처의 개수. 배열에 저장될 때마다 값 증가.
    private Scanner scanner = new Scanner(System.in); // 입력 도구.

    public static void main(String[] args) {
        System.out.println("***** 연락처 프로그램 v0.1 *****");
        
        TContactMain01 app = new TContactMain01();
        //-> static이 아닌 메서드들을 사용하기 위해서 참조 변수를 생성.
        
        boolean run = true;
        while (run) {
            int menu = app.showMainMenu();
            switch (menu) {
            case 0: // 프로그램 종료
                run = false;
                break;
            case 1: // 새 연락처 저장
                app.insertNewContact();
                break;
            case 2: // 연락처 전체 목록 보여주기
            	 app.selectAllContacts();
                break;
            case 3: // 배열의 인덱스로 연락처 검색하기
            	app.selectContactByIndex();
                break;
            case 4: // 연락처 이름/전화번호/이메일 정보 수정하기
            	app.updateContactByIndex();
                break;
            case 5: // 배열의 인덱스로 연락처 삭제하기.
            	app.deleteIndex();
                break;
            default:
                System.out.println("메인 메뉴 번호를 확인하세요...");
            }
        }

        System.out.println("***** 프로그램 종료 *****");
    }
    
    public void insertNewContact() {
        System.out.println();
        System.out.println("--- 새 연락처 저장 ---");
        System.out.print("이름 입력> ");
        String name = scanner.nextLine(); // 공백을 포함해서 엔터가 입력될 때까지 모든 문자열을 읽음.
        System.out.print("전화번호 입력> ");
        String phone = scanner.nextLine();
        System.out.print("이메일 입력> ");
        String email = scanner.nextLine();
        
        // 입력받은 정보들로 Contact 타입의 객체를 생성.
        ContactLec c = new ContactLec(0, name, phone, email);
        
        // 생성된 Contact 타입의 객체를 배열에 저장.
        contacts[count] = c;
        
        // 배열에 저장된 원소(연락처) 개수를 1 증가.
        count++;
        
        System.out.println("새 연락처 저장 성공");
    }
    
    
    
    public void selectAllContacts() {
    	System.out.println();
    	System.out.println("---연락처 목록 ---");
    	for(int i=0; i<count; i++) {
    		contacts[i].printInfo();
    	}
    }
    
    public void updateContactByIndex() {
		System.out.println();
		System.out.println("--- 연락처 수정 ---");
		System.out.println();
		
		System.out.println("수정할 연락처의 순번을 입력하세요>>>");
		int index = Integer.parseInt(scanner.nextLine());
		
		System.out.print("수정 전:");
		contacts[index].printInfo();
		
		System.out.println("수정할 연락처의 정보를 입력하세요>>>");
		System.out.print("이름 입력>");
		String name = scanner.nextLine(); 
		System.out.println("전화번호 입력> ");
		String phone = scanner.nextLine();
		System.out.println("이메일을 입력> ");
		String email = scanner.nextLine();
		
		
	}
    
    public void selectContactByIndex() {
        System.out.println();
        System.out.println("--- 인덱스 검색 ---");
        System.out.print("검색할 인덱스 입력> ");
        int index = Integer.parseInt(scanner.nextLine());
        contacts[index].printInfo();
    }
    
    public void deleteIndex() {
    	System.out.println();
    	System.out.println("--- 연락처 삭제 ---");
    	System.out.print("삭제할 연락처 인덱스 입력>>>");
    	int index = Integer.parseInt(scanner.nextLine());
    	
    	for(int i=index; i < count - 1; i++) {
    		contacts[i] = contacts[i + 1]; // 뒷쪽 연락처 정보를 한칸 앞으로...
    	}
    	
    	contacts[count - 1] = null; // 삭제 전 배열의 마지막 원소를 null
    	count--; // 배열 원소 개수를 1 줄임.
    	
    	System.out.println("삭제 성공");
    }
    
    public int showMainMenu() {
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("[0]종료 [1]새 연락처 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
        System.out.println("---------------------------------------------------------");
        System.out.print("선택> ");
        
        // 콘솔 창에서 입력된 문자열 1개 라인을 정수(int)로 변환.
        int result = Integer.parseInt(scanner.nextLine());
        
        return result;
    }

}