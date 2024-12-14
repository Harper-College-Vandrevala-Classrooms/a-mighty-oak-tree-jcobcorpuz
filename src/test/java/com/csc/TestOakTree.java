package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestOakTree {

  OakTree<OakTree.Squirrel> squirrelTree;

  @BeforeEach
  void setUp() {
    squirrelTree = new OakTree<>();
  }

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

  @Test
  void testAddRoot(){
    OakTree.Squirrel cheeks = squirrelTree.new Squirrel("Cheeks");
    squirrelTree.setRoot(cheeks);

    assertEquals("Cheeks", squirrelTree.getRoot().getData().getName());
  }

  @Test
  void testAddLeft(){
    OakTree.Squirrel cheeks = squirrelTree.new Squirrel("Cheeks");
    OakTree.Squirrel squeaks = squirrelTree.new Squirrel("Squeaks");

    squirrelTree.setRoot(cheeks);
    OakTree<OakTree.Squirrel>.Node rootNode = squirrelTree.getRoot();
    squirrelTree.setLeft(rootNode, squeaks);

    assertEquals("Squeaks", rootNode.getLeft().getData().getName());
  }

  @Test
  void testAddRight(){
    OakTree.Squirrel cheeks = squirrelTree.new Squirrel("Cheeks");
    OakTree.Squirrel fluffybutt = squirrelTree.new Squirrel("Mr. Fluffy Butt");

    squirrelTree.setRoot(cheeks);
    OakTree<OakTree.Squirrel>.Node rootNode = squirrelTree.getRoot();
    squirrelTree.setRight(rootNode, fluffybutt);

    assertEquals("Mr. Fluffy Butt", rootNode.getRight().getData().getName());
  }

  @Test
  void testRetrieve(){
    OakTree.Squirrel cheeks = squirrelTree.new Squirrel("Cheeks");
    OakTree.Squirrel squeaks = squirrelTree.new Squirrel("Squeaks");
    OakTree.Squirrel fluffybutt = squirrelTree.new Squirrel("Mr. Fluffy Butt");

    squirrelTree.setRoot(cheeks);
    OakTree<OakTree.Squirrel>.Node rootNode = squirrelTree.getRoot();
    squirrelTree.setLeft(rootNode, squeaks);
    squirrelTree.setRight(rootNode, fluffybutt);

    assertEquals("Squeaks", rootNode.getLeft().getData().getName());
    assertEquals("Mr. Fluffy Butt", rootNode.getRight().getData().getName());
  }

  @Test
  void testGenericIntegerTree(){
    OakTree<Integer> intTree = new OakTree<>();
    intTree.setRoot(10);
    OakTree<Integer>.Node rootNode = intTree.getRoot();

    intTree.setLeft(rootNode, 5);
    intTree.setRight(rootNode, 15);

    assertEquals(10, rootNode.getData());
    assertEquals(5,rootNode.getLeft().getData());
    assertEquals(15, rootNode.getRight().getData());
  }
}
