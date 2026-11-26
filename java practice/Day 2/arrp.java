public class arrp {
    public static void main(String[] args) {
    //solve array porblem find sum,avg,min,max
    int [] arr={15,19,29,10,28};
    int i;
    int min=arr[0];
    int max=arr[0];
    int sum=0;
     for(int a=0;a<arr.length;a++){
        sum+=arr[a];
     }
    int avg=sum/arr.length;
    System.out.println(sum);
    System.out.println(avg);
    for(i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }}
    System.out.println("Min is : "+min);
    System.out.println("Max is : "+max);
              }
}