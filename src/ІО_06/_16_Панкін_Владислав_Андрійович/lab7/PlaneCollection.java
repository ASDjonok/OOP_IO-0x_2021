package ІО_06._16_Панкін_Владислав_Андрійович.lab7;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class PlaneCollection /*<T>*/ implements Set<Plane> {
	private List s = new List(); //список елементів
	private int size = 0; //розмір списку

	public PlaneCollection (){ //порожній конструктор
	}

	public PlaneCollection (Plane pln){ //конструктор в який передається 1 об’єкт класу
		add(pln);		
	}

	public PlaneCollection(Collection<? extends Plane> pln){ //конструктор в який передається стандартна колекція об’єктів
		addAll(pln);
	} 

	@Override
	public boolean add(Plane pln) { //Метод, який додає елемент у списк
		boolean flag = true;
			ListElement t = s.getHead(); 
		while (t != null) {		
			if (t.data==pln) {
				flag = false;
				break;
			}
			t = t.next;
		}
		if (flag) {
			s.addBack(pln);
			size++;
		}
		return flag;
	}

	@Override
	public boolean addAll(Collection<? extends Plane> c) { //Метод, який додає всі елементи колекції
		Iterator<? extends Plane> iterator = c.iterator();
		boolean flag = false;
		while (iterator.hasNext()) {		
			flag = add((Plane) iterator.next());
		}
		return flag;
	}

	@Override
	public void clear() { //Метод, який очищає список
		s = null;
		s = new List();
	}

	@Override
	public boolean contains(Object o) { //Метод, який перевіряє наявність об'єкта
		Plane pln = (Plane) o;
		boolean flag = true;
		ListElement t = s.getHead();
		while (t != null) {
			if (t.data==pln) {
				flag = false;
				break;
			}
			t = t.next;
		}
		return flag;
	}

	@Override
	public boolean containsAll(Collection<?> c) { //Метод, який перевіряє наявність колекції
		boolean flag = true;
		Iterator<Plane> iterator = (Iterator<Plane>) c.iterator();
		while (iterator.hasNext()) {
			flag = contains((Plane) iterator.next());
			if (flag==false){
				break;
			}
		}
		return flag;
	}
	@Override
	public boolean isEmpty() { //Метод, який перевіряє порожнечу списку
		return s.getHead()==null;
	}

	@Override
	public Iterator<Plane> iterator() { //Метод, який повертає ітератор
		return new PlaneIterator();
	}

 	@Override
	public boolean remove(Object o) { //Метод, який видаляє елемент зі списку
			if (contains(o)) {
				s.delEl((Plane) o);
				size--;
				return true;
				
			} else {
				return false;
		}
	}

	@Override
	public boolean removeAll(Collection<?> c) { //Метод, який видаляє всі елементи колекції

		boolean flag = false;
		for (Object object : c) {
			flag = remove(object);
		}
		return flag;
	}

	@Override
	public boolean retainAll(Collection<?> c) { //Метод, який реалізує безліч перетину
		boolean flag = true;
		Iterator<Plane> iterator = iterator();
		while (iterator.hasNext()) {
			Plane Plane = /*(Plane)*/ iterator.next();
			flag = c.contains(Plane);
			if (flag == false)
				remove(Plane);
		}
		return flag == false;
	}

	@Override
	public int size() { //Метод повертає розмір колекції
		return size;
	}

	@Override
	public Object[] toArray() { //Метод, який перетворює об'єкти колекції в масив
		int i = 0;
		Object[] mas = new Object[size];
		Iterator<Plane> iterator = iterator();
		while (iterator.hasNext()) {
			mas[i] = iterator.next();
			i++;

		}
		return mas;
	}

	@Override
	public <T> T[] toArray(T[] array) { //Метод, який записує елементи колекції в масив, поки йому не знайдеться місця
		 int size = size();
		    if (array.length < size) {
			 array = (T[]) Array.newInstance(array.getClass().getComponentType(), size);
		    }
		    else if (array.length > size) {
		        array[size] = null;
		    }
		    int i = 0;
		    for (Plane e: this) {
		        array[i] = (T) e;
		        i++;
		    }
		    return array;	
	}

	class PlaneIterator implements Iterator { //Внутрішній клас PlaneIterator, який реалізує інтерфейс Iterator
		private ListElement thisElement = s.getHead();

		@Override
		public boolean hasNext() { //Метод, який перевіряє, чи існує наступний елемент
			return thisElement != null;
		}

		@Override
		public Plane next() { //Метод, який повертає наступний елемент колекції
			Plane s = thisElement.data;
			thisElement = thisElement.next;
			return s;
		}

		@Override
		public void remove() { //Метод, який видаляє елементи колекції
			s.delEl(thisElement.data);
		}
	}
}
