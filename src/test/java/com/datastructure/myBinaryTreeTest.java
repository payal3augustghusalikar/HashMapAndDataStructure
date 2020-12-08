package com.datastructure;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class myBinaryTreeTest {
    @Test
    public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        int size = myBinaryTree.getSize();
        Assert.assertEquals(3, size);
    }

    @Test
    public void given4Numbers_WhenAddedToBinaryTree_ShouldReturnSize4() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(80);
        myBinaryTree.add(57);
        myBinaryTree.add(65);
        myBinaryTree.add(71);

        int size = myBinaryTree.getSize();
        Assert.assertEquals(4, size);
    }

    @Test
    public void givenNumber_WhenSearchANumber_ShouldReturnTrueIfItExist() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(80);
        myBinaryTree.add(57);
        myBinaryTree.add(63);
        myBinaryTree.add(71);

        int number = 63;
        boolean result = myBinaryTree.search(number);
       String resultString = (result)?"Found":"Not found";
        System.out.println(+number+" "+resultString);
        Assert.assertFalse(result);
    }
}


