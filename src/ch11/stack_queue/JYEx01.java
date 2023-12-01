package ch11.stack_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class JYEx01 {

	public static void main(String[] args) {

		Queue pq = new PriorityQueue();

		pq.offer(new Book("마흔에 읽는 쇼펜하우어", 15300));
		pq.offer(new Book("트렌드 코리아 2024", 17100));
		pq.offer(new Book("더 마인드", 17820));
		pq.offer(new Book("남에게 보여주려고 인생을 낭비하지마라", 15750));
		pq.offer(new Book("아무도 늙지 않는 세상", 16200));
		// Queue에서 꺼내기

		while (!pq.isEmpty()) {
			Object o = pq.poll();
			System.out.println(o);
		}

	}

}

class Book implements Comparable<Book> {

	String name;
	int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Book b) {
		// TODO Auto-generated method stub
		return b.price - this.price;
	}
}
