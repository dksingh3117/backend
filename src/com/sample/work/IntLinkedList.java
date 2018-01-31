package com.sample.work;

public class IntLinkedList {

	protected Node head;
	protected Node tail;
	public int size;

	/* Constructor */
	public IntLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	/* Function to check if list is empty */
	public boolean isEmpty() {
		return head == null;
	}

	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to insert an element */
	public void insertElement(int val) {
		Node nptr = new Node(val);
		size++;
		if (head == null) {
			head = nptr;
			tail = head;
		} else {
			tail.setNext(nptr);
			tail = nptr;
		}
	}

	/**
	 * Function to deletes last element from Singly LinkedList
	 */
	public Node deleteLast() {
		if (head == null) {
			System.out.println("LinkedList doesn't contain any Nodes.");
		}

		if (head.next == null) {
			Node tempNode = head;
			head = head.next;
			return tempNode;
		}

		Node previous = null;
		Node current = head;

		while (current.next != null) {

			previous = current;
			current = current.next;
		}

		previous.next = null;

		return current;
	}

	/**
	 * Function to delete all elements which are greater than target value from Singly LinkedList.
	 */
	public Node deletElements(int targetValue) {

		if (head == null) {
			System.out.println("LinkedList doesn't contain any Nodes.");
		}
		Node current = head;
		Node previous = null;

		while (current != null) {
			if (current.data > targetValue) {
				if (previous == null) {
					current = current.next;
				} else {
					current = current.next;
					previous.next = current;
				}

			} else {
				previous = current;
				current = current.next;
			}

		}
		return current;
	}

	/* Function to display elements */
	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (head.getNext() == null) {
			System.out.println(head.getData());
			return;
		}
		Node ptr = head;
		System.out.print(head.getData() + "->");
		ptr = head.getNext();
		while (ptr.getNext() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getNext();
		}
		System.out.print(ptr.getData() + "\n");
	}
}
