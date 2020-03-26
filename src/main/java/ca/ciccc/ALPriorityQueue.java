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

  public ALPriorityQueue(List<Entry<K, V>> entries) {
    this.entries = entries;
  }

  public int size() {
    return this.entries.size();
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public Entry<K, V> enqueue(Comparable key, Object value) throws IllegalArgumentException {
    Entry<K, V> entry = new Entry<K, V>((K)key, (V)value);

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

  @Override
  public Entry<K, V> dequeueMin() {
    if (isEmpty()) {
      return null;
    }
    Entry min = entries.get(0);
    for (Entry<K, V> entry: entries) {
      if(min.getKey().compareTo(entry.getKey()) < 0) {
        min = entry;
      }
    }
    return this.entries.get(this.size() -1);
  }

  @Override
  public VCPriorityQueue merge(VCPriorityQueue other) {
    for (int i = 0; i < other.size(); i++ ) {
      Entry entry = other.dequeueMin();
      enqueue(entry.getKey(), entry.getValue());
    }
    return this;
  }
}
