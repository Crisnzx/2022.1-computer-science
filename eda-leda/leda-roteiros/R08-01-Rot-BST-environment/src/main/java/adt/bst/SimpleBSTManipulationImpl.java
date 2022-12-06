package adt.bst;

/**
 * - Esta eh a unica classe que pode ser modificada
 * 
 * @author adalbertocajueiro
 *
 * @param <T>
 */
public class SimpleBSTManipulationImpl<T extends Comparable<T>> implements SimpleBSTManipulation<T> {

	@Override
	public boolean equals(BST<T> tree1, BST<T> tree2) {
		return this.equals((BSTNode<T>) tree1.getRoot(), (BSTNode<T>) tree2.getRoot());
	}

	private boolean equals(BSTNode<T> node1, BSTNode<T> node2) {
		if (!node1.equals(node2)) {
			return false;
		}

		if (node1.isEmpty() && node2.isEmpty()) {
			return true;
		}

		return this.equals((BSTNode<T>) node1.getLeft(), (BSTNode<T>) node2.getLeft())
				&& this.equals((BSTNode<T>) node1.getRight(), (BSTNode<T>) node2.getRight());
	}

	@Override
	public boolean isSimilar(BST<T> tree1, BST<T> tree2) {
		return this.isSimilar((BSTNode<T>) tree1.getRoot(), (BSTNode<T>) tree2.getRoot());
	}

	private boolean isSimilar(BSTNode<T> node1, BSTNode<T> node2) {

		if (node1.isEmpty() && node2.isEmpty()) {
			return true;
		}

		if (node1.getLeft().isEmpty() && !node2.getLeft().isEmpty()
				|| node1.getRight().isEmpty() && !node2.getRight().isEmpty()) {
			return false;
		}

		return this.isSimilar((BSTNode<T>) node1.getLeft(), (BSTNode<T>) node2.getLeft())
				&& this.isSimilar((BSTNode<T>) node1.getRight(), (BSTNode<T>) node2.getRight());
	}

	@Override
	public T orderStatistic(BST<T> tree, int k) {
		// TODO Implement this method
		throw new UnsupportedOperationException("Not implemented yet!");
	}

}
