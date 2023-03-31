package edu.java.inner03;

import edu.java.inner03.Button.OnClickListener;

public class InnerMain03 {

	public static void main(String[] args) {
		// 1. 버튼 객체 생성
		Button btnOpen = new Button("파일 열기");
		// 2. 버튼을 클릭했을 때 할 일을 구현
		OnClickListener l = new OpenButtonListener(); // 인터페이스 구현 클래스 객체 생성
		// 3. 버튼에 버튼 클릭 기능을 연결
		btnOpen.setOnClickListener(l);
		// 4. 버튼 클릭
		btnOpen.click();

	}

}
