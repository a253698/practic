package com.mavis.pokercard;

public class PracticShuffle2 {
	public static void main(String[] args) {
		final int N = 10;
		int[] poker = new int[N + 1];

		int count = list.length;  
        //结果集  
        int[] resultList = new int[count];  
        //用一个LinkedList作为中介  
        LinkedList<Integer> temp = new LinkedList<Integer>();  
        //初始化temp  
        for(int i = 0; i<count; i++){  
            temp.add((Integer)list[i]);  
        }  
        //取数  
        Random rand = new Random();  
        for(int i = 0;i<count; i++){  
            int num = rand.nextInt(count - i);  
            resultList[i] = (Integer) temp.get(num);  
            temp.remove(num);  
        }  
          
        return resultList;  
    }  
      
    public static void main(String[] args) {  
        int[] list = {0,1,2,3,4,5,6,7,8,9};  
        int[] result = RandomNumber.getList(list);  
        for(int i=0; i<result.length; i++){  
            System.out.print("["+result[i]+"] ");  
        }  
    }  
}  
}
