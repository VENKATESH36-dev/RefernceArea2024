package test1;

import java.util.LinkedList;

public class SimpleHashMap<K, V> {

	public static void main(String[] args) {
		
		SimpleHashMap<String, Integer> map = new SimpleHashMap<String, Integer>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		System.out.println(map.get("One"));
		System.err.println(map.get("Two"));
		System.out.println(map.get("Three"));
		System.err.println(map.get("Six"));
		
		for(int i=6; i<=20;i++) {
			map.put("key"+i, i);
		}
		System.out.println(map.get("key12"));
	}

	private static class Entry<K, V> {
		K key;
		V value;

		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private LinkedList<Entry<K, V>>[] table;
	private int capacity;
	private int size;
	private static final int INTIAL_CAPACITY = 16;
	private static final float LOAD_FACTOR = 0.75f;

	public SimpleHashMap() {
		this.capacity = INTIAL_CAPACITY;
		this.table = new LinkedList[capacity];
		this.size = 0;
	}

	public void put(K key, V value) {
		if (size >= capacity * LOAD_FACTOR) {
			resize();
		}

		int index = getIndex(key);
		if (table[index] == null) {
			table[index] = new LinkedList<>();
		}
		// check If already exists and update its value
		for (Entry<K, V> entry : table[index]) {
			if (entry.key.equals(key)) {
				entry.value = value;
				return;
			}
		}
		// If key doesn't exists add a new entry
		table[index].add(new Entry<>(key, value));
		size++;
	}

	public V get(K key) {
		int index = getIndex(key);
		if (table[index] == null) {
			return null;
		}

		for (Entry<K, V> entry : table[index]) {
			if (entry.key.equals(key)) {
				return entry.value;
			}
		}
		return null;
	}

	private int getIndex(K key) {

		return key == null ? 0 : Math.abs(key.hashCode() % capacity);
	}

	private void resize() {
		capacity *= 2; // Double the capacity
		LinkedList<Entry<K, V>>[] oldTable = table;
		table = new LinkedList[capacity];
		size = 0;
		for (LinkedList<Entry<K, V>> bucket : oldTable) {
			if (bucket != null) {
				for (Entry<K, V> entry : bucket) {
					put(entry.key, entry.value); // Rehash and put into new table
				}
			}
		}
	}

}
