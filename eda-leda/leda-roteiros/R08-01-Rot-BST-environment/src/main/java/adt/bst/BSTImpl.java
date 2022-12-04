package adt.bst;

import java.util.ArrayList;

public class BSTImpl<T extends Comparable<T>> implements BST<T> {

	protected BSTNode<T> root;

	public BSTImpl() {
		root = new BSTNode<T>();
	}

	public BSTNode<T> getRoot() {
		return this.root;
	}

	@Override
	public boolean isEmpty() {
		return root.isEmpty();
	}

	@Override
	public int height() {
		if (this.isEmpty()) {
			return -1;
		}

		return this.height(this.root);
	}

	private int height(BSTNode<T> current) {
		if (current == null) {
			return -1;
		}
		int leftHeight = this.height((BSTNode<T>) current.getLeft());
		int rightHeight = this.height((BSTNode<T>) current.getRight());
		return 1 + Math.max(leftHeight, rightHeight);

	}

	@Override
	public BSTNode<T> search(T element) {
		if (this.isEmpty()) {
			return root;
		}

		return this.search(this.root, element);

	}

	private BSTNode<T> search(BSTNode<T> currentNode, T element) {

		if (currentNode == null) {
			BSTNode<T> nil = new BSTNode<T>();
			return nil;
		}

		if (currentNode.getData().equals(element)) {
			return currentNode;
		}

		boolean shouldGoToTheLeft = element.compareTo(currentNode.getData()) < 0;

		if (shouldGoToTheLeft) {
			return this.search((BSTNode<T>) currentNode.getLeft(), element);
		} else {
			return this.search((BSTNode<T>) currentNode.getRight(), element);

		}

	}

	@Override
	public void insert(T element) {
		if (this.isEmpty()) {
			BSTNode<T> node = new BSTNode<T>();
			node.setData(element);
			this.root = node;
			return;
		}
		this.insert(this.root, element);

	}

	private void insert(BSTNode<T> currentNode, T element) {
		boolean isElementSmallerThanCurrentNode = element.compareTo(currentNode.getData()) < 0;
		if (isElementSmallerThanCurrentNode && currentNode.getLeft() != null) {
			this.insert((BSTNode<T>) currentNode.getLeft(), element);
			return;
		}

		if (!isElementSmallerThanCurrentNode && currentNode.getRight() != null) {
			this.insert((BSTNode<T>) currentNode.getRight(), element);
			return;
		}

		BSTNode<T> newNode = new BSTNode<T>();
		newNode.setParent(currentNode);
		newNode.setData(element);

		if (isElementSmallerThanCurrentNode) {
			currentNode.setLeft(newNode);
		} else {
			currentNode.setRight(newNode);
		}

	}

	@Override
	public BSTNode<T> maximum() {
		if (this.isEmpty()) {
			return null;
		}
		return this.maximum(this.root);

	}

	private BSTNode<T> maximum(BSTNode<T> current) {
		if (current.getRight() == null) {
			return current;
		}

		return this.maximum((BSTNode<T>) current.getRight());

	}

	@Override
	public BSTNode<T> minimum() {
		if (this.isEmpty()) {
			return null;
		}
		return this.minimum(this.root);

	}

	private BSTNode<T> minimum(BSTNode<T> current) {
		if (current.getLeft() == null) {
			return current;
		}

		return this.minimum((BSTNode<T>) current.getLeft());

	}

	@Override
	public BSTNode<T> sucessor(T element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public BSTNode<T> predecessor(T element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public void remove(T element) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public T[] preOrder() {
		if (this.isEmpty()) {
			return (T[]) new Comparable[0];
		}

		ArrayList<T> array = new ArrayList<T>();

		this.preOrder(array, this.root);
		return (T[]) array.toArray(new Comparable[0]);
	}

	private void preOrder(ArrayList<T> array, BSTNode<T> current) {
		if (current == null) {
			return;
		}

		array.add(current.getData());
		this.preOrder(array, (BSTNode<T>) current.getLeft());
		this.preOrder(array, (BSTNode<T>) current.getRight());

	}

	@Override
	public T[] order() {
		if (this.isEmpty()) {
			return (T[]) new Comparable[0];
		}

		ArrayList<T> array = new ArrayList<T>();

		this.order(array, this.root);
		return (T[]) array.toArray(new Comparable[0]);
	}

	private void order(ArrayList<T> array, BSTNode<T> current) {
		if (current == null) {
			return;
		}

		this.order(array, (BSTNode<T>) current.getLeft());
		array.add(current.getData());
		this.order(array, (BSTNode<T>) current.getRight());

	}

	@Override
	public T[] postOrder() {
		if (this.isEmpty()) {
			return (T[]) new Comparable[0];
		}

		ArrayList<T> array = new ArrayList<T>();

		this.postOrder(array, this.root);
		return (T[]) array.toArray(new Comparable[0]);
	}

	private void postOrder(ArrayList<T> array, BSTNode<T> current) {
		if (current == null) {
			return;
		}

		this.postOrder(array, (BSTNode<T>) current.getLeft());
		array.add(current.getData());
		this.postOrder(array, (BSTNode<T>) current.getRight());

	}

	/**
	 * This method is already implemented using recursion. You must understand
	 * how it work and use similar idea with the other methods.
	 */
	@Override
	public int size() {
		return size(root);
	}

	private int size(BSTNode<T> node) {
		int result = 0;
		// base case means doing nothing (return 0)
		if (!node.isEmpty()) { // indusctive case
			result = 1 + size((BSTNode<T>) node.getLeft())
					+ size((BSTNode<T>) node.getRight());
		}
		return result;
	}

}
