import java.util.*;
public class third_question{
   public static void main(String args[]){
       String[] topics={"Economic","food","Political","Environmental","video_games"}; //My chosen topics.
       int[][] response_section=new int[5][11];
       for(int i=0;i<4;i++){
           for(int j=1;j<=10;j++){
        	   response_section[i][j]=0; 
           }
       } 
       
       int numberofpeople;
       System.out.print("How many users do we have? "); //asking the input
       Scanner a =new Scanner(System.in);
       numberofpeople=a.nextInt();
       int p=1; 
       while(p<=numberofpeople){ //asking for users input frequently.
           for(int j=0;j<5;j++){ 
               System.out.print("P"+p+":"+topics[j]+":");
               int m=a.nextInt();
               response_section[j][m]=response_section[j][m]+1;
           }
           p++; 
       } 
       
       System.out.println();
       
       System.out.println("Topics \t\t"+"The_Total_Ratings \t\t"+"Average_Ratings"); //displaying using tabs
       int maximum=0,minimum=100000,maximum_topic=0,minimum_topic=0;
       
       for(p=0;p<5;p++)
       {
           int total_number=0,countstotal=0;
           for(int j=1;j<=10;j++)
           {
        	   total_number=total_number+j*response_section[p][j]; 
               countstotal=countstotal+response_section[p][j]; 
           }
           if(maximum<total_number)//maximum count
           {  
        	   maximum=total_number;
        	   maximum_topic=p;
           }
           if(minimum>total_number)// minimum count
           {  
        	   minimum=total_number;
        	   minimum_topic=p;
           }
           System.out.println(topics[p]+"\t "+total_number+"\t\t\t "+(total_number+0.0)/countstotal);
       }
       
       System.out.println();
       
       System.out.println("Maximum_Points_Topic \t"+"Ratings");
       System.out.println(topics[maximum_topic]+"\t\t "+maximum);
       
       System.out.println();
       
       System.out.println("Minimum_Points_Topic \t"+"Ratings");
       System.out.println(topics[minimum_topic]+"\t\t "+minimum);
   }
   
}