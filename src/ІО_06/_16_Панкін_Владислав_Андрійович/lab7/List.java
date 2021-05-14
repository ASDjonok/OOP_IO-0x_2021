package ІО_06._16_Панкін_Владислав_Андрійович.lab7;

class List {
	private ListElement head; //покажчик на перший елемент
	private ListElement tail; //покажчик на останній елемент

	public ListElement getHead() { //Метод, який повертає перший елемент списку
		return head;
	}

	void addFront(Plane data) { //Метод, який додає нові елементи на початок списку
		ListElement a = new ListElement();
		a.data = data;
		if (head == null) {
			head = a;
			tail = a;
		} else {
			a.next = head;
			head = a;
		}
	}

	void addBack(Plane data) { //Метод, який додає новий елемент у кінець списку
		ListElement a = new ListElement();
		a.data = (Plane) data;
		if (tail == null) {
			head = a;
			tail = a;
		} else {
			tail.next = a;
			tail = a;
		}
	}

	void delEl(Plane data) { //Метод, який видаляє елемент
		if (head == null)
			return;
		if (head == tail) {
			head = null;
			tail = null;
			return;
		}
		if (head.data == data) {
			head = head.next;
			return;
		}
		ListElement t = head;
		while (t.next != null) {
			if (t.next.data == data) {
				if (tail == t.next) {
					tail = t;
				}
				t.next = t.next.next;
				return;
			}
			t = t.next;
		}
	}
}
