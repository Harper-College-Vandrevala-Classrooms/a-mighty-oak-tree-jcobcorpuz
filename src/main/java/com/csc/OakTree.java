package com.csc;

public class OakTree<T> {
  public class Squirrel{
    private String name;

    Squirrel(String name){
      this.name = name;
    }

    String getName(){
      return this.name;
    }
  }

  public class Node {
    private T data;
    private Node left;
    private Node right;

    public Node(T data){
      this.data = data;
      this.left = null;
      this.right = null;
    }

    public void setLeft(Node left){
      this.left = left;
    }

    public void setRight(Node right){
      this.right = right;
    }

    public Node getLeft(){
      return this.left;
    }

    public Node getRight(){
      return this.right;
    }

    public T getData(){
      return this.data;
    }
  }

  private Node root;

  public OakTree(){
    this.root = null;
  }

  public void setRoot(T data){
    this.root = new Node(data);
  }

  public Node getRoot(){
    return this.root;
  }

  public void setLeft(Node parent, T data){
    parent.setLeft(new Node(data));
  }

  public void setRight(Node parent, T data){
    parent.setRight(new Node(data));
  }

}
