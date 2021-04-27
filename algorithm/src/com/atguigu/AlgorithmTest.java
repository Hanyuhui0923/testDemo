package com.atguigu;

import java.util.ArrayList;

public class AlgorithmTest {
    public static void main(String[] args) {
        ListNode first = new ListNode();
        int num=8;
        ListNode current = new ListNode();
        for(int i=1;i<=num;i++){
            ListNode boy = new ListNode(i);
            if(i==1){
                current=boy;
                first=boy;
                boy.setNext(boy);
            }else{
                current.setNext(boy);
                boy.setNext(first);
                current=boy;
            }

        }
        ArrayList array = getArray(first, 2, 1);
        System.out.println(array);

    }
    public static void printList(ListNode listNode,int m ){
        ListNode current = listNode;

        while(true){
            if(current.getNext()==listNode){
                System.out.println(current.getValue());
                return;
            }
            System.out.println(current.getValue());
            current=current.getNext();

        }
//        for(int i=1;i<=m;i++){
//            System.out.println(current.getValue());
//            current=current.getNext();
//        }
    }
    public static ArrayList getArray(ListNode listNode,int k,int m){
        ArrayList arrayList = new ArrayList();
        ListNode current =  listNode;
        if(k<0) return arrayList;
        for(int i=1;i<k;i++){
            current=current.getNext();
        }
        if(m==1){
            ListNode start = current;
            while(true){
                arrayList.add(current.getValue());
                if(current.getNext()==start){
                    return  arrayList;
                }
                current=current.getNext();
            }

        }
        while(true){

            if(current.getNext()==current) {
                arrayList.add(current.getValue());
                return arrayList;
            };
            for(int i=1;i<m-1;i++){
                current=current.getNext();
            }
            arrayList.add(current.getNext().getValue());
            current.setNext(current.getNext().getNext());
            current=current.getNext();


        }

    }

}
