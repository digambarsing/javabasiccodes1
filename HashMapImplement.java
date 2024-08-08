package HashMap;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class HashMapImplement {

    static class Hashmap<K,V>{
        private static class Node<K, V> {
            K key;
            V val;
            public Node(K key, V val) {
                this.key = key;
                this.val = val;
            }
        }
        private int size;
        private int N;

        private LinkedList<Node> buckets[];


        @SuppressWarnings("Unchechked")
        public Hashmap(){
            this.N=4;

            this.buckets=new LinkedList[4];
            for (int i = 0; i <4 ; i++) {
                this.buckets[i]=new LinkedList<>();
            }
        }

        public void put(K key,V val){
        int bi=hashFunction(key);

        int di=insertInLL(key,bi);

        if (di!=-1){
            Node node=buckets[bi].get(di);
            node.val=val;
        }else{
            buckets[bi].add(new Node<>(key,val));
            size++;
        }

        double lambda=(double) size/N;

        if (lambda>2.0){
            rehash();
        }
        }

        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[oldBucket.length * 2];
            N = 2 * N;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> ll : oldBucket) {
                for (Node node : ll) {
                    put((K) node.key, (V) node.val);
                }
            }
        }

        private int insertInLL(K key,int bi) {
            LinkedList<Node> ll=buckets[bi];
            int di=0;

            for (int i = 0; i < ll.size(); i++) {
                Node node=ll.get(i);
                if (node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        private int hashFunction(K key) {
            int hc=key.hashCode();
            return Math.abs(hc)%N;
        }

        public void print() {
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> bucket = buckets[i];
                System.out.print("Bucket " + i + ": ");
                for (Node node : bucket) {
                    System.out.print("[" + node.key + ", " + node.val + "] ");
                }
                System.out.println();
            }
        }

        public boolean keyContains(K Key){
            int bi=hashFunction(Key);

            int di=insertInLL(Key,bi);

            if (di!=-1){
                return true;
            }else {
                return false;
            }
        }

        public V remove(K key){
            int bi=hashFunction(key);

            int di=insertInLL(key,bi);

            if (di!=-1){
                Node node=buckets[bi].remove(di);
                size--;
                return (V) node.val;
            }else{
                return null;
            }
        }

        public V get(K key){
            int bi=hashFunction(key);

            int di=insertInLL(key,bi);

            if (di!=-1){
                Node node=buckets[bi].get(di);
                 return (V) node.val;
            }else{
                return null;
            }
        }

        public ArrayList<K> KeySet(){
            ArrayList<K> keySet = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keySet.add((K) node.key);
                }
            }
            return keySet;
        }


        public boolean isEmpty(){
            return size==0;
        }


    }


    public static void main(String[] args) {
        Hashmap<String,Integer> hp = new Hashmap<>();
        hp.put("india", 100);
        hp.put("indonesia", 200);
        hp.put("usa", 300);
        hp.put("china", 400);
        hp.put("japan", 500);
        hp.put("korea", 600);
        hp.put("india",300);
        hp.print();

    //    System.out.println(hp.keyContains("india"));
    //    System.out.println(hp.keyContains("ved"));


   //     System.out.println(hp.get("india"));
    //    System.out.println(hp.get("ved"));


    //    System.out.println(hp.remove("india"));
    //    System.out.println(hp.remove("ved"));

     //   hp.print();


        System.out.println(hp.KeySet());

        System.out.println(hp.isEmpty());


    }
}

