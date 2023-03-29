package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class FileMain07 {

	public static void main(String[] args) {
		// TODO
		// 1. ArrayList<Student> 객체 생성
		ArrayList<Student> students = new ArrayList<>();
		
		// 2. 1,000,000개의 Student 객체를 리스트에 저장 - Random
		Random random = new Random();
		for(int i = 0; i < 1_000_000; i++) {
			Student s = new Student(i, "NAME_" + i, new Score(random.nextInt(100), random.nextInt(100), random.nextInt(100)));
			students.add(s);
		}
		System.out.println("size = " + students.size());
		System.out.println(students.get(77777));
		System.out.println(students.get(12345));
		
		// 3. 리스트를 students.dat 파일에 (직렬화해서) 씀.
		String file = "data/students.dat";
		try (FileOutputStream out = new FileOutputStream(file);
			 BufferedOutputStream bout = new BufferedOutputStream(out);
			 ObjectOutputStream oout = new ObjectOutputStream(bout);		
			) {
			
			long start = System.currentTimeMillis();
			oout.writeObject(students);
			long end = System.currentTimeMillis();
			
			System.out.println("write 경과 시간: " + (end - start) + "ms");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 4. 파일에서 데이터를 읽어서 역직렬화 -> 읽은 데이터 확인.
		try (FileInputStream in = new FileInputStream(file);
			 BufferedInputStream bin = new BufferedInputStream(in);
			 ObjectInputStream oin = new ObjectInputStream(bin);			
			) {
			
			long start = System.currentTimeMillis();
			ArrayList<Student> result = (ArrayList<Student>) oin.readObject();
			long end = System.currentTimeMillis();
			
			System.out.println("read 경과 시간: " + (end - start) + "ms");
			System.out.println("size = " + students.size());
			System.out.println(students.get(77777));
			System.out.println(students.get(12345));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
