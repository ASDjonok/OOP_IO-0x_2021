package ��_03._26_�������_�����_�������������.Lab4.src.tarastaras.me;

import java.util.Comparator;

public class SortByName implements Comparator<Equipment> {
	//o1 �� o2 - ���������
    @Override
    public int compare(Equipment o1, Equipment o2) {
        return o1.name.compareTo(o2.name);
    }
}