/**
 * Class for weighted union.
 */
class WeightedUnion {
  /**
   * Array for the connections.
   */
  private int[] id;
  /**
   * num of objects rooted in the array at i.
   */
  private int[] size;
  /**
   * Constructs the object.
   *
   * @param      num Total num of elements in the tree.
   */
  WeightedUnion(final int num) {
    id = new int[num];
    size = new int[num];
    for (int i = 0; i < num; i++) {
      id[i] = i;
      size[i] = 1;
    }
  }

  /**
   * Searches for the first match.
   *
   * final @param      p     Element in the array.
   *
   * @return     root of p.
   */
  public int find(int p) {
    while (p != id[p]) {
      id[p] = id[id[p]];
      p = id[p];
    }
    return p;
  }
  /**
   * checks if connected.
   *
   * @param      p     { parameter_description }
   * @param      q     The quarter
   *
   * @return     { description_of_the_return_value }
   */
  public boolean connected(final int p, final int q) {
    return find(p) == find(q);
  }
  /**.
   * { function_description }
   *
   * @param      p     { parameter_description }
   * @param      q     The quarter
   */
  public void union(final int p, final int q) {
    int i = find(p);
    int j = find(q);
    if (i == j) {
      return;
    }
    // make smaller root point to larger one
    if   (size[i] < size[j]) { id[i] = j; size[j] += size[i]; }
    else                 { id[j] = i; size[i] += size[j]; }
  }
}
