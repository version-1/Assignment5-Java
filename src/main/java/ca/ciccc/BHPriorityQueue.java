package ca.ciccc;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface for the priority queue ADT(Abstract Data Type).
 *
 * @author jiro
 */
public class BHPriorityQueue<K extends Comparable, V>  implements VCPriorityQueue {
  private List<Entry<K, V>> entries;

  public BHPriorityQueue() {
    this.entries = new ArrayList<Entry<K, V>>();
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
    try {
      Entry<K, V> entry = new Entry<K, V>((K)key, (V)value);
      entries.add(entry);
      return entry;
    } catch (IllegalArgumentException e )  {
      throw e;
    }
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
    return this.entries.get(this.size() -1);
  }

  @Override
  public VCPriorityQueue merge(VCPriorityQueue other) {
    // TODO Auto-generated method stub
    return null;
  }
}
