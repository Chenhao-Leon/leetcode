package leetcode_706;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {

    @Test
    public void put() {
        MyHashMap map = new MyHashMap();
        map.put(1,1);
        map.put(2,2);
        System.out.println(map.get(1));;
        System.out.println(map.get(3));;
        map.put(2,1);
        System.out.println(map.get(2));;
        map.remove(2);
        System.out.println(map.get(2));;
    }
}