package com.sonata1;

import java.util.ArrayList;

public class ArraylistTest {
@SuppressWarnings("rawtypes")
ArrayList a1= new ArrayList();
@SuppressWarnings("unchecked")
public void add(int element) {
	a1.add(element);
}
public void delete(int element) {
	a1.remove(element);
}
public int getsize()
{
	return a1.size();
}
}
