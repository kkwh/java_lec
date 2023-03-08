package edu.java.homework;

import java.io.Serial;
import java.util.Random;
import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {
        // 가위바위보 게임
        // 가위-0, 바위-1, 보-2

        // 컴퓨터의 가위/바위/보는 (정수) 난수로 만듦.
        Random random = new Random();
        int computer = random.nextInt(3);

        // 사용자는 콘솔창에서 키보드로 가위/바위/보에 해당하는 정수를 입력.
        System.out.println("가위/바위/보 게임");
        System.out.println("-----------------");
        System.out.println("[0] 가위");
        System.out.println("[1] 바위");
        System.out.println("[2] 보");
        System.out.println("-----------------");
        System.out.print("선택>>>");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        // print(computer : user)
        System.out.println("computer(" + computer + ") : user(" + user + ")");
        if(!(0 <= user && user <= 2)) {
        	System.out.println("잘 못 입력하셨습니다.");
        }
        else if(computer == user) { // ctrl+마우스 커서 올리고 뜨는 링크 누르면 해당 변수 선언한 곳으로 이동
        	System.out.println("비겼습니다.");
        } else {
        	if((computer == 0 && user == 2) || (computer == 1 && user == 0) || (computer == 2 && user == 1)) {
        		System.out.println("컴퓨터가 이겼습니다.");
        	} else {
        		System.out.println("사용자가 이겼습니다.");
        	}
        }
        
        /*
        if(user == 0) { // 사용자 가위
        	if(computer == 0) { // 컴: 가위
        		System.out.println("비김");
        	}
        	else if (computer == 1) { // 컴 : 바위
        		System.out.println("컴퓨터 승");
        	}
        	else { // 컴 : 보
        		System.out.println("사용자 승");
        	}
        }
        else if (user == 1) { // 사용자 바위
        	if(computer == 0) { // 컴: 가위
        		System.out.println("사용자 승");
        	}
        	else if (computer == 1) { // 컴 : 바위
        		System.out.println("비김");
        	}
        	else { // 컴 : 보
        		System.out.println("컴퓨터 승");
        	}
        }
        else { // 사용자 보
        	if(computer == 0) { // 컴: 가위
        		System.out.println("컴퓨터 승");
        	}
        	else if (computer == 1) {  // 컴 : 바위
        		System.out.println("사용자 승");
        	}
        	else { // 컴 : 보
        		System.out.println("비김");
        	}
        } */
        
//        int diff = user - computer;
//        if(diff == 0) {
//        	System.out.println("비김");
//        } else if ((diff == -2) || (diff == 1)) {
//			System.out.println("사용자 승");
//		} else {
//			System.out.println("컴퓨터 승");
//		}
    }

}