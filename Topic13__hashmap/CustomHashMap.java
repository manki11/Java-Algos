package topic13_hashmap;

import java.util.ArrayList;

public class CustomHashMap<K, V> {

	ArrayList<MapNode<K, V>> bucket;
	int bucketSize;
	int noOfEntries;

	CustomHashMap() {
		bucket = new ArrayList<>();
		bucketSize = 50;
		for(int i =0;i<bucketSize;i++){
			bucket.add(null);
		}
		noOfEntries = 0;
	}

	public int size() {
		return noOfEntries;
	}

	public boolean isEmpty() {
		return noOfEntries == 0 ? true : false;
	}

	public void put(K key, V value) {
		int index = getIndex(key);
		
		MapNode<K, V> head = bucket.get(index);

		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		head = bucket.get(index);
		MapNode<K, V> newNode = new MapNode<>(key, value);
		newNode.next = head;
		bucket.set(index, newNode);
		noOfEntries++;

		if ((noOfEntries * (1.0)) / bucketSize > .7) {
			rehash();
		}
	}

	private void rehash() {
		System.out.print("rehash: ");
		ArrayList<MapNode<K,V>> temp = bucket;
		bucket = new ArrayList<>();
		System.out.print("Old Bucket Size : "+bucketSize+"    ");
		bucketSize = bucketSize * 2;
		System.out.println("New Bucket Size : "+bucketSize+"    ");
		for(int i =0;i<bucketSize;i++){
			bucket.add(null);
		}
		noOfEntries = 0;
		
		for(MapNode<K,V> head : temp){
			while(head!=null){
				put(head.key,head.value);
				head = head.next;
			}
		}
	}

	private int getIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		return compress(hashCode);
	}

	private int compress(int hashCode) {
		return hashCode % bucketSize;
	}

	public V get(K key) {
		int index = getIndex(key);

		MapNode<K, V> head = bucket.get(index);
		while (head != null) {
			if (head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}

	public boolean remove(K key) {
		int index = getIndex(key);
		MapNode<K, V> head = bucket.get(index);

		if (head.key.equals(key)) {
			bucket.set(index, head.next);
			noOfEntries--;
			return true;
		}

		while (head.next != null) {
			if (head.next.key.equals(key)) {
				noOfEntries--;
				head.next = head.next.next;
				return true;
			}
			head = head.next;
		}
		return false;
	}

	public ArrayList<K> getKeys() {
		ArrayList<K> keyList = new ArrayList<>();
		MapNode<K, V> head;
		for (int i = 0; i < bucket.size(); i++) {
			head = bucket.get(i);
			while (head != null) {
				keyList.add(head.key);
				head = head.next;
			}
		}
		return keyList;
	}

//	public ArrayList<V> getValues() {
//
//	}

}
