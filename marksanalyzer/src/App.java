public class App {
    public static void main(String[] args) throws Exception {
        // Total marks of a student in all subjects
        int marks[]={90,93,89,96,78,99};
        int sum=0;
        int min=marks[0];
        int max=marks[0];
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
            if(marks[i]<min){
                min=marks[i];
            }
            if(marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println("Total marks is: "+sum);
        int average=sum/(marks.length);
        System.out.println("The average marks obtained is: "+average);
        System.out.println("The minimum marks he obtained is: "+min);
        System.out.println("The maximum marks he obtained is: "+max);

    }
}
