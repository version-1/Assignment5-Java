package ca.ciccc;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface for the priority queue ADT(Abstract Data Type).
 *
 * @author jiro
 */
public class ALPriorityQueue<K extends Comparable, V>  implements VCPriorityQueue {
  private List<Entry<K, V>> entries;

  public ALPriorityQueue() {
    this.entries = new ArrayList<Entry<K, V>>();
  }

  public int size() {
    return this.entries.size();
  }

  public boolean isEmapy() {
    return size() == 0;
  }

  @Override
  public Entry<K, V> enqueue(K key, V value) throws IllegalArgumentException {
    Entry<K, V> entry = new Entry<K, V>(key, value);

    try {
      entries.add(entry);
    } catch (IllegalArgumentException e )  {
      throw e;
    }
    return entry;
  }

  public Entry<K, V> peek() {
    if (isEmpty()) {
      return null;
    }
    return this.entries.get(this.size() -1);
  }

  public Entry<K, V> dequeMin() {
    if (isEmpty()) {
      return null;
    }
    return this.entries.get(this.size() -1);
  }
}
