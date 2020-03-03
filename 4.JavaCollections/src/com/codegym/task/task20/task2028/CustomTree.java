package com.codegym.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Build a tree (part 1)

*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    int size;

    public CustomTree() {
        this.root = new Entry<>("0");
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        int count = -1;
        Queue<Entry> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Entry node = q.poll();
            //System.out.println(node.elementName);
            count++;
            if (!node.availableToAddLeftChildren) {
                q.add(node.leftChild);
            }
            if (!node.availableToAddRightChildren) {
                q.add(node.rightChild);
            }
        }
        size = count;
        return size;
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }


    @Override
    public boolean add(String s) {
        Entry<String> newNode = new Entry(s);
        Queue<Entry> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Entry node = q.poll();
            if (node.availableToAddLeftChildren) {
                node.leftChild = newNode;
                node.availableToAddLeftChildren = false;
                newNode.parent = node;
                break;
            } else if (node.availableToAddRightChildren) {
                node.rightChild = newNode;
                node.availableToAddRightChildren = false;
                newNode.parent = node;
                break;
            } else {
                q.add(node.leftChild);
                q.add(node.rightChild);
            }
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Queue<Entry<String>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Entry<String> currentNode = queue.poll();
            if (currentNode.leftChild != null) {
                if (currentNode.leftChild.elementName.equals(o)) {
                    currentNode.leftChild.parent.availableToAddLeftChildren = false;
                    currentNode.leftChild = null;
                    return true;
                }
                queue.offer(currentNode.leftChild);
                System.out.println("current node:" + currentNode.elementName);
                System.out.println("current node left child " + currentNode.leftChild.elementName);
            }
            if (currentNode.rightChild != null) {
                if (currentNode.rightChild.elementName.equals(o)) {
                    currentNode.rightChild.parent.availableToAddRightChildren = false;
                    currentNode.rightChild = null;
                    return true;
                }
                queue.offer(currentNode.rightChild);
                System.out.println("current node:" + currentNode.elementName);
                System.out.println("current node left child " + currentNode.rightChild.elementName);
            }
        }
        return false;
    }

    public String getParent(String s) {
        Queue<Entry> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Entry node = q.poll();
            if (node.elementName.equals(s))
                try {
                    return node.parent.elementName;
                } catch (NullPointerException e) {
                    return null;
                }
            else {
                if (!node.availableToAddLeftChildren) q.add(node.leftChild);
                if (!node.availableToAddRightChildren) q.add(node.rightChild);
            }
        }
        return null;
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String s) {
            elementName = s;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        void checkChildren() {
            if (leftChild != null) {
                availableToAddLeftChildren = false;
            }
            if (rightChild != null) {
                availableToAddRightChildren = false;
            }
        }

        public boolean isAvailableToAddChildren() {
            if (availableToAddRightChildren || availableToAddLeftChildren)
                return true;
            return false;
        }

    }
}
