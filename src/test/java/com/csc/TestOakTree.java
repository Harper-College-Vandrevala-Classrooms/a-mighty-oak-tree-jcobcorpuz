package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {

  OakTree tree;

  @BeforeEach
  void setUp() {
    tree = new OakTree();
  }

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

  @Test
  void testAddRoot(){
    OakTree.Squirrel cheeks = tree.new Squirrel("Cheeks");
    tree.setRoot(cheeks);

    assertEquals("Cheeks", tree.getRoot().getData().getName());
  }

  @Test
  void testAddLeft(){
    OakTree.Squirrel cheeks = tree.new Squirrel("Cheeks");
    OakTree.Squirrel squeaks = tree.new Squirrel("Squeaks");

    tree.setRoot(cheeks);
    OakTree.Node rootNode = tree.getRoot();
    tree.setLeft(rootNode, squeaks);

    assertEquals("Squeaks", rootNode.getLeft().getData().getName());
  }

  @Test
  void testAddRight(){
    OakTree.Squirrel cheeks = tree.new Squirrel("Cheeks");
    OakTree.Squirrel fluffybutt = tree.new Squirrel("Mr. Fluffy Butt");

    tree.setRoot(cheeks);
    OakTree.Node rootNode = tree.getRoot();
    tree.setRight(rootNode, fluffybutt);

    assertEquals("Mr. Fluffy Butt", rootNode.getRight().getData().getName());
  }

  @Test
  void testRetrieve(){
    OakTree.Squirrel cheeks = tree.new Squirrel("Cheeks");
    OakTree.Squirrel squeaks = tree.new Squirrel("Squeaks");
    OakTree.Squirrel fluffybutt = tree.new Squirrel("Mr. Fluffy Butt");

    tree.setRoot(cheeks);
    OakTree.Node rootNode = tree.getRoot();
    tree.setLeft(rootNode, squeaks);
    tree.setRight(rootNode, fluffybutt);

    assertEquals("Squeaks", rootNode.getLeft().getData().getName());
    assertEquals("Mr. Fluffy Butt", rootNode.getRight().getData().getName());
  }
}
