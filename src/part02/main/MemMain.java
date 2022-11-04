package part02.main;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import part02.controller.MemController;
import part02.dto.MemDTO;

public class MemMain {

	public static void main(String[] args) {
		MemController mController = new MemController();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("1.리스트, 2.삽입, 3.수정, 4.삭제, 0.종료 : ");
			int input = Integer.parseInt((sc.nextLine()));

			if (input == 1) {
				listCall(mController);
			} else if (input == 2) {
				insertCall(mController, sc);
				listCall(mController);
			} else if (input == 3) {
				updateCall(mController, sc);
				listCall(mController);
			} else if (input == 4) {
				deleteCall(mController, sc);
				listCall(mController);
			} else if (input == 0) {
				System.out.println("시스템 종료");
				System.exit(0);
			}
		}
	}// end main

	private static void deleteCall(MemController mController, Scanner sc) {
		System.out.printf("나이 입력: ");
		int age = Integer.parseInt(sc.nextLine());
		int chk = mController.deletProcess(age);

		if (chk > 0) {
			System.out.printf("%d개 삭제\n", chk);
		} else {
			System.out.println("삭제 실패");
		}
	}

	private static void updateCall(MemController mController, Scanner sc) {
		HashMap<String, Object> hmap = new HashMap<String, Object>();
		System.out.printf("번호 입력:");
		hmap.put("num", Integer.parseInt(sc.nextLine()));

		System.out.printf("이름 입력:");
		hmap.put("name", sc.nextLine());

		int chk = mController.updateProcess(hmap);

		if (chk >= 0) {
			System.out.printf("%d개 수정\n", chk);
		} else {
			System.out.println("수정 실패");
		}
	}// end updateCall

	private static void insertCall(MemController mController, Scanner sc) {
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		System.out.print("나이 입력: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("지역 입력: ");
		String loc = sc.nextLine();
		MemDTO dto = new MemDTO(name, age, loc);
		int chk = mController.insertProcess(dto);

		if (chk > 0) {
			System.out.printf("%d개 삽입\n", chk);
		} else {
			System.out.println("삽입 실패");
		}
	}// end insertCall

	private static void listCall(MemController mController) {
		List<MemDTO> aList = mController.listProcess();
		for (MemDTO dto : aList)
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());

	}// end listCall()

}
