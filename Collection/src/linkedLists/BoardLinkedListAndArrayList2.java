package linkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class BoardLinkedListAndArrayList2 {

	public static void main(String[] args) {
		List<Board> boardsLinkedList = new LinkedList<Board>();
		List<Board> boardsArrayList = new ArrayList<Board>();
		
		
		
		
		// ArrayList
				long startTime1 = System.nanoTime();
				
				
				for(int cnt=0;cnt<10000; cnt++) {
					String subject = String.format("�������� %d:", cnt);
					String content = String.format("�������� %d:", cnt);
					boardsArrayList.add(new Board(subject,content,"������"));
				}
				
				long endTime1 = System.nanoTime();
				printTime(" ArrayList",startTime1, endTime1);
				
				// LinkedList
				long startTime = System.nanoTime();
				
				
				for(int cnt=0;cnt<10000; cnt++) {
					String subject = String.format("�������� %d:", cnt);
					String content = String.format("�������� %d:", cnt);
					boardsLinkedList.add(new Board(subject,content,"������"));
				}
				
				long endTime = System.nanoTime();
				printTime("LinkedList",startTime, endTime);
				
		}
	
	static void printTime(String title, long startTime, long endTime) {
		double xsec = (endTime - startTime) /100000000.0;
		System.out.printf("[%s] ó���ð�(%d)ns [%f]\n",title,(endTime - startTime),xsec);
	}
	
	static void printBoard(List<Board> boards) {
		for (Board board : boards) {
			System.out.printf("[%s][%s][%s]\n", 
					board.subject, 
					board.content, 
					board.writer
					);
		}
		System.out.println();
	}
}
