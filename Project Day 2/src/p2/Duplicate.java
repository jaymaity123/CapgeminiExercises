package p2;
class Duplicate{   
  
    public static void main (String[] args)    
    {   
          
        int arr[] = { 3,4,5,6,3,4,7,8,9,10 };  
        int len = arr.length;   
        int[] DisArr = new int[20];  
        int index = 0;  
        for (int i = 0; i < len; i++)   
        {   
        int key = 0;  
        for (int j = 0; j < i; j++){  
        if (arr[i] == arr[j]){   
        key = 1;  
        break;   
            }  
            }  
          if (key == 0){   
          DisArr[index] = arr[i];  
          index++;   
            }  
            }  
         
        for(int i = 0; i < index; i++)  
            System.out.print( DisArr[i] + " ");   
}         
      
}   
