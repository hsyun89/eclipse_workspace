package suyongs_stackqueue;

class LinkedNode {// LinekedList를 구성하는 node 클래스
	int val;
	LinkedNode next; // 다음 node를 가르키기 위한 객체

	LinkedNode(int val) {
		next = null;
		this.val = val;
	}
}

class LinkedList {
	LinkedNode first; // LinekedList의 첫 node
	LinkedNode last; // LinekedList의 마지막 node

	LinkedList() {
		first = null;
		last = null;
	}

	protected void addFirst(int val) {
		LinkedList list = new LinkedList();
	}

	protected void addLast(int val) {
		// 여기를 구현하세요
	}

	protected Boolean removeFirst() {
		// 여기를 구현하세요
	}

	protected Boolean removeLast() {
		// 여기를 구현하세요
	}

	protected void printList() {
		LinkedNode current = first;
		while (current != null) { // current 노드가 null 아닐때 까지 실행
			System.out.println(current.val);
			current = current.next; // next 노드를 current에 덮어 씌움
		}
	}
}

class Queue extends LinkedList {
	Queue() {
		super();
	}

	public void add(int val) {
		super.addLast(val);
	}

	public void remove() {
		System.out.println("삭제 결과 : " + super.removeFirst());
	}

	public void printList() {
		System.out.println("----------queue print----------");
		super.printList();
		System.out.println("------------------------------");
	}
}

class Stack extends LinkedList {
	Stack() {
		super(); // LinkedList의 생성자를 실행
	}

	public void add(int val) {
		super.addFirst(val);
	}

	public void remove() {
		System.out.println("삭제 결과 : " + super.removeFirst());
	}

	public void printList() {
		System.out.println("----------stack print----------");
		super.printList();
		System.out.println("------------------------------");
	}
}

public class Main {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.printList();
		s.remove();
		s.remove();
		s.remove();
		s.printList();

		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.printList();
		q.remove();
		q.remove();
		q.printList();
	}
}
/*
 * -----------설명-------------- 지난번에 배운 stack, queue에 대한 구현 1. 언어 : 자바 2. 사용한
 * 자료구조 : 연결리스트
 * 
 * 첨부한 클래스다이어그램 사진과 소스코드에 첨부한 주석을 참고하면 이해가 됨
 * 
 * 이 코드를 다 읽고 이해가 된다면 마스터하는 개념! 1. 자료구조의 연결리스트 2. 자바의 접근권한자 3. 자바의 클래스의 상속 4.
 * 스택과 큐 ----------------------------
 */